import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://htcinc-cloud.caretech.com/cmp-mcda/portal/#/login')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_User Name_form-control ng-untouched n_fec229'), 'pradeep')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CMP NextGen/input_Password_form-control ng-untouched ng_e0c371'), 
    'GGbbmOViWeiuZ5NvdDMBPA==')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/i_Menu_menuIremIcon fa-lg text-secondary ml_52d72b'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Case Intake'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_a1940d'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult Criminal'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__CitationNum'), '63325343')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__BeginDate'), 't-3')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Offense To Date_EndDate'), 't-2')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_ec61d6'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Add Attachments'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select Document Type_ui-dropdown-trigg_5d166d'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Police Report'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentSource'), 'doc source')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentName'), 'doc title')

WebUI.uploadFile(findTestObject('Page_CMP NextGen/Page_CMP NextGen/Choose File'), file)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_File Uploaded Successfully'), 'File Uploaded Successfully.')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_c47fe1'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Felony'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Defendant_ui-dropdown-trigger-icon ui-_952f45'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Defendant'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Last Name_LastName'), 'balya')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Known Person Search'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_2af1d8'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Custody'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_416b28'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Arrest Warrant'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Partial StatuteOffense Title_partialStatute'), '107.718-e')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Statute Lookup'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CMP NextGen/span_107.718-e'), 0)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/a_Select'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Add Assigned Staff'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_e278dd'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/li_Unit'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_f29808'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_DV DDAs'))

WebUI.click(findTestObject('Page_CMP NextGen/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Submit'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Case  3002492  created successfully'), 
    'Case # 3002492 created successfully')

