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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Cursos (cap)')

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/li_Cursos (cap)'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/li_Cursos (cap)'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/td_Prueba'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/td_Prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Tema'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/span_Tema'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Tema_form_cursopestaniaslistaTemas0j_idt608'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Datos Bsicos'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Curso_form_cursopestaniasdescripcion'), 
    'Prueba')

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

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_-- Seleccione --CARTAS DE RETIROCERT'), 
    FailureHandling.STOP_ON_FAILURE)

String optionT = ''

/*PROCESO PARA OBTENER EL TEXTO DE CADA SELECT*/
String option1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option1'))

String option2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option2'))

String option3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option3'))

String option4 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option4'))

String option5 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option5'))

String option6 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option6'))

String option7 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option7'))

String option8 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option8'))

String option9 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option9'))

String option10 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option10'))

String option11 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option11'))

String option12 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option12'))

String option13 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option13'))

String option14 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option14'))

String option15 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option5'))

switch (((((((((((((((option1 != '') || (option2 != '')) || (option3 != '')) || (option4 != '')) || (option5 != '')) || 
(option6 != '')) || (option7 != '')) || (option8 != '')) || (option9 != '')) || (option10 != '')) || (option11 != '')) || 
(option12 != '')) || (option13 != '')) || (option14 != '')) || (option15 != '')) {
    case option1 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option1'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option2 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option2'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option3 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option3'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option4 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option4'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option5 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option5'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option6 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option6'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option7 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option7'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option8 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option8'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option9 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option9'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option10 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option10'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option11 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option11'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option12 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option12'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option13 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option13'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option14 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option14'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    case option15 == 'PLANTILLA DIPLOMA12':
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/options/option_option15'), 
            FailureHandling.STOP_ON_FAILURE)

        break
    default:
        WebUI.acceptAlert()

        break
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_SeleccioneNINGUNOIcetexInstituto Caro y Cuervo.PositivaSena'), 
    5)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/select_ActivoCancelado'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Asistencia Mnima Horas_form_cursopestaniasasistenciamin'), 
    '8')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/input_Puntaje Mximo_form_cursopestaniaspuntajemaximo'), 
    '50')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Poblacin Objeto_form_cursopestaniascobertura'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/textarea_Objetivo_form_cursopestaniasimpacto'), 
    'null')

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

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Nuevo_Curso/td_Prueba'), 
    1)) {
    String Resultado = 'PRUEBAS OK'
} else {
    WebUI.acceptAlert()
}

