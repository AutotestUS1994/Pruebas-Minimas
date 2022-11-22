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

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/Listado hojas de Vida'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/input_Identificacin_listado_hojaVidaj_idt62'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/input_Identificacin_listado_hojaVidaj_idt62'), 
    '355682169')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/input_Identificacin_listado_hojaVidaj_idt62'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/td_355682169'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/td_355682169'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Imprimir'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Imprimir'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Si'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Si'))

WebUI.switchToWindowTitle('SARA')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/span_Grupo Sanguneo-closethick'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/span_Grupo Sanguneo-closethick'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Generar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Generar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/td_espaol impresion empleado'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/td_espaol impresion empleado'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Descargar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Descargar'))

WebUI.switchToWindowIndex(0)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/span_Grupo Sanguneo-closethick_1'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/span_Grupo Sanguneo-closethick_1'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Imprimir Hoja de Vida/a_Actualizar Respuesta'), 
    1)) {
    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Cerrar_sesion_sara/cerrar_sesion'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

