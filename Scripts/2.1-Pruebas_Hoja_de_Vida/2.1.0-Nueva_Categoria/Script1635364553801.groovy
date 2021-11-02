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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/span_Categora_buscar glyphicons glyphicons-search'), 
    0)

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/span_Categora_buscar glyphicons glyphicons-search'), 
    'categoria')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/span_Categora_buscar glyphicons glyphicons-search'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/input_Actos Administrativos_form_categoriaSeccionj_idt61'), 
    'prueba')

WebUI.sendKeys(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/input_Actos Administrativos_form_categoriaSeccionj_idt61'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/span_prueba'), 1)) {
    WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/span_prueba'))

    WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/a_Eliminar'))

    WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/a_Aceptar'))
}

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/a_Nuevo'))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/input_Descripcin_form_categoriaSecciondescripcion'), 
    'prueba')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/input_Orden_form_categoriaSeccionorden'), '5')

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_Categoria/a_Guardar'))

WebUI.closeBrowser()

