/*
 * Copyright (c) 2017, Michael Sonst, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.sonsts.reslend.agent;

import de.sonsts.common.RunState;

public class AgentStateEvent
{
    private long mTimestamp;
    private String mResourceIdentifier;
    private RunState mRunState;
    
    public AgentStateEvent()
    {
    }
    
    public AgentStateEvent(String resourceIdentifier, long timestamp, RunState runState)
    {
        init(resourceIdentifier, timestamp, runState);
    }
    
    private void init(String resourceIdentifier, long timestamp, RunState runState)
    {
        setResourceIdentifier(resourceIdentifier);
        setTimestamp(timestamp);
        setRunState(runState);
    }
    
    protected String getResourceIdentifier()
    {
        return mResourceIdentifier;
    }
    
    protected void setResourceIdentifier(String resourceIdentifier)
    {
        mResourceIdentifier = resourceIdentifier;
    }
    
    public RunState getRunState()
    {
        return mRunState;
    }
    
    public void setRunState(RunState runState)
    {
        mRunState = runState;
    }
    
    public void setTimestamp(long timestamp)
    {
        mTimestamp = timestamp;
    }
    
    public long getTimestamp()
    {
        return mTimestamp;
    }
    
    public AgentStateEvent deepClone()
    {
        return new AgentStateEvent(mResourceIdentifier, mTimestamp, mRunState);
    }
    
    @Override
    public String toString()
    {
        return "AgentStateEvent [Timestamp=" + mTimestamp + ", ResourceIdentifier=" + mResourceIdentifier + ", RunState=" + mRunState
            + "]";
    }
}
