package tendable.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tendable.utility.TendableUtility;

public class Top_Menu_Pojo extends TendableUtility {
	
	public Top_Menu_Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	//Home Button
	
	@FindBy(xpath="//a[@href='https://www.tendable.com/']")
	private WebElement homeButton;
	
	
	//Our Story Button
	
	@FindBy(xpath="//a[@href='https://www.tendable.com/our-story']")
	private WebElement ourStoryButton;
	
	//Our Solution Button
	
	
	@FindBy(xpath="//*[@id='main-navigation-new']/ul/li[2]/a")
	private WebElement ourSolutionButton;
	
	
	//Why Tendable button
	
	@FindBy(xpath="//a[@href='https://www.tendable.com/why-tendable']")
	private WebElement whyTendableButton;
	
	//Reqyuest a Demo icon
	
	@FindBy(xpath="//a[@class='button ' and @href='https://www.tendable.com/book-a-demo']")
	private WebElement RequestADemoIcon;

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getOurStoryButton() {
		return ourStoryButton;
	}

	public WebElement getOurSolutionButton() {
		return ourSolutionButton;
	}

	public WebElement getWhyTendableButton() {
		return whyTendableButton;
	}

	public WebElement getRequestADemoIcon() {
		return RequestADemoIcon;
	}
	
	
	
	
	

}
