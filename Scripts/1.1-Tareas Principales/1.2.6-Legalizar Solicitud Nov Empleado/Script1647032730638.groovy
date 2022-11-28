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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Aplicacion Nov. Empleado'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por Autorizar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por Autorizar'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Consta Belfegord . Jhon'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Solicitud_ui-chkbox-box_Consta Belfegord'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Autorizar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Continuar_Por Autorizar'))
} else {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.2.3-Legalizar Licencia Remunerada'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Tarea Aplicacion Nov. Empleado/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
        'Aplicacion Nov. Empleado (com)')

    WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_legalizar solicitud nov emp'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_legalizar solicitud nov emp'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por Autorizar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por Autorizar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/span_CONSTA BELFEGORD JHON'), 
        0)

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Solicitud_ui-chkbox-box_Consta Belfegord'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Solicitud_ui-chkbox-box_Consta Belfegord'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Autorizar'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Continuar_Por Autorizar'))
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo - Copy'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Solicitud_ui-chkbox-box_Consta Belfegord'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Autorizar'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si_Por  Autorizar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Continuar_Por Autorizar'))
    }
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por legalizar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Ausentismo_Por legalizar'))

WebUI.check(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Estado_ui-chkbox-box ui-widget ui-corner-all ui-state-default'))

/*
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/div_Estado_ui-chkbox-box ui-widget'))
*/
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Legalizacin'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/span_Si'))

String Alerta = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Resultado'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Solicitud Nov Empelado/a_Continuar'))

if (Alerta == 'Se ha realizado el proceso') {
    

    WebUI.closeBrowser()
} else if (Alerta == 'Realizado proceso...') {
    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

