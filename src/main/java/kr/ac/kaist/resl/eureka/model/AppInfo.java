package kr.ac.kaist.resl.eureka.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfo {
	@JsonProperty("instance")
	public Instance instance;
}
