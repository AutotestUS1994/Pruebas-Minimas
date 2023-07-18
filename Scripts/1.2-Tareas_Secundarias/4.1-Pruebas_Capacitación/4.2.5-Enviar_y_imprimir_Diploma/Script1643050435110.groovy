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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/input_Empresa 1_form_templatej_idt24_input'), 
    'Control Evento Capacitacion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/li_Control Evento Capacitacion (cap)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/td_Prueba'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/div_Asistentes'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Registro'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Agregar Asistentes'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Identificacin_form_filtro_EmpleadosfiltroPopupEmpleado'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/input_Filtro Empleado_form_popupEmpleadoj_idt2269'), 
    '80097770')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/input_Filtro Empleado_form_popupEmpleadoj_idt2269'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/span_80097770'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/div_Almanza Novoa John Alexandre_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/select_--SeleccionePruebas k'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/select_--SeleccionePrueba1pruebaPRUEBA PLAN CAPACITACIONPRUEBA SILVIA'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Aceptar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/td_FINALIZADO'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/select_SeleccioneACEPTADOFINALIZADOINSCRITONO ACEPTADONO APROBADONO ASISTIO'), 
    2)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/input_Puntaje_formAsistenteEventopanelTabAsistenteEvenpuntaje'), 
    '5')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/span_Externo_ui-icon ui-icon-closethick'))

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/span_Origen_ui-chkbox-icon ui-icon ui-icon-check ui-c'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Enviar Diploma'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Imprimir Diploma'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/div_Grupo_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/a_Generar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/span_Cupo_ui-icon ui-icon-closethick'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Enviar_Diploma/td_80097770'), 
    1)) {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

