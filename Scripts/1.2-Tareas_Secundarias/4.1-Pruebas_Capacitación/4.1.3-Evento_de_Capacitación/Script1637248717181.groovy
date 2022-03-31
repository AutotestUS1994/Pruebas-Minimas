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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementClickable(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba'), 1)) {
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Evaluacin'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Evento'))

    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt766'), 
        1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt766'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar4'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Programacin'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Programacin0'))

    if (WebUI.waitForElementVisible(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_24122021'), 1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Ubicacin_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar2'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar2'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Costo'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro2'))

    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'), 
        1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar3'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Recursos'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Logsticos'))

    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt606'), 
        1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt606'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar2'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Asistentes'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro1'))

    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba ka Pruebas'), 
        1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba ka Pruebas'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar1'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar1'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Grupos'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro0'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_Pruebas k'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_Pruebas k'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar0'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar0'))
    }
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Evento'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro3'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar3'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar5'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Regresar'))
}

if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Nuevo'), 1)) {
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_-- Seleccione --Evento CapacitacinEvento Capacitacin Grupal'), 
        2)

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aplicar'))

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--Aplicacin SaraCurso De Alturas'), 
        9)

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--BloqueadoEjecucinFinalizadoProgramado'), 
        4)

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Plan de Inversin_formRegistroEventoj_idt180'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba1'))

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaInicial_input'), 
        '17/11/2021')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
        '27/11/2021')

    WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/textarea_Descripcin del evento_formRegistroEventoj_idt1890idTexto5'), 
        'Prueba')

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
        '7')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Publicacion Inicial_formRegistroEventoj_idt1892fecha_input'), 
        '17/11/2021')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Publicacion Final_formRegistroEventoj_idt1893fecha_input'), 
        '27/11/2021')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input__formRegistroEventoj_idt1894idTexto6'), 
        '100')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input__formRegistroEventoj_idt1895idNumero1'), 
        '2')

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_Diagnstico de Necesidades de CapacitacinEstrategiaEvaluacin del desempeoOrigen Evento'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_MixtaPresencialVirtual'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_NOSI'), 1)

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_123456PRUEBA SILVIAUS654US23913781'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_BARRANQUILLABOGOTACALIFRANCIAIBIZA'), 
        3)

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
        '100000')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Costo Evento_formRegistroEventoj_idt18914idTexto6'), 
        '10000')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
        '5')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/textarea_Observacin_formRegistroEventoj_idt18917idTexto5'), 
        'Prueba')

    WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_AmbosNo AplicaPor AsistenciaPor Puntaje'), 
        1)

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a__formRegistroEventoj_idt18910j_idt229'))

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt23111'), 
        'A')

    WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt23111'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/span_A A A'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Guardar'))

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Puntaje Minimo_formRegistroEventominimoPuntaje'), 
        '3')

    WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Mximo Horas Ausencia_formRegistroEventomaximoHorasAusencia'), 
        '4')

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Guardar'))
} else {
    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementClickable(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba'), 1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Evaluacin'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Evento'))

        if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt766'), 
            1)) {
            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_No Diligenciada_formEventoEvaluacionpanel_eventotablaEvaluacion0j_idt766'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar4'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Programacin'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Programacin0'))

        if (WebUI.waitForElementVisible(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_24122021'), 
            1)) {
            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Ubicacin_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar2'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar2'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Costo'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro2'))

        if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'), 
            1)) {
            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar3'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Recursos'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Logsticos'))

        if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt606'), 
            1)) {
            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_INDISPENSABLE_formRecursoLogisticopanel_recursostabla_recursos0j_idt606'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar2'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Asistentes'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro1'))

        if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba ka Pruebas'), 
            1)) {
            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba ka Pruebas'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar1'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar1'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Grupos'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro0'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_Pruebas k'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Capacitación/Evento_de_Capacitacion/td_Pruebas k'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar0'))

            WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar0'))
        }
        
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/div_Evento'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Registro3'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Eliminar3'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aceptar5'))
    }
    
    if (WebUI.waitForElementPresent(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Nuevo'), 1)) {
        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Nuevo'))

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_-- Seleccione --Evento CapacitacinEvento Capacitacin Grupal'), 
            2)

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Aplicar'))

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--Aplicacin SaraCurso De Alturas'), 
            9)

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--BloqueadoEjecucinFinalizadoProgramado'), 
            4)

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Plan de Inversin_formRegistroEventoj_idt180'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/td_prueba1'))

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaInicial_input'), 
            '17/11/2021')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
            '27/11/2021')

        WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Fecha Rango_formRegistroEventofechaFinal_input'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/textarea_Descripcin del evento_formRegistroEventoj_idt1890idTexto5'), 
            'Prueba')

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
            '7')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Publicacion Inicial_formRegistroEventoj_idt1892fecha_input'), 
            '17/11/2021')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Publicacion Final_formRegistroEventoj_idt1893fecha_input'), 
            '27/11/2021')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input__formRegistroEventoj_idt1894idTexto6'), 
            '100')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input__formRegistroEventoj_idt1895idNumero1'), 
            '2')

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_Diagnstico de Necesidades de CapacitacinEstrategiaEvaluacin del desempeoOrigen Evento'), 
            1)

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_MixtaPresencialVirtual'), 
            3)

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_NOSI'), 1)

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_123456PRUEBA SILVIAUS654US23913781'), 
            2)

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_BARRANQUILLABOGOTACALIFRANCIAIBIZA'), 
            3)

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
            '100000')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Costo Evento_formRegistroEventoj_idt18914idTexto6'), 
            '10000')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Nmeromero Autorizacin_formRegistroEventoj_idt18915idTexto'), 
            '5')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/textarea_Observacin_formRegistroEventoj_idt18917idTexto5'), 
            'Prueba')

        WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/select_AmbosNo AplicaPor AsistenciaPor Puntaje'), 
            1)

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a__formRegistroEventoj_idt18910j_idt229'))

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt23111'), 
            'A')

        WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt23111'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/span_A A A'))

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Guardar'))

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Puntaje Minimo_formRegistroEventominimoPuntaje'), 
            '3')

        WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/input_Mximo Horas Ausencia_formRegistroEventomaximoHorasAusencia'), 
            '4')

        WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Evento_de_Capacitacion/a_Guardar'))
    }
}

WebUI.closeBrowser()

