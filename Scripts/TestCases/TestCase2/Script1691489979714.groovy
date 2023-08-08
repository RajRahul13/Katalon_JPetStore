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

//common method
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.click(findTestObject('ParentPgae/Enter Store_Link'))

//test using local variable craeted using datafile attributes
WebUI.click(findTestObject('Object Repository/HomePage/Sign InBTN'))
WebUI.sendKeys(findTestObject('Object Repository/SignInPageObjects/input_Need a user name and password_username'), username)
WebUI.clearText(findTestObject('Object Repository/SignInPageObjects/input_Need a user name and password_password'))
WebUI.sendKeys(findTestObject('Object Repository/SignInPageObjects/input_Need a user name and password_password'), password)
WebUI.click(findTestObject('Object Repository/SignInPageObjects/input_Need a user name and password_signon'))

//end to end test
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img'))
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_FL-DLH-02'))
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart'))
WebUI.clearText(findTestObject('Object Repository/Page_JPetStore Demo/input_false_EST-17'))
WebUI.sendKeys(findTestObject('Object Repository/Page_JPetStore Demo/input_false_EST-17'), Quantity)
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Sub Total 187.00_updateCartQuantities'))
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Proceed to Checkout'))
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/continueBTN'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/th_Billing Address'), 1)
WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Confirm'))
WebUI.getText(findTestObject('Object Repository/Page_JPetStore Demo/th_Order 2897220230808 011617'))
Thread.sleep(3000)

//teardown method
WebUI.closeBrowser();