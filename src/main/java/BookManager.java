import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Book Manager application driver
 *
 */
public class BookManager 
{
	public static void main( String[] args )
	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BookManagerConfig.class);

		((AnnotationConfigApplicationContext)appContext).close();
	}
}
