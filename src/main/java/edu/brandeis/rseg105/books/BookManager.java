package edu.brandeis.rseg105.books;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


/**
 * Book Manager application driver
 *
 */
public class BookManager
{

	public static void main( String[] args ) {
		List<Category> categoryList = new ArrayList<Category>();

		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();

		appContext.load("classpath:spring/app-context.xml");
		appContext.refresh();

		categoryList.add((Category) appContext.getBean("classics"));
		categoryList.add((Category) appContext.getBean("novels"));
		categoryList.add((Category) appContext.getBean("java"));

		for (Object e: categoryList) System.out.println((Category)e);

		appContext.close();
	}

}

