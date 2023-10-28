package cucumbercapstone;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Cucumberlogin {
	public static WebDriver driver  = null;
@Given("^logging into my store & not giving any credentials $")
public void opening_loginpage_clikingenterbuttuon() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^clicking on entering button in login  my store$")
public void navigating_dressesmystore() {
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
 	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
 	driver.findElement(By.id("email_create")).sendKeys("",Keys.ENTER);
  	}
@Then("^verifing the credentials given or not $")
public void verifying_credetails() {
	String expectedtitle = "Invalid email address.";
 	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();
 	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
}

@Given("^Entering only E-mail&checking credentials $")
public void  Entering_only_Email() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	}
@When("^entering only mail id $")
public void entering_only_mailid () {
driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
   	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
   	driver.findElement(By.id("passwd")).sendKeys("",Keys.ENTER);
   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
}
@Then("^checking id registered mail  $")
public void Checking_registredmail_ornot() { 
	String expectedtitle = "Password is required.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
	
}

@Given("^Entering only E-mail& wrong password $")
public void  Entering_only_Email_wrongpassword() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	}
@When("^entering mailid  and wrong password $")
public void entering_only_mailid_wrongpassword () {
driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
   	
    driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	
}
@Then("^checking id registered mail&password  $")
public void Checking_mail_password() { 
	String expectedtitle = "Invalid password.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
	
}
@Given("^Entering password& not entering mail $")
public void  Entering_password_notentering_mail() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	}
@When("^entering password cheking for mail  $")
public void entering_password_checking_mail () {
driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("");
	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
}
@Then("^verifying for password & asking to enter mail $")
public void verifying_password_asking_mail() {
	String expectedtitle = "An email address required.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);

}
@Given("^Entering registred mail & password $")
public void  Entering_registred_mail_password() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	}
@When("^giving correct credentials $")
public void entering_correct_credentails() {
driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
    driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Khasimvali@9381",Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li/a/span")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
}
@Then("^verifying my account $")
public void verifying_myaccount() {
	String expectedtitle = "My Store";
   	String actualtitle= driver.getTitle();
   	Assert.assertEquals("  my store is not avilable", expectedtitle, actualtitle);
	}

}
