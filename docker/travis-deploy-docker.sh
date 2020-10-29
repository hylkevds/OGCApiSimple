#!/bin/bash
set -e

mvn install -DskipTests -Dmaven.javadoc.skip=true && mvn dockerfile:build
mvn dockerfile:tag@tag-version

if [ "${TRAVIS_BRANCH}" = "master" ]; then
  mvn dockerfile:push@push-latest -Ddockerfile.useMavenSettingsForAuth=true --settings travis-settings.xml
fi

mvn dockerfile:push@push-version -Ddockerfile.useMavenSettingsForAuth=true --settings travis-settings.xml
