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
/*librerias para ejecutar botones con java sript*/ import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Empresa 1_form_templatej_idt24_input'), 
    'listado contratacion')

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/li_Listado Contratacion (tal)'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Responsable Tarea 1. Validar Documentos'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'))

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/select_-Seleccione-CumplidoNo AplicaNo Cumplido'), 
            3)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/textarea_Observacin_requisitoHoja_formobservacion'), 
            'Pruebas katalon')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actualizar'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Aplicar'))

        WebUI.closeBrowser()
    } else {
        WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.4-Crear_un_Registro_de_Contratación'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Empresa 1_form_templatej_idt24_input'), 
            'listado contratacion')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/li_Listado Contratacion (tal)'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'))
        } else {
            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'))

            WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
                '1010220596')

            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A'))
        }
        
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Responsable Tarea 1. Validar Documentos'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'))

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/select_-Seleccione-CumplidoNo AplicaNo Cumplido'), 
            3)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/textarea_Observacin_requisitoHoja_formobservacion'), 
            'Pruebas katalon')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actualizar'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Aplicar'))

        WebUI.closeBrowser()
    }
} else if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'))

    WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
        '1010220596')

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Responsable Tarea 1. Validar Documentos'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'))

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/select_-Seleccione-CumplidoNo AplicaNo Cumplido'), 
            3)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/textarea_Observacin_requisitoHoja_formobservacion'), 
            'Pruebas katalon')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actualizar'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Aplicar'))

        WebUI.closeBrowser()
    } else {
        WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.4-Crear_un_Registro_de_Contratación'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Empresa 1_form_templatej_idt24_input'), 
            'listado contratacion')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/li_Listado Contratacion (tal)'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'))
        } else {
            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'))

            WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
                '1010220596')

            WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A'))
        }
        
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'))

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
            '1010220596')

        WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_SOLICITADO'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Responsable Tarea 1. Validar Documentos'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'))

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/select_-Seleccione-CumplidoNo AplicaNo Cumplido'), 
            3)

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/textarea_Observacin_requisitoHoja_formobservacion'), 
            'Pruebas katalon')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actualizar'))

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Aplicar'))

        WebUI.closeBrowser()
    }
} else {
    WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/7.1-Pruebas_Vinculación/7.1.4-Crear_un_Registro_de_Contratación'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Empresa 1_form_templatej_idt24_input'), 
        'listado contratacion')

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/li_Listado Contratacion (tal)'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A - Copy'))
    } else {
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Nombre Persona_listado_contratacionj_idt68'))

        WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1320'), 
            '1010220596')

        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_A A A'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actividad'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Responsable Tarea 1. Validar Documentos'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/td_Cdula'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/select_-Seleccione-CumplidoNo AplicaNo Cumplido'), 
        3)

    WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/textarea_Observacin_requisitoHoja_formobservacion'), 
        'Pruebas katalon')

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Actualizar'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Validar_Documentos/a_Aplicar'))

    WebUI.closeBrowser()
}

