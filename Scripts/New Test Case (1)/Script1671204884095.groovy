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

WebUI.navigateToUrl('https://htcinc-cloud.caretech.com/cmp-mcda/portal/#/login')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_User Name_form-control ng-untouched n_fec229 (4)'), 
    'pradeep')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CMP NextGen/input_Password_form-control ng-untouched ng_e0c371 (4)'), 
    'GGbbmOViWeiuZ5NvdDMBPA==')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/i_Menu_menuIremIcon fa-lg text-secondary ml_52d72b (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Case Intake (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_038126 (1)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult Criminal (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Continue (4)'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__CitationNum (4)'), '7955')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__BeginDate (4)'), 't-5')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Offense To Date_EndDate (4)'), 't-1')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_ec61d6'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult and Family Services (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_7e735a (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Felony (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (4)'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Last Name_LastName (3)'), 'd')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Known Person Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_847a83 (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/li_Custody (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_2fc28a (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Arrest Warrant (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save (4)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (4)'))

