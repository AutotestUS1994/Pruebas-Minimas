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

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/input_Empresa 1_form_templatej_idt24_input'), 
    'planta personal (tal)')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Planta Personal (tal)'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/span_Administracion'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_No Relacionado_ui-button-icon-left ui-icon ui-c ui-icon-triangle-1-s'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad/span_Organigrama'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/a_Organigrama_organigramacrearUnidadTransversal'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/select_--Seleccione Unidad Transicional--3            - CALIDAD1'), 
    7)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/select_--Seleccione Sucursal--NO RELACIONADABOGOTA'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/select_--Seleccione el Estado--SINO'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_una_unidad_transversal/a_Actualizar'))

WebUI.comment('No se sabe como eliminar para evitar dato repetido')
