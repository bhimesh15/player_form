package com.boraji.tutorial.spring;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author imssbora
 */
@Component
@Lazy(value=true)
public class MailService {

   private Map<String, String> map=null;
   
   public MailService() {
      map=new HashMap<>();
   }

   public void send(String mailTo){
      //Send mail code
      System.out.println("Inside send method - "+mailTo);
   }
   
   @PostConstruct
   public void init() {
      map.put("host", "mail.example.com");
      map.put("port", "25");
      map.put("from", "example@boraji.com");
      System.out.println("Inside init method - "+map);
   }

   @PreDestroy
   public void destroy() {
      map.clear();
      System.out.println("Inside destroy method - "+map);
   }
}
