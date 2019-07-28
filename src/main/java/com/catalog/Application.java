package com.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
}







//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//
//    @Override
//    public void run(String... args) {
//
//
//        repository.save(new ItemEntity(1,"book",50,"abc123"));
//        repository.save(new ItemEntity(2,"cd", 35,"xyz789"));
//        repository.save(new ItemEntity(3,"laptop",120,"aaa111"));
//
//        System.out.println("\nfindAll()");
//        repository.findAll().forEach(x -> System.out.println(x));
//
//        System.out.println("\nfindByItemNumber(1)");
//        ItemEntity item1 = repository.findOne((long) 1);
//        System.out.println(item1); 
//        
//        System.out.println("\ndelete(1)");
//        repository.delete(item1);
//
//        System.out.println("\nfindAll()");
//        repository.findAll().forEach(x -> System.out.println(x));
//    }
//}
