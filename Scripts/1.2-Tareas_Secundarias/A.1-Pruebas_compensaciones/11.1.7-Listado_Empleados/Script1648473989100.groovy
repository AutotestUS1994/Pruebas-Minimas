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

WebUI.setText(findTestObject('Modulo compensaciones/Listado_Empleados/input_Empresa 1_form_templatej_idt24_input'), 'Listado de Empleados')

WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/li_Listado de Empleados (com)'))

WebUI.setText(findTestObject('Modulo compensaciones/Listado_Empleados/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    'Consta')

WebUI.sendKeys(findTestObject('Modulo compensaciones/Listado_Empleados/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/span_Constantino Jhon'))

WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/a_Liquidacin Periodica'))

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Listado_Empleados/select_-- seleccione --BC - PRESTAMO BANCOLOMBIAPC - PRESTAMO COMPAA'), 
    2)

WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/span_Prestamo Compaa'))

String totalA = WebUI.getText(findTestObject('Modulo compensaciones/Listado_Empleados/input_Total Abonado_form_liquidacionesPeriodicasEmpleadotabLiquidacionesPeriodicasabono'), 
    FailureHandling.STOP_ON_FAILURE)

if (totalA == '10.000,00') {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/A.1-Pruebas_compensaciones/11.1.4-Fuente_General'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/A.1-Pruebas_compensaciones/11.1.4-Fuente_General'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('input_Empresa 1_form_templatej_idt24_input'), 'listado de empleados')

    WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/span_Listado de Empleados'))

    WebUI.setText(findTestObject('Modulo compensaciones/Listado_Empleados/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
        'consta')

    WebUI.sendKeys(findTestObject('Modulo compensaciones/Listado_Empleados/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/span_Constantino Jhon'))

    WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/a_Liquidacin Periodica'))

    WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Listado_Empleados/select_-- seleccione --BC - PRESTAMO BANCOLOMBIAPC - PRESTAMO COMPAA'), 
        2)

    WebUI.click(findTestObject('Modulo compensaciones/Listado_Empleados/span_Prestamo Compaa'))

    WebUI.getText(findTestObject('Modulo compensaciones/Listado_Empleados/input_Total Abonado_form_liquidacionesPeriodicasEmpleadotabLiquidacionesPeriodicasabono'))

    WebUI.closeBrowser()
}

