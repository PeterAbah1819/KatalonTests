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

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_Cart'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_Checkout'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_My account'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_Sample Page'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_Shop'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_Proudly powered by WordPress'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a__next page-numbers'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_2'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/a_2'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Click on item
WebUI.click(findTestObject('Object Repository/Items on FrontPage/img_Sale_attachment-woocommerce_thumbnail size-woocommerce_thumbnail'))

//Go back to homepage
WebUI.navigateToUrl('http://cms.demo.katalon.com/')

//Close Browser
WebUI.closeBrowser()


