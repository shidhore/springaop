package com.ms.springaop.repository;

import org.springframework.stereotype.Repository;

import com.ms.springaop.domain.DomainObject;

@Repository
public class SimpleRepository {
	
	public DomainObject getDomainObject() {
		return new DomainObject();
	}

}
