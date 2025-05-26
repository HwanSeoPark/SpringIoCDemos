package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.Encryptor;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerProvider;

@Configuration
@ComponentScan({"com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope"})
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//("prototype") 등가
	public Encryptor encryptor() {
		return new Encryptor();
	}

	@Bean
	public EncryptorManagerProvider managerProvider(
			ObjectProvider<Encryptor> provider) { 
		return new EncryptorManagerProvider(provider);
	}
}