package stepDefinationFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login 
{
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Given("^user navigates to login page$")
	public void user_navigates_to_login_page() {
	 
		driver.get("https://demo.actitime.com/login.do");
	}

	@And("^user enters (.*) in username TextField$")
	public void user_enters_admin_in_username_text_field(String username) {
	 
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("^user enters (.*) in password TextField$")
	public void user_enters_manager_in_password_text_field(String password) {
	 
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	 
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("^user should be navigated to homepage$")
	public void user_should_be_navigated_to_homepage() {
	 
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		Assert.assertTrue(logoutLink.isDisplayed());
	}


}
