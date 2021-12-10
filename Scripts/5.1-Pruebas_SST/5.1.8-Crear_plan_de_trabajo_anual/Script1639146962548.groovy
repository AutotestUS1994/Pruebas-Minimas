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

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Plan de trabajo anual')

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/li_Plan de Trabajo Anual (sst)'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_pruebas katalon'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_pruebas katalon'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Objetivos'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_BASE LEGAL'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_BASE LEGAL'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Actividades'))

        if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_pruebas k'), 1)) {
            WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_pruebas k'))

            if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Anexos'), 1)) {
                WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Anexos'))

                if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_prueba.pdf_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexos0j_idt769'), 
                    1)) {
                    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_prueba.pdf_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexos0j_idt769'))

                    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/span_Si'))
                }
            }
        }
        
        if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Cronograma'), 1)) {
            WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Cronograma'))

            if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_Programado0'), 
                1)) {
                WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_Programado0'))

                WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Eliminar'))

                WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Aceptar'))
            }
        }
        
        if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Responsable'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Responsable'))
        }
        
        if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_A A A_form_actividadesObjetivosPlanTrabajotabsActividadestabla_responsables0j_idt714'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_A A A_form_actividadesObjetivosPlanTrabajotabsActividadestabla_responsables0j_idt714'))

            WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Aceptar'))
        }
    }
    
    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Actividades_Pestaa'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Actividades_Pestaa'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Detalle'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Aceptar'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Regresar'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Detalle'))

   


        if(WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Eliminar'), 1))
        {
        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Aceptar'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Regresar'))
        }
}

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Nombre_form_datosBasicosPlanTrabajonombre'), 
    'Pruebas  k')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/textarea_Descripcin_form_datosBasicosPlanTrabajodescripcion'), 
    'pruebas katalon')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Fecha_form_datosBasicosPlanTrabajofecha_input'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Fecha_form_datosBasicosPlanTrabajofecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/select_SEDE NORTESEDE OCCIDENTESEDE SUR'), 
    0)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Objetivos'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/textarea_Objetivo_form_datosObjetivosPlanTrabajoobjetivo'), 
    'pruebas katalon')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/select_SeleccionarBASE LEGAL'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/select_SeleccionarPSO'), 1)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Actividades'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Cdigo_form_actividadesObjetivosPlanTrabajotabsActividadesactividad'), 
    '5')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/textarea_Descripcin_form_actividadesObjetivosPlanTrabajotabsActividadesdescripcion'), 
    'pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Responsable Principal_form_actividadesObjetivosPlanTrabajotabsActividadesj_idt673'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt782'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt782'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/span_A A A'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Tipo de Riesgo_form_actividadesObjetivosPlanTrabajotabsActividadesj_idt677'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_prueba'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Responsable'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nombre_form_actividadesObjetivosPlanTrabajotabsActividadestabla_responsablesj_idt710'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7820'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7820'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/td_A A A'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nombre_form_actividadesObjetivosPlanTrabajotabsActividadestabla_responsablesj_idt715'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Cronograma'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Fecha Inicio_form_actividadesObjetivosPlanTrabajotabsActividadesfechaInicial_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Fecha Final_form_actividadesObjetivosPlanTrabajotabsActividadesfechaFinal_input'), 
    '02/07/2021')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Horas Programadas_form_actividadesObjetivosPlanTrabajotabsActividadeshorasProgramadas'), 
    '5')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/select_SeleccionarEjecutadoProgramado'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Anexos'))

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Descargar_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexosj_idt763'))

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    0)

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'prueba.pdf'

WebUI.uploadFile(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Descargar_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexosdescripcionAnexo'), 
    'prueba')

WebUI.setText(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/input_Descargar_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexosfecha_input'), 
    '01/07/2021')

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Descargar_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexosj_idt770'), 
    0)

WebUI.click(findTestObject('Modulo Pruebas SST/Crear_plan_de_trabajo_anual/a_Descargar_form_actividadesObjetivosPlanTrabajotabsActividadestablaAnexosj_idt770'))

WebUI.delay(2)

WebUI.closeBrowser()

