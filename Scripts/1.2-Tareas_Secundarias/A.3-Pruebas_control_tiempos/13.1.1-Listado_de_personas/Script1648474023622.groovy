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

WebUI.comment('No se pueden eliminar conceptos y genera conflicto al intentar eliminar persona')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/input_Empresa 1_form_templatej_idt24_input'), 'Listado Persona')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/span_Listado Persona'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_1010220596'), 1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_1010220596'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Reloj'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_20210701 1800_eliminar reloj'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_20210701 1800_eliminar reloj'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Eliminar_eliminar reloj'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Aceptar_eliminar reloj'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Programacin'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Circular_Programacion1'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Circular_Programacion1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Eliminar_Programacion1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Aceptar_Programacion1'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Horario Predefinido_Programacion2'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Horario Predefinido_Programacion2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Eliminar_Programacion2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Aceptar_Programacion2'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Horario Predefinido_Programacion2'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Horario Predefinido_Programacion2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Eliminar_Programacion2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Aceptar_Programacion2'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Persona'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Aceptar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Regresar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Nuevo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Identificacin_form_personaj_idt121'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1737'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1737'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_A A A'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarFijoProgramacin'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarDesarrolloLIQUIDACIN MENSUAL'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarGrupo 2Sociosgrupo 3ClientesGrupo 1'), 
    5)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarAlternoMltiplenico'), 
    3)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/a_Sitio Administracin_form_personaj_idt166'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/td_Oficina'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarActivoInactivo'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarActivoInactivo'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Comprobar Parametros/a_Guardar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Listado de Personas/select_SeleccionarPruebaTurno 04 (L-V 730 - 1700 1h Almuerzo, S 700 - 1230)'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Comprobar Parametros/a_Guardar'))

WebUI.comment('No se puede eliminar registro pos ejecucion ')

