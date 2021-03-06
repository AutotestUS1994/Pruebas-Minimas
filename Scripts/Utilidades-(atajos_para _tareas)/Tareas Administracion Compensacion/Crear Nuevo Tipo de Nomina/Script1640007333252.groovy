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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Mantenimieto Periodo Nomina'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/a_Nuevo'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/a_Nuevo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/input_Tipo Periodo_tipoPeriodo'), 
    '36364')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/input_Descripcin Tipo Periodo_'), 
    'kataloon')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/select_--- Seleccione estado L'), 
    '2')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/a_Guardar'))

WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Administrador Sara'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Administrador Sara'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Cambiar Modulo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Sara General'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_SaraDS_Jboss (Compensacio'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_SaraDS_Jboss (Compensacio'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/div_Salir_navMenu'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/div_Salir_navMenu'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/input_Ir_nav_t66_input'), 
    'Rol Acceso')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_rol Acceso'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_rol Acceso'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Permisos Por Login Usuari'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_saraadmin'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/li_36363 - kataloon'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/li_36363 - kataloon'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Periodos Asociados_ui-ico'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Actualizar'))

WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Administrador Sara'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Mantenimiento Periodo Nomina/span_Cambiar Modulo'))

WebUI.closeBrowser()

