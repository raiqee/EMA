package stepDefinition;

import java.awt.Robot;
import java.awt.event.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.Data;
import cucumber.api.java.en.*;

public class ParticipantDasboardSteps extends Data {
	
	/**********************************************PARTICIPANT DASHBOARD**********************************************/
	@Given("^Access Participant's Email$")
	public void access_email() throws Throwable
	{
		//Open Thunderbird
        Robot robot = new Robot();
		robot.delay(1000);
		robot.mouseMove(295,1070);
		robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    //Open Email
	    robot.delay(1000);
	    robot.mouseMove(774,144);
		robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK); 
	}
	
	@When("^Copy Emailed Link$")
	public void copy_link() throws Throwable
	{
		Robot robot = new Robot();
		//Right-Clicked
		robot.delay(1000);
		robot.mouseMove(559,736);
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		//Copy Link
		robot.delay(3000);
		robot.mouseMove(643,846);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		//Minimize Thunderbird
		robot.delay(3000);
		robot.mouseMove(1830,10);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	@When("^Open Browser and Paste Copied Link$")
	public void open_browser() throws Throwable
	{
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Paste Link 
	    Robot robot = new Robot();
	    robot.delay(3000);
	    robot.mouseMove(450,72);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("^Page should be redirected to Participant's Dashboard$")
	public void participant_dashboard() throws Throwable
	{
		String url = driver.getCurrentUrl();
		if(url.equals("http://10.0.12.124/survey/dashboard/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Quit Browser$")
	public void quit_browser() throws Throwable
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@When("^Click EMA Logo$")
	public void click_ema_logo() throws Throwable
	{
		//driver.findElement(By.cssSelector("a > img")).click();
		
		Robot robot = new Robot();
		robot.delay(3000);
		robot.mouseMove(410,705);
		robot.mouseWheel(25);
		robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
	@Then("^Page should be redirected to EMA Website$")
	public void ema_website() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(340,40);
		robot.delay(3000);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.ema.co.nz/Pages/Home.aspx")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click OSEA Logo$")
	public void click_osea_logo() throws Throwable
	{
		Robot robot = new Robot();
		robot.delay(3000);
		robot.mouseMove(1035,705);
		robot.mouseWheel(25);
		robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	@Then("^Page should be redirected to OSEA Website$")
	public void osea_website() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(340,40);
		robot.delay(3000);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.osea.org.nz/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click CECC Logo$")
	public void click_cecc_logo() throws Throwable
	{
		Robot robot = new Robot();
		robot.delay(3000);
		robot.mouseMove(835,705);
		robot.mouseWheel(25);
		robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	@Then("^Page should be redirected to CECC Website$")
	public void cecc_website() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(340,40);
		robot.delay(3000);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.cecc.org.nz/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Business Central Logo$")
	public void click_business_central_logo() throws Throwable
	{
		Robot robot = new Robot();
		robot.delay(3000);
		robot.mouseMove(610,705);
		robot.mouseWheel(25);
		robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	@Then("^Page should be redirected to Business Central Website$")
	public void business_central_website() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(340,40);
		robot.delay(3000);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://businesscentral.org.nz/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	/**********************************************COMPANY INFORMATION**********************************************/
	@When("^Click Company Information Tab$")
	public void click_company_info() throws Throwable
	{
		driver.findElement(By.linkText("Company Info")).click();
	}
	
	@Then("^Page should be redirected to Company Information Page$")
	public void company_information_page() throws Throwable
	{
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
	
		String findString = url.substring(0, 42);		
		if(findString.equals("http://10.0.12.124/survey/part-b/index.php"))
		{
			sat = true;
		}
		else
		{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Check Company Information Panel$")
	public void company_info_panel() throws Throwable
	{
		for(int i=0; i<10; i++)
		{
			if(i==0){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[1]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Industry Sector"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==1){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[2]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Private or Public Sector"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==2){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[3]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Not-for-Profit"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==3){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[4]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Revenue"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==4){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[5]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Number of Employees"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==5){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[6]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("90 Day Trial Periods"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==6){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[7]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Sick Leave"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==7){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[8]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Annual Leave"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==8){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[9]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Business Outlook"))
					{
						sat = true;
					}
					else
					{
						driver.quit();
						throw new Exception("Test Condition Failed") ;
					}
				}
			}else if (i==9){
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[10]/h3/label"));
				
				for(WebElement wwa: panel)
				{					
					if(wwa.getText().equals("Wage & Salary Reviews"))
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
	}
	
	@Then("^Company Information is displayed$")
	public void company_info() throws Throwable
	{
		List<WebElement> msg = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[1]/div/table/tbody/tr/td[1]/label"));
				
			if(msg.size() > 0)
			{
				sat = true;
			}
			else
			{
				driver.quit();
				throw new Exception("Test Condition Failed") ;
			}
	}
	
	@When("^Click Select an Industry Link$")
	public void click_industry() throws Throwable
	{
		driver.findElement(By.linkText("Select an Industry")).click();
	}
	
	@Then("^Page should be redirected to Industry Selection Page$")
	public void industry_selection() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/common/industry-selection.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Check Organization Sector Dropdown List$")
	public void organization_sector() throws Throwable
	{
		int count = 0;
		String[] selection = {"", "Private", "Public", "Local Government"};
		WebElement sector = driver.findElement(By.xpath("//*[@id='field202']"));
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
	
	@When("^Leave Organization Sector Blank or Empty$")
	public void select_blank_sector() throws Throwable
	{
		new Select(driver.findElement(By.id("field202"))).selectByVisibleText("");
	}
	
	@Then("^Private or Public Sector is required Error Message is displayed$")
	public void sector_is_required() throws Throwable
	{
		List<WebElement> msg = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[2]/div/div"));
	
		for(WebElement wwa: msg)
		{					
			if(wwa.getText().equals("Private or Public Sector is required"))
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
	
	@When("^Check Revenue Dropdown List$")
	public void revenue_dropdown() throws Throwable
	{
		int count = 0;
		String[] selection = {"", "Less than 1 million", "1 million to less than 5 million", "5 million to less than 10 million", "10 million to less than 15 million", "15 million to less than 20 million", 
				"20 million to less than 30 million", "30 million to less than 50 million", "50 million to less than 100 million", "100 million to less than 500 million", "Over 500 million"};
		WebElement sector = driver.findElement(By.xpath("//*[@id='field204']"));
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
	
	@When("^Leave Revenue Blank or Empty$")
	public void select_blank_revenue() throws Throwable
	{
		new Select(driver.findElement(By.id("field204"))).selectByVisibleText("");
	}
	
	@Then("^Revenue is required Error Message is displayed$")
	public void revenue_is_required() throws Throwable
	{
		List<WebElement> msg = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[4]/div/div"));
	
		for(WebElement wwa: msg)
		{					
			if(wwa.getText().equals("Revenue is required"))
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
	
	@When("^Leave Number of Employees Blank or Empty$")
	public void select_blank_noOfemployees() throws Throwable
	{
		driver.findElement(By.id("field205")).clear();
	    driver.findElement(By.id("field205")).sendKeys("");
	}
	
	@Then("^Number of Employees is required Error Message is displayed$")
	public void noOfemployees_is_required() throws Throwable
	{
		List<WebElement> msg = driver.findElements(By.xpath("//*[@id='frmCompanyInfo']/div[5]/div/div"));
	
		for(WebElement wwa: msg)
		{					
			if(wwa.getText().equals("Number of Employees is required"))
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
	
	@When("^Click A Specific Month each Year - Please Specify$")
	public void organisation_review_wages() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='aspecificmontheachyear']")).click();
	}
	
	@Then("^Month Dropdown list is displayed$")
	public void month_dropdown() throws Throwable
	{
		List<WebElement> msg = driver.findElements(By.xpath("//*[@id='chooseMonth']"));
		
		if(msg.size() > 0)
		{
			sat = true;
		}
		else
		{
			driver.quit();
			throw new Exception("Test Condition Failed") ;
		}
	}
	
	@When("^Modify Company Information$")
	public void modify_company_info() throws Throwable
	{
		new Select(driver.findElement(By.id("field202"))).selectByVisibleText("Public");
	    driver.findElement(By.id("r2")).click();
	    new Select(driver.findElement(By.id("field204"))).selectByVisibleText("30 million to less than 50 million");
	    driver.findElement(By.id("field205")).clear();
	    driver.findElement(By.id("field205")).sendKeys("1000");
	    driver.findElement(By.xpath("(//input[@name='YNS'])[2]")).click();
	    driver.findElement(By.id("field207")).clear();
	    driver.findElement(By.id("field207")).sendKeys("15");
	    driver.findElement(By.id("field208")).clear();
	    driver.findElement(By.id("field208")).sendKeys("15");
	    driver.findElement(By.id("field209")).clear();
	    driver.findElement(By.id("field209")).sendKeys("15");
	    driver.findElement(By.id("field210")).clear();
	    driver.findElement(By.id("field210")).sendKeys("15");
	}
	@When("^Click Save Button$")
	public void click_save_button() throws Throwable
	{
		driver.findElement(By.cssSelector("input.button")).click();
	}
	
	@Then("^Page will redirected to Survey Page$")
	public void redirected_to_SurveyPage() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/dashboard/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Print Button$")
	public void click_print() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='frmCompanyInfo']/center/input[2]")).click();
	}
	
	@When("^Page will redirected to Company Information Print Preview$")
	public void company_info_print() throws Throwable
	{
		for(String windows : driver.getWindowHandles())
		{
			driver.switchTo().window(windows);
		}
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-b/printcompanyinfo.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}		
	}
	
	@When("^Click Close Button$")
	public void click_close_button() throws Throwable
	{
		driver.findElement(By.id("closeButton")).click();
		
		Thread.sleep(1000);
		
		for(String windows : driver.getWindowHandles())
		{
			driver.switchTo().window(windows);
		}		
	}
	/**********************************************SURVEY TABLE**********************************************/
	@When("^Click Survey Tab$")
	public void click_survey_tab() throws Throwable
	{
		driver.findElement(By.linkText("Survey")).click();
	}
	
	@Then("^Page should be redirected to Survey Page$")
	public void survey_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		String findString = url.substring(0, 36);	
		if(findString.equals("http://10.0.12.124/survey/dashboard/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Check Survey Panel/Element$")
	public void survey_element() throws Throwable
	{
		for(int i=0; i<5; i++)
		{
			if(i==0){
				List<WebElement> panel = driver.findElements(By.id("maintable_46855"));
								
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
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='newPosition855']/input[4]"));
				
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
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='surveycompleted']"));
				
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
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='newPosition855']/input[6]"));
				
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
				List<WebElement> panel = driver.findElements(By.xpath("//*[@id='newPosition855']/input[7]"));
				
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
	
	@When("^Click Print Link$")
	public void click_printlink() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='survey-row9237']/td[6]/a")).click();
	}
	
	@Then("^Page should be redirected to Part-c Print Preview$")
	public void print_partc() throws Throwable
	{
		for(String windows : driver.getWindowHandles())
		{
			driver.switchTo().window(windows);
		}
		
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
	
		String findString = url.substring(0, 49);		
		if(findString.equals("http://10.0.12.124/survey/part-cnew/printable.php"))
		{
			sat = true;
		}
		else
		{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Check Survey Table$")
	public void survey_list() throws Throwable
	{
		List<WebElement> panel = driver.findElements(By.xpath("//*[@id='survey-row9237']"));
		
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
	
	@When("^Click Arrow Icon$")
	public void click_arrow() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='survey-row9237']/td[1]/img")).click();
	}
	
	@When("^Click Question 1 to 4 Edit Link$")
	public void q1to4_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[2]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 1 to 4 Page$")
	public void q1to4_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-1.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 5 Edit Link$")
	public void q5_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[3]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 5 Page$")
	public void q5_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-2.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 6 Edit Link$")
	public void q6_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[4]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 6 Page$")
	public void q6_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-3.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 7 Edit Link$")
	public void q7_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[5]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 7 Page$")
	public void q7_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-4.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 8 Edit Link$")
	public void q8_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[6]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 8 Page$")
	public void q8_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-5.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 9 Edit Link$")
	public void q9_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[7]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 9 Page$")
	public void q9_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-6.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 10 Edit Link$")
	public void q10_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[8]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 10 Page$")
	public void q10_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-7.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 11 Edit Link$")
	public void q11_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[9]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 11 Page$")
	public void q11_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-8.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 12 Edit Link$")
	public void q12_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[10]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 12 Page$")
	public void q12_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-9.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 13 Edit Link$")
	public void q13_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[11]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 13 Page$")
	public void q13_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-10.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 14 Edit Link$")
	public void q14_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[12]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 14 Page$")
	public void q14_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-11.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 15 Edit Link$")
	public void q15_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[13]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 15 Page$")
	public void q15_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-12.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 16 Edit Link$")
	public void q16_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[14]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 16 Page$")
	public void q16_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-13.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 17 Edit Link$")
	public void q17_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[15]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 17 Page$")
	public void q17_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-14.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 18 Edit Link$")
	public void q18_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[16]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 18 Page$")
	public void q18_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-15.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Question 19 Edit Link$")
	public void q19_link() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='participant-question-list0']/div/table/tbody/tr[17]/td/p[1]/span/a")).click();
	}
	
	@Then("^Page should redirected to Question 19 Page$")
	public void q19_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-16.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Refresh Button$")
	public void refresh_btn() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='newPosition855']/input[7]")).click();
	}
	
	@Then("^Survey Table was refreshed$")
	public void refresh_table() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/dashboard/")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Add Position Button$")
	public void add_position_btn() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='newPosition855']/input[4]")).click();
	}
	
	@Then("^Page should redirected to Positional Survey Page$")
	public void positional_data_page() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/part-cnew/question-1.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@When("^Click Save a copy Button$")
	public void save_btn() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='newPosition855']/input[6]")).click();
	}
	
	@Then("^Survey Table will be saved/extracted as Excel File$")
	public void survey_tbl_file() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(550, 420);
		robot.delay(1000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(800, 515);
		robot.delay(1000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(1240, 140);
		robot.delay(1000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	@When("^Click Survey Completed Button$")
	public void complete_btn() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='surveycompleted']")).click();
	}
	
	@When("^Click Ok Button$")
	public void ok_btn() throws Throwable
	{
		Robot robot = new Robot();
		robot.mouseMove(680, 430);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	@Then("^Page should redirected to Survey Completion Thank You Page$")
	public void thank_you_page() throws Throwable
	{
		Thread.sleep(1000);
		
		for(String windows : driver.getWindowHandles())
		{
			driver.switchTo().window(windows);
		}
	
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String findString = url.substring(0, 45);		
		if(findString.equals("http://10.0.12.124/survey/part-c/thankyou.php"))
		{
			sat = true;
		}
		else
		{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
	
	@Then("^Page should redirected to Survey Closed Page$")
	public void survey_closed() throws Throwable
	{
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://10.0.12.124/survey/survey-closed.php")){
			sat = true;
		}else{
			driver.quit();
			throw new Exception("Test Condition Failed");
		}
	}
}
