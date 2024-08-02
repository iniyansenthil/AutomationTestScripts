package tendable.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tendable.utility.TendableUtility;

public class Contact_Us_Pojo extends TendableUtility  {

	public Contact_Us_Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	// Contact us button
	
	@FindBy(xpath="/html/body/header/div/div[1]/a[1]")
	private WebElement contactUsButton;
	
	
	// click contact us from marketing 
	
	//     
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/button")
	private WebElement contactUsMarket;
	
	
	//First name 
	@FindBy(xpath="//*[@id='form-input-fullName']")
	private WebElement firstName;
	
	
	// Organisation name
	//  
	@FindBy(xpath="//*[@id='form-input-organisationName']")
	private WebElement orgName;
	
	
	
	
	//Mobile number
	
	@FindBy(xpath="//*[@id='form-input-cellPhone']")
	private WebElement mobileNo;
	
	
	//E mail 
	
 
	@FindBy(xpath="//*[@id='form-input-email']")
	private WebElement mailId;
	
	
	//Job role
	
	@FindBy(xpath="//*[@id='form-input-jobRole']")
	private WebElement jobRole;
	
	//agree button
	
	@FindBy(xpath="//input[@class='freeform-input' and @name='consentAgreed' and @type='radio' and @id='form-input-consentAgreed-0']")
	private WebElement agreeClick;
	
	
	
	
	// submit button
	
	
	@FindBy(xpath="//*[@id='contactMarketingPipedrive-163701']/div[10]/div/button")
	private WebElement submitButton;
	
	
	
	
	
	
	
	
	//Error message
	
	@FindBy(xpath="//*[text()='Sorry, there was an error submitting the form. Please try again.']")
	private WebElement errorMessage;
	
	//missed the field to fill in form
	@FindBy(xpath="//*[text()='This field is required']")
	private WebElement missingField;


	public WebElement getContactUsButton() {
		return contactUsButton;
	}


	public WebElement getContactUsMarket() {
		return contactUsMarket;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getMobileNo() {
		return mobileNo;
	}


	public WebElement getMailId() {
		return mailId;
	}


	public WebElement getJobRole() {
		return jobRole;
	}


	public WebElement getAgreeClick() {
		return agreeClick;
	}


	public WebElement getSubmitButton() {
		return submitButton;
	}


	public WebElement getErrorMessage() {
		return errorMessage;
	}


	public WebElement getMissingField() {
		return missingField;
	}
	
	
	
	
	
	
	
}
