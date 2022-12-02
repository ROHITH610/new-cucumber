package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {
	public static WebDriver driver = Test_Runner.driver;

	@Given("^user is able to launch the URL$")
	public void user_is_able_to_launch_the_URL() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user is able to give username$")
	public void user_is_able_to_give_username() throws Throwable {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));

		username.sendKeys("rohith610");
	}

	@When("^user is able to give password$")
	public void user_is_able_to_give_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("rohith123@RR");

	}

	@Then("^user is able to login if username and password are correct$")
	public void user_is_able_to_login_if_username_and_password_are_correct() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

	}

	@Given("^user selects the location$")
	public void user_selects_the_location() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByValue("Adelaide");
	}

	@When("^user selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Creek");
	}

	@When("^user selects the room$")
	public void user_selects_the_room() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(room);
		s2.selectByValue("Deluxe");

	}

	@When("^user selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(roomnos);
		s3.selectByValue("1");
	}

	@When("^user gives check in date$")
	public void user_gives_check_in_date() throws Throwable {
		WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.click();
		checkindate.sendKeys("22/11/2022");
	}

	@When("^user gives check out date$")
	public void user_gives_check_out_date() throws Throwable {
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.click();
		checkoutdate.sendKeys("23/11/2022");

	}

	@When("^user selects the adults$")
	public void user_selects_the_adults() throws Throwable {
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adultroom);
		s4.selectByValue("2");
	}

	@When("^user selects the child$")
	public void user_selects_the_child() throws Throwable {
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childroom);
		s5.selectByValue("4");
	}

	@When("^user clicks the search$")
	public void user_clicks_the_search() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
	}

	@When("^user gives the select hotel$")
	public void user_gives_the_select_hotel() throws Throwable {
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobutton.click();

	}

	@Then("^user gives the continue$")
	public void user_gives_the_continue() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}

	@Given("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("rohith");
	}

	@Given("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("raj");
	}

	@Given("^user enters address$")
	public void user_enters_address() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("kannur,kerala");
	}

	@Given("^user enters card no$")
	public void user_enters_card_no() throws Throwable {

		WebElement creditcardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditcardno.sendKeys("5699874562189612");
	}

	@Given("^user verify the card type$")
	public void user_verify_the_card_type() throws Throwable {
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(cctype);
		s6.selectByValue("VISA");
	}

	@Given("^user verify the  month$")
	public void user_verify_the_month() throws Throwable {
		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(expmonth);
		s7.selectByValue("12");

	}

	@Given("^user verify the year$")
	public void user_verify_the_year() throws Throwable {
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(expyear);
		s8.selectByValue("2022");

	}

	@Given("^user enters the cvv$")
	public void user_enters_the_cvv() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("546");
	}

	@Given("^user clicks the book button$")
	public void user_clicks_the_book_button() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'][1])"));
		booknow.click();
	}

	@Then("^user clicks the logout button$")
	 public void user_clicks_the_logout_button() throws Throwable {
		WebElement logout = driver.findElement(By.xpath("//a[@href=\"Logout.php\"]"));
		logout.click();
		

}
}
