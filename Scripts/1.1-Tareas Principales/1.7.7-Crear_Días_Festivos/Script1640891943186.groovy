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

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/input_Empresa 1_form_templatej_idt24_input'), 
    'Dias Festivos')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/li_Dias Festivos (com)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/input_Actos Administrativos_form_diasfestivosdescripcionFiltroConcepto'), 
    'pruebas katalon')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/input_Actos Administrativos_form_diasfestivosdescripcionFiltroConcepto'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/td_Pruebas katalon'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/td_Pruebas katalon'), FailureHandling.STOP_ON_FAILURE)

    /*-----------------------BUSCADOR DE MES---------------------------------------------*/
    String leerMes = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/h2_enero 2021'))

    String Mes = leerMes

    while (Mes != 'enero de 2021') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/span_Modo_fc-icon fc-icon-left-single-arrow_regresarMes'), 
            FailureHandling.STOP_ON_FAILURE)

        String Mes1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/h2_enero 2021'))

        Mes = Mes1
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/div_0 FESTIVO'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/div_0 FESTIVO'), FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Eliminar Registro'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Aceptar_EliminarFes'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Eliminar_general'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Aceptar_eliminar general'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Nuevo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/input_Cdigo_form_diasfestivoscodigo'), 
    '5')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/input_Descripcin_form_diasfestivosdescripcion'), 
    'Pruebas katalon')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Actualizar'))

String leerMes = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/h2_enero 2021'))

String Mes = leerMes

while (Mes != 'enero de 2021') {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/span_Modo_fc-icon fc-icon-left-single-arrow_regresarMes'), 
        FailureHandling.STOP_ON_FAILURE)

    String Mes1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/h2_enero 2021'))

    Mes = Mes1
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/td_dom_fc-day fc-widget-content fc-fri fc-future_31-dic-2021'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/a_Aceptar0'))

WebUI.scrollToElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear_Días_Festivos/div_0 FESTIVO'), 0)

WebUI.closeBrowser()

