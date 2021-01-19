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
WebUI.openBrowser('http://cms.demo.katalon.com')

//Delay a bit
WebUI.delay(2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_2'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a__next page-numbers'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Cart'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Checkout'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_My account'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Proudly powered by WordPress'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Sample Page'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Shop'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/a_Themes Zone'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/b_ELLIE'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/div_Katalon Shop                                    Katalon Ecommerce'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/div_Proudly powered by WordPress  Theme ELLIE by Themes Zone'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h1_Shop'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h1_Shop'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h2_Archives'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h2_Meta'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h2_Recent Comments'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/h2_Recent Posts'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/i_Search_ellie-icon-search'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/img_Themes Zone_bitnami-corner-image'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/input_Search for_s'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/li_Comments RSS'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/li_Entries RSS'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/li_Log in'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/li_WordPress.org'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/p_Showing 112 of 24 results'), 2)

//Verify this item
WebUI.verifyElementPresent(findTestObject('Object Repository/Items on FrontPage/ul_CartCheckoutMy accountSample PageShop'), 2)

//Close Browser
WebUI.closeBrowser()

