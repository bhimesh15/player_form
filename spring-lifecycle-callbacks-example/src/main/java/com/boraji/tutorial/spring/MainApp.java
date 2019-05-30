package com.boraji.tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 */
public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
      
      /*// Send mail 1
      MailService mailService1 = context.getBean(MailService.class);
      mailService1.send("abcd@example.com");
      System.out.println(mailService1);
      // Send mail 2
      MailService mailService2 = context.getBean(MailService.class);
      mailService2.send("boraji@example.com");
      System.out.println(mailService2);*/
      
      System.out.println("**************************");
      InitDestroyService destroyService = context.getBean(InitDestroyService.class);
      destroyService.process();
      context.start();
     // System.out.println("context.CLASSPATH_ALL_URL_PREFIX"+context.start());
      context.close();
      context.start();
      System.out.println("sadsa");
      
   }
}
