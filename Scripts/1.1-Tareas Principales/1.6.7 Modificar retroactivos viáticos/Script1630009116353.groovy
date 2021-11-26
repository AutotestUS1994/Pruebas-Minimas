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

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/a_Listado Viticos_cerrar_menu'), 
    0)

WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/a_Listado Viticos_cerrar_menu'))

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'costos pendientes')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/select_--Seleccione--Nota Reembolso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/select_--Seleccione--Nota Reembolso'), 
    '2')

if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/td_QUINTERO 5 EMPLEADO'), 
    1)) {
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/td_QUINTERO 5 EMPLEADO'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Modificar retroactivos/a_Aplicar Reembolso'))

    WebUI.closeBrowser()
} else {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.6.2 Complementario de Viáticos'), [:], FailureHandling.STOP_ON_FAILURE)
}

