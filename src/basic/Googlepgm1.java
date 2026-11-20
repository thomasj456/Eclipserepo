package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
//		driver.close();
		
		String actualtitle=driver.getTitle();
		
		String Expected_title="Googlee";
		
		if(actualtitle.equals(Expected_title))
		{
			System .out.println("The title is correct");
		}
		else
		{
			System .out.println("The title is wrong");
		}
		
		

	}

}
