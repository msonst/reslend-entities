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

import de.sonsts.common.SessionState;

public class SessionStateChangeEvent
{
    private long mTimestamp;
    private SessionState mSessionState;
    private String mResourceIdentifier;
    
    public SessionStateChangeEvent()
    {
    }
    
    public SessionStateChangeEvent(String resourceIdentifier, long timestamp)
    {
        init(resourceIdentifier, timestamp, SessionState.INVALID);
    }
    
    public SessionStateChangeEvent(String resourceIdentifier, SessionState sessionState)
    {
        init(resourceIdentifier, System.currentTimeMillis(), sessionState);
    }
    
    public SessionStateChangeEvent(String resourceIdentifier, long timestamp, SessionState sessionState)
    {
        init(resourceIdentifier, timestamp, sessionState);
    }
    
    private void init(String resourceIdentifier, long timestamp, SessionState runState)
    {
        mResourceIdentifier = resourceIdentifier;
        setTimestamp(timestamp);
        setSessionState(runState);
    }
    
    public SessionState getSessionState()
    {
        return mSessionState;
    }
    
    public void setSessionState(SessionState runState)
    {
        mSessionState = runState;
    }
    
    public void setTimestamp(long timestamp)
    {
        mTimestamp = timestamp;
    }
    
    public String getResourceIdentifier()
    {
        return mResourceIdentifier;
    }

    protected void setResourceIdentifier(String resourceIdentifier)
    {
        mResourceIdentifier = resourceIdentifier;
    }

    public long getTimestamp()
    {
        return mTimestamp;
    }
    
    public SessionStateChangeEvent deepClone()
    {
        return new SessionStateChangeEvent(mResourceIdentifier, mTimestamp, mSessionState);
    }

    @Override
    public String toString()
    {
        return "SessionStateChangeEvent [Timestamp=" + mTimestamp + ", SessionState=" + mSessionState + ", ResourceIdentifier=" + mResourceIdentifier
            + "]";
    }
}
