package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args)  {
	WebDriver driver= new ChromeDriver();
	driver.get("http://WWW.google.co.in");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("Facebook login"+Keys.ENTER);
	
	WebElement Loginpage=driver.findElement(By.xpath("//*[text()='Facebook - log in or sign up']"));
	Loginpage.click();
	
	WebElement Createaccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
	Createaccount.click();
	
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
    WebElement firstNameInput=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
    firstNameInput.sendKeys("Allan");
    
	WebElement  lastNameInput=driver.findElement(By.xpath("//input[starts-with(@name,'lastname')]")); 
	lastNameInput.sendKeys("Allan");
	
    WebElement Mobilenumber=driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
    Mobilenumber.sendKeys("9788970027");
    
    WebElement NewPassword=driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]"));
    NewPassword.sendKeys("123456@");
    
    Select date=new Select(driver.findElement(By.xpath("//select[contains(@id,'day')]")));
    date.selectByValue("15");
    
    Select month=new Select(driver.findElement(By.xpath("//select[contains(@id,'month')]")));
    month.selectByVisibleText("Jun");
    
    Select year=new Select(driver.findElement(By.xpath("//select[contains(@id,'year')]")));
    year.selectByVisibleText("2002");
    
    
    WebElement genderRadioButton = driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[2]"));
    genderRadioButton.click();
    
    
    WebElement SignUp=driver.findElement(By.xpath("//Button[contains(@name,'websubmit')]"));
    SignUp.click();
    System.out.println("Facebook create account");
    
	}
}
