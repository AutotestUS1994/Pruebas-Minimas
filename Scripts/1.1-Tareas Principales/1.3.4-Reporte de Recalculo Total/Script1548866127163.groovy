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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import java.util.stream.Collectors as Collectors
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

import org.openqa.selenium.Capabilities
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.*


def Systema() {
	 String RutaA = System.getProperty('os.name')
}

String RutaA = Systema()
if(RutaA == 'Windows 10') {
	def rutaW = (System.getProperty('user.home')+'/Downloads/')
	rutaW = rutaW.replace('/','\\')
	println("ESTA ES LA RUTA"+ rutaW)
	RutaA = rutaW
}
else if (RutaA == 'Linux') {
	def rutaW = (System.getProperty('user.home')+'/Descargas/')
	
	println("ESTA ES LA RUTA"+ rutaW)
	RutaA = rutaW
}
else {RutaA = 'ERROR'
	WebUI.acceptAlert()
}

String rutaA = RutaA
println(rutaA)
String Archivo = 'Reporte.txt'

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.3.3-Recalculo Total'), [:], FailureHandling.STOP_ON_FAILURE)



WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Reporte'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/span_ACUMULADO POR CONCEPTO (1)'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/span_ACUMULADO POR CONCEPTO (1)'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Aplicar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Aplicar'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/span_Reporte_glyphicons glyphicons-article'), 
    GlobalVariable.G_TimeOut)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/span_Reporte_glyphicons glyphicons-article'))
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/label_html'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/label_html'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Generar Reporte (1)'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Generar Reporte (1)'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Descargar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte de Recalculo Total/a_Cerrar ventana'))

//detectar y eliminar archivo

Assert.assertTrue(archivoDescargado(rutaA,Archivo))
boolean archivoDescargado(String RutaA,String Archivo){
	File dir = new File (RutaA)
	File[] dirContentenidos=dir.listFiles()
	for(int i= 0;i< dirContentenidos.length;i++) {
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



