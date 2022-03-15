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

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
    'Nomina Electronica')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Nomina Electronica'), 
    0)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/td_Con inconsistencia'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Mendoza 2727 Empleado'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Mendoza 2727 Empleado'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar1'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Si'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Si'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'), 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/a_Generar_principal'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/a_Generar_secundario'))

    WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/input_Estado_j_idt90j_idt119'), 
        'Mendoza 2727 Empleado')

    WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/input_Estado_j_idt90j_idt119'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Mendoza 2727 Empleado'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Mendoza 2727 Empleado'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar1'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Si'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/span_Si'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'), 
        0)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Descargar Nomina Electronica/Page_SARA/a_Descargar2'))
}

WebUI.closeBrowser()

