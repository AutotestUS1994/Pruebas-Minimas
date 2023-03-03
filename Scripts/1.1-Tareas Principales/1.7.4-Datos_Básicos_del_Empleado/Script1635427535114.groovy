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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Evento Bienestar_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Evento Bienestar_form_templatej_idt24_input'), 
    'Listado de Empleados (com)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Listado de Empleados (com)'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Listado de Empleados (com)'), 
    1)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '1234567890')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_1234567890'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Datos Empleado'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Pestaa_Variable'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Metodo De Retencion En La Fuen'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Metodo De Retencion En La Fuen'))

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Hasta_variableempleado_formfechaHasta_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Eliminar_Variable'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Si'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Nuevo_Variable'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_Variable'), 
    43)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Vigencia_variableempleado_formfechaVigencia_input'), 
    '01/08/2018')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Valor_variableempleado_formvalor'), 
    '0')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_-- seleccione --Ciclo 0Ciclo 1Ciclo 2'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Aplicar_variable'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Novedad Fecha'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Novedad Fecha'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Recargo Nocturno'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Recargo Nocturno'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Eliminar_Novedad'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Si_Novedad'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Nuevo_Novedad'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_Auxilio Subsidio Familiar'), 
    9)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Vigencia_'), 
    '01/07/2018')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Valor_'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Zona Econmica_variableempleado_formj_idt2653'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_ADMINISTRATIVA'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_1 - ADMINISTRATIVO. - NO RELACIONADA9999 - SUBCENTROS'), 
    1)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Cantidad_variableempleado_formcantidad'), 
    '10')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_-- seleccione'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Presupuestal_variableempleado_formpresupuestal'), 
    '100')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Aplicar_Novedad Fecha'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Concepto'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Hora Extra Diurna Festiva_Concepto'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Hora Extra Diurna Festiva_Concepto'))

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Hasta_conceptoempleado_formfechaHasta_input_Concepto'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Eliminar_concepto'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_Si_concepto'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Nuevo_Concepto'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Concepto_conceptoempleado_formj_idt453'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/label_Concepto'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_concepto'), 
    'HORA EXTRA DIURNA FESTIVA')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_concepto'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/span_HORA EXTRA DIURNA FESTIVA'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Vigencia_conceptoempleado_formfechaVigencia_input'), 
    '01/07/2018')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_-- SELECCIONAR LIQUIDACION'), 
    '2')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/input_Valor_conceptoempleado_formvalor'), 
    '100')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/select_-- seleccione --Ciclo 0'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Datos_Básicos_del_Empleado/a_Aplicar_Concepto'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'El concepto ha sido ingresado correctamente') {
    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

