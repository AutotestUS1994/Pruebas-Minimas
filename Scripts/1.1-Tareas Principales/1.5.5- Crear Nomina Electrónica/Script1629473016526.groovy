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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Nomina Electronica (com)')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/li_Nomina Electronica (com)'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/li_Nomina Electronica (com)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/input_Fecha Corte_listado_nominaelectronicaj_idt72'), 
    '2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/input_Fecha Corte_listado_nominaelectronicaj_idt72'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/td_2021-07-01'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/td_2021-07-01'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Reversar Nomina'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/span_Si_Reversar Nomina'))
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Nuevo'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Nuevo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/select_-- seleccione --Nmina IndividualNmina Individual de Ajuste'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/input_Ao_popup_nominaelectronicaanno'), 
    '2021')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/select_-- seleccione --Nmina IndividualNmina Individual de Ajuste'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulioAgostoSeptiembreOctubreNoviembreDiciembre'), 
    '8')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica/Page_SARA/select_CUNDINAMARCASANTANDERBOGOTANo Usar'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulioAgostoSeptiembreOctubreNoviembreDiciembre'), 
    '7')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Guardar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Guardar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Generar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Generar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Generar2'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/Page_SARA/a_Generar2'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Nomina Electronica (1)/td_Aguilar Ardila Simon Andres'), 
    0)) {
    String Result = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

