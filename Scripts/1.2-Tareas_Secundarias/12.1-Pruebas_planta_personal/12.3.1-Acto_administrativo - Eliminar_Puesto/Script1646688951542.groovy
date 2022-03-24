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

WebUI.comment('se genera Error al seleccionar puesto y dar continuar ')

Date today = new Date()

/*--------------------------------------------*/
String Dia = today.format('dd')

String Mes = today.format('MM')

String Año = today.format('yyyy')

/*-----------------------------------------------*/
String Fecha = (((Dia + '/') + Mes) + '/') + Año

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/input_Empresa 1_form_templatej_idt24_input'), 
    'actos administrativos')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/li_Actos Administrativos (act)'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/i_Actos Ausencia_glyphicons glyphicons-user-structure x3 icon-acto'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Acto Movimento de planta_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/span_eliminar puesto de trabajo'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/input__form_actoMovPlantaj_idt22710fecha_input'), 
    Fecha)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/select_- No Relacionado1  - Cambio Datos Del Puesto10 - Ingreso Puesto Nuevo11'), 
    '2')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Unidad Organizacional_form_actoMovPlantaunidad'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    'A1')

WebUI.sendKeys(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/span_ADMINISTRACION'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Cargo_form_actoMovPlantacargo'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/span_ANALISTA CONTABLE'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Continuar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil11'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil11'))
} else if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil10'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil10'))
} else if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil9'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil9'))
} else if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil8'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil8'))
} else if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil7'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/img_Nmero Puesto_us-foto-perfil7'))
}

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Continuar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Aceptar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo - Eliminar_Puesto/span_Si'))

