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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('google.com')

WebUI.setText(findTestObject('Google text box'), 'IoT news')

WebUI.click(findTestObject('Search with google button'))

WebUI.click(findTestObject('Link iottechnews.com'))

WebUI.click(findTestObject('GDPR I Agree'))

News_Name = WebUI.getText(findTestObject('Notice'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Notice'))

WebUI.verifyElementText(findTestObject('entry-title single-title'), News_Name)

WebUI.verifyElementPresent(findTestObject('Author photo'), 0)

WebUI.click(findTestObject('Author link page'))

WebUI.switchToWindowIndex('1')

WebUI.verifyElementText(findTestObject('article-header'), News_Name)

WebUI.closeWindowIndex('1')

WebUI.closeBrowser()

