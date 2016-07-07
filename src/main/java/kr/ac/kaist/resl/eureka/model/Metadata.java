package kr.ac.kaist.resl.eureka.model;
public class Metadata
{
    private String ami_launch_index;

    private String availability_zone;

    private String local_hostname;

    private String instance_id;

    private String public_ipv4;

    private String public_hostname;

    private String ami_manifest_path;

    private String local_ipv4;

    private String hostname;

    private String ami_id;

    private String instance_type;

    public String getAmi_launch_index ()
    {
        return ami_launch_index;
    }

    public void setAmi_launch_index (String ami_launch_index)
    {
        this.ami_launch_index = ami_launch_index;
    }

    public String getAvailability_zone ()
    {
        return availability_zone;
    }

    public void setAvailability_zone (String availability_zone)
    {
        this.availability_zone = availability_zone;
    }

    public String getLocal_hostname ()
    {
        return local_hostname;
    }

    public void setLocal_hostname (String local_hostname)
    {
        this.local_hostname = local_hostname;
    }

    public String getInstance_id ()
    {
        return instance_id;
    }

    public void setInstance_id (String instance_id)
    {
        this.instance_id = instance_id;
    }

    public String getPublic_ipv4 ()
    {
        return public_ipv4;
    }

    public void setPublic_ipv4 (String public_ipv4)
    {
        this.public_ipv4 = public_ipv4;
    }

    public String getPublic_hostname ()
    {
        return public_hostname;
    }

    public void setPublic_hostname (String public_hostname)
    {
        this.public_hostname = public_hostname;
    }

    public String getAmi_manifest_path ()
    {
        return ami_manifest_path;
    }

    public void setAmi_manifest_path (String ami_manifest_path)
    {
        this.ami_manifest_path = ami_manifest_path;
    }

    public String getLocal_ipv4 ()
    {
        return local_ipv4;
    }

    public void setLocal_ipv4 (String local_ipv4)
    {
        this.local_ipv4 = local_ipv4;
    }

    public String getHostname ()
    {
        return hostname;
    }

    public void setHostname (String hostname)
    {
        this.hostname = hostname;
    }

    public String getAmi_id ()
    {
        return ami_id;
    }

    public void setAmi_id (String ami_id)
    {
        this.ami_id = ami_id;
    }

    public String getInstance_type ()
    {
        return instance_type;
    }

    public void setInstance_type (String instance_type)
    {
        this.instance_type = instance_type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ami_launch_index = "+ami_launch_index+", availability_zone = "+availability_zone+", local_hostname = "+local_hostname+", instance_id = "+instance_id+", public_ipv4 = "+public_ipv4+", public_hostname = "+public_hostname+", ami_manifest_path = "+ami_manifest_path+", local_ipv4 = "+local_ipv4+", hostname = "+hostname+", ami_id = "+ami_id+", instance_type = "+instance_type+"]";
    }
}