/**
 * Written by Louis LeBlanc
 * For Homework Assignment 1
 * Expert Software Development in Java
 * Brandeis University
 * Instructed by Vitaly Yurik
 */

package edu.brandeis.rseg105.BookManager;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//@SpringBootApplication
public class BookManagerApplication {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context.xml");
		ctx.refresh();

		Category classics = ctx.getBean("classics", Category.class);
		Category novels = ctx.getBean("novels", Category.class);
		Category java = ctx.getBean("java", Category.class);

		System.out.println(classics);
		System.out.println(novels);
		System.out.println(java);

		ctx.close();
	}
}
