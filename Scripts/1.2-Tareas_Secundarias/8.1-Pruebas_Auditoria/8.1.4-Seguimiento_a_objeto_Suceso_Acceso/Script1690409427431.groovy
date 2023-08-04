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

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/a_Suceso Acceso'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'), 
    'saraadmin')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/td_18012022 092902'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/div_Fecha_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_csv'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_PDF'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_xls'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'), 
    'invitado')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/td_17012022 031118'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/input_Vista Suceso Acceso Sistema_form_visorj_idt253j_idt306'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_csv'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_PDF'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Acceso/img_xls'))

WebUI.closeBrowser()

