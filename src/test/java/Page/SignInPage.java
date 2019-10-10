package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.Common;

public class SignInPage extends Common {
	
	public void openPage(String url) {
		driver.get(url);
	}
	
	public void inputUserName(String username) {
		driver.findElement(By.xpath("//*[@id='client-login']/form/div[2]/input[@name='email']")).sendKeys(username);
	}
	
	public void inputPassword(String password) {
		driver.findElement(By.xpath("//*[@id='client-login']/form/div[3]/input[@name='password']")).sendKeys(password);
	}
	
	public void clickSignInButton() {
		driver.findElement(By.xpath("//*[@id='client-login']/form/button")).click();
	}
	
	public String getErrorMessage() {
		return driver.findElement(By.xpath("//*[@id=\"client-login\"]/form/div[1]")).getText();
	}
	
	public String navigateToHomePage() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		return driver.findElement(By.xpath("//*[@id='main-page-content']/section/div/div/h1")).getText();
	}
	
	public boolean titleIsDisplay() {
		return driver.findElement(By.xpath("//*[@id='client-login']/p")).isDisplayed();
	}

}
