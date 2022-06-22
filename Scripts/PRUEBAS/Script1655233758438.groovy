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
import com.sun.jna.StringArray

import groovy.json.internal.Type as Type
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    'Listado Hojas de Vida')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/span_Listado Hojas de Vida'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/span_Listado Hojas de Vida'))

WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/input_Identificacin_listado_hojaVidaj_idt67'), '1097597')

WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/input_Identificacin_listado_hojaVidaj_idt67'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/span_Chandler  Francis 1097597'))

filepath = WebUI.getAttribute(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/div_LoginNombresPrimer ApellidoFecha de NacimientoTipo Documento'), 
    'type')

/*
WebDriver driver = DriverFactory.getWebDriver()

String valorEsperado = 'Nacionalidad'

WebElement Tabla = driver.findElement(By.xpath('//div[1]/div[3]/div/table/tbody/tr[3]/td/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td/div/div/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table'))

List<WebElement> filas_tabla = Tabla.findElements(By.tagName('tbody'))

int filas_conteo = filas_tabla.size()

Loop: for (int fila = 0; fila < filas_conteo; fila++) {
    List<WebElement> Columnas_fila = filas_tabla.get(fila).findElements(By.tagName('td'))

    int columnas_conteo = Columnas_fila.size()

    println((('Número de celdas en fila ' + fila) + ' area ') + columnas_conteo)

    for (int column = 0; column < columnas_conteo; column++) {
        String celltext = Columnas_fila.get(column).getText()

        filepath = Columnas_fila.get(column).getAttribute('value')

        println(((((('Cell Value Of row number ' + fila) + ' and column number ') + column) + ' Is ') + celltext) + filepath)

        if (celltext == valorEsperado) {
            println((('Text present in row number 3 is: ' + Columnas_fila.get(2).getText()) + 'valor es: ') + Columnas_fila.get(
                    column).getAttribute('value'))

            Loop: break
        }
    }
}
*/
String descrip1 = ''

String descrip2 = ''

String descrip3 = ''

String descrip4 = ''

String descrip5 = ''

String descrip6 = ''

String descrip7 = ''

String descrip8 = ''

String descrip9 = ''

String descrip10 = ''

String descrip11 = ''

String descrip12 = ''

String descrip13 = ''

String descrip14 = ''

String descrip15 = ''

def Descripcion (String descrip1,String descrip2,String descrip3,String descrip4,String descrip5) {
	
	descrip1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_1'))
	
	descrip2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_2'))

	descrip3 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_3'))

	descrip4 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_4'))

	descrip5 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_5'))
	return descrip1
}
System.out.println(Descripcion(descrip1, descrip2, descrip3, descrip4, descrip5) )
WebUI.acceptAlert()/*
String[] Descripcion = {

		descrip1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_1'))
		
		descrip2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_2'))
	
		descrip3 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_3'))
	
		descrip4 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_4'))
	
		descrip5 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_5'))
	
		descrip6 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_6'))
	
		descrip7 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_7'))
	
		descrip8 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_8'))
	
		descrip9 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_9'))
	
		descrip10 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_10'))
	
		descrip11 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_11'))
	
		descrip12 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_12'))
	
		descrip13 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_13'))
	
		if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_14'), 1)) {
			descrip14 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_14'), FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_14'), 1)) {
			descrip15 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/PRUEBAS/descripción/td_15'), FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		System.out.println((((((((((((((descrip1 + descrip2) + descrip3) + descrip4) + descrip5) + descrip6) + descrip7) + descrip8) +
			descrip9) + descrip10) + descrip11) + descrip12) + descrip13) + descrip14) + descrip15)
};
System.out.println (Descripcion[0])
WebUI.closeBrowser()
*/
