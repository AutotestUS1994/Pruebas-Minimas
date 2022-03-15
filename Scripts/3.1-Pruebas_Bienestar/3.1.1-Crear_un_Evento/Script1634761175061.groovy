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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

Date today = new Date()

/*--------------------------------------------*/
Number Dia = ((today.format('dd')) as Integer)

Number Mes = ((today.format('MM')) as Integer)

Number MesN = ((today.format('MM')) as Integer)

Number Año = ((today.format('yyyy')) as Integer)

Number AñoN = ((today.format('yyyy')) as Integer)

/*-----------------------------------------------*/
Number sumaD = Dia + 10

Number sumaM = Mes + 1

Number sumaA = Año + 1

/*--------------------------*/
if (sumaD > 30) {
    sumaD = (sumaD - Dia)

    Mes = sumaM
} else {
    sumaD

    Mes
}

/*--------------------------*/
if (sumaM > 12) {
    Año = sumaA

    Mes = 1
}

/*---------------------------*/
String FechaI = (((Dia + '/') + MesN) + '/') + AñoN

String FechaF = (((sumaD + '/') + Mes) + '/') + Año

/*----------------------------------------------------*/
WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_CostoEvento'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_SALON 1'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_TEST FB_form_costoEventolistaCostoEvento0j_idt663'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar Eliminar -1'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_02112021'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_02112021'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'))

            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar'))
        }
        
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar0'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Evaluacin'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Evento0'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_1010220596'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt881'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar0'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Participante'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Grupo'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_PRUEBAS K'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_PRUEBAS K'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Integrantes'), 1)) {
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Integrantes'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Administracion_grupoEventopanel_principal_2pGListaIntegrantes0j_idt390'), 
                1)) {
                WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Administracion_grupoEventopanel_principal_2pGListaIntegrantes0j_idt390'))

                WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar1'))
            }
            
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Grupo_pestaa'))

            /*-------------------------------------------------------------------------------------*/
            WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar0'), 
                30)

            WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

            /*-------------------------------------------------------------------------------------*/
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar3'))
        }
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Evaluacin'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Evento0'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt881'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt881'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar0'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Datos Evento'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Publicacin'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_http'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_http'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Entidades'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_US_form_entidadlistaEntidades0j_idt630'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_US_form_entidadlistaEntidades0j_idt630'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_Entidades'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_DirigidoA'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_DirigidoA'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Recursos'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Logsticos'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt951'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt951'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_Logisticos'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Datos Evento'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Registro'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_MAR-MIE 0500-0600'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Boto borrar'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar Eliminar 0'))
		
		WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'), 1)
        
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar2'))
}

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S-SH'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S-SH'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Participante'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Sancionados'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_PRUEBAS K_form_sancionadoslistaSancionados0j_idt645'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_PRUEBAS K_form_sancionadoslistaSancionados0j_idt645'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_Sancionados'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_A A A0'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_A A A0'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar Datos_A A A'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_AAA'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si_eliminar_AAA'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Diaz Blanco Guisell0'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Diaz Blanco Guisell0'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar Datos_guisell'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_guisell'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si_eliminar_guisel'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Individual'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_A A A1'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_A A A1'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar Datos_AAA1'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_AAA1'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si_eliminar_AAA1'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Diaz Blanco Guisell1'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar Datos_guisell1'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_guisell1'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si_eliminar_guisell1'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Datos Evento'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_DirigidoA'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar_dirigidoA'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Instructores'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Instructores_form_entrenadorlistaEntrenadores0j_idt620'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Instructores_form_entrenadorlistaEntrenadores0j_idt620'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar_instructor'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_prueba-S-SH1'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_prueba-S-SH1'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1586'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1586'), 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar_momentoE0'))
        }
        
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_momentoE'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar_momentoE'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Publicacin'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_http'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_http'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Entidades'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_US_form_entidadlistaEntidades0j_idt630'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_US_form_entidadlistaEntidades0j_idt630'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_Entidades'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_DirigidoA'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Edad_form_condicionDerechoTipoBeneftabla_ventanaCDTB0j_idt797'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_DirigidoA'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Recursos'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Logsticos'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt951'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt951'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_Logisticos'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Evaluacin'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Evento0'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt885'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt885'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar evento'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Participante'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Noborrar Usuario Portal'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Noborrar Usuario Portal'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Cambiar Datos'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar_Cambiar'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Si_Cambiar'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/div_Datos Evento'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Registro0'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar2'))
}

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --aprea de Saludrea Formativarea Deportivarea de cienciasrea Social'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Promocin y prevencinActivate Acompaamiento psicosocial Semana de la SaludSeguimiento puestos de trabajo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Evento grupo Bienestar MultipleEvento Grupo Bienestar Multiple SIEvento Grupo Bienestar nicoEvento Individual Multiple SS'), 
    5)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'), 0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 'Prueba-S')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inicial Desarrollo_formEventosfechaIn_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Final Desarrollo_formEventosfechaFin_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cdigo_popupMomentoEvento_formcodigo'), '355682169')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_popupMomentoEvento_formpMENombre'), 
    'prueba')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --ESCENARIO DE PRUEBASALON 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --FemeninaMasculinaMixta'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Nivel BsicoNivel IntermedionicoNivel Avanzado'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Mximo_popupMomentoEvento_formpMECupoMaximo'), 
    '150')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Minimo_popupMomentoEvento_formpMECupoMinimo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --CanceladoProgramada'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar1'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Regresar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --aprea de Saludrea Formativarea Deportivarea de cienciasrea Social'), 
    5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Promocin y prevencinActivate Acompaamiento psicosocial Semana de la SaludSeguimiento puestos de trabajo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Evento grupo Bienestar MultipleEvento Grupo Bienestar Multiple SIEvento Grupo Bienestar nicoEvento Individual Multiple SS'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 'Prueba-S-SH')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inicial Desarrollo_formEventosfechaIn_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Final Desarrollo_formEventosfechaFin_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cdigo_popupMomentoEvento_formcodigo'), '355682169')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_popupMomentoEvento_formpMENombre'), 
    'prueba-S-SH')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --ESCENARIO DE PRUEBASALON 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --FemeninaMasculinaMixta'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Nivel BsicoNivel IntermedionicoNivel Avanzado'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Mximo_popupMomentoEvento_formpMECupoMaximo'), 
    '150')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Minimo_popupMomentoEvento_formpMECupoMinimo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Canizalez Acero Marta BrigitteMendoza 1010 Empleado'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --CanceladoProgramada'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar1'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Regresar'))

