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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Louer_whereToBuy'), 
    'paris')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Villes'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Paris'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/span_Recherche'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/Page_iad - Appartement de 52 m - 2 chambres_c76d2d/a_Motif'))

WebUI.click(findTestObject('Object Repository/Page_iad - Appartement de 52 m - 2 chambres_c76d2d/li_Je suis intrss(e) par un bien'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Appartement de 52 m - 2 chambres_c76d2d/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'laayali')

WebUI.setText(findTestObject('Object Repository/Page_iad - Appartement de 52 m - 2 chambres_c76d2d/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'fadoua')

WebUI.closeBrowser()

