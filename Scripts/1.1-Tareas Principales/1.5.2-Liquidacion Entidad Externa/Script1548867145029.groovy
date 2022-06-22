import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File

String RutaA = WebUI.callTestCase(findTestCase('0.1.3-Detector_de folder_download'), [:], FailureHandling.STOP_ON_FAILURE)

String rutaA = RutaA

String Archivo = 'Liquidación_Entidades_Externa.csv'

String Archivo1 = 'Liquidación_Entidades_Externa.csv.crdownload'


System.out.println(rutaA)


WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Administracion Compensacion'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Ir_nav_t66_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Ir_nav_t66_input'), 
    'Liquidacion Entidad Externa (com)')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Liquidacion Entidad Externa (com)'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Liquidacion Entidad Externa (com)'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Traer'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/select_--Seleccione--APORTE AF'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Fecha_form_popUpTraeLiqu'), 
    '31/01/2019')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Fecha_form_popUpTraeLiqu'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Aplicar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Sucursal_liquidacionesEn'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Liquidar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Liquidar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/span_Imprimir'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/input_Csv_form_popupSeleccionR'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Generar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Entidad Externa/a_Descargar'))

//detectar y eliminar archivo

Assert.assertTrue(archivoDescargado(rutaA,Archivo,Archivo1))
boolean archivoDescargado(String RutaA,String Archivo,String Archivo1){
	File dir = new File (RutaA)
	File[] dirContentenidos=dir.listFiles()
	for(int i= 0;i< dirContentenidos.length;i++) {
		if(dirContentenidos[i].getName().equals(Archivo1)) {
			dirContentenidos[i].delete();
			String ResultF0='PRUEBA OK'
		}
		if(dirContentenidos[i].getName().equals(Archivo)) {
			dirContentenidos[i].delete();
			String ResultF='PRUEBA OK'
			WebUI.closeBrowser()
			
			return true
		}
		
	}
	return false
	WebUI.acceptAlert()
	}

/*---------------------------------------------------------------------------------------*/



