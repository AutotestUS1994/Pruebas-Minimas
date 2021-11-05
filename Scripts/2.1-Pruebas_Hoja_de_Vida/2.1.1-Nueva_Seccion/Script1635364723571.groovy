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

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Secciones_form_templatej_idt286j_idt29'))

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/label_Parametros de Formularios'))

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/a_Seccion'))

WebUI.waitForElementClickable(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Nueva Hoja Vida_seccion_formj_idt60'), 
    0)

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Nueva Hoja Vida_seccion_formj_idt60'))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Nueva Hoja Vida_seccion_formj_idt60'), 'prueba')

WebUI.sendKeys(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Nueva Hoja Vida_seccion_formj_idt60'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/span_Prueba'), 1)) {
    WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/span_Prueba'))

    WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/a_Eliminar'))
}

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/a_Nuevo'))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Descripcin_seccion_formtabdescripcion'), 'Prueba')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Orden_seccion_formtaborden'), '12345')

WebUI.selectOptionByIndex(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/select_SeleccioneBienes'), '2')

WebUI.selectOptionByIndex(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/select_SeleccioneAreas de experiencia'), '5')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/textarea_Mensaje_seccion_formtabmensaje'), 'PRUEBA')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/textarea_Mensaje Final_seccion_formtabmensaje_final'), 
    'PRUEBA')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/textarea_Texto Confirmar_seccion_formtabmensaje_aceptacion'), 
    'PRUEBA')

WebUI.selectOptionByIndex(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/select_SeleccioneMultiplex AnexosNo solicitarnico anexo'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/select_SeleccioneSiNo'), '1')

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/input_Externo_seccion_formtabexterno'), 'PRUEBA')

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Nueva_sección/a_Guardar'))

WebUI.closeBrowser()

