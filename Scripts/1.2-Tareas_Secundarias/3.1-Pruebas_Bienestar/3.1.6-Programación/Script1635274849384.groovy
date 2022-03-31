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

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/td_Evento Salud Unico'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_Programacin'))

if (WebUI.waitForElementClickable(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_MAR-MIE 0500-0600_form_programacionMomentoEventotablaMomentoEventoHorario0j_idt836'), 
    1)) {
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_MAR-MIE 0500-0600_form_programacionMomentoEventotablaMomentoEventoHorario0j_idt836'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_Aceptar'))
}

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/input_Horario_form_programacionMomentoEventotablaMomentoEventoHorariofechaIniciaPME_input'), 
    '27/11/2018')

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/input_Horario_form_programacionMomentoEventotablaMomentoEventoHorariofechaTerminaPME_input'), 
    '28/11/2018')

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_Horario_form_programacionMomentoEventotablaMomentoEventoHorarioj_idt833'))

WebUI.check(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/label_MAR'))

WebUI.check(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/label_MIE'))

WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/select_hora1'), 5)

WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/select_hora 2'), 6)

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_mas_horario'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_Aplicar'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Programación/a_mas'))

WebUI.closeBrowser()

