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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/input_Empresa 1_form_templatej_idt24_input'), 
    'gestion herramientas')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/span_Gestion Herramientas'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_Pruebas katalon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_Pruebas katalon'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Tipo Evaluador'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_pr.katalon'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_pr.katalon'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Nuevo'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/input_Descripcin_form_planillaGestiondescripcion'), 
        'pr.katalon')

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/select_--Seleccione--AutoevaluacinCompaeroJefeOtroSubalterno'), 
        1)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Guardar'))

    WebUI.closeBrowser()
} else {
    WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/9.1-Pruebas_Evaluaciones/9.1.3-Crear_una_Etapa'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/input_Empresa 1_form_templatej_idt24_input'), 
        'gestion herramientas')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/span_Gestion Herramientas'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_Pruebas katalon'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_Pruebas katalon'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Tipo Evaluador'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_pr.katalon'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/td_pr.katalon'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Eliminar'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Aceptar'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Nuevo'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/input_Descripcin_form_planillaGestiondescripcion'), 
            'pr.katalon')

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/select_--Seleccione--AutoevaluacinCompaeroJefeOtroSubalterno'), 
            1)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Crear_modelos_de_evaluaciones 360º 180º 90º/a_Guardar'))

        WebUI.closeBrowser()
    }
}

