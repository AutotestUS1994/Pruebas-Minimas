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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Publicacin'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/span_Si'))
}

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'fondo.jpg'

WebUI.uploadFile(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1archivo_input'), 
    ruta)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Evento Bienestar_form_templatej_idt24_input'), 
    'inscripcion evento')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/li_Inscripcion Evento (bie)'))

WebUI.closeBrowser()

