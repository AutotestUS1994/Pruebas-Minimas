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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.Date as Date
import java.util.Calendar as Calendar
import java.time.LocalDateTime as LocalDateTime

Date fecha = new Date()

Number Dia = fecha.getDate()

Number Mes = fecha.getMonth() + 1

Number MesN = fecha.getMonth() + 1

Number Año = fecha.getYear() + 1900

Number AñoN = fecha.getYear() + 1900

Number DiaF = Dia + 10

Number MesF = Mes + 1

Number AñoF = Año + 1

if (DiaF > 30) {
    DiaF = (DiaF - Dia)

    Mes = MesF
} else {
    DiaF

    Mes
}

if (MesF > 12) {
    año = AñoF

    MesF = 1
}

String Fechaini = (((Dia + '/') + MesN) + '/') + AñoN

String Fechafin = (((DiaF + '/') + Mes) + '/') + Año

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'evento (bie)')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_prueba'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aceptar_Eliminar'))
}

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    Fechaini)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    Fechafin)

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    Fechaini)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    Fechafin)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupj_idt1579'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'), 0)

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'))

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MIE'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_01'), 5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_02'), 6)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_mas_Horario'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_LUN-MAR 0500-0600'), 2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Icon_mas_principal'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Guardar'))

