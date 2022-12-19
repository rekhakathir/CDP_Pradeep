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

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_User Name_form-control ng-untouched n_fec229 (3)'), 
    'pradeep')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CMP NextGen/input_Password_form-control ng-untouched ng_e0c371 (3)'), 
    'GGbbmOViWeiuZ5NvdDMBPA==')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/i_Menu_menuIremIcon fa-lg text-secondary ml_52d72b (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Case Intake (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_a1940d (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult Criminal (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Continue (3)'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__CitationNum (3)'), '87655')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__BeginDate (3)'), 't-5')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Offense To Date_EndDate (3)'), 't-2')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/label_Select (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult and Family Services (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_ca5b12'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/li_Felony'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (3)'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Last Name_LastName (2)'), 'balya', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Known Person Search (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_847a83 (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Custody'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_2fc28a (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Arrest Warrant (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save (3)'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (3)'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Partial StatuteOffense Title_partialStatute (1)'), 
    '107.718-e')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Statute Lookup (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/a_Select (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Save (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (3)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Add Assigned Staff (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_3ff55a (1)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/li_Unit (1)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_ed1107 (1)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_DV DDAs (2)'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/div_Add Assigned Staff Staff TypeSelectSele_7b294c'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Next (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/span_balya I, Pradeep kumar'), 'balya I, Pradeep kumar')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/a_Defendant-balya MR., pradeep kumar'), 'Defendant-balya MR., pradeep kumar')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/span_107.718-e'), '107.718-e')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Submit (2)'))

