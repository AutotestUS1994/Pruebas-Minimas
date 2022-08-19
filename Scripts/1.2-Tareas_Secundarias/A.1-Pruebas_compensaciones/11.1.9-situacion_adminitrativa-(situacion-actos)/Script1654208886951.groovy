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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Empresa 1_form_templatej_idt24_input'), 
    'listado de empleados (com)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_Listado de Empleados'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '1252462')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_1252462'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Situacin Administrativa'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_CAMBIO DE SUELDO'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Continuar0'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input__form_actosDirectosEmpleadoj_idt25340fecha_input'), 
    Fecha())

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/select_11 - Redistribucion Flexible4  - Aumento Directo5  - Nivelacion6  - Cambio Sueldo Masivo'), 
    2)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input__form_actosDirectosEmpleadoj_idt25342fecha_input'), 
    Fecha())

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Continuar'),
	30)
/*--------------------------------------------------*/
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

filepath = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Sueldo_form_actosDirectosEmpleadosueldo'), 
    'value')

if (filepath == '689455.00') {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Sueldo_form_actosDirectosEmpleadosueldo'), 
        '700000')
} else {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Sueldo_form_actosDirectosEmpleadosueldo'), 
        '689455')
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Aplicar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_SI'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Aceptar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Empresa 1_form_templatej_idt24_input'), 
    'actos administrativos')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_Listado de Empleados'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/i_Actos_glyphicons glyphicons-group x3 icon-acto'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Acto cambio del Empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_Nomina'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Empleados_form_ActosAdministrativosj_idt104'), 
    'cambio de sueldo')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Empleados_form_ActosAdministrativosj_idt105'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_cambio de sueldo_'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Elaboracin_form_popupSeleccionDerogarj_idt408'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Contrato_form_popupSeleccionDerogarTrasladoj_idt372'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Filtro Empleado_form_popupEmpleadoj_idt895'), 
    '1252462')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input_Filtro Empleado_form_popupEmpleadoj_idt895'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/span_1252462_'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/td_03062022'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/select_- No Relacionado1  - Cambio Datos Del Puesto10 - Ingreso Puesto Nuevo11'), 
    2)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/input__form_actoIngresoj_idt9841fecha_input'), 
    Fecha())

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Continuar2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/situacion_adminitrativa-(situacion-actos)/a_Aplicar2'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

System.out.println(Fecha())

def Fecha() {
    Date today = new Date()

    String Fecha = today.format('dd/MM/yyyy')

    String FechaF = Fecha
}

