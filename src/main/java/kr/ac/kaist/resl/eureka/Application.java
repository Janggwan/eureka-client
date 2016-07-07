package kr.ac.kaist.resl.eureka;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import kr.ac.kaist.resl.eureka.http.GZipClientHttpRequestFactory;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    public void run(String... args) throws Exception {
    	
    	String urlToRetrieve = "http://192.168.1.63:8080/eureka/v2/apps/eureka/janggwan-NUC";
    	
        
		Map<String, Object> instance = getInstanceInfo(urlToRetrieve);
        
        for(String key : instance.keySet()) {
        	System.out.println(key+"\t"+instance.get(key));
        }
        
        String appId = "asdf2";
        String urlToPut = "http://192.168.1.63:8080/eureka/v2/apps/"+appId;
        
        String requestBody = "{\"instance\":{\"instanceId\":\"janggwan-NUC\",\"hostName\":\"janggwan-NUC\",\"app\":\""+appId+"\",\"ipAddr\":\"127.0.1.1\",\"status\":\"UP\",\"overriddenstatus\":\"UNKNOWN\",\"port\":{\"$\":8080,\"@enabled\":\"true\"},\"securePort\":{\"$\":443,\"@enabled\":\"false\"},\"countryId\":1,\"dataCenterInfo\":{\"@class\":\"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo\",\"name\":\"MyOwn\"},\"leaseInfo\":{\"renewalIntervalInSecs\":30,\"durationInSecs\":90,\"registrationTimestamp\":1465369757979,\"lastRenewalTimestamp\":1467892492660,\"evictionTimestamp\":0,\"serviceUpTimestamp\":1465369747726},\"metadata\":{\"@class\":\"java.util.Collections$EmptyMap\"},\"appGroupName\":\"UNKNOWN\",\"homePageUrl\":\"http://janggwan-NUC:8080/\",\"statusPageUrl\":\"http://janggwan-NUC:8080/Status\",\"healthCheckUrl\":\"http://janggwan-NUC:8080/healthcheck\",\"vipAddress\":\"eureka.mydomain.net\",\"isCoordinatingDiscoveryServer\":\"true\",\"lastUpdatedTimestamp\":\"1465369757979\",\"lastDirtyTimestamp\":\"1465369718032\",\"actionType\":\"ADDED\"}}";
        
        
        String responseBody = registerApp(urlToPut, requestBody);
        
        System.out.println(responseBody);
        
        
        String instanceId = "janggwan-NUC";
        String urlToHeartbeat = "http://192.168.1.63:8080/eureka/v2/apps/"+appId+"/"+instanceId;
        
        System.out.println(sendHeartbeat(urlToHeartbeat, requestBody));
        
        
        
    }
    private String sendHeartbeat(String urlToHeartbeat, String requestBody) {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); 
        HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers); 
        RestTemplate restTemplate = new RestTemplate(new GZipClientHttpRequestFactory());
        ResponseEntity<String> response = restTemplate.exchange(urlToHeartbeat, HttpMethod.PUT, entity, String.class);
        // check the response, e.g. Location header,  Status, and body
        response.getHeaders().getLocation();
        response.getStatusCode();
        String responseBody = response.getBody();
		return responseBody;
	}
	private String registerApp(String urlToPut, String requestBody) {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); 
        HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers); 
        RestTemplate restTemplate = new RestTemplate(new GZipClientHttpRequestFactory());
        ResponseEntity<String> response = restTemplate.exchange(urlToPut, HttpMethod.POST, entity, String.class);
        // check the response, e.g. Location header,  Status, and body
        response.getHeaders().getLocation();
        response.getStatusCode();
        String responseBody = response.getBody();
		return responseBody;
	}

	private Map<String, Object> getInstanceInfo(String url) throws JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate(new GZipClientHttpRequestFactory());
        String object = restTemplate.getForObject(url, String.class);

        JsonParser parser = JsonParserFactory.getJsonParser();
        Map<String, Object> appInfo = parser.parseMap(object);
        @SuppressWarnings("unchecked")
		Map<String, Object> instance = (Map<String, Object>) appInfo.get("instance");
        
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String jsonString = mapper.writeValueAsString(object);
        log.info(jsonString);
		return instance;
	}
}