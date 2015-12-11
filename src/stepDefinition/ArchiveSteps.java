package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.Data;
import cucumber.api.java.en.*;

public class ArchiveSteps extends Data{

	@Given("^Log in as EMA Admin User$")
	public void login() throws Throwable
	{
		 driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get(baseUrl);
	     elementName = "username";
	     driver.findElement(By.name(elementName)).clear();
	     driver.findElement(By.name(elementName)).sendKeys(username);
	     elementName = "password";
	     driver.findElement(By.name(elementName)).clear();
	     driver.findElement(By.name(elementName)).sendKeys(password);
	     driver.findElement(By.name("submitre")).click();
	}
	
	@When("^Click Archive Tab$")
	public void click_archive() throws Throwable
	{
		driver.findElement(By.linkText("Archive")).click();
	}
	
	@Then("^Page Should Redirect to Archive Page$")
	public void archive_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		if(url.equals("http://10.0.12.124/maintenance/surveyarchive/archives.php?rel=load")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Exit Browser$")
	public void exit_browser() throws Throwable
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Then("^Check Archive Panel/Element$")
	public void archive_element() throws Throwable
	{
		for(int i=0; i<8; i++)
		{
			if(i==0){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='cboSearchBy']"));
								
					if(panel.size() != 0)
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
			}else if(i==1){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='txtSearch']"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==2){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='cboYearList']"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==3){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='txtCycle']"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==4){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='cmdSearch']"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==5){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='cmdClear']"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==6){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmSurvey']/table[2]"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}else if(i==7){
				List<WebElement> panel = driver.findElements(By.xpath("/html/body/div/div[3]/div/div"));
				
				if(panel.size() != 0)
				{
					sat = true;
				}
				else
				{
					driver.quit();
					throw new Exception("Test Condition Failed") ;
				}
			}
		}
	}
	
	@Then("^Check Search By Dropdown List$")
	public void Search_By_drpdwn() throws Throwable
	{
		int count = 0;
		String[] selection = {"All", "Survey ID", "Company"};
		WebElement sector = driver.findElement(By.xpath("//*[@id='cboSearchBy']"));
		Select select = new Select(sector);
		
		List<WebElement> options = select.getOptions();
		for(WebElement option : options){
			for(int i = 0; i < selection.length; i++){
				if(option.getText().equals(selection[i])){
					count++;
					System.out.println(selection[i]);
				}
			}
		}
		if(count == selection.length){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Check Year Dropdown List$")
	public void year_drpdwn() throws Throwable
	{
		int count = 0;
		String[] selection = {"", "2012", "2013", "2014"};
		WebElement sector = driver.findElement(By.xpath("//*[@id='cboYearList']"));
		Select select = new Select(sector);
		
		List<WebElement> options = select.getOptions();
		for(WebElement option : options){
			for(int i = 0; i < selection.length; i++){
				if(option.getText().equals(selection[i])){
					count++;
					System.out.println(selection[i]);
				}
			}
		}
		if(count == selection.length){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Check Search Textbox is enable/editable$")
	public void search_txtbox() throws Throwable
	{
		WebElement txtbox = driver.findElement(By.xpath("//*[@id='txtSearch']"));
		
		txtbox.sendKeys("RCS");
		
		String value = txtbox.getAttribute("value");
		if(value.contentEquals("RCS"))
		{
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Check Cycle Textbox is read only/disable$")
	public void cycle_txtbox_disable() throws Throwable
	{
		String txtbox = driver.findElement(By.xpath("//*[@id='txtCycle']")).getAttribute("readonly");
		
		if(txtbox.contains("true"))
		{
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Select from Year Dropdown$")
	public void select_year() throws Throwable
	{
	    driver.findElement(By.id("cboYearList")).click();
	    new Select(driver.findElement(By.id("cboYearList"))).selectByVisibleText("2012");
	    driver.findElement(By.cssSelector("option[value=\"2012\"]")).click();
	}
	
	@Then("^Cycle Textbox should be enable/editable$")
	public void cycle_txtbox_enable() throws Throwable
	{
		WebElement txtbox = driver.findElement(By.xpath("//*[@id='txtCycle']"));
		txtbox.sendKeys("1");
		
		String value = txtbox.getAttribute("value");
		if(value.contentEquals("1"))
		{
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
}
