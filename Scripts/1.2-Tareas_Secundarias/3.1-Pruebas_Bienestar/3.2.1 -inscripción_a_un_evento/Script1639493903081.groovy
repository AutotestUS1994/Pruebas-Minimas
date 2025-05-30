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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
    'Inscripcion evento (bie)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Inscripcin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Nombre_formListadoEventosj_idt185'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/select_-- Seleccione --prueba-S-SH'), 
    1)

/*WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Referencia Pago_formListadoEventospIReferencia'), 
    '5')*/

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Valor Persona A Pagar_formListadoEventospIValor'), 
    '100')



WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Posicin_formListadoEventospIPosicion'), 
    '5')

if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/select_pariente'), 
    1)) {

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/select_pariente'), 
    1)
}
WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Guardar'), 1)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Guardar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))


if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 2)) {
    String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Result == 'Se ha registrado en el evento.') {
        WebUI.closeBrowser()
    } else {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
            'evento (bie)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_Prueba-S-SH'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/div_Participante'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Individual'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_ A A A'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Cambiar Datos'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/span_Si'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
            'Inscripcion evento (bie)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Inscripcin'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Nombre_formListadoEventosj_idt185'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/select_-- Seleccione --prueba-S-SH'), 
            1)

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Referencia Pago_formListadoEventospIReferencia'), 
            '5')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Valor Persona A Pagar_formListadoEventospIValor'), 
            '100')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Posicin_formListadoEventospIPosicion'), 
            '5')
		
        WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Guardar'), 
            30)

        WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))
		
        String Result0 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (Result0 == 'Se ha registrado en el evento.') {
            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
    /*--------------------------------------------------*/
} else {
    WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Aceptar'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element2))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/span_Cerrar Individual'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
        'evento (bie)')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_Prueba-S-SH'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/div_Participante'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Individual'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_ A A A'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Cambiar Datos'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/span_Si'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
        'Inscripcion evento (bie)')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Inscripcin'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Nombre_formListadoEventosj_idt185'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/td_'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/select_-- Seleccione --prueba-S-SH'), 
        1)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Referencia Pago_formListadoEventospIReferencia'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Valor Persona A Pagar_formListadoEventospIValor'), 
        '100')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/input_Posicin_formListadoEventospIPosicion'), 
        '5')

    WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Inscripción_a_un_evento/a_Guardar'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))

    String Result0 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Result0 == 'Se ha registrado en el evento.') {
        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

def zoom() {
    WebUI.executeJavaScript('document.body.style.zoom=\'80%\'', null)
}

def zoom1() {
    WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)
}

