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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Hoja de Vida'), [:], FailureHandling.STOP_ON_FAILURE) debe borrar todo lo que sea Modulos
//WebUI.delay(2) debe reemplazar por wait for elemento /objet
WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Tareas Listado Hojas de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Tareas Listado Hojas de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    'Listado Hojas de Vida (hoj)')

WebUI.waitForElementVisible(findTestObject('Modulo Tarea Listado Hojas de Vida/Tareas Listado Hojas de Vida/span_Listado Hojas de Vida (hoj)'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Tareas Listado Hojas de Vida/span_Listado Hojas de Vida (hoj)'))

