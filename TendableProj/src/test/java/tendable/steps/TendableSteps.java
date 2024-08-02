package tendable.steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import tendable.pojo.Contact_Us_Pojo;
import tendable.pojo.Top_Menu_Pojo;
import tendable.utility.TendableUtility;

public class TendableSteps extends TendableUtility {
	
	@Given("User on Tendable page")
	public void user_on_tendable_page() {
		Top_Menu_Pojo pojo = new Top_Menu_Pojo();
		String browser ="Chrome";
		String url = "https://www.tendable.com/";
		browserLaunch(browser,url);	
		
		System.out.println("User on Tendablr page....!");
		
	}

	@When("click the Home button")
	public void click_the_home_button() {
		Top_Menu_Pojo pojo = new Top_Menu_Pojo();
		WebElement homeButton = pojo.getHomeButton();
		
		
		
		homeButton.click();
		
		System.out.println("Launch URL and Home URL are always same...!");
		
		System.out.println(pojo.getRequestADemoIcon().getText() +"are Vissible while click Home button");
	}

	@When("Click the Our Story")
	public void click_the_our_story() {
		Top_Menu_Pojo pojo = new Top_Menu_Pojo();
		WebElement ourStory = pojo.getOurStoryButton();
		
		String buttonTextBefore = ourStory.getText();
		
		ourStory.click();
		
String buttonTextAfter = ourStory.getText();
		
		if (!buttonTextBefore.equals(buttonTextAfter)) {
            System.out.println("Button clicked successfully, text changed from: " + buttonTextBefore + " to: " + buttonTextAfter);
        } else {
            System.out.println("Button click failed, text did not change.");
        }
		
		
		System.out.println(pojo.getRequestADemoIcon().getText() +"are Vissible while Click the Our Story");
	}

	@When("Click the Our Solution button.")
	public void click_the_our_solution_button() {
		Top_Menu_Pojo pojo = new Top_Menu_Pojo();
		
		WebElement ourSolution = pojo.getOurSolutionButton();
		
		String buttonTextBefore = ourSolution.getText();
		
		ourSolution.click();
		
String buttonTextAfter = ourSolution.getText();
		
		if (!buttonTextBefore.equals(buttonTextAfter)) {
            System.out.println("Button clicked successfully, text changed from: " + buttonTextBefore + " to: " + buttonTextAfter);
        } else {
            System.out.println("Button click failed, text did not change.");
        }
		
		System.out.println(pojo.getRequestADemoIcon().getText() +"are Vissible while Click the Our Solution button");
	}

	@When("Click Why Tendable button")
	public void click_why_tendable_button() {
		Top_Menu_Pojo pojo = new Top_Menu_Pojo();
		
		WebElement whyTendable = pojo.getWhyTendableButton();
		
		String buttonTextBefore = whyTendable.getText();
		
			whyTendable.click();
			
			String buttonTextAfter = whyTendable.getText();
			
			if (!buttonTextBefore.equals(buttonTextAfter)) {
	            System.out.println("Button clicked successfully, text changed from: " + buttonTextBefore + " to: " + buttonTextAfter);
	        } else {
	            System.out.println("Button click failed, text did not change.");
	        }
			
			System.out.println(pojo.getRequestADemoIcon().getText() +"are Vissible while Click Why Tendable button");
		
	}
	
	
	
	//2.Contact as Feature to be testing
	
	@Given("User on Tendable Home page")
	public void user_on_tendable_home_page() {
		
		
		System.out.println("User on Tendablr Home page....!");
		
	}

	
	@When("click the Contact Us button")
	public void click_the_contact_us_button() {
		
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		
		WebElement clickContactUs = pojo.getContactUsButton();
		
		clickContactUs.click();
	    
	}

	@When("Click the contact button which from Marketing tag")
	public void click_the_contact_button_which_from_marketing_tag() {
		
		Duration timeout = Duration.ofSeconds(30);
		 waitForNextPageToLoad(driver, By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/button"), timeout);
		 
		// Switch to the new window (assuming only two windows are present)
		    for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		    
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		
		WebElement contactUsMarket = pojo.getContactUsMarket();
		contactUsMarket.click();
		
		
	}

	@When("^User enter the full name (.*)$")
	public void user_enter_the_full_name_iniyan(String firstName) {
		
		Duration timeout = Duration.ofSeconds(30);
		 waitForNextPageToLoad(driver, By.xpath("//*[@id='form-input-fullName']"), timeout);
		 
		// Switch to the new window (assuming only two windows are present)
		    for (String windowHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(windowHandle);
		    }
		    
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		
		WebElement fullName = pojo.getFirstName();
		
		fullName.sendKeys(firstName);
		
		
	}

	@When("^User enter the Organisation (.*)$")
	public void user_enter_the_organisation(String orgname) {
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		WebElement orgName = pojo.getOrgName();
		orgName.sendKeys(orgname);
		
	}

	@When("^User enter the Phone Number (.*)$")
	public void user_enter_the_phone_number(String phonenum) {
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		
		WebElement phoneNo = pojo.getMobileNo();
		phoneNo.sendKeys(phonenum);
	}

	@When("^User enter the email id (.*)$")
	public void user_enter_the_email(String mail) {
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		WebElement mailId = pojo.getMailId();
		mailId.sendKeys(mail);
		
	}

	@When("User skip to enter the input on Message box.")
	public void user_skip_to_enter_the_input_on_message_box() {
	   
	}

	@When("User click the i agree button")
	public void user_click_the_i_agree_button() {
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		WebElement clickAgree = pojo.getAgreeClick();
		clickAgree.click();
	}

	@When("User click submit button")
	public void user_click_submit_button() {
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		WebElement submitButton = pojo.getSubmitButton();
		submitButton.sendKeys(Keys.ENTER);
		//submitButton.click();
		
	}

	@Then("user got error message because not enter the value on Messsage box.")
	public void user_got_error_message_because_not_enter_the_value_on_messsage_box() {
		
		try
		{
		
			Duration timeout = Duration.ofSeconds(30);
			 waitForNextPageToLoad(driver, By.xpath("//*[text()='Sorry, there was an error submitting the form. Please try again.']"), timeout);
			 
			
			    
		Contact_Us_Pojo pojo = new Contact_Us_Pojo();
		
		WebElement errorMessage = pojo.getErrorMessage();
		
		String errormsg = errorMessage.getText();
		
		System.out.println(errormsg);
		
		
		 waitForNextPageToLoad(driver, By.xpath("//*[text()='This field is required']"), timeout);
		 
		
		
		WebElement missingField = pojo.getMissingField();
		
		
		
		String errormsg1 = missingField.getText(); 
		
		
		System.out.println(errormsg1);
		
		}
		
		catch(NoSuchElementException e)
		{
			 System.out.println("No error message found");
		}
		
		//Alert simpleAlert = driver.switchTo().alert();
        //System.out.println("Simple Alert Message: " + simpleAlert.getText());
       
		
		
		
		
	}




	


}
