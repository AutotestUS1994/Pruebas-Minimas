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

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Empresa 1_form_templatej_idt24_input'), 
    'ejecucion reporte (gna)')

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/li_Ejecucion Reporte (gna)'))

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    'pruebas  automaticas')

WebUI.sendKeys(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_pruebas  automaticas'), 
    1)) {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_pruebas  automaticas'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Campo'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_NIT'), 1)) {
        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_NIT'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_codigo'), 1)) {
        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_codigo'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Nombre'), 1)) {
        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Nombre'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Entrada'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Numero Entero'), 1)) {
        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Numero Entero'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_entrada'))

        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar entrada'))
    }
    
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Reporte'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_reporte'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar reporte'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_reporte'), 
        1)) {
        WebUI.acceptAlert()
    } else {
        WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Regresar'))
    }
}

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Nuevo'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Descripcin_reporteFormdescripcion'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Descripcin_reporteFormdescripcion'), 'pruebas  automaticas')

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Titulo_reporteFormtitulo'), 'Pruebas  katalon')

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_SeleccioneFIJOFUENTESQL'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_--Seleccione--NoSi'), 2)

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_SeleccioneEjecutar limite de tiempo de la sesion'), 
    1)

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/textarea_Sql_reporteFormsql'), 'SELECT  nemp_empresa "codigo", cemp_nombre "Nombre", memp_nit "NIT" FROM EMPRESA_EMP')

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Guardar'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Entrada'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Descripcin_formPopUpEntradaReporteentradaDescripcion'), 
    'Empresa')

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Parmetro_formPopUpEntradaReporteentradaParametro'), 
    'Codempresa')

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_DirectoLista'), 0)

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_- Seleccione -FechaNumero DecimalNumero EnteroSerie NumeroSerie TextoTexto'), 
    3)

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Orden_formPopUpEntradaReporteentradaOrden'), 
    '1')

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/label_Si'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Guardar1'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/span_No se encontr registros_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Campo'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Generar'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Tipo'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Plantilla_btn_popupInformacion'))

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Buscar_form_PopupPlantillasj_idt74'), 
    'descargar.xlsx')

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_descargar.xlsx'))

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Nombre De La  Hoja_reporteFormexcel'), 
    'Hoja1')

WebUI.selectOptionByIndex(findTestObject('Modulo Sara General/Ejecucion reporte general/select_SeleccioneSin CifrarEncripcion DaviviendaEncripcion Citibank'), 
    1)

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Guardar2'))

WebUI.click(findTestObject('a_Ejecutar'))

WebUI.setText(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Empresa_popupReportetablaParametroReporte0j_idt477'), 
    '1')

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/div_Generar_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Generar'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Descargar'))

/*-----------------------------------Sección eliminar --------------------------------------------------------------------*/
WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/span_No se encontr registros_ui-icon ui-icon-closethick1'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Campo'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_NIT'), 1)) {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_NIT'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_codigo'), 1)) {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_codigo'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Nombre'), 1)) {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Nombre'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Entrada'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Numero Entero'), 1)) {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/td_Numero Entero'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_entrada'))

    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar entrada'))
}

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Reporte'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_reporte'))

WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Aceptar_eliminar reporte'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Eliminar_reporte'), 1)) {
    WebUI.acceptAlert()
} else {
    WebUI.click(findTestObject('Modulo Sara General/Ejecucion reporte general/a_Regresar'))

    WebUI.waitForElementVisible(findTestObject('Modulo Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
        0)

    WebUI.closeBrowser()
}

