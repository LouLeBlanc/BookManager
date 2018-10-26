
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Book Manager application driver
 *
 */
public class BookManager
{
	public static void main( String[] args )
	{
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();

		appContext.load("classpath:spring/app-context.xml");
		appContext.refresh();


		appContext.close();
	}

	public static void showBooks() {

	}
}

