/*
 * The OGC API Simple provides environmental data
 * Created on Wed Feb 26 2020
 * @author Tobias Pressler
 * Copyright (c) 2020 - Tobias Pressler
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.

 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */
package com.inspire.development.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ColumnConfig {
    private String alias;
    private boolean exclude;

    /**
     * Create a new Column Config
     * @param alias the alias to be used for a column
     * @param exclude true if the column should be excluded
     */
    public ColumnConfig(@JsonProperty("alias") String alias,
                        @JsonProperty("exclude") boolean exclude) {
        this.alias = alias;
        this.exclude = exclude;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isExclude() {
        return exclude;
    }
}
