package kr.ac.kaist.resl.eureka.model;
       
public class LeaseInfo
{
    private String evictionDurationInSecs;

    public String getEvictionDurationInSecs ()
    {
        return evictionDurationInSecs;
    }

    public void setEvictionDurationInSecs (String evictionDurationInSecs)
    {
        this.evictionDurationInSecs = evictionDurationInSecs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [evictionDurationInSecs = "+evictionDurationInSecs+"]";
    }
}