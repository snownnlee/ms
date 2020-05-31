package code.lzl.ms.service;

import org.springframework.stereotype.Component;

@Component
public class MsProviderServiceHystrix implements MsProviderService {

	@Override
	public String visitProvider() {
		return "【Hello, I am MsProviderServiceHystrix!】";
	}

}
