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

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/input_Generacion Interfaz_form_templatej_idt24_input'), 
    'Generacion Interfaz')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/li_Generacion interfaz (com)'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_INTERFAZ PROVISIONES'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/input_Fecha_generacionInterfazfechacomprobante_input'), 
    '01/07/2017')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Filtrar'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_01072017'), 
    1)) {
    WebUI.check(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/div_-_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover0'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Ver'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Reversar'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Aceptar'))
}

WebUI.waitForElementPresent(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Generar'), 
    0)

WebUI.waitForElementPresent(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Generar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Generar'))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/select_NOMINA MENSUALNOMINA QUINCENAL'), 
    2)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/input_Fecha Inicial_popupGeneracionInterfazinicial_input'), 
    '01/07/2017')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/input_Fecha Final_popupGeneracionInterfazfinal_input'), 
    '31/07/2017')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/input_Fecha Proceso_popupGeneracionInterfazfechaProceso_input'), 
    '01/07/2017')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Generar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/button_Si'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Continuar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Exportar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'))
}

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Generar Reporte'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Descargar'))

WebUI.waitForElementVisible(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Total Otro_ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Total Otro_ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Exportar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'))
}

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Generar Reporte'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion_Interfaz_Contable/a_Descargar'))

WebUI.closeBrowser()

