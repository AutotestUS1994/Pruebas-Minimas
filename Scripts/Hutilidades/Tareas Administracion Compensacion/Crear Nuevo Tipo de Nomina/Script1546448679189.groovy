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

WebUI.callTestCase(findTestCase('Hutilidades/Tareas Administracion Compensacion/Tarea Mantenimieto Periodo Nomina'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/input_Tipo Periodo_tipoPeriodo'), 
    '36364')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/input_Descripcin Tipo Periodo_'), 
    'kataloon')

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/select_--- Seleccione estado L'), 
    '2')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/a_Guardar'))

WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.delay(1)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Administrador Sara'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Cambiar Modulo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Sara General'))

WebUI.delay(2)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_SaraDS_Jboss (Compensacio'))

WebUI.delay(2)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/div_Salir_navMenu'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/input_Ir_nav_t66_input'), 
    'Rol Acceso')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/input_Ir_nav_t66_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Permisos Por Login Usuari'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_saraadmin'))

WebUI.delay(1)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/li_36363 - kataloon'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Periodos Asociados_ui-ico'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Actualizar'))

WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Administrador Sara'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Crear Mantenimiento Periodo Nomina/span_Cambiar Modulo'))

WebUI.closeBrowser()

