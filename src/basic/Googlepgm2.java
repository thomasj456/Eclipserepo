package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String Actual_result=driver.getPageSource();
		
		String Expected_result="Gmail";
		
		if(Actual_result.contains(Expected_result))
		{
			System .out.println("Test passed");
		}
		else
		{
			System .out.println("Test failed");
		}

	}

}
