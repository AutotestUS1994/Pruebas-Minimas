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

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/input_Empresa 1_form_templatej_idt24_input'), 
    'planta personal (tal)')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Planta Personal (tal)'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Administracion'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Pruebas  Katalon1'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Pruebas  Katalon1'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_No Relacionado_ui-button-icon-left ui-icon ui-c ui-icon-triangle-1-s'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Organigrama1'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_QAS_organigramaj_idt1420modificar'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_Eliminar1'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Si1'))
}

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Administracion'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_No Relacionado_ui-button-icon-left ui-icon ui-c ui-icon-triangle-1-s'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Organigrama'))

String Result = WebUI.getText(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Pruebas  Katalon'))

if (Result == 'Pruebas Katalon') {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Pruebas  Katalon'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_Pruebas  Katalon_organigramaj_idt1422modificar'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Si'))
}

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_Organigrama_organigramacrearUnidad'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/input_Unidad Organizacional_popupUnidadOrganizacional_formcodigoUnidadPopup'), 
    '27')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/select_--Seleccione Tipo Unidad--COORDINACIONPRESIDENCIAVICEPRESIDENCIA'), 
    5)

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/input_Descripcin_popupUnidadOrganizacional_formnombreUnidadPopup'), 
    'Pruebas  Katalon')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/select_--Seleccione Sucursal--NO RELACIONADABOGOTA'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/select_--Seleccione el Estado--SINO'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/a_Actualizar'))

