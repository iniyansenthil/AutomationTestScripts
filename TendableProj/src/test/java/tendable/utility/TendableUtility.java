package tendable.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TendableUtility {
	
	//Launch browser  
			public static WebDriver driver ;
					public static void browserLaunch(String browserName,String url) {
						
				//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

						if (browserName.equals("Chrome")) {
							
							driver = new ChromeDriver();
						}
						else if (browserName.equals("Edge")) {
							
							driver = new EdgeDriver();
						}
						else if (browserName.equals("Firefox")) {
							
							driver = new FirefoxDriver();
						}
						
						driver.manage().window().maximize();
						
						if (driver!=null) {
							driver.get(url);
						}
						
						else
						{
							throw new IllegalStateException("Driver not initialized. Call launchBrowser() first.");
						}

						
						
					}
					
					
					
		//Text field action using sendkeys or javascript executor
					public static void textField(WebElement element,String value)
					{
						element.sendKeys(value);
						

					}
					
					public static void textField(WebDriver driver, WebElement element, String value) {
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        element.click();
				        js.executeScript("arguments[0].value = arguments[1]", element, value);
				    }
					
					
		//click action using normal click or Java Script executor 
					public static void buttonClick(WebElement element) {
						
						element.click();

					}
					
		//Double click action  using normal click or Java Script executor

					public static void doubleClick(WebDriver driver, WebElement element) {
				        Actions actions = new Actions(driver);
				        actions.doubleClick(element).perform();
				    }
					
		//Drag and drop action
					public static void dragAndDrop(WebDriver driver, WebElement sourceElement, WebElement targetElement) {
				        Actions actions = new Actions(driver);
				        actions.dragAndDrop(sourceElement, targetElement).perform();
				    }
		// scroll down to element
					public static void scrollToElement(WebDriver driver, WebElement element) {
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})", element);
				    }
					
		//choice box 
					public static void selectOptionFromDropdown(WebElement dropdownElement, String optionText) {
				        Select dropdown = new Select(dropdownElement);
				        dropdown.selectByVisibleText(optionText);
				    }
					
		//click the particular input and get choosed value from multi choice box
					public static void printAllCheckboxData(List<WebElement> checkboxes) {
				        for (WebElement checkbox : checkboxes) {
				        	
				        	checkbox.click();
				            String checkboxText = checkbox.getText(); // Assuming the text associated with the checkbox is obtained this way
				            System.out.println("Checkbox data: " + checkboxText);
				        }
				    }

					
		//radio button
					public static void selectRadioButton(WebElement radioButton) {
				        if (!radioButton.isSelected()) {
				            radioButton.click();
				        } 
				       	     
				       }
					
		//radio button by list 
					public static void clickAllRadioButtons(List<WebElement> radioButtons) {
				        for (WebElement radioButton : radioButtons) {
				            radioButton.click();
				        }
					}
				        
					
					 // Method to wait for the next page to load by checking for a unique element
				    public static void waitForNextPageToLoad(WebDriver driver, final By locator, Duration timeoutInSeconds) {
				        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
				        wait.until(new ExpectedCondition<Boolean>() {
				            public Boolean apply(WebDriver driver) {
				                return driver.findElement(locator) != null;
				            }
				        });
				    }
					
					 public static String getAttributeValue(WebElement element, String attributeName) {
					        try {
					            return element.getAttribute(attributeName);
					        } catch (Exception e) {
					            e.printStackTrace();
					            return null;
					        }
					    }
					 
					 
					// Method to capture screenshot
					    public static void takeScreenshot(WebDriver driver, String fileName) {
					        // Get the screenshot as an image file
					        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

					        // Set the destination file with timestamp
					        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
					        File destinationFile = new File("src\\test\\resources\\screenshot\\" + fileName + "_" + timeStamp + ".png");

					        try {
					            // Copy the file to the desired location
					            FileHandler.copy(screenshot, destinationFile);
					            System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
					        } catch (IOException e) {
					            System.out.println("Failed to save screenshot: " + e.getMessage());
					        }
					    }

}
