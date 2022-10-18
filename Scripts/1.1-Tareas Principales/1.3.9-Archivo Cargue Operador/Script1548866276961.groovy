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
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File
import org.openqa.selenium.Capabilities as Capabilities
import java.awt.*
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

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

String Archivo = 'tmpUnionE1_20190119.txt'

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Seguridad Social'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Archivo Cargue Operador/td_Planilla Empleados Empresa'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Archivo Cargue Operador/td_Planilla Empleados Empresa'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Archivo Cargue Operador/a_Archivo_'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Archivo Cargue Operador/a_Archivo_1'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Archivo Cargue Operador/a_Si'))

WebUI.delay(5)

Assert.assertTrue(archivoDescargado(rutaA, Archivo,))

boolean archivoDescargado(String rutaA, String Archivo) {
		File dir = new File(rutaA)
	
		File[] dirContentenidos = dir.listFiles()
		
		for (int i = 0; i < dirContentenidos.length; i++) {
			if ((dirContentenidos[i]).getName().equals(Archivo)) {
				(dirContentenidos[i]).delete()
	
				String ResultF0 = 'PRUEBA OK'
				WebUI.closeBrowser()
				return true
			}}
}