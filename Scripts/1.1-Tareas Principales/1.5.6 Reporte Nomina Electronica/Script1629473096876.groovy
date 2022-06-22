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
import com.thoughtworks.selenium.webdriven.commands.GetText

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


WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
    'Nomina Electronica')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/span_Nomina Electronica'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/span_Nomina Electronica'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt72'), 
    '2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt72'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/td_2021-07-01'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/td_2021-07-01'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Reporte'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/td_Reporte Nomina Electrnica'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Generar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Generar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Continuar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Continuar'))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Descargar'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Descargar'))
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Descargar - Copy'))
    }
    

} else {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.5.5- Crear Nomina Electrónica'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
        'Nomina Electronica')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/span_Nomina Electronica'), 
        0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/input_Nomina Electronica_form_templatej_idt24_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/td_2021-07-01'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Reporte'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/td_Reporte Nomina Electrnica'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Generar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Generar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Continuar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Continuar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Descargar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Reporte Nomina Electronica/Page_SARA/a_Descargar'))
	
}
String Ruta = WebUI.callTestCase(findTestCase('0.1.3-Detector_de folder_download'), [:], FailureHandling.STOP_ON_FAILURE)
String rutaA = Ruta
String Archivo ='Reporte_Nomina_Electrónica.xlsx'
Assert.assertTrue(archivoDescargado(rutaA,Archivo))
boolean archivoDescargado(String rutaA,String Archivo) {
	File dir = new File (rutaA)
	File[] dirContenidos=dir.listFiles()
	String r1 ='';
	System.out.println(dirContenidos)
	for (int i= 0;i< dirContenidos.length;i++) {
		if (dirContenidos[i].getName().equals(Archivo)) {
			dirContenidos[i].delete();
			r1 = 'ok';
			System.out.println(dirContenidos)
			WebUI.closeBrowser()
			return true 
				}
	}
	return false
	WebUI.closeBrowser()
	}



