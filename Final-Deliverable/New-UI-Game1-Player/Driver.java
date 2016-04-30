/*
 * @Author: Kartik
 * @Version1: 4/14/16
 * 
 * Class Description:This is the launcher for the program. This creates a new UI and runs the program.
 */
import java.io.IOException;

//The Driver is used as a launcher for the program.
public class Driver
{
	
	public static void main(String[] args) throws IOException
	{
		UI newUI = new UI();
		newUI.run();
	
	}
}