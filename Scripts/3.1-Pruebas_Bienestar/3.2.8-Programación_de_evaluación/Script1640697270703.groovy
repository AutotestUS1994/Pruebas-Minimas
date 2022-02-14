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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/div_Participante'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Grupo'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/td_PRUEBAS K'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/td_PRUEBAS K'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Integrantes'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/td_Administracion'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/span_Inscrito_ui-icon ui-icon-closethick'))
    } /*---------------------------------------------------------------------------------------------------*/
    /*------------------------------------------------------------------------------------------------*/
    else {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Costo_grupoEventopanel_principal_2pGListaIntegrantesj_idt376'))

        WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2407'), 
            'A A A')

        WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2407'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/span_A A A'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Costo_grupoEventopanel_principal_2pGListaIntegrantesj_idt391'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/span_Inscrito_ui-icon ui-icon-closethick'))
    }
} else {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Nuevo'))

    WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Cdigo_grupoEventopanel_principal_2codigo'), 
        '5')

    WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Nombre_grupoEventopanel_principal_2pGNombre'), 
        'PRUEBAS K')

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/select_-- Seleccione --prueba'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/select_-- Seleccione --AceptadoCanceladoFinalizadoInscritoNo AceptadoNo FinalizadoSolicitado'), 
        7)

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/select_CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
        5)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Guardar'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Integrantes'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Costo_grupoEventopanel_principal_2pGListaIntegrantesj_idt376'))

    WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2407'), 
        'A A A')

    WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2407'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/span_A A A'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Costo_grupoEventopanel_principal_2pGListaIntegrantesj_idt391'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/span_Inscrito_ui-icon ui-icon-closethick'))
}

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/div_Evaluacin'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Evento'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt881'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt881'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Programar'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/select_SeleccioneEvaluacin ArtsticaEvaluacin Evento BienestarEvaluacin PreviaEvaluacin EventoqqEvaluacin Bienestar'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/select_SeleccioneAceptadoCanceladoFinalizadoInscritoNo AceptadoNo FinalizadoSolicitado'), 
    0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/div_Grupo_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programación_de_evaluación/a_Aplicar0'))

WebUI.delay(3)

WebUI.closeBrowser()

