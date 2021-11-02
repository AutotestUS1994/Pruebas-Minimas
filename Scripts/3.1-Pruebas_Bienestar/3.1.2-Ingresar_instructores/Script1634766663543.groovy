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

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/input_Evento Bienestar_form_templatej_idt282j_idt29'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/label_bienestar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_evento'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/td_Prueba'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/td_Prueba'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Aceptar'))
    }
    
    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/select_-- Seleccione --Beltran Daza Jose AndresCanizalez Acero Marta BrigitteBuitrago Buitrago Andrea12501250Mendoza 1010 Empleado'), 
        5)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadoresj_idt618'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/input_Evento Bienestar_form_templatej_idt282j_idt29'))

    WebUI.delay(2)
} else {
    WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.1-Crear_un_Evento'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/input_Evento Bienestar_form_templatej_idt282j_idt29'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/label_bienestar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_evento'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/td_Prueba'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/td_Prueba'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'))

            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Aceptar'))
        }
        
        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/select_-- Seleccione --Beltran Daza Jose AndresCanizalez Acero Marta BrigitteBuitrago Buitrago Andrea12501250Mendoza 1010 Empleado'), 
            5)

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadoresj_idt618'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/input_Evento Bienestar_form_templatej_idt282j_idt29'))

        WebUI.delay(2)
    } else {
        WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.1-Crear_un_Evento'), [:], FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/td_Prueba'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadores0j_idt616'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Aceptar'))
    }
    
    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/select_-- Seleccione --Beltran Daza Jose AndresCanizalez Acero Marta BrigitteBuitrago Buitrago Andrea12501250Mendoza 1010 Empleado'), 
        5)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/a_Instructores_form_entrenadorlistaEntrenadoresj_idt618'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar instructores/input_Evento Bienestar_form_templatej_idt282j_idt29'))

    WebUI.delay(2)
}

WebUI.closeBrowser()

