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

//Click order ninja shirt
WebUI.click(findTestObject('Object Repository/Try To Order/img_Sale_attachment-woocommerce_thumbnail size-woocommerce_thumbnail'))

//Click on extra quantity of shirts
WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

WebUI.click(findTestObject('Object Repository/Try To Order/div_Flying Ninja quantity_quantity-button quantity-up'))

//Add to cart
WebUI.click(findTestObject('Object Repository/Try To Order/button_Add to cart'))

//View Cart
WebUI.click(findTestObject('Object Repository/Try To Order/a_View cart (1)'))

//Enter Coupon Code
WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input_Coupon_coupon_code'), 'GHR483')

//Apply Coupon
WebUI.click(findTestObject('Object Repository/Try To Order/button_Apply coupon'))

//To checkout page
WebUI.click(findTestObject('Object Repository/Try To Order/a_Checkout'))

//Send a bunch of text
WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__billing_first_name'), 'Makarov')

WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__billing_last_name'), 'Vlad')

WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input_(optional)_billing_company'), 'Vivid Inc.')

WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__billing_address_1'), '8 Vlokosic Drive Germany')

WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__billing_city'), 'Blokosic')

WebUI.click(findTestObject('Object Repository/Try To Order/span_Select an option'))

WebUI.click(findTestObject('Object Repository/Try To Order/span_Abia'))


WebUI.delay(5)
//Write a reveiw
WebUI.navigateToUrl('http://cms.demo.katalon.com/product/flying-ninja/')

//Reveiw Button
WebUI.click(findTestObject('Object Repository/Try To Order/a_Write a Review'))

//Review Comment
WebUI.sendKeys(findTestObject('Object Repository/Try To Order/textarea__comment'), 'Great Shirt, Please patronize them, always purchase')

//Name
WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__author'), 'Makarov Vladichik')

//Email
WebUI.sendKeys(findTestObject('Object Repository/Try To Order/input__email'), 'VladMAka@hotmail.com')

//5 Star
WebUI.click(findTestObject('Object Repository/Try To Order/a_5'))

//Save details
WebUI.click(findTestObject('Object Repository/Try To Order/input__wp-comment-cookies-consent'))

//Submit
not_run: WebUI.click(findTestObject('Object Repository/Try To Order/input_Save my name, email, and website in this browser for the next time I comment._submit'))

