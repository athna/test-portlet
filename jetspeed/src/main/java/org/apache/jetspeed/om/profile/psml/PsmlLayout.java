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

package org.apache.jetspeed.om.profile.psml;

import org.apache.jetspeed.om.profile.Layout;

/**
 * Default bean like implementation of the skin entry in psml
 * 
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: PsmlLayout.java,v 1.3 2004/02/23 03:02:54 jford Exp $
 */
public class PsmlLayout extends PsmlConfigElement implements Layout
{   
    private long position = -1;
    private long size = -1;

    public PsmlLayout()
    {
    }

    @Override
	public long getPosition()
    {
        return this.position;
    }
                              
    @Override
	public void setPosition(long position)
    {
        this.position = position;
    }
    
    @Override
	public long getSize()
    {
        return this.size;
    }
                                
    @Override
	public void setSize( long size )
    {
        this.size = size;
    }

}