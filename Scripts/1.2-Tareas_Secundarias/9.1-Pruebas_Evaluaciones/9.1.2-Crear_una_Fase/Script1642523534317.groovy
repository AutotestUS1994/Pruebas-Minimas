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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Empresa 1_form_templatej_idt24_input'), 
    'gestion herramientas')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/li_Gestion Herramientas (tal)'))

if (WebUI.waitForElementNotVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_Pruebas katalon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Nuevo'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Descripcin_formGestionHerramientasdescripcion'), 
        'Pruebas katalon')

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/select_--Seleccione--No VigenteVigente'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/select_--Seleccione--Evaluacin de DesempeoEvaluacin de Desempeo 2016'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/select_--Seleccione--Asociar evaluadoNo Asociar evaluado'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Guardar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Fase Evaluacin'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_PRUEBAS K'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Nuevo1'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Cdigo_formGestionHerramientaspanelTabFasecodigo'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Descripcin_formGestionHerramientaspanelTabFasedescripcion'), 
        'PRUEBAS K')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Orden_formGestionHerramientaspanelTabFaseorden'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Nmero Seguimiento_formGestionHerramientaspanelTabFaseseguimiento'), 
        '5')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Guardar1'))

    String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Regresar'))

    if (Result == 'Registro ingresado correctamente..') {
        String Resultado = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_Pruebas katalon'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Tipo Evaluador'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_pr.katalon'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_pr.katalon'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Eliminar_Tipo evaluador'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Aceptar_Tipo evaluador'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Fase Evaluacin'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_PRUEBAS K'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/td_PRUEBAS K'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Etapa'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/span_Pruebas Ka_Etapa'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/span_Pruebas Ka_Etapa'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Eliminar_Etapa'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/span_Si_Etapa'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Detalle'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Nuevo1'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Cdigo_formGestionHerramientaspanelTabFasecodigo'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Descripcin_formGestionHerramientaspanelTabFasedescripcion'), 
        'PRUEBAS K')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Orden_formGestionHerramientaspanelTabFaseorden'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/input_Nmero Seguimiento_formGestionHerramientaspanelTabFaseseguimiento'), 
        '5')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_una_Fase/a_Guardar1'))

    String Result0 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Result0 == 'Registro ingresado correctamente..') {
        String Resultado0 = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

