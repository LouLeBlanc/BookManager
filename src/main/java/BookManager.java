import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class BookManager 
{
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BookManagerConfig.class);

		appContext.close();
	}
}
