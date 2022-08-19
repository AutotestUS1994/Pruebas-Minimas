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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/input_Empresa 1_form_templatej_idt24_input'), 
    'planta personal (tal)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/span_Planta Personal (ta'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/a_Actos Administrativos_organigramabuscar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/select_--Seleccione--EmpleadoPuesto'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/a_Identificacin_popupBusquedaPlantaj_idt286'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1339'), 
    'mendoza cabra empleado')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1339'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/span_Mendoza Cabra Empleado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/span_65       - Asistente'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/a_1'), 0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/input_A1            - Administracion_organigramalistaPuestosActivosj_idt150'), 
    'Mendoza 960')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/input_A1            - Administracion_organigramalistaPuestosActivosj_idt150'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/span_Mendoza Cabra Empleado0'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/div_Mendoza Cabra Empleado Asistente'), 
    1)

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_Empleado/div_Mendoza Cabra Empleado Asistente'), 
    1)) {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

WebUI.closeBrowser()

