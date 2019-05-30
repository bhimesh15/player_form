package com.boraji.tutorial.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class InitDestroyService {

	
	@Autowired
	@Qualifier("olServiceName")
	private OutLookService olService;
	
	public InitDestroyService() {
		// TODO Auto-generated constructor stub
		
		System.out.println("InitDestroyService object created^^^^^^^^^^^^^^");
	}
	public void process(){
		System.out.println("process.............STARTED");
		olService.startMailing();
	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("#################initMethod..........executed");
	}
	
	@PreDestroy
	public void destroyMethod(){
		System.out.println("$$$$$$$$$$$$$$$$destroyMethod..........executed");
	}
	
}
