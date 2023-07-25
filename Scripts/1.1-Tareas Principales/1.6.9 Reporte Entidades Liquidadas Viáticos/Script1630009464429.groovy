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
import internal.GlobalVariable

import org.apache.poi.hssf.record.PageBreakRecord.Break
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'generacion Entidad Pago Viaticos')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Traer'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/label_Viaticos2'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/label_Viaticos2'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/input_Fecha_form_viaticos2'), 
    '01/07/2021')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Aplicar_viaticos2'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/span_Medicina Prepagada Colsanitas'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/div_Bogota_ui-chkbox-box ui-widget ui-corner-all'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Liquidar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Aceptar_Liquidar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Aceptar_Liquidar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Continuar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Imprimir'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Imprimir'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/label_Csv_informe'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/label_Csv_informe'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Generar_Reporte'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Generar_Reporte'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Descargar_reporte medicina prepagada colsanitas'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/span_Fecha_ui-icon ui-icon-closethick'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/span_Fecha_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Reversar_viaticos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Reporte Entidades Liquidadas/a_Aceptar_viaticos'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
// comprobacion y eliminado de descarga

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

//-------------------------------------------------------------------------------------
String Archivo = 'Reporte_Entidad_Pago.csv'

System.out.println(rutaA)

Assert.assertTrue(archivoDescargado(rutaA,Archivo,))
boolean archivoDescargado(String RutaA,String Archivo) {
	File dir = new File (RutaA)
	File[] dirContenidos=dir.listFiles()
	String R = "";
	
	System.out.println(dirContenidos)
	for(int i= 0;i< dirContenidos.length;i++) {
		if(dirContenidos[i].getName().equals(Archivo)) {
			if(dirContenidos[i].isFile()) {
				dirContenidos[i].delete()
				String ResultF  = 'prueba ok'
				System.out.println(R)
				WebUI.closeBrowser()
				return true
			}		
		}

	}
	return false
	WebUI.acceptAlert()
}
