Feature: Archive Action

Scenario: Page will be redirected to Archive Page upon clicking the Archive Tab
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Exit Browser
	
Scenario: The following Elements is available upon Archive Page load (Search Function, Survey List Table, Pagination Link)
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Archive Panel/Element
	Then Exit Browser

Scenario: Search By Dowpdown List contains the following option (All, Survey ID, Company)
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Search By Dropdown List
	Then Exit Browser

Scenario: Year Dowpdown List contains the following option (2012, 2013, 2014)
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Year Dropdown List
	Then Exit Browser

Scenario: User is able to input characters in Search textbox.
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Search Textbox is enable/editable
	Then Exit Browser

Scenario: Cycle textbox is disabled upon loading of Archive page.
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Cycle Textbox is read only/disable
	Then Exit Browser

Scenario: Cycle textbox will be enabled once year has been selected from the dropdown.
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	When Select from Year Dropdown
	Then Cycle Textbox should be enable/editable
	Then Exit Browser

Scenario: User is able to search filters
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	When Input Search Filters
	When Click Search Button
	Then Searched Survey should be displayed
	Then Exit Browser

Scenario: The following Elements is available in Table List (Survey ID, Participate Only No Reports, Company Name, Notes)
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	Then Check Survey Table List
	Then Exit Browser

Scenario: Notes window will pop-up upon clicking Notes link
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	When Click Notes Link
	Then Note Modal will be displayed
	Then Exit Browser
@AR
Scenario: Notes window will close upon clicking close button
	Given Log in as EMA Admin User
	When Click Archive Tab
	Then Page Should Redirect to Archive Page
	When Click Notes Link
	Then Note Modal will be displayed
	When Click Close Icon
	Then Note Modal should be closed
	