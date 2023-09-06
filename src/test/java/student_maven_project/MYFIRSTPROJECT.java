package student_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYFIRSTPROJECT {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    
    WebDriver driver1 =new ChromeDriver();
    driver1.manage().window().maximize();
    driver.get("https://www.amazon.com");
    

	
		
				

	}

	private static WebDriver newchromedriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
