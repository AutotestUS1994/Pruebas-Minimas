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
import com.sun.org.apache.bcel.internal.generic.RETURN as RETURN
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String identificacion = ((WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.1.1-Crear Nueva Hoja de Vida'), [:], 
        FailureHandling.STOP_ON_FAILURE)) as String)

WebUI.callTestCase(findTestCase('Hutilidades/Tareas Actos Administrativos/Tarea Actos Administrativos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/i_Actos_glyphicons glyphicons-group'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/i_Actos_glyphicons glyphicons-group'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Acto cambio del Empleado_form'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Acto cambio del Empleado_form'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_Nomina'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_Nomina'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_ingreso definitivo indefinido salario basico'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_ingreso definitivo indefinido salario basico'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Elaboracin_glyphicons glyphicons-chronicle x2'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Elaboracin_glyphicons glyphicons-chronicle x2'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Identificacin_form_actoIngresoj_idt975'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Identificacin_form_actoIngresoj_idt975'))

WebUI.setText(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1696'), 
    identificacion)

WebUI.sendKeys(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1696'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_Consta Belfegord  Jhon5682169'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/span_Consta Belfegord  Jhon5682169'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Continuar'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Cambio Empleado/a_Continuar'))

return identificacion

