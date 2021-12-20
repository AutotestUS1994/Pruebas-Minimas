import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '1234567890')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Consta Belfegord Jhon'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Consta Belfegord Jhon'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Vacacin'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Vacacin'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Programacion De Vacaciones'), 
    GlobalVariable.G_TimeOut)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Programacion De Vacaciones'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Eliminar'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Eliminar'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Aceptar'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Aceptar'))
}

/*COMPRUEBA SI EXISTEN VACACIONES */
WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Histrico'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Programacion De Vacaciones'), 
    1)) {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.2.1-Reversar Vacaciones'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
        '1234567890')

    WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Consta Belfegord Jhon'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Consta Belfegord Jhon'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Vacacin'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Vacacin'))
}

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Vacaciones'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Nuevo Pasivo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Nuevo Pasivo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_pestaa Vacaciones'))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/select_APLAZAMIENTOPROGRAMACION DE VACACIONES'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/select_InterrupcinNo Aplica'), 
    '1')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Periodo Servicio_form_'), 
    '01/06/2021')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/span_Periodo Servicio'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Periodo Servicio_form_vacaciones'), 
    '06/06/2021')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Periodo Servicio_form_vacaciones'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Das_form_vacacionesEmpleadotabs'), 
    '5')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Fecha Origen_form_vacaciones'), 
    '01/06/2021')

//WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Fecha Origen_form_vacaciones'), 
//    '01/12/2018')
WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Fecha Origen_form_vacaciones'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Guardar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Guardar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Regresar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Regresar'))

WebUI.delay(3)

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/td_02062021'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/td_02062021'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Eliminar Directo_Solicitud'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Eliminar Directo_Solicitud'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Aceptar'))
}

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Nueva Solicitud'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Nueva Solicitud'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Salida Nomina_form_vacaciones'), 
    '01/06/2021')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Salida Nomina_form_vacaciones'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/select_SeleccioneChequeEntidad_'), 
    '3')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Pago_form_vacacionesEmpleado'), 
    '01/06/2021')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Pago_form_vacacionesEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Disfrute_form_vacacionesEmpleado'), 
    '1')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/input_Compensados_form_vacaciones'), 
    '1')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/textarea_Observacin_form_vacaciones'), 
    'Pruebas sara')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Verificar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Verificar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Guardar_solicitudes'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Guardar_solicitudes'))

WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Dias con Permisos Pasivos Permitidos/a_Regresar_vacaciones'))

