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

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/input_Evento Capacitacin_form_templatej_idt24_input'), 
    'Listado necesidad de capacitacion')

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/li_Listado necesidad de capacitacion (cap)'))

if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/td_A A A'))

    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Cambiar Datos'), 
        1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Cambiar Datos'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Eliminar'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/span_Si'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Aceptar_Eliminar'))
    } else {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Eliminar'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/span_Si'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Aceptar_Eliminar'))
    }
}

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Nuevo'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/span_prueba np'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Nombre_formj_idt628'))

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1726'), 
    'a')

WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1726'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/span_A A A'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Solicitado Por_formj_idt661'))

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/input_Filtro Hoja de Vida_formj_idt723'), 
    'a')

WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/input_Filtro Hoja de Vida_formj_idt723'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/span_Aalfalfa Aalfalfa Aalfalfa'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_una_Necesidad_de_Capacitación/a_Guardar'))

WebUI.closeBrowser()

