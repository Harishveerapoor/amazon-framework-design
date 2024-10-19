package testclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazona.Loginpage;
import page.page;

public class test extends page{

	public test() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() {
	page pa=PageFactory.initElements(driver, page.class);
	page.initialization("chrome", "https://www.amazon.in/");
	}
	
	@Test
	public void me() throws InterruptedException {
	Loginpage page=	PageFactory.initElements(driver, Loginpage.class);
	page.login();
		System.out.println("logged in succesfully");
		System.out.println("sucefully added to cart");
	}
	@AfterMethod
	public void comeback() {
	page pa=PageFactory.initElements(driver, page.class);
	pa.teardown();
	}

}
