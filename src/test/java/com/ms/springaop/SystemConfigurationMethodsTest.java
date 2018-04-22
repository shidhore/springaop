package com.ms.springaop;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.springaop.configuration.SystemConfigurationMethods;
import com.ms.springaop.service.SimpleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SystemConfigurationMethods.class)
public class SystemConfigurationMethodsTest {

	@Autowired
	private SimpleService simpleService;

	@Test
	public void testSimpleServiceNotNull() {
		assertNotNull(simpleService);
	}

	@Test
	public void serviceShouldReturnDomainObject() {
		assertNotNull(simpleService.getDomainObject());
	}

}
