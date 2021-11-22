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

WebUI.comment('No funciona en pantallas con resolucion 1366 x 768')

WebUI.comment('boton guardar no es accesible por katalon')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Listado Necesidad Capacitacin_form_templatej_idt24_input'), 
    'Reserva de Salones')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/span_Reserva de Salones'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/td_Sala de Juntas'))

if(WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/span_Pruebas ka'), 1))
{
WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/span_Pruebas ka'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/a_Eliminar'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/a_Aceptar'))
}
WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/span_----'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/textarea_Tema_popup_form_reservaSalonestema'), 
    'Pruebas ka')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/select_0830 AM0900 AM0930'), 1)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Nmero Asistentes_popup_form_reservaSalonescantidad'), 
    '20')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/textarea_Requerimiento_popup_form_reservaSalonesrequerimiento'), 
    'Ninguno')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/textarea_Observacin_popup_form_reservaSalonesobservacion'), 
    'Ninguna')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/a_Solicitante_popup_form_reservaSalonesj_idt173'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt205'), 
    'a')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt205'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/td_A A A'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/a_Responsable de reservacin_popup_form_reservaSalonesj_idt177'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt205'), 
    'a')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt205'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/span_A A A'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Reserva_de_Salones/a_Guardar'))

