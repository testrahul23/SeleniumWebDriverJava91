package webtest;
import 	org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigationTest {
	// here we will automate the navigation through selenium webdriver
	//test url used 
	//url1: https://opensource-demo.orangehrmlive.com/auth/login
	//url2: https://demo.automationtesting.in/Register.html
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		//get the title of the website 
		String title=driver.getTitle();
		
		System.out.println("The title is"+title);
		
		Thread.sleep(2000);
		//now to switch this into other website
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		String title1=driver.getTitle();
		System.out.println("The current title is"+title1);
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    String title2=driver.getTitle();
	    System.out.println("The current title is"+title2);
	    
	    driver.quit();
	    

	}

}
