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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_prueba'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_prueba'))

    WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Eliminar'), 0)

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_-- Seleccione --Evento CapacitacinEvento Capacitacin Grupal'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Aplicar'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_--Seleccione--Aplicacin SaraCurso De Alturas'), 
    9)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_--Seleccione--BloqueadoEjecucinFinalizadoProgramado'), 
    4)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Plan de Inversin_formRegistroEventoj_idt180'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_prueba1'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaInicial_input'), 
    '17/11/2021')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
    '27/11/2021')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/textarea_Descripcin del evento_formRegistroEventoj_idt1890idTexto5'), 
    'Prueba')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    '7')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Publicacion Inicial_formRegistroEventoj_idt1892fecha_input'), 
    '17/11/2021')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Publicacion Final_formRegistroEventoj_idt1893fecha_input'), 
    '27/11/2021')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input__formRegistroEventoj_idt1894idTexto6'), 
    '100')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input__formRegistroEventoj_idt1895idNumero1'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_Diagnstico de Necesidades de CapacitacinEstrategiaEvaluacin del desempeoOrigen Evento'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_MixtaPresencialVirtual'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_NOSI'), 1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_123456PRUEBA SILVIAUS654US23913781'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_BARRANQUILLABOGOTACALIFRANCIAIBIZA'), 
    3)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
    '100000')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Costo Evento_formRegistroEventoj_idt18914idTexto6'), 
    '10000')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
    '5')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/textarea_Observacin_formRegistroEventoj_idt18917idTexto5'), 
    'Prueba')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/select_AmbosNo AplicaPor AsistenciaPor Puntaje'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a__formRegistroEventoj_idt18910j_idt229'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1714'), 
    'A')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1714'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/span_A A A'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Guardar'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Puntaje Minimo_formRegistroEventominimoPuntaje'), 
    '3')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/input_Mximo Horas Ausencia_formRegistroEventomaximoHorasAusencia'), 
    '4')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/a_Guardar'))

WebUI.closeBrowser()

