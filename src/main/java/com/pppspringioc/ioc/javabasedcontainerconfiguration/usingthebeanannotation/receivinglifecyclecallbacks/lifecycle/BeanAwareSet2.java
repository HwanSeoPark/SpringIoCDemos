package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.*;

import java.util.Locale;

public class BeanAwareSet2 implements ApplicationContextAware, MessageSourceAware {

	private ApplicationContext applicationContext;
	private MessageSource messageSource;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("9️⃣ BeanAwareSet2 - ApplicationContextAware.setApplicationContext()");
		
		// 컨텍스트에서 빈 개수 출력
		System.out.println("🔍 현재 ApplicationContext에 등록된 빈 개수: " + applicationContext.getBeanDefinitionCount());

		// 특정 타입의 빈 목록 출력
		String[] names = applicationContext.getBeanNamesForType(Object.class);
		System.out.println("📦 등록된 모든 빈 이름 중 일부:");
		                      // min메서드 둘중 최소값을 비교해서 작은값을 리턴함
		for (int i = 0; i < Math.min(names.length, 5); i++) {
			System.out.println("   └ " + names[i]);
		}
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		System.out.println("🔟 BeanAwareSet2 - MessageSourceAware.setMessageSource()");

		// 다국어 메시지 출력 시도 (message.properties 가정)
		try {
			String message = messageSource.getMessage("greeting.message", null, Locale.KOREA);
			System.out.println("💬 [ko] greeting.message = " + message);
		} catch (NoSuchMessageException e) {
			System.out.println("⚠️ 'greeting.message' 키에 대한 메시지를 찾을 수 없음");
		}
	}
}

