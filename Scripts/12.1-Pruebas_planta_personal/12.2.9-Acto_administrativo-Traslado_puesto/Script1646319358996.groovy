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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

Date today = new Date()

/*-------------------------------------------*/
String Dia = today.format('dd')

String Mes = today.format('MM')

String Año = today.format('yyy')

/*--------------------------------------------*/
String Fecha = (((Dia + '/') + Mes) + '/') + Año

/*-------------------------------------------*/
WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos administrativos')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_Actos Administrativos'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/i_Actos Ausencia_glyphicons glyphicons-user-structure x3 icon-acto'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Acto Movimento de planta_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_movimiento de planta traslado puesto de trabajo'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Elaboracin_form_popupSeleccionDerogarj_idt138'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/input__form_actoMovPlantaLiberaTransladaj_idt20880idTexto'), 
    '5')

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/input__form_actoMovPlantaLiberaTransladaj_idt20881fecha_input'), 
    Fecha)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Unidad Organizacional_form_actoMovPlantaLiberaTransladaunidad_antes'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    'A1')

WebUI.sendKeys(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_ADMINISTRACION'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Cargo_form_actoMovPlantaLiberaTransladacargo_antes'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_ANALISTA CONTABLE'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Continuar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/td'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Continuar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_Si'))

WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/label_EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE'), 
    0)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/a_Aceptar'))

if(WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Traslado_puesto/span_movimiento de planta traslado puesto de trabajo'), 
    1))
{
WebUI.closeBrowser()
}
