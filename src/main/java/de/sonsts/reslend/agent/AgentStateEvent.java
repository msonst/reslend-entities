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
