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

WebUI.comment('SE GENERA FALLA AL DAR CLICK SOBRE REGISTRO ACTIVIDAD')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado Contratacion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/span_Listado Contratacion'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_ERROR_UNI-APL-001'), 
        1)) {
        WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.4-Crear_un_Registro_de_Contratación'), 
            [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Empresa 1_form_templatej_idt24_input'), 
            'Listado Contratacion')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/span_Listado Contratacion'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Nombre Persona_listado_contratacionj_idt68'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
            'A A A')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))

        WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'), 
            0)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Actividad'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_2. Elaborar contrato'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Aplicar'))

    String Result0 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Result0 == 'Procesado Exitosamente') {
        String Resultado0 = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Nombre Persona_listado_contratacionj_idt68'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
        'A A A')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A - 2'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_ERROR_UNI-APL-001'), 
            1)) {
            WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.4-Crear_un_Registro_de_Contratación'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Empresa 1_form_templatej_idt24_input'), 
                'Listado Contratacion')

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/span_Listado Contratacion'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Nombre Persona_listado_contratacionj_idt68'))

            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
                'A A A')

            WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
                Keys.chord(Keys.ENTER))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))

            WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'), 
                0)

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Actividad'))

        WebUI.doubleClick(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_2. Elaborar contrato'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Aplicar'))

        String Result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (Result1 == 'Procesado Exitosamente') {
            String Resultado1 = 'PRUEBA OK'

            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    } else {
        WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.6-Validar_Documentos'), [:], 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/input_Empresa 1_form_templatej_idt24_input'), 
            'Listado Contratacion')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/span_Listado Contratacion'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_A A A'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Actividad'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/td_2. Elaborar contrato'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Elaborar_Contrato/a_Aplicar'))

        String Result2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (Result2 == 'Procesado Exitosamente') {
            String Resultado = 'PRUEBA OK'

            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
}

