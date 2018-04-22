package com.ms.springaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springaop.domain.DomainObject;
import com.ms.springaop.repository.SimpleRepository;

@Service
public class SimpleService {

	@Autowired
	private SimpleRepository simpleRepository;

	public DomainObject getDomainObject() {
		return simpleRepository.getDomainObject();
	}

}
