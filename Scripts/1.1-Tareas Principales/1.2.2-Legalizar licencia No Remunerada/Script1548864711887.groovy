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
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Hutilidades/Tareas Administracion Compensacion/Tarea Listado Empleados'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    0)

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '354968431354')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_Consta Belfegord Jhon'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_Consta Belfegord Jhon'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Licencia'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Licencia'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/td_Licencia No Remunerada'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/td_Licencia No Remunerada'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Eliminar Directo'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Aceptar_ELIMINAR'))
}

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Incapacidad'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Histrico'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_Enfermedad General 21'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_Enfermedad General 21'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Aceptar'))
}

WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Licencia'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Histrico'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_01012021'), 
    1)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_01012021'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Eliminar liciencia'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Aceptar_ eliminar licencia'))

    WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'), 
        GlobalVariable.G_TimeOut)

    WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'))
}

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Pestaa Licencia'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Pestaa Licencia'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida_form_licenc'), 
    0)

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida_form_licenc'), 
    '01/01/2021')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida_form_licenc'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida Nomina_form'), 
    '28/02/2021')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida Nomina_form'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/textarea_Observacin_form_licen'), 
    'Prueba 2021')

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp'), 
    '01/01/2021')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Das Ausentismo_form_lice'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp_11'), 
    '28/02/2021')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp_11'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmp'), 
    'Prueba 2021')

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmpleadotabs'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmpleadotabs'), 
    'Prueba')

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Horas adicionales_form_licenciaEmpleadotabs'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Horas adicionales_form_licenciaEmpleadotabs'), 
    '0500')

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Afiliacin Eps_form_licenciaEmpleadotabs'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Afiliacin Eps_form_licenciaEmpleadotabs'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/td_Se ha cargado el archivo'), 
    GlobalVariable.G_TimeOut)

//WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumentoNovedad_forminputFileNameArchivo_input'))
/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumentoNovedad_forminputFileNameArchivo_input'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))*/
WebUI.click(findTestObject('Object Repository/Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/Page_SARA/div_Se ha cargado el archivo_ui-fileupload-_55cbf6'))

WebUI.delay(2)

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'ArchivoPlanoLiquidacionNomina.txt'

WebUI.uploadFile(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumento'), 
    ruta)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    '01/12/2021')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/textarea_Observacin_popupDocumentoNovedad_formobservacion'), 
    'PRUEBA')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Guardar_archivo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Legalizar Licencia No Remunerada/a_Guardar_1'))

