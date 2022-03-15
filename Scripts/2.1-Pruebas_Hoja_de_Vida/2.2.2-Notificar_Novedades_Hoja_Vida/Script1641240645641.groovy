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

double random_double = Math.random() * 31

random_double = Math.round(random_double - 10)

String identificacion = random_double.toString().replace('.0', '')

String identificacion1 = 0 + identificacion

int identificacion0 = Integer.parseInt(identificacion)

/*-------------------------------------------------------------------------------------------*/
if (identificacion0 < 10) {
    identificacion = identificacion1
} else {
    identificacion0
}

if (identificacion1 == '0') {
    identificacion1 = 1
}

/*-------------------------------------------------------------------------------------------*/
WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Listado Hojas de Vida (hoj)')

WebUI.waitForElementVisible(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/span_Listado Hojas de Vida (hoj)'), 
    0)

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/span_Listado Hojas de Vida (hoj)'))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/input_Identificacin_listado_hojaVidaj_idt63'), 
    '354968431354')

WebUI.sendKeys(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/input_Identificacin_listado_hojaVidaj_idt63'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/td_354968431354'))

WebUI.setText(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/input_Fecha Expedicin_hojaVidaseccionj_idt2106fecha_input'), 
    identificacion1 + '/09/2013')

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/a_Guardar'))

WebUI.click(findTestObject('Pruebas_Hoja_de_Vida/Notificar_Novedades_Hoja_Vida/a_Aceptar'))

WebUI.closeBrowser()

