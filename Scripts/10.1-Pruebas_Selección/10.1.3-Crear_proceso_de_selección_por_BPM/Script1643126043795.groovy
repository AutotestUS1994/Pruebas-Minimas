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

WebUI.comment('NO SE PUEDE ELIMINAR REGISTROS')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Proceso de Sele'))

WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    '29/06/2017')

WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    '10/07/2017')

if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_8028     - Analista De Sistemas'), 
    1)) {
    WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_8028     - Analista De Sistemas'), 
        0)

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_8028     - Analista De Sistemas'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Etapa'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Orden_ui-icon ui-icon-closethick'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_PRUEBA'), 1)) {
        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_PRUEBA'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Nuevo1'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--Ajuste al cargoContacto'), 
        9)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Nmero_popupEtapaSeleccion_formorden'), 
        '11')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/div_INFORME FINAL_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover1'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_SeleccioneClasificatoriaEliminatoriaNo Aplica'), 
        3)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1peso'), 
        '15')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1minimo'), 
        '3')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1maximo'), 
        '10')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Guardar1'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Medio'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_Evaluacin Artstica'), 
        1)) {
        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_Evaluacin Artstica'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Eliminar2'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--Evaluacin ArtsticaINFORME FINAL'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--ClasificatoriaEliminatoriaNo Aplica'), 
        3)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Peso_popupMedioSeleccion_formpeso'), 
        '10')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Mnimo_popupMedioSeleccion_formminimo'), 
        '3')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Mximo_popupMedioSeleccion_formmaximo'), 
        '10')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Guardar2'))

    WebUI.delay(4)

    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_SeleccionarSiNo'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
        1)

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Unidad Organizacional_popupConfirmacionRequerimientoj_idt132'))

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
        'Analista QA')

    WebUI.sendKeys(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Analista QA'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Cargo_popupConfirmacionRequerimientoj_idt136'))

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Cargo_popupCargo_Formj_idt668'), 
        'ANALISTA DE SISTEMAS')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_ANALISTA DE SISTEMAS'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--Primer Modelo Seleccin R. Modelo Etapa'), 
        1)

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Continuar'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_SeleccioneNOSI'), 
        2)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Proceso_seleccion_procesofecha_inicio_input'), 
        '29/06/2017')

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_Concurso InternoMixtoProceso Externo'), 
        0)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input__seleccion_procesofechaconvocatoria_input'), 
        '10/07/2017')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/textarea_TEST_seleccion_procesoproceso'), 
        'PRUEBAS KATALON')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Guardar'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Etapa'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Orden_ui-icon ui-icon-closethick'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_PRUEBA'), 1)) {
        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_PRUEBA'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Nuevo1'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--Ajuste al cargoContacto'), 
        9)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Nmero_popupEtapaSeleccion_formorden'), 
        '11')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/div_INFORME FINAL_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover1'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_SeleccioneClasificatoriaEliminatoriaNo Aplica'), 
        3)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1peso'), 
        '15')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1minimo'), 
        '3')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Evaluacin Artstica_popupEtapaSeleccion_formtabla1maximo'), 
        '10')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Guardar1'))

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Medio'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_Evaluacin Artstica'), 
        1)) {
        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/td_Evaluacin Artstica'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Eliminar2'))

        WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--Evaluacin ArtsticaINFORME FINAL'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/select_--Seleccione--ClasificatoriaEliminatoriaNo Aplica'), 
        3)

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Peso_popupMedioSeleccion_formpeso'), 
        '10')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Mnimo_popupMedioSeleccion_formminimo'), 
        '3')

    WebUI.setText(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/input_Mximo_popupMedioSeleccion_formmaximo'), 
        '10')

    WebUI.click(findTestObject('Modulo Selección/Crear_proceso_de_selección_por_BPM/a_Guardar2'))

    WebUI.delay(4)

    WebUI.closeBrowser()
}

