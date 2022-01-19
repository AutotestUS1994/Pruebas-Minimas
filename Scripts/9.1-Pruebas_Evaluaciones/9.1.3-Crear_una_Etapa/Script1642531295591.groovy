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

WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Empresa 1_form_templatej_idt24_input'), 
    'gestion herramientas')

WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Gestion Herramientas'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'))

    WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Fase Evaluacin'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_PRUEBAS K'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_PRUEBAS K'))

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Etapa'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Pruebas Ka'), 1)) {
            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Pruebas Ka'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Eliminar'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Si'))
        }
        
        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Nuevo'))

        WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Descripcin_formGestionHerramientaspanelTabFasepanelDetalleEtapadescripcion'), 
            'Pruebas Ka')

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --CapacitacionEncuestaMetaPlan AccionSeguimiento Competencias'), 
            2)

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --NoSi'), 
            1)

        WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Orden_formGestionHerramientaspanelTabFasepanelDetalleEtapaorden'), 
            '5')

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Guardar'))

        WebUI.closeBrowser()
    } else {
        WebUI.callTestCase(findTestCase('9.1-Pruebas_Evaluaciones/9.1.2-Crear_una_Fase'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Empresa 1_form_templatej_idt24_input'), 
            'gestion herramientas')

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Gestion Herramientas'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Fase Evaluacin'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_PRUEBAS K'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Etapa'))

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Nuevo'))

            WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Descripcin_formGestionHerramientaspanelTabFasepanelDetalleEtapadescripcion'), 
                'Pruebas Ka')

            WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --CapacitacionEncuestaMetaPlan AccionSeguimiento Competencias'), 
                2)

            WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --NoSi'), 
                1)

            WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Orden_formGestionHerramientaspanelTabFasepanelDetalleEtapaorden'), 
                '5')

            WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Guardar'))

            WebUI.closeBrowser()
        }
    }
} else {
    WebUI.callTestCase(findTestCase('9.1-Pruebas_Evaluaciones/9.1.2-Crear_una_Fase'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Empresa 1_form_templatej_idt24_input'), 
        'gestion herramientas')

    WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/span_Gestion Herramientas'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_Pruebas katalon'))

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Fase Evaluacin'))

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/td_PRUEBAS K'))

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Etapa'))

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Nuevo'))

        WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Descripcin_formGestionHerramientaspanelTabFasepanelDetalleEtapadescripcion'), 
            'Pruebas Ka')

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --CapacitacionEncuestaMetaPlan AccionSeguimiento Competencias'), 
            2)

        WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/select_-- Seleccione --NoSi'), 
            1)

        WebUI.setText(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/input_Orden_formGestionHerramientaspanelTabFasepanelDetalleEtapaorden'), 
            '5')

        WebUI.click(findTestObject('Modulo Pruebas Evaluaciones/Crear_una_Etapa/a_Guardar'))

        WebUI.closeBrowser()
    }
}

