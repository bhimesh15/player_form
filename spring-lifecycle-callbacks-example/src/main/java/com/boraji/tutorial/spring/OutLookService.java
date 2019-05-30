package com.boraji.tutorial.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Qualifier("olServiceName")
public class OutLookService {

	public OutLookService() {
		// TODO Auto-generated constructor stub
		System.out.println("OutLookService...................constructor");
	}
	
	public void startMailing(){
		System.out.println("startMailing started and.................executing outlook");
	}
}
