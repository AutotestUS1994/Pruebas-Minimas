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

WebUI.setText(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Informe accidente de trabajo')

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/li_Informe Accidente de Trabajo (sst)'))

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- Seleccin --GrupalIndividual'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Continuar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accidente'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --'), 
    null)

WebUI.deselectOptionByIndex(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --desFAMILIAR Tipo AccidenteLABORALPERSONAL'), 
    null)

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/label_Si'))

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/label_Urbana'))

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Ubicacin Fsica_form_detalleAccidentej_idt1171'))

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/span_Sede Suba'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --RECREATIVO O CULTURALPROPIOS DEL TRABAJODEPORTIVOTRANSITOVIOLENCIAPROVOCADOIMPRUDENCIA'), 
    null)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --AREAS DE PRODUCCIONAREAS RECREATIVAS O DEPORTIVAS'), 
    null)

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Ubicacin Geogrfica Accidente_form_detalleAccidentej_idt1189'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt1544'), 
    '')

WebUI.setText(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt1545'), 
    '')

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Persona Informa_form_detalleAccidentej_idt1196'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/textarea_Descripcin_form_detalleAccidentedescripcionAcci'), 
    '')

WebUI.click(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/a_Guardar'))

