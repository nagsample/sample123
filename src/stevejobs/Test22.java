package stevejobs;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test22
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().timeouts()
		           .implicitlyWait(10,TimeUnit.SECONDS);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\batch238\\ss.png");
		FileUtils.copyFile(src,dest);
	}
}




