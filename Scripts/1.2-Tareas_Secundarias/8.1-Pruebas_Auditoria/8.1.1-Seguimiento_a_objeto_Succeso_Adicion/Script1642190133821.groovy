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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Auditoria'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/a_Suceso Adicion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/td_concepto_con'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/a_Aplicar'))

String codigo = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/td_123456'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/input_codigo_form_sucesoadiciontablaFiltros0j_idt234'), 
    codigo)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/a_Aplicar'))

String codigoR = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Adicion/td_123456'))

if (codigo == codigoR) {
    WebUI.closeBrowser()
} else {
    FailureHandling.STOP_ON_FAILURE
}

