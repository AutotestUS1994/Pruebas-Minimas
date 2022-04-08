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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Cursos (cap)')

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/li_Cursos (cap)'), 0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/li_Cursos (cap)'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/td_Prueba'), 1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/td_Prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Tema'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/span_Tema'), 1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Tema_form_cursopestaniaslistaTemas0j_idt608'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Datos Bsicos'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Curso_form_cursopestaniasdescripcion'), 'Prueba')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Intensidad Horaria_form_cursopestaniasintensidad'), 
    '12')

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/label_Ambas'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Puntaje Minimo_form_cursopestaniaspuntajeminimo'), 
    '10')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Puntaje Aprobacin_form_cursopestaniaspuntajeaproba'), 
    '31')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Prerrequisito_form_cursopestaniasprerequisito'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Metodologa_form_cursopestaniasmetodologia'), 
    'virtual')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_-- Seleccione --CARTAS DE RETIROCERT'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_SeleccioneNINGUNOIcetexInstituto Caro y Cuervo.PositivaSena'), 
    5)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_ActivoCancelado'), 1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Asistencia Mnima Horas_form_cursopestaniasasistenciamin'), 
    '8')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Puntaje Mximo_form_cursopestaniaspuntajemaximo'), 
    '50')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Poblacin Objeto_form_cursopestaniascobertura'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Objetivo_form_cursopestaniasimpacto'), 'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Contenido_form_cursopestaniascontenido'), 
    'null')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Tema'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_-- SELECCIONAR --GERENCIA DE PROYECTOSPLANMEACINPRUEBA DE MODULOSEGURIDAD EN EL SISTEMA DE INFORMACINTema'), 
    5)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Orden_form_cursopestaniaslistaTemasorden'), 
    '1')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Orden_form_cursopestaniaslistaTemasj_idt609'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Regresar'))

WebUI.closeBrowser()

