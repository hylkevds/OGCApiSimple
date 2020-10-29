From tomcat:8.5-jdk11
MAINTAINER api4inspire

COPY target/docker_deps/ ${CATALINA_HOME}/lib/

ARG WAR_FILE
COPY target/${WAR_FILE} /tmp/ogcapisimple.war

RUN unzip -d ${CATALINA_HOME}/webapps/ogcapisimple /tmp/ogcapisimple.war \
    && rm /tmp/ogcapisimple.war \
    && addgroup --system --gid 1000 tomcat \
    && adduser --system --uid 1000 --gid 1000 tomcat \
    && chgrp -R 0 $CATALINA_HOME \
    && chmod -R g=u $CATALINA_HOME

