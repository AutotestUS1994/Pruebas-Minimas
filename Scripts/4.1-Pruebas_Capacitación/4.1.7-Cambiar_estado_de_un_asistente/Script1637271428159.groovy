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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/td_Prueba'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/div_Asistentes'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/a_Registro'))

if (WebUI.waitForElementNotPresent(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/td_prueba ka Pruebas'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/td_prueba ka Pruebas'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/select_SeleccioneACEPTADOFINALIZADOINSCRITONO ACEPTADONO APROBADONO ASISTIO'), 
        1)

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/a_Actualizar'))
} else {
    WebUI.callTestCase(findTestCase('4.1-Pruebas_Capacitación/4.1.5-Insribir_un_asistente'), [:], FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementNotPresent(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/td_prueba ka Pruebas'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/td_prueba ka Pruebas'))

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/select_SeleccioneACEPTADOFINALIZADOINSCRITONO ACEPTADONO APROBADONO ASISTIO'), 
            1)

        WebUI.click(findTestObject('Modulo Pruebas Capacitación/Cambiar_estado_de_un_asistente/a_Actualizar'))
    }
}

WebUI.closeBrowser()

