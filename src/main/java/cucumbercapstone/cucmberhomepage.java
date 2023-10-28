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





public class cucmberhomepage {
	public static WebDriver driver  = null;
@Given("^opening chrome and mystore $")
public void opening_mystore() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^navigating to dresses my store$")
public void navigating_dressesmystore() {
	driver.get("http://automationpractice.com/index.php");
  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
  	
  driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();
  	}
@Then("^verify the dresses my store$")
public void verify_dressesmystore() {

  	String expectedtitle = "Dresses - My Store";
  	String actualtitle= driver.getTitle();
  	Assert.assertEquals("dresses store is not available", expectedtitle, actualtitle);
  	driver.navigate().back();
	
}
//test scenario 2
@Given("^opening mystore&Tshirts my store $")
public void opening_Tshirtmystore() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^navigating to T shirts my store $")
public void navigating_Tshirtmystore() {
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
  	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
  	
}
@Then("^verifying T shirts my store $")
public void verify_Tshirtsmystore() {
	String expectedtitle = "T-shirts - My Store";
  	String actualtitle= driver.getTitle();
  	Assert.assertEquals("T-shirts page is not availble", expectedtitle, actualtitle);
  	driver.navigate().back();
}
@Given("^opening mystore&womenmy store $")
public void opening_womenmystore() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^navigating to  women shirts my store $")
public void navigating_womenmystore() {
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
   }
@Then("^verifying women  my store $")
public void verify_womenmystore() {
	String expectedtitle = "Women - My Store";
  	String actualtitle= driver.getTitle();
  	Assert.assertEquals("women store is not avilable", expectedtitle, actualtitle);
  	driver.navigate().back();
}
@Given("^opening mystore& searching in my store $")
public void opening_search_barin_mystore() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^Entering text in search bar in  my store $")
public void Enteringtext_inmystore() {
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
  	driver.findElement(By.id("search_query_top")).sendKeys("partyware",Keys.ENTER);
   }
@Then("^verifying searched product in   my store $")
public void verify_searchedprodut_mystore() {
	String expectedtitle = "Search - My Store";
  	String actualtitle= driver.getTitle();
  	Assert.assertEquals(" party ware is not avilable", expectedtitle, actualtitle);
  	driver.navigate().back();
}
@Given("^opening mystore& searching  news letter input in my store $")
public void opening_newsletter_mystore() {
	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("http://automationpractice.com/index.php");
}
@When("^Entering text in newsletter bar in  my store $")
public void Enteringtext_innewsletter_mystore() {
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	driver.findElement(By.id("newsletter-input")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
   }
@Then("^verifying email for news letter in   my store $")
public void verify_email_mystore() {
	String expectedtitle = "My Store";
  	String actualtitle= driver.getTitle();
  	Assert.assertEquals(" mystore is not avilable", expectedtitle, actualtitle);
  	driver.navigate().back();
}




}

