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

public class StateChangeEvent
{
    private long mTimestamp;
    private RunState mRunState;
    private String mResourceIdentifier;
    
    public StateChangeEvent()
    {
    }
    
    public StateChangeEvent(String resourceIdentifier, long timestamp)
    {
        init(resourceIdentifier, timestamp, RunState.UNKNOWN);
    }
    
    public StateChangeEvent(String resourceIdentifier, RunState runState)
    {
        init(resourceIdentifier, System.currentTimeMillis(), runState);
    }
    
    public StateChangeEvent(String resourceIdentifier, long timestamp, RunState runState)
    {
        init(resourceIdentifier, timestamp, runState);
    }
    
    private void init(String resourceIdentifier, long timestamp, RunState runState)
    {
        mResourceIdentifier = resourceIdentifier;
        setTimestamp(timestamp);
        setRunState(runState);
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
    
    protected String getResourceIdentifier()
    {
        return mResourceIdentifier;
    }

    protected void setResourceIdentifier(String resourceIdentifier)
    {
        mResourceIdentifier = resourceIdentifier;
    }

    public StateChangeEvent deepClone()
    {
        return new StateChangeEvent(mResourceIdentifier, mTimestamp, mRunState);
    }

    @Override
    public String toString()
    {
        return "StateChangeEvent [Timestamp=" + mTimestamp + ", RunState=" + mRunState + ", ResourceIdentifier=" + mResourceIdentifier
            + "]";
    }
}
