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

WebUI.click(findTestObject('Modulo Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/a_Suceso Actualizacin'))

WebUI.setText(findTestObject('Modulo Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Inicial_form_visorj_idt253fechaInicial_input'), 
    '10/12/2018 10:34:00')

WebUI.setText(findTestObject('Modulo Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Final_form_visorj_idt253fechaFinal_input'), 
    '10/12/2018 10:35:00')

WebUI.sendKeys(findTestObject('Modulo Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Final_form_visorj_idt253fechaFinal_input'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

