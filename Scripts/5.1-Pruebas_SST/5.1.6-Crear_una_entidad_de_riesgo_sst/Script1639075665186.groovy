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

WebUI.setText(findTestObject('Modulo Pruebas SST/Reporte_de_accidente_de_trabajo/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'entidades riesgo')

WebUI.delay(2)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/li_Entidades Riesgo (sst)'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Nombre_form_entidadRiesgoj_idt59'), 
    'pruebas k')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Nombre_form_entidadRiesgoj_idt59'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_PRUEBAS K'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_PRUEBAS K'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Seguimiento'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_DIAZ BLANCO GUISELL'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_DIAZ BLANCO GUISELL'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Eliminar1'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Aceptar1'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Entidad de Riesgo'))

    if(WebUI.waitForElementVisible(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Eliminar1'), 1))
    {
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Eliminar1'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Aceptar1'))
    }
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Regresar'))
}

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Cdigo_form_detalleEntidadRiesgocodigoInterno'), 
    '5')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Nombre_form_detalleEntidadRiesgodescripcion'), 
    'PRUEBAS K')

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Unidad Organizacional_form_detalleEntidadRiesgoj_idt6210'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Unidad Organizacional_formPopUpUnidaddescripciones0'), 
    'ADMINISTRACION')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Unidad Organizacional_formPopUpUnidaddescripciones0'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_ADMINISTRACION'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/select_SeleccionarAREAS DE RIESGOAREAS SIN RIESGOPRUEBA SILVIA 1PRUEBA SILVIA 2'), 
    5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/select_-- SELECCIONAR --SEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/select_-- SELECCIONAR --Aula InteligenteSala de JuntasSalon ExternoSalon Principal'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Responsable_form_detalleEntidadRiesgoj_idt6320'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt9270'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt9270'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_1010220596'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Personas'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Persona_form_detalleEntidadRiesgoj_idt692'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt92700'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt92700'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_1010220596'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Nuevo'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Identificacin_form_popupHojaVidaEntidadj_idt838'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt92700'), 
    'GUISELL')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt92700'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_Diaz Blanco Guisell'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_Indefinido'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Generar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Unidad_form_popupHojaVidaEntidadMasivaj_idt891'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    'a')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_ADMINISTRACION'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/select_Seleccione40 MIL STAFF .  ABOGADO'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Buscar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/div_Cargo_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Recomendacin'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Nuevo'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Responsable_form_detalleEntidadRiesgoj_idt774'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt9270'), 
    'guisell')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt9270'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/span_1057596487'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Fecha de Implementacin_form_detalleEntidadRiesgofecharecomendacionr_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/textarea_Observacin_form_detalleEntidadRiesgoobservacionr'), 
    'pruebas katalon')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Nombre_form_detalleEntidadRiesgonombrerecomendacionr'), 
    'pruebas katalon')

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Seguimiento'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/td_DIAZ BLANCO GUISELL'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/input_Fecha de Seguimiento_form_detalleEntidadRiesgofechaseguimientoreal_input'), 
    '01/08/2021')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/textarea_Observacin_form_detalleEntidadRiesgoobservacions'), 
    'pruebas katalon')

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_una_entidad_de_riesgo_sst/a_Guardar'))

WebUI.closeBrowser()

