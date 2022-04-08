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
import java.util.Date as Date
import java.util.Calendar as Calendar
import java.time.LocalDateTime as LocalDateTime
import java.text.SimpleDateFormat as SimpleDateFormat

Date today = new Date()

/*--------------------------------------------*/
Number Dia = ((today.format('dd')) as Integer)

Number Mes = ((today.format('MM')) as Integer)

Number MesN = ((today.format('MM')) as Integer)

Number Año = ((today.format('yyyy')) as Integer)

Number AñoN = ((today.format('yyyy')) as Integer)

/*-----------------------------------------------*/
Number sumaD = Dia + 10

Number sumaM = Mes + 1

Number sumaA = Año + 1

/*--------------------------*/
if (sumaD > 30) {
    sumaD = (sumaD - Dia)

    Mes = sumaM
} else {
    sumaD

    Mes
}

/*--------------------------*/
if (sumaM > 12) {
    Año = sumaA

    Mes = 1
}

/*---------------------------*/
String Fechaini = (((Dia + '/') + MesN) + '/') + AñoN

String Fechafin = (((sumaD + '/') + Mes) + '/') + Año

/*----------------------------------------------------*/
WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 100)

WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/td_Prueba-S'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/td_Prueba-S'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_CostoEvento'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/td_TEST FB'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_TEST FB_form_costoEventolistaCostoEvento0j_idt663'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_Aceptar_eliminar'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/select_-- Seleccione --SALON 1SALON 2SALON 3'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/input_Plan de Inversin_form_costoEventolistaCostoEventocENumero'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/input_Plan de Inversin_form_costoEventolistaCostoEventocEFechaPago_input'), 
    Fechaini)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/input_Plan de Inversin_form_costoEventolistaCostoEventocEValor'), 
    '99966')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/select_-- Seleccione --Plan CapacitacinSUB PLAN EVENTO BIENESTARTEST FBSub Plan Inversin Alimen 7'), 
    '3')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_Plan de Inversin_form_costoEventolistaCostoEventoj_idt665'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/input_Evento Bienestar_form_templatej_idt24_input'), 
    'Plan Inversion Bienestar (bie)')

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/span_Plan Inversion Bienestar (bie)'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/span_Plan Inversion Bienestar (bie)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_Sub Plan Inversion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_Abiertos_form_planDeInversionbienestarj_idt119'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/td_99.966,00'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Deducción de costos al plan inversión/a_Eliminar'), 
    0)

WebUI.closeBrowser()

