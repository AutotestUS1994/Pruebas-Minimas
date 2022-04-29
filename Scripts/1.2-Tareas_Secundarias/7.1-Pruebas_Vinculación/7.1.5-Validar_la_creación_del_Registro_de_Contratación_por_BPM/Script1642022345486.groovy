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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/span_Proceso de Seleccion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/select_SeleccionarSiNo'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/a_Unidad Organizacional_popupConfirmacionRequerimientoj_idt132'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    'ADMINISTRACION')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/span_ADMINISTRACION'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/a_Cargo_popupConfirmacionRequerimientoj_idt136'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/input_Cargo_popupCargo_Formj_idt668'), 
    'ABOGADO')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/input_Cargo_popupCargo_Formj_idt668'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/span_ABOGADO'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/select_--Seleccione--Primer Modelo Seleccin R. Modelo Etapa'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM/a_Continuar'))

if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Validar_la_creación_del_Registro_de_Contratación_por_BPM (1)/a_Guardar'), 
    1)) {
String Resultado = 'PRUEBA OK'
}
else {
	WebUI.acceptAlert()
}
