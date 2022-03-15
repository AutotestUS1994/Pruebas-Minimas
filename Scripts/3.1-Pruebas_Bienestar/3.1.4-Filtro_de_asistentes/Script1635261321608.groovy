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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_DirigidoA'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt793'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt793'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Aceptar_Eliminar'))
}

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/select_-- Seleccione --CargoCargos'), 
    6)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/input_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBedadMinima'), 
    '1')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/input_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBedadMaxima'), 
    '80')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBj_idt794'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Regresar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_DirigidoA'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt793'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt793'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Aceptar_Eliminar'))
}

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/select_-- Seleccione --CargoCargos'), 
    6)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/input_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBedadMinima'), 
    '1')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/input_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBedadMaxima'), 
    '80')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Tipo Campo_form_condicionDerechoTipoBeneftabla_ventanaCDTBj_idt794'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/div_Participante'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Invitacin'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/select_SeleccioneCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/a_Filtrar'))

WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Filtro_de_Asistentes_S-(solicitante)/span_Listado Hojas de Vida (hoj)'), 
    0)

WebUI.closeBrowser()

