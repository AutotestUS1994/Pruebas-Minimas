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

double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    'Listado Hojas de Vida')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Nueva HojaVida'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Nueva HojaVida'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Identificacin_nuevahoja_'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Identificacin_nuevahoja_'), 
    identificacion)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/select_-- Seleccione --.ASPIRA'), 
    '4')

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Nueva Solicitud'))

WebUI.waitForElementPresent(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8350j_idt845'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8350j_idt845'), 
    identificacion)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8351j_idt845'), 
    'jhon' + identificacion)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8352j_idt845'), 
    'consta belfegord')

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8353fecha_input'), 
    '30/08/1995')

WebUI.sendKeys(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8353fecha_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a__hojaVidaseccionj_idt8354j_idt865'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a__hojaVidaseccionj_idt8354j_idt865'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/span_CEDULA CIUDADANIA'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/span_CEDULA CIUDADANIA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Fecha Expedicin_hojaVidas'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Fecha Expedicin_hojaVidas'), 
    '13/09/2013')

WebUI.sendKeys(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input_Fecha Expedicin_hojaVidas'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/select_-- Seleccione--000000ABEJORRAL'), 
    '113')

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8358j_idt845'), 
    '634564654684')

WebUI.setText(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/input__hojaVidaseccionj_idt8359j_idt845'), 
    'noodle@gmail.com')

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/select_AA-ABAB-BB-OO-'), 
    '7')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Continuar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Aceptar'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Listado Hojas de Vida/Crear Nueva Hoja de Vida/a_Aceptar'), FailureHandling.STOP_ON_FAILURE)

return identificacion

WebUI.closeBrowser()

