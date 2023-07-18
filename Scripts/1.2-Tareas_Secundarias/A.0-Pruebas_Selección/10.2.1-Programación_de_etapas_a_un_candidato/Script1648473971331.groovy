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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/input_No search results are available_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_Proceso de Seleccion'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/input_filtroprocesoseleccion'), 
    '659')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/input_filtroprocesoseleccion'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/div_Citacion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Registro Citacin'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_A A A'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_Si'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_Constantino  Jhon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_Constantino  Jhon'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Eliminar'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_Si'), 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Etapas Por Asistente'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_A A A_glyphicons glyphicons-user-add'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_A A A_glyphicons glyphicons-user-add'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_Si'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Jurados'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Programar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_PRUEBA'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Responsable_popupCitacion_formj_idt1947'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2644'), 
    'constantino jhon')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2644'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_Constantino  Jhon'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/textarea_Observacin_popupCitacion_formobservacion'), 
    'pr katalon')

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/div_Evaluacin Artstica_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Continuar'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_ui-chkbox-icon2'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/span_ui-chkbox-icon2'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Generar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Registro Citacin'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/td_A A A'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/select_EfectuadaNo se presentoPor Definir FechaProgramada'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Programación_de_etapas_a_un_candidato/a_Actualizar'))
}

if (Result == 'El candidato ha sido registrado correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else if (Result == 'Las citaciones han sido generadas correctamente') {
    String Resultado0 = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def Fecha() {
    Date today = new Date()

    String Dia = today.format('dd')

    String Mes = today.format('MM')

    String Año = today.format('yyyy')

    String FECHA = (((Dia + '/') + Mes) + '/') + Año
}

