//TESTCASE for Registration and getting data from JPetStore_Login.xlsx


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

//moving to loging page
WebUI.click(findTestObject('HomePage/Sign InBTN'))

//clicking registernow btn
WebUI.click(findTestObject('Object Repository/SignIn_Page/Register Now_BTN'))

//filling data for registration
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_User ID_username'),findTestData("Input").getValue('UserName', 1) )
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_New password_password'), findTestData("Input").getValue(2, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Repeat password_repeatedPassword'), findTestData("Input").getValue(2, 1))

WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_First name_account.firstName'), findTestData("Input").getValue(3, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Last name_account.lastName'), findTestData("Input").getValue(4, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Email_account.email'), findTestData("Input").getValue(5, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Phone_account.phone'), findTestData("Input").getValue(6, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Address 1_account.address1'), findTestData("Input").getValue(7, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Address 2_account.address2'), findTestData("Input").getValue(8, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_City_account.city'), findTestData("Input").getValue(9, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_State_account.state'), findTestData("Input").getValue(10, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Zip_account.zip'), findTestData("Input").getValue(11, 1))
WebUI.sendKeys(findTestObject('Object Repository/RegistrationPage/input_Country_account.country'), findTestData("Input").getValue(12, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationPage/select_englishjapanese'), findTestData("Input").getValue(13, 1), false)
WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationPage/select_FISHDOGSREPTILESCATSBIRDS'), findTestData("Input").getValue(14, 1), false)

WebUI.click(findTestObject('Object Repository/RegistrationPage/input_Enable MyList_account.listOption'))
WebUI.click(findTestObject('Object Repository/RegistrationPage/input_Enable MyBanner_account.bannerOption'))

WebUI.click(findTestObject('Object Repository/RegistrationPage/input_Enable MyBanner_newAccount'))

//teardown method
WebUI.closeBrowser();

