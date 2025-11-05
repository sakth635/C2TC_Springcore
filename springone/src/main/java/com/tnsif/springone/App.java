package com.tnsif.springone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
  public static void main(String[] args) {
   
   ApplicationContext context = new ClassPathXmlApplicationContext();
   
   Airtel airtel=(Airtel) context.getBean("air");
   airtel.call();
   airtel.data();
   
   
  }
}
