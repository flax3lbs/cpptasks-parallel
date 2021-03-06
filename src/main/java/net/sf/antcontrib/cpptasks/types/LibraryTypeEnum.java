/*
 * 
 * Copyright 2004 The Ant-Contrib project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package net.sf.antcontrib.cpptasks.types;
import org.apache.tools.ant.types.EnumeratedAttribute;
/**
 * Enumeration of library types for LibrarySet
 * 
 * @author Curt Arnold
 *  
 */
public class LibraryTypeEnum extends EnumeratedAttribute {
    /**
     * Constructor
     * 
     * Set by default to "shared"
     * 
     * @see java.lang.Object#Object()
     */
    public LibraryTypeEnum() {
        setValue("shared");
    }
    /**
     * Gets list of acceptable values
     * 
     * @see org.apache.tools.ant.types.EnumeratedAttribute#getValues()
     */
    public String[] getValues() {
        return new String[]{"shared", // prefer shared libraries
                "static", // prefer static libraries
                "framework" // framework libraries (Mac OS/X)
                            //  equiv to shared on other platforms
        };
    }
}
