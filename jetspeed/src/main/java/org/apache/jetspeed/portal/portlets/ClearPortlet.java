package org.apache.jetspeed.portal.portlets;

/*
 * Copyright 2000-2001,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 /** ClearPortlet
  * Empty Portlet which displays no content
  * @author <a href="mailto:mlukas@raleigh.ibm.com">Martin Lukas</a>
  */
public class ClearPortlet extends AbstractPortlet 
{
/**
 * Insert the method's description here.
 * Creation date: (12/4/2000 1:49:50 PM)
 * @return org.apache.ecs.ConcreteElement
 * @param data org.apache.turbine.util.RunData
 */
@Override
public org.apache.ecs.ConcreteElement getContent(org.apache.turbine.util.RunData data) {
	return new org.apache.jetspeed.util.JetspeedClearElement( " " );
}
}
