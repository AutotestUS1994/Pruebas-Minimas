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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/td_Prueba-S-SH'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/div_Participante'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Individual'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/td_Diaz Blanco Guisell'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Sancionados'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/select_-- Seleccione --1010220596 - A A A1057596487 - Diaz Blanco Guisell'), 
        1)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/textarea_Observacin_form_sancionadoslistaSancionadosobservacion'), 
        'PRUEBAS K')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Observacin_form_sancionadoslistaSancionadosj_idt643'))
} else if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_2'), 
    1)) {
    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/td_Diaz Blanco Guisell'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Sancionados'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/select_-- Seleccione --1010220596 - A A A1057596487 - Diaz Blanco Guisell'), 
            2)

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/textarea_Observacin_form_sancionadoslistaSancionadosobservacion'), 
            'PRUEBAS K')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Observacin_form_sancionadoslistaSancionadosj_idt643'))
    }
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Nuevo'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Nombre_grupoEventoj_idt427'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/input_Filtro Empleado_form_popupFiltroEmpleadofiltroEmpleado'), 
        'constantino')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/input_Filtro Empleado_form_popupFiltroEmpleadofiltroEmpleado'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/span_Diaz Blanco Guisell'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/select_-- Seleccione --prueba-S-SH'), 
        1)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Guardar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Sancionados'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_PRUEBAS K_form_sancionadoslistaSancionados0j_idt641'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_PRUEBAS K_form_sancionadoslistaSancionados0j_idt641'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Aceptar'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/select_-- Seleccione --1010220596 - A A A1057596487 - Diaz Blanco Guisell'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/textarea_Observacin_form_sancionadoslistaSancionadosobservacion'), 
    'PRUEBAS K')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/a_Observacin_form_sancionadoslistaSancionadosj_idt643'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Sancionados/td_PRUEBAS K'), 
    1)) {
    String Resultado = 'Prueba ok'
} else {
    WebUI.acceptAlert()
}

WebUI.closeBrowser()

