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



//Open Browser
WebUI.openBrowser('http://cms.demo.katalon.com/')

//Click on Account
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_My account'))

//Send text
WebUI.sendKeys(findTestObject('Object Repository/Try to Login/input__username'), 'peterabah@test.com')

//Send text
WebUI.sendKeys(findTestObject('Object Repository/Try to Login/input__password'), 'petertest123')

//Remember Me
WebUI.click(findTestObject('Object Repository/Try to Login/input__rememberme'))

//Login
WebUI.click(findTestObject('Object Repository/Try to Login/button_Log in'))

//Verify it failed
WebUI.verifyElementPresent(findTestObject('Object Repository/Try to Login/li_ERROR Invalid username. Lost your password'), 2)

//Try to Retrieve Password
WebUI.click(findTestObject('Object Repository/Try to Login/a_Lost your password'))

WebUI.sendKeys(findTestObject('Object Repository/Try to Login/input_Username or email_user_login'), 'peterabah@test.com')

//Click reset button
WebUI.click(findTestObject('Object Repository/Try to Login/button_Reset password'))

//verify you are not a user
WebUI.verifyElementPresent(findTestObject('Object Repository/Try to Login/li_ERROR Invalid username. Lost your password'), 2)

//Close browser
WebUI.closeBrowser()




