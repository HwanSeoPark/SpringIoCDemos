package com.pppspringioc.ioc.componentconfig.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.pppspringioc.ioc.componentconfig.beans.TestBean;

@Component
public class FactoryMethodComponent {

	private static int i;

	@Bean
	@Qualifier("public")
	public TestBean publicInstance() {
		return new TestBean("publicInstance");
	}

	// use of a custom qualifier and autowiring of method parameters
	@Bean
	protected TestBean protectedInstance(
			@Qualifier("public") TestBean spouse,
			@Value("#{privateInstance.age}") String country) {
		TestBean tb = new TestBean("protectedInstance", 1);
		tb.setSpouse(spouse);
		tb.setCountry(country);
		return tb;
	}

	@Bean
	private TestBean privateInstance() {
		return new TestBean("privateInstance", i++, "10");
	}

	@Bean
	@RequestScope
	public TestBean requestScopedInstance() {
		return new TestBean("requestScopedInstance", 3);
	}
}
