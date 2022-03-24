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

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Empresa 1_form_templatej_idt24_input'), 
    'listado contratacion')

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/li_Listado Contratacion (tal)'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_-- Seleccione --ANULADOCERRADOELIMINADOSOLICITADO'), 
    4)

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Nombre Persona_listado_contratacionj_idt68'))

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt13270'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt13270'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_A A A1'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/td_A A A'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_Referencia en el sistema nula, informe al administrador del sistema'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_closethick'))
    }
    
    WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/textarea_Motivo_form_contratacionpanelTabmotivo'), 
        'PRUEBAS KATALON')

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_--Seleccione--NOSI'), 
        1)

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Anular Proceso'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Aceptar'))

    WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Regresar'))
}

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Nuevo'))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/td_Pruebas katalon'))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Identificacin_form_contratacionpanelTabj_idt164'))

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1327'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1327'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_0.5APRENDIZ ETAPA LECTIVA6APRENDIZ ETAPA PRODUCTIVA96ASISTENTE'), 
    8)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_2120 HORAS1240 HORAS0NO DEFINIDO61Pensin'), 
    3)

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Sueldo Total_form_contratacionpanelTabasignacionTotal'), 
    '2000000')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_12kataloonkataloonNOMINA CATORCENALNOMINA CATORCENALNOMINA MENSUALNOMINA QUINCENALNOMINA SEMANAL'), 
    '8')

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Sueldo_form_contratacionpanelTabasignacion'), 
    '1000000')

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Fecha de Ingreso_form_contratacionpanelTabfechaIngreso_input'), 
    '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_--Seleccione--EmpalmeNormal'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_Unidad_btn_popupInformacion'))

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    'ADMINISTRACION')

WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_ADMINISTRACION'))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_Cargo_btn_popupInformacion'))

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Cargo_popupCargo_Formj_idt1354'), 
    'ABOGADO')

WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Cargo_popupCargo_Formj_idt1354'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_ABOGADO'))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_Zona Econmica_btn_popupInformacion'))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_ADMINISTRATIVA'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_0.5APRENDIZ ETAPA LECTIVA6APRENDIZ ETAPA PRODUCTIVA96ASISTENTE'), 
    8)

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_Ubicacin Fsica_btn_popupInformacion'))

WebUI.setText(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Ubicacin Fsica_j_idt1379parametroBusquedaUbicacion'), 
    'BOGOTÁ')

WebUI.sendKeys(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/input_Ubicacin Fsica_j_idt1379parametroBusquedaUbicacion'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/span_BOGOT'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_-- Seleccione Linea --ADMINISTRATIVONO RELACIONADASUBCENTROS'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_--Seleccione--EmpalmeNormal'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/select_12kataloonkataloonNOMINA CATORCENALNOMINA'), 
    8)

WebUI.click(findTestObject('Modulo Pruebas Vinculación/Crear un Registro de Contratación/a_Guardar'))

WebUI.closeBrowser()

