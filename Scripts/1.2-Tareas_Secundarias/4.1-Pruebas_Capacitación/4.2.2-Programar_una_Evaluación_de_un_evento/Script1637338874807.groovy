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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/td_Prueba'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/div_Evaluacin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/a_Evento'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/td_Encuesta De Satisfaccion Capacitacion'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt766'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/a_Aceptar_Eliminar'))

    WebUI.verifyElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/p_Se elimino el registro de evaluacion'), 
        0)
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/a_Programar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/select_SeleccioneENCUESTA DE SATISFACCION CAPACITACION'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/select_SeleccioneACEPTADOFINALIZADOINSCRITONO ACEPTADONO APROBADONO ASISTIO'), 
    0)

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/div_Grupo_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/input_Fecha Limite_popupProgramarEvento_formfechaIn_input'), 
    '31/12/2021')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/input_Fecha Limite_popupProgramarEvento_formfechaIn_input'), 
    Keys.chord(Keys.ESCAPE))


    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programar_una_Evaluación_de_un_evento/a_Aplicar'))


String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se aplico correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

