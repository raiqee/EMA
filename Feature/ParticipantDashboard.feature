Feature: Participant Dashboard Action

Scenario: Page will redirected to Participant's Dashboard Page upon clicking again the Emailed Link
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	Then Page should be redirected to Participant's Dashboard
	Then Quit Browser

Scenario: Page will redirected to EMA Website upon clicking the EMA Logo
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click EMA Logo
	Then Page should be redirected to EMA Website
	Then Quit Browser
	
Scenario: Page will redirected to OSEA Website upon clicking the OSEA Logo
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click OSEA Logo
	Then Page should be redirected to OSEA Website
	Then Quit Browser
	
Scenario: Page will redirected to CECC Website upon clicking the CECC Logo
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click CECC Logo
	Then Page should be redirected to CECC Website
	Then Quit Browser
	
Scenario: Page will redirected to Business Central Website upon clicking the Business Central Logo
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Business Central Logo
	Then Page should be redirected to Business Central Website
	Then Quit Browser

Scenario: Page will redirected to Company Information Page upon clicking the Company Info Tab
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	Then Page should be redirected to Company Information Page
	Then Quit Browser

Scenario: The following Panel is available upon Company Page load (Industry Sector, Private or Public Sector, Not-for-Profit, Revenue, Number of Employees, 90 Day Trial Periods, Sick Leave, Annual Leave, Business Outlook, Wage & Salary Reviews)
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	Then Check Company Information Panel
	Then Quit Browser

Scenario: Company Information is dislplayed upon page load
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	Then Company Information is displayed
	Then Quit Browser
		
Scenario: Page will redirected to Industry Selection Page upon clicking the Select and Industry Link
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Click Select an Industry Link
	Then Page should be redirected to Industry Selection Page
	Then Quit Browser
	
Scenario: Organization Sector Dowpdown List contains the following option (Private, Public, Local Government)
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Check Organization Sector Dropdown List
	Then Quit Browser
	
Scenario: Private or Public Sector is required
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Leave Organization Sector Blank or Empty
	When Click Save Button
	Then Private or Public Sector is required Error Message is displayed
	Then Quit Browser
	
Scenario: Revenue Dowpdown List contains the following option (Less than 1 million, 1 Million to less than 5 Million, 5 Million to less than 10 Million, 10 Million to less than 15 Million, 15 Million to less than 20 Million, 20 Million to less than 30 Million, 30 Million to less than 50 Million, 50 Million to less than 100 Million, 100 Million to less than 500 Million, Over 500 Million)
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Check Revenue Dropdown List
	Then Quit Browser
	
Scenario: Revenue is required
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Leave Revenue Blank or Empty
	When Click Save Button
	Then Revenue is required Error Message is displayed
	Then Quit Browser
	
Scenario: Number of Employees is required
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Leave Number of Employees Blank or Empty
	When Click Save Button
	Then Number of Employees is required Error Message is displayed
	Then Quit Browser

Scenario: Month Dropdown list is displayed, if "A specific month each year - please specify"  Radion Button is selected
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Click A Specific Month each Year - Please Specify
	Then Month Dropdown list is displayed
	Then Quit Browser
	
Scenario:  All Modifications will be saved upon clicking the Save Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Modify Company Information
	When Click Save Button
	Then Page will redirected to Survey Page
	Then Quit Browser

Scenario: Page will redirected to Company Information Print Preview upon clicking the Print Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Click Print Button
	When Page will redirected to Company Information Print Preview
	Then Quit Browser
	
Scenario: Company Information Print Preview will be closed upon clicking the Close Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Company Information Tab
	When Click Print Button
	Then Page will redirected to Company Information Print Preview
	When Click Close Button
	Then Page should be redirected to Company Information Page
	Then Quit Browser

Scenario: Page will redirected to Survey Page upon clicking the Survey Tab
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Survey Tab
	Then Page should be redirected to Survey Page
	Then Quit Browser

Scenario: The following Panel/Element is available upon Survey Page load (Survey Table, Add Postion Button, Survey Completed Button, Save a copy Button, Refresh Button)
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	Then Check Survey Panel/Element
	Then Quit Browser

