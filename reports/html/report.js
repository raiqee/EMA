$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Archive.feature");
formatter.feature({
  "line": 1,
  "name": "Archive Action",
  "description": "",
  "id": "archive-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 44,
  "name": "Cycle textbox will be enabled once year has been selected from the dropdown.",
  "description": "",
  "id": "archive-action;cycle-textbox-will-be-enabled-once-year-has-been-selected-from-the-dropdown.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@AR"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "Log in as EMA Admin User",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "Click Archive Tab",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Page Should Redirect to Archive Page",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Select from Year Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Cycle Textbox should be enable/editable",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Exit Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ArchiveSteps.login()"
});
formatter.result({
  "duration": 10467479638,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveSteps.click_archive()"
});
formatter.result({
  "duration": 1069952602,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveSteps.archive_page()"
});
formatter.result({
  "duration": 98359809,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveSteps.select_year()"
});
formatter.result({
  "duration": 802502184,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveSteps.cycle_txtbox_enable()"
});
formatter.result({
  "duration": 202170016,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveSteps.exit_browser()"
});
formatter.result({
  "duration": 2384698559,
  "status": "passed"
});
});