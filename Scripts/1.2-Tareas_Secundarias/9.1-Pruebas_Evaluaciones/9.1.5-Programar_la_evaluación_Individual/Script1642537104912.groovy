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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/input_Empresa 1_form_templatej_idt24_input'), 
    'listado herramientas')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/li_Listado Herramientas (tal)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/div_Contratacion_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_--- Seleccione Herramienta ---ENCUESTA DE RETIROEVALUACION 2011'), 
    2)

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_A A A'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_Si'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_Regresar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_--- Seleccione Herramienta ---ENCUESTA DE RETIROEVALUACION 2011 - Copy'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/a_Identificacion Evaluado_form_popupDetalleEvaluacionj_idt215'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt723'), 
    'A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt723'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_--Seleccione--CALIDADMENSUAL ABC'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_--- Seleccione Unidad Organizacional ---1111123456ADMINISTRACIONADMINISTRACIONAnalista'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_--- Seleccione Cargo ---20145   -40 MIL STAFF20139   -ABOGADO20117   -ABOGADO JUNIOR10'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/select_ADMINISTRATIVOSAPRENDICESEMPLEADOFBROLESTSMECANICOSNO APLICANOMINA 40 MIL'), 
    6)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/a_Periodo_form_popupDetalleEvaluacionj_idt208'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_PERIODO DE PRUEBA'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Individual/span_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Registro guardado') {
    String Resultado = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

