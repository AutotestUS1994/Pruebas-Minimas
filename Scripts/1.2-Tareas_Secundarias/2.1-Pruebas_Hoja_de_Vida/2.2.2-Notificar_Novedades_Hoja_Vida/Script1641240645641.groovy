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
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

Date today = new Date()

/*----------------------*/
String Dia = today.format('dd')

String Mes = today.format('MM')

Number Año = ((today.format('yyyy')) as Integer)

Number Añom = Año - 20

Number AñoB = Año - 32

/*-------------------------------------*/
String Fecha = (((Dia + '/') + Mes) + '/') + Añom

String FechaB = (((Dia + '/') + Mes) + '/') + AñoB

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Listado Hojas de Vida (hoj)')

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/span_Listado Hojas de Vida (hoj)'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/span_Listado Hojas de Vida (hoj)'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_Identificacin_listado_hojaVidaj_idt63'), 
    '354968431354')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_Identificacin_listado_hojaVidaj_idt63'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/td_354968431354'))

String FechaG = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_Fecha Expedicin_hojaVidaseccionj_idt2106fecha_input'), 
    FailureHandling.STOP_ON_FAILURE)

if (Fecha == FechaG) {
    Fecha = (Fecha + 1)
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_Fecha Expedicin_hojaVidaseccionj_idt2106fecha_input'), 
    Fecha)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/div_INFONo hay cambios que guardar'), 
    1)) {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/input_Fecha Expedicin_hojaVidaseccionj_idt2106fecha_input'), 
        FechaB)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/a_Guardar'))
}

WebUI.delay(50)

String Result = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/label_Sus datos han sido Actualizados correctamente'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Notificar_Novedades_Hoja_Vida/a_Aceptar'))

if(Result == 'Sus datos han sido Actualizados correctamente') {
	String Resultado = 'PRUEBAS OK'
	WebUI.closeBrowser()
}
else {
	WebUI.acceptAlert()
}