Scenario: Survey Table displays the list of survey taken by the Participant
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Check Survey Table
	Then Quit Browser

Scenario: Page will redirected to Positional Data Print Preview upon clicking the Print Link
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Print Link
	Then Page should be redirected to Part-c Print Preview
	Then Quit Browser

Scenario: Positional Data Print Preview will be closed upon clicking the Close Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Print Link
	Then Page should be redirected to Part-c Print Preview
	When Click Close Button
	Then Page should be redirected to Survey Page
	Then Quit Browser

Scenario: Page will be redirected to Question 1 to 4 Edit Page upon clicking the Edit Link beside Question 1
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 1 to 4 Edit Link
	Then Page should redirected to Question 1 to 4 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 5 Edit Page upon clicking the Edit Link beside Question 5
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 5 Edit Link
	Then Page should redirected to Question 5 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 6 Edit Page upon clicking the Edit Link beside Question 6
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 6 Edit Link
	Then Page should redirected to Question 6 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 7 Edit Page upon clicking the Edit Link beside Question 7
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 7 Edit Link
	Then Page should redirected to Question 7 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 8 Edit Page upon clicking the Edit Link beside Question 8
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 8 Edit Link
	Then Page should redirected to Question 8 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 9 Edit Page upon clicking the Edit Link beside Question 9
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 9 Edit Link
	Then Page should redirected to Question 9 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 10 Edit Page upon clicking the Edit Link beside Question 10
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 10 Edit Link
	Then Page should redirected to Question 10 Page
	Then Quit Browser

Scenario: Page will be redirected to Question 11 Edit Page upon clicking the Edit Link beside Question 11
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 11 Edit Link
	Then Page should redirected to Question 11 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 12 Edit Page upon clicking the Edit Link beside Question 12
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 12 Edit Link
	Then Page should redirected to Question 12 Page
	Then Quit Browser

Scenario: Page will be redirected to Question 13 Edit Page upon clicking the Edit Link beside Question 13
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 13 Edit Link
	Then Page should redirected to Question 13 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 14 Edit Page upon clicking the Edit Link beside Question 14
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 14 Edit Link
	Then Page should redirected to Question 14 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 15 Edit Page upon clicking the Edit Link beside Question 15
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 15 Edit Link
	Then Page should redirected to Question 15 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 16 Edit Page upon clicking the Edit Link beside Question 16
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 16 Edit Link
	Then Page should redirected to Question 16 Page
	Then Quit Browser
	
Scenario: Page will be redirected to Question 17 Edit Page upon clicking the Edit Link beside Question 17
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 17 Edit Link
	Then Page should redirected to Question 17 Page
	Then Quit Browser

Scenario: Page will be redirected to Question 18 Edit Page upon clicking the Edit Link beside Question 18
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 18 Edit Link
	Then Page should redirected to Question 18 Page
	Then Quit Browser

Scenario: Page will be redirected to Question 19 Edit Page upon clicking the Edit Link beside Question 19
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Arrow Icon
	When Click Question 19 Edit Link
	Then Page should redirected to Question 19 Page
	Then Quit Browser

Scenario: Survey Table will be refreshed upon clicking the Refresh Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Refresh Button
	Then Survey Table was refreshed
	Then Quit Browser
	
Scenario: Page will redirected to Positional Survey upon clicking the Add Position Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Add Position Button
	Then Page should redirected to Positional Survey Page
	Then Quit Browser

Scenario: Survey Table will be saved/extracted as Excel File upon clicking the Save a copy Button
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Save a copy Button
	Then Survey Table will be saved/extracted as Excel File
	Then Quit Browser
@PD
Scenario: Page will be redirected to Thank you Page upon Survey Completion
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	When Click Survey Completed Button
	When Click Ok Button
	Then Page should redirected to Survey Completion Thank You Page
	

Scenario: Page will be redirected to Survey Closed Page upon clicking the Survey Link, if Survey is already Completed
	Given Access Participant's Email
	When Copy Emailed Link
	When Open Browser and Paste Copied Link
	Then Page should redirected to Survey Closed Page
	Then Quit Browser