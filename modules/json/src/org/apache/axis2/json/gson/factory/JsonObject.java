/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.json.gson.factory;

import java.util.ArrayList;
import java.util.List;

public class JsonObject {
    private String name;
    private JSONType type;
    private String valueType;
    private String namespaceUri;
    private long minOccurs;

    private String parentName;
    private List<String> childObjects;

    public JsonObject(String name, JSONType type, String valueType , String namespaceUri) {
        this.name = name;
        this.type = type;
        this.valueType = valueType;
        this.namespaceUri = namespaceUri;
        if( this.type != JSONType.OBJECT ) {
            this.childObjects = new ArrayList<>();
        } else {
            this.childObjects = null;
        }
    }

    public String getName() {
        return name;
    }

    public JSONType getType() {
        return type;
    }

    public String getValueType() {
        return valueType;
    }

    public String getNamespaceUri() {
        return namespaceUri;
    }

    public void setMinOccurs(long minOccurs) {
        this.minOccurs = minOccurs;
    }

    public long getMinOccurs() {
        return minOccurs;
    }

    public void addChildObject(String childName) {
        this.childObjects.add(childName);
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<String> getChildObjects() {
        return childObjects;
    }
}
