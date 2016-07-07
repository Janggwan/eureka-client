package kr.ac.kaist.resl.eureka.model;

public class DataCenterInfo
{
	private String name;

	private Metadata metadata;

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public Metadata getMetadata ()
	{
		return metadata;
	}

	public void setMetadata (Metadata metadata)
	{
		this.metadata = metadata;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [name = "+name+", metadata = "+metadata+"]";
	}
}