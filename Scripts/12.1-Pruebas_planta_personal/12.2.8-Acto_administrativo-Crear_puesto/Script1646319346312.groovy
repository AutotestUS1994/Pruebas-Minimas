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

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos administrativos')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/li_Actos Administrativos (act)'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/i_Actos Ausencia_glyphicons glyphicons-user-structure x3 icon-acto'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Acto Movimento de planta_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/span_crea puesto trabajo'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/input__form_actoMovPlantaj_idt18340idTexto'), 
    '1010220596')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Unidad Organizacional_form_actoMovPlantaunidad'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    'administracion')

WebUI.sendKeys(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/input_Unidad_form_popupUnidadUsuarioj_idt1425'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/span_ADMINISTRACION'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Cargo_form_actoMovPlantacargo'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/span_ANALISTA CONTABLE'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/select_AMPLEADO'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/select_2120 HORAS1240 HORAS0NO DEFINIDO'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/select_NOMINA MENSUALNOMINA QUINCENAL'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/select_0.5APRENDIZ ETAPA LECTIVA6APRENDIZ ETAPA PRODUCTIVA96ASISTENTE DE INVESTIGACION11'), 
    8)

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/input_Sueldo_form_actoMovPlantasueldo'), 
    '1200000')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Continuar'))

WebUI.doubleClick(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Aceptar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/span_Si'))

WebUI.doubleClick(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/a_Aceptar'))

if(WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Acto_administrativo-Crear_puesto/span_crea puesto trabajo'), 
    1))
{
WebUI.closeBrowser()
}
