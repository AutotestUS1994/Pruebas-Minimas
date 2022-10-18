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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Informe accidente de trabajo')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/li_Informe Accidente de Trabajo (sst)'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Prueba'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Recomendaciones_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Camine con Precaucin_eliminar'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Camine con Precaucin_eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar0'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar0'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Testigo_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/td_DIAZ BLANCO GUISELL'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/td_DIAZ BLANCO GUISELL'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar1'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accidentado_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_DIAZ BLANCO GUISELL_Eliminar'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_DIAZ BLANCO GUISELL_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Investigaciones'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Prueba0'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Prueba0'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accin2'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Tipo Accion'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Tipo Accion'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Control'))

                if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Efectuado_form_popupRecomendacionInvvpanel_principal_23tablaControl0j_idt460'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Efectuado_form_popupRecomendacionInvvpanel_principal_23tablaControl0j_idt460'))

                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/label_Confirmacin'), 
                        FailureHandling.STOP_ON_FAILURE)

                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_eliminar accion'))
                }
                
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accin'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_eliminar accion'))
            }
            
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Determinacin de Causas'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Causas Bsicas'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Anexos'))

                if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_prueba.pdf_j_idt1841tabInvestigacionAccidentadotablaAnexos0j_idt2142'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_prueba.pdf_j_idt1841tabInvestigacionAccidentadotablaAnexos0j_idt2142'))

                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Si'))
                }
                
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Determinacin de Causas'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Causas Bsicas'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Eliminar'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar_causaInve'))
            }
            
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Anlisis Causal'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Anexos'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Anexos'))

                if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_prueba.pdf_j_idt1841tabInvestigacionAccidentadotablaAnexos0j_idt2142'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_prueba.pdf_j_idt1841tabInvestigacionAccidentadotablaAnexos0j_idt2142'))

                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Si'))
                }
                
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Anlisis Causal'))

                if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/td_Metodologa 1'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/td_Metodologa 1'))

                    /*--------------------------------------------------------------------------------------------------------*/
                    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_EliminarNv2'), 
                        30)

                    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

                    /*---------------------------------------------------------------------------------------------------------*/
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar_causal'))
                }
            }
            
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Datos de Investigacin Accidentado'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_eliminar datos investigacion'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Datos Bsicos'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar2'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accidente'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Eliminar_3'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Aceptar_Eliminar3'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- Seleccin --GrupalIndividual'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accidente'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --desFAMILIAR Tipo AccidenteLABORALPERSONAL'), 
    3)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/label_Si'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/label_Urbana'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Ubicacin Fsica_form_detalleAccidentej_idt1171'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Sede Suba'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --RECREATIVO O CULTURALPROPIOS DEL TRABAJODEPORTIVOTRANSITOVIOLENCIAPROVOCADOIMPRUDENCIA'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --AREAS DE PRODUCCIONAREAS RECREATIVAS O DEPORTIVAS'), 
    9)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Ubicacin Geogrfica Accidente_form_detalleAccidentej_idt1189'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt1544'), 
    'Bogotá')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt1545'), 
    'colombia')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/td_COLO      COLOMBIA'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Persona Informa_form_detalleAccidentej_idt1196'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1557'), 
    'guisell')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1557'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Diaz Blanco Guisell'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/textarea_Descripcin_form_detalleAccidentedescripcionAcci'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Testigo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nuevo3'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nombre Testigo_form_popupTestigoAccidentej_idt157'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt15573'), 
    'guisell')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt15573'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Diaz Blanco Guisell3'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Telfono_form_popupTestigoAccidentetelefono'), 
    '1234567890')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/textarea_Versin Testigo_form_popupTestigoAccidenteversion'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Guardar3'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Accidentado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nuevo2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Identificacin_form_datosAccidentadoj_idt1642'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Bsqueda_form_datosAccidentadoj_idt1816'), 
    'Guisell')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Bsqueda_form_datosAccidentadoj_idt1816'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Diaz Blanco Guisell2'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Fecha Reporte_form_datosAccidentadoreporte_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Fecha Radicado_form_datosAccidentadofecharadicado_input'), 
    '10/07/2021')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Fecha Radicado_form_datosAccidentadofecharadicado_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --COOPERADOESTUDIANTE O APRENDIZINDEPENDIENTEMISIONPLANTA'), 
    5)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --AREAS DE RIESGOAREAS SIN RIESGOPRUEBA SILVIA'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR ---'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --AGENTES  NO CLASIFICADOSAMBIENTES DE TRABAJO(SUPERFICIES DE TRANSITO Y TRABAJO'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/label_Si2'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --Lesin GraveLesin MedianaLesin Mnima'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --DIURNAMIXTANOCTURNAPOR TURNOS'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_--SELECCIONAR --idad y Salud en el Trabajo'), 
    1)

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/label_No'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Guardar2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Recomendaciones'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Nuevo4'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_ActivoCanceladoCumplidoNo Cumplido'), 
    0)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --Camine con PrecaucinCapacitacinTrate de no correr'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/select_-- SELECCIONAR --Recomendacin Atep 2Recomendacin Atep 1'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Responsable Recomendaciones_form_popupSeguimientotabRecomendacionj_idt200'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt15574'), 
    'Guisell')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt15574'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/span_Diaz Blanco Guisell4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/textarea_Observacin_form_popupSeguimientotabRecomendacionobservacion'), 
    'PRUEBA')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Reporte_de_accidente_de_trabajo/a_Guardar4'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Registro guardado') {
    String Resultado = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

