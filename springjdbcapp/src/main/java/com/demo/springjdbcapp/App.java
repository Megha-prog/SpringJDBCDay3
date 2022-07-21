package com.demo.springjdbcapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/springjdbcapp/springdb.xml");


        WorkerDao workerdao = (WorkerDao)context.getBean("workerdao");
        
        Worker worker = new Worker();
//        worker.setId(1000);
//        worker.setName("Megha");
//        worker.setAddress("Bengaluru");
//        
//        int statusCode = workerdao.saveWorker(worker);
        
        
//       int status= workerdao.updateWorker(worker);
//       System.out.println(status);
       
       worker.setId(1000);
       int status= workerdao.deleteWorker(worker); 
       System.out.println(status);
        
    }
}
