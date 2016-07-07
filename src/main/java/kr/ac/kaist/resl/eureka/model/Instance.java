package kr.ac.kaist.resl.eureka.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Instance
{
	@JsonProperty("port")
    private String port;

    private String statusPageUrl;

    private String app;

    private String securePort;

    private String ipAddr;

    private String status;

    private String homePageUrl;

    private DataCenterInfo dataCenterInfo;

    private String vipAddress;

    private String secureVipAddress;

    private String hostName;

    private LeaseInfo leaseInfo;

    private String healthCheckUrl;

    private String metadata;

    public String getPort ()
    {
        return port;
    }

    public void setPort (String port)
    {
        this.port = port;
    }

    public String getStatusPageUrl ()
    {
        return statusPageUrl;
    }

    public void setStatusPageUrl (String statusPageUrl)
    {
        this.statusPageUrl = statusPageUrl;
    }

    public String getApp ()
    {
        return app;
    }

    public void setApp (String app)
    {
        this.app = app;
    }

    public String getSecurePort ()
    {
        return securePort;
    }

    public void setSecurePort (String securePort)
    {
        this.securePort = securePort;
    }

    public String getIpAddr ()
    {
        return ipAddr;
    }

    public void setIpAddr (String ipAddr)
    {
        this.ipAddr = ipAddr;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getHomePageUrl ()
    {
        return homePageUrl;
    }

    public void setHomePageUrl (String homePageUrl)
    {
        this.homePageUrl = homePageUrl;
    }

    public DataCenterInfo getDataCenterInfo ()
    {
        return dataCenterInfo;
    }

    public void setDataCenterInfo (DataCenterInfo dataCenterInfo)
    {
        this.dataCenterInfo = dataCenterInfo;
    }

    public String getVipAddress ()
    {
        return vipAddress;
    }

    public void setVipAddress (String vipAddress)
    {
        this.vipAddress = vipAddress;
    }

    public String getSecureVipAddress ()
    {
        return secureVipAddress;
    }

    public void setSecureVipAddress (String secureVipAddress)
    {
        this.secureVipAddress = secureVipAddress;
    }

    public String getHostName ()
    {
        return hostName;
    }

    public void setHostName (String hostName)
    {
        this.hostName = hostName;
    }

    public LeaseInfo getLeaseInfo ()
    {
        return leaseInfo;
    }

    public void setLeaseInfo (LeaseInfo leaseInfo)
    {
        this.leaseInfo = leaseInfo;
    }

    public String getHealthCheckUrl ()
    {
        return healthCheckUrl;
    }

    public void setHealthCheckUrl (String healthCheckUrl)
    {
        this.healthCheckUrl = healthCheckUrl;
    }

    public String getMetadata ()
    {
        return metadata;
    }

    public void setMetadata (String metadata)
    {
        this.metadata = metadata;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [port = "+port+", statusPageUrl = "+statusPageUrl+", app = "+app+", securePort = "+securePort+", ipAddr = "+ipAddr+", status = "+status+", homePageUrl = "+homePageUrl+", dataCenterInfo = "+dataCenterInfo+", vipAddress = "+vipAddress+", secureVipAddress = "+secureVipAddress+", hostName = "+hostName+", leaseInfo = "+leaseInfo+", healthCheckUrl = "+healthCheckUrl+", metadata = "+metadata+"]";
    }
}