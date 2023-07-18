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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Secciones_form_templatej_idt286j_idt29'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/label_Nueva Hoja Vida'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Novedades'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_-- Seleccione --AprobadaCanceladaPendienteRechazada'), 
    3)

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/span_DIAZ BLANCO GUISELL'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/span_DIAZ BLANCO GUISELL'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Aprobar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Aceptar' /*-----------------------------------------------------------------------------------------------*/ ))
} else {
    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/0.1-Login-1057596487'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Empresa 1_form_templatej_idt24_input'), 
        'hoja de vida')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/li_Listado Hojas de Vida (hoj)'))

    String fecha = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input__hojaVidaseccionj_idt2143fecha_input'), 
        'value')

    if (fecha != '07/03/2011') {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input__hojaVidaseccionj_idt2143fecha_input'), 
            '07/03/2011')
    } else {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input__hojaVidaseccionj_idt2143fecha_input'), 
            '07/03/2010')
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_--Seleccione--AA-ABAB-BB-OO-'))

    String seleccion = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_--Seleccione--AA-ABAB-BB-OO-'), 
        'value')

    if (seleccion != 'O+') {
        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_--Seleccione--AA-ABAB-BB-OO-'), 
            7)
    } else {
        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_--Seleccione--AA-ABAB-BB-OO-'), 
            2)
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a__hojaVidaseccionj_idt21411j_idt254'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt921'), 
        'BOGOTÁ')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt921'), 
        Keys.chord(Keys.ENTER))

    WebUI.doubleClick(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/td_11001     BOGOT'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a__hojaVidaseccionj_idt21412j_idt254'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Nacionalidad_j_idt930j_idt935'), 
        'Colombiana')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Nacionalidad_j_idt930j_idt935'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/span_Colombiana'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Guardar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Aceptar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Empleado_glyphicons glyphicons-exit'))
}

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/input_Secciones_form_templatej_idt286j_idt29'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/label_Nueva Hoja Vida'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Novedades'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/select_-- Seleccione --AprobadaCanceladaPendienteRechazada'), 
    3)

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/span_DIAZ BLANCO GUISELL'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/span_DIAZ BLANCO GUISELL'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Aprobar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Aprobación_Novedades/a_Aceptar'))

    String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Result == 'se Aprobo Correctamente el Registro') {
        String Resultado = 'Prueba ok'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

