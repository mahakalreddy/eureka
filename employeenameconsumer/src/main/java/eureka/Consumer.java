package eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class Consumer {
    /*@Autowired
	private DiscoveryClient discover;
	
	
	public String consume(){
		
		List<InstanceInfo> instance=discover.getInstancesById("producer-service");
		String baseUrl=instance.get(0).getHomePageUrl().toString();
		String resultUrl=baseUrl+"/employee";
		System.out.println(resultUrl);
		return resultUrl;
		
	}*/
	
	
	
	@RequestMapping("/")
	public String dummy(){
		
		return"working";
	}




}
