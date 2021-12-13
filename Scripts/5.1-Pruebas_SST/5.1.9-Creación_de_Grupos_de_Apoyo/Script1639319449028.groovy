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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'grupos de apoyo')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/li_Grupos de Apoyo (sst)'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Nombre Grupo Apoyo_form_equipoTrabajoSaltabdescripcion'), 
    'PRUEBAS KATALON')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_-- SELECCIONAR --BRIGADA DE PRIMEROS AUXILIOS'), 
    4)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_SeleccioneSEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/textarea_Objetivo_form_equipoTrabajoSaltabobjetivo'), 
    'null')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Integrantes'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Nuevo0'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Identificacin_form_popupGrupoApoyoIntegrantej_idt217'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt840'), 
    'Diaz Blanco Guisell')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt840'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/span_Diaz Blanco Guisell'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_-- SELECCIONAR --SEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_-- SELECCIONAR --ADMINISTRADOR SSTBRIGADISTAJEFE DE BRIGADAPRESIDENTEREPRESENTATE DE LOS TRABAJADORESSECRETARIA'), 
    3)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/textarea_Detalle Ingreso_form_popupGrupoApoyoIntegranteobjetivo'), 
    'pruebas katalon')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Actividades'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Nuevo1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Responsable_form_popupSeguimientotabPopupSeguimientoj_idt276'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8401'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8401'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_ProgramadoCumplidoCancelado'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/textarea_Objetivo_form_popupSeguimientotabPopupSeguimientoobjetivo'), 
    'pruebas k')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/textarea_Detalle Actividad_form_popupSeguimientotabPopupSeguimientoobservacion'), 
    'pruebas k')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/textarea_Detalle Cumplimiento_form_popupSeguimientotabPopupSeguimientodetallecump'), 
    'pruebas k')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/select_-- SELECCIONAR --Trate de no correr'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Asistentes'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Rol_form_popupSeguimientotabPopupSeguimientolistaAsistentesIntegrantesj_idt304'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Inscritos_form_AsistenteGrupoApoyoPopUpj_idt350'), 
    'guisell')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/input_Filtro Inscritos_form_AsistenteGrupoApoyoPopUpj_idt350'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/span_1057596487'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Rol_form_popupSeguimientotabPopupSeguimientolistaAsistentesIntegrantesj_idt310'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Grupo Actividad'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo Pruebas SST/Creación de Grupos de Apoyo/a_Guardar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

