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

WebUI.comment('PENDIENTE POR REPARAR FALLA SE PUEDE EJECUTAR PERO FALLA')

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/td_Prueba'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/div_Asistentes'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/a_Registro'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/td_prueba ka Pruebas'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/td_prueba ka Pruebas'))

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/a_Aceptar_eliminar'))
}

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/select_SeleccioneExternoInterno'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Documento_formAsistenteEventopanelTabAsistenteEvendocumentoAsistenteAlfaNumerico'), 
    '123456789')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Nombres_formAsistenteEventopanelTabAsistenteEvennombresAsistente'), 
    'Pruebas')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Primer Apellido_formAsistenteEventopanelTabAsistenteEvenprimerApellidoAsistente'), 
    'prueba')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Segundo Apellido_formAsistenteEventopanelTabAsistenteEvensegundoApellidoAsistente'), 
    'ka')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Email_formAsistenteEventopanelTabAsistenteEvenemail'), 
    'autotestus1994@gmail.com')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/input_Tipo de Vinculacin_formAsistenteEventopanelTabAsistenteEventipovinculacion'), 
    'null')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/select_SeleccioneACEPTADOFINALIZADOINSCRITONO ACEPTADONO APROBADONO ASISTIO'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/select_SeleccionePrueba'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/select_SeleccionePrueba1pruebaPRUEBA PLAN CAPACITACIONPRUEBA SILVIA'), 
    '1')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/textarea_Observacin_formAsistenteEventopanelTabAsistenteEvenobservacion'), 
    'Pruebas')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Inscribir_un_asistente/a_Guardar'))

