package webtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firsttest {
// here we will check the expected web page title should match with actual web page title 
	
	public static void main(String[] args) {
		//step1 : Open 'browser 
		WebDriver driver=new ChromeDriver();
		
		//step2: open the website 
		 driver.get("https://www.google.com/");
		
		//step3: get the title of the website 
		 
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		if(actTitle.equals("Google"))
		{
			System.out.println("The title is correct");
		}else
		{
			System.out.println("The title is incorrect");
		}
		
		driver.quit();

	}

}
