package code.lzl.ms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="ms-provider",fallback = MsProviderServiceHystrix.class)
public interface MsProviderService {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String visitProvider();

}
