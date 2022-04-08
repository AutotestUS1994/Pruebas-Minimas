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
import java.text.SimpleDateFormat as SimpleDateFormat

Date today = new Date()

String todaysDate = today.format('dd/MM/yyyy HH:mm')

WebUI.comment('FALTA CONDICION PARA ELIMINAR REGISTRO.')

WebUI.comment('conflicto con base de datos no permite eliminar registro')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Entidad de Riesgo_form_templatej_idt24_input'), 
    'vigilancia epidemiologica')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/li_Programas de Vigilancia Epidemiologica (sst)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/td_PRUEBAS K'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Nuevo0'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_--Seleccione--PRUEBAS KATALON'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Descripcin_form_programaVigilanciatabdescripcion'), 
    'pruebas k ' + todaysDate)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/label_SI'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Personas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Nuevo_personas'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_SeleccioneSEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Identificacin_form_popupInscritostabj_idt117'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1722'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1722'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/td_A A A'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_SeleccioneAula InteligenteSala de JuntasSalon ExternoSalon Principal'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/span_Remitido EPS_ui-chkbox-icon ui-icon ui-icon-blank ui-c'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/textarea_Observacin_form_popupInscritostabobservacion'), 
    'pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Grupos'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Personas Entidad de Riesgo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_Seleccione234ENTIDAD DE RIESGO 01idad y Salud en el Trabajo'), 
    26)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/div_DIAZ BLANCO GUISELL_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/div_CONSTA BELFEGORD  JHON1393138_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Enviar'))

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Fecha Inscripcin_form_popupInscritostabinicio_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/textarea_Observacin_form_popupInscritostabobservacion'), 
    'pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/td_PRUEBAS K'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Recomendaciones'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_ActivoCanceladoCumplidoNo Cumplido'), 
    0)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_-- SELECCIONAR --Trate de no correr'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_-- SELECCIONAR --Recomendacin Atep 2Recomendacin Atep 1'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Responsable Recomendaciones_form_popupSeguimientotabRecomendacionj_idt607'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1722'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1722'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/td_A A A'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Seguimiento'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Fecha Seguimiento_form_popupInscritostabtablaSeguimientoj_idt192'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_-- SELECCIONAR --Trate de no correr0'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/span_Trate de no correr'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/textarea_Fecha Seguimiento_form_popupInscritostabtablaSeguimientoj_idt197'), 
    'pruebas k')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/input_Fecha Seguimiento_form_popupInscritostabtablaSeguimientoj_idt202_input'), 
    '15/12/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Fecha Seguimiento_form_popupInscritostabtablaSeguimientoj_idt206'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/span_SEDE NORTE_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Examen'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_SeleccioneSEDE NORTESEDE OCCIDENTESEDE SUR1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_SeleccioneALMANZA NOVOA JOHN'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Examinado_form_popupExamenesj_idt286'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_SeleccioneCuadro HematicoExamen de OrinaExamen Medico de RutinaExamen Medico de Rutina'), 
    3)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Programar Encuestas'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/select_-- SELECCIONAR --EntidadListado Chequeo encuesta'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Adicionar Personas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/span_CONSTA BELFEGORD  JHON1393138'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/a_Resultado Encuestas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Crear_un_Sistema_de_Vigilancia_Epidemiologica/td_1393138 - CONSTA BELFEGORD  JHON1393138'))

WebUI.comment('FALTA CONDICION PARA ELIMINAR REGISTRO.')

WebUI.comment('conflicto con base de datos no permite eliminar registro')

WebUI.closeBrowser()

