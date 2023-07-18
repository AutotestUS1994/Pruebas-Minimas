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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

String Entorno = GlobalVariable.G_Identificador

if (Entorno == 'weblogic') {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.8.6-Configuracion_para_weblogic_gdbc'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/li_Proceso de Seleccion (tal)'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    '659')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/div_Citacion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Registro Citacin'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/td_A A A0'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/td_A A A0'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Eliminar0'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/span_Si0'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/div_Candidato'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Registro Candidato'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/td_A A A'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/span_Si'))
}

/*---------------------------------------CLIC CON JAVASCRIPT------------------------------------------------*/
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Nuevo'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

/*----------------------------------------------------------------------------*/
WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/a_Identificacin_seleccion_procesopanelCandidatoj_idt924'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/input_Filtro Candidatos_form_popUpCandidatosSeleccionj_idt171'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/input_Filtro Candidatos_form_popUpCandidatosSeleccionj_idt171'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Asociar_candidatos/span_A A A'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Comprobar Parametros/a_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'El candidato ha sido registrado correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.8.7-Configuracio_conexiones_default'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.acceptAlert()
}

