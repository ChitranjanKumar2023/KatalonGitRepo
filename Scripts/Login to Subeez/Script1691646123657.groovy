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

WebUI.navigateToUrl('http://192.168.110.53/')

WebUI.click(findTestObject('Object Repository/Page_Subeez/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Subeez/input_NEXT_form-control ng-untouched ng-inv_768764'), 'QualityAnalyst01@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_Subeez/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Subeez/input_Login_form-control with-icon ng-untou_c59821'), 
    'WjtjWq/gpi/4LpT9Kr0aTA==')

WebUI.click(findTestObject('Object Repository/Page_Subeez/button_Login_1'))

WebUI.closeBrowser()

