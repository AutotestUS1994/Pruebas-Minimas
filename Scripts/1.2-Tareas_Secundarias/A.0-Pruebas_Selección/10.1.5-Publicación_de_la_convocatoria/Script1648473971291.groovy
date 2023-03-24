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

String Entorno = GlobalVariable.G_Identificador

if (Entorno == 'weblogic') {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.8.6-Configuracion_para_weblogic_gdbc'), [:], FailureHandling.STOP_ON_FAILURE)
}

Date today = new Date()

/*-----------------fecha------------------------ */
Number Dia = ((today.format('dd')) as Integer)

Number Mes = ((today.format('MM')) as Integer)

Number Año = ((today.format('yyyy')) as Integer)

Number AñoM = Año + 1

/*-----------------------------------------------*/
String fechaI = (((Dia + '/') + Mes) + '/') + Año

String fechaF = (((Dia + '/') + Mes) + '/') + AñoM

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/span_Proceso de Sel'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    '29/06/2017')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    '10/07/2017')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    '10/07/2017')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/td_8028     - Analista De Sistemas'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/a_Publicacin'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Publicacin_seleccion_procesofecha_publicacion_input'), 
    fechaI)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/input_Hasta_seleccion_procesofecha_hasta_input'), 
    fechaF)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/div_Detalle_ql-editor ql-blank'), 
    'pruebas katalon 10.1.5')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Publicación_de_la_convocatoria/a_Publicar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'El proceso ha sido publicado exitosamente') {
    String Resultado = 'PRUEBA OK'


    
    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

