package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/key_presses");

		Thread.sleep(3000);

    	Actions AT = new Actions(driver);

		AT.sendKeys(Keys.BACK_SPACE).build().perform();     //For keyboard related actions like ALT , Contrl etc.we use sendkeys method from actions class and
		                                                         //for actions use the method from keys class that all methods are static methods

		String Text = driver.findElement(By.id("result")).getText();  //for validation we use the gettext method
		System.out.println(Text);

		Thread.sleep(2000);

		AT.sendKeys(Keys.ALT).build().perform();

		String Text1 = driver.findElement(By.id("result")).getText();
		System.out.println(Text1);

		Thread.sleep(1000);

//		AT.sendKeys(Keys.CONTROL).perform();

		String Text2 = driver.findElement(By.id("result")).getText();
		System.out.println(Text2);

		Thread.sleep(1000);

		AT.sendKeys(Keys.ENTER).build().perform();

	    String Text3 = driver.findElement(By.id("result")).getText();
		System.out.println(Text3);

        Thread.sleep(1000);

		AT.sendKeys(Keys.CANCEL).build().perform();

	    String Text4 = driver.findElement(By.id("result")).getText();
		System.out.println(Text4);

		Thread.sleep(1000);

	    AT.sendKeys(Keys.CLEAR).build().perform();

	    String Text5 = driver.findElement(By.id("result")).getText();
    	System.out.println(Text5);


		Thread.sleep(1000);

	    AT.sendKeys(Keys.DELETE).build().perform();

	    String Text6 = driver.findElement(By.id("result")).getText();
    	System.out.println(Text6);

    	Thread.sleep(1000);

    	driver.quit();







	}

}
