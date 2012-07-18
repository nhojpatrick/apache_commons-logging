/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.apache.commons.logging;

import junit.framework.TestCase;
import java.util.Hashtable;

/**
 * Tests behaviour when the property is misconfigured.
 */
public class BadHashtablePropertyTestCase extends TestCase {

    public void testType()  {
        assertTrue(LogFactory.factories instanceof Hashtable);
    }
    
    public void testPutCalled() throws Exception {
        LogFactory.getLog(BadHashtablePropertyTestCase.class);
    }
}
