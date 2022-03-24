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
/*librerias para ejecutar botones con java sript*/
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Listado Caso Atep_form_templatej_idt24_input'), 
    'Matriz de peligros')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/li_Matriz de peligros (sst)'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Periodo_principal'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Empresa_principal'), 
    1)

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_PRUEBA KATALON'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Fsico. - Riesgo Fsico_form_listadoMatrizPeligrotablaMatrizPeligroDetalle1j_idt138'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Anexos_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_Pruebas k'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_Pruebas k'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_prueba.pdf_Eliminar'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Medida de intervencin_Eliminar'), FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_PRUEBAS K (1)'), 
        1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_PRUEBAS K (1)'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar0'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar0'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Niveles de Riesgo_Eliminar'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_1'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_1'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar1'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar1'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Controles Existentes_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_Individuo'), 1)) {
        /*--------------------------------------------------------------------------------------------*/
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_Individuo'),
			30)

		WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))
		WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_Individuo'))
		/*--------------------------------------------------------------------------------------------*/
        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar2'))

        WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar2'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Detalle'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar3'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar3'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar4'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar4'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar5'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar5'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Eliminar6'))

    WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Aceptar_Eliminar6'))
}

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarPeriodo 2018Periodo No. 1'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Descripcin_form_datosMatrizPeligrodescripcion'), 
    'PRUEBA KATALON')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarNo VigenteVigente'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Fecha Vigencia_form_datosMatrizPeligrofechaVigencia_input'), 
    '01/07/2021')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Actividades'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Cdigo_form_datosActividadMatrizcodigo'), 
    '1122334455')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_datosActividadMatrizdescripcion'), 
    'PRUEBAS K')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarNoSi'), 2)

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo2'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Cdigo_form_detalleTareaMatrizcodigoTar'), 
    '66778899')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_detalleTareaMatrizdescripcionTar'), 
    'Pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo3'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarFsicoPrueba cdigo repetidoCondiciones de SeguridadPsicosocialBiomecnicoAuditivoFenmenos NaturalesVisualMotriz'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Seleccionar'), '1')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Efecto Posible_form_listadoPeligroListadoActividaddtabconsecuencia'), 
    'prueba k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Controles Existentes'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo4'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarIndividuoFuenteMedio'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_listadoPeligroListadoActividaddtabdescripcionMedControl'), 
    'pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar4'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Niveles de Riesgo'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo6'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Fecha Original_form_l5'), '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarBAJAMEDIAALTO'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarSiNoNo Aplica'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarIIIIIIIV'), 
    '1')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar6'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Seguimiento'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/td_4'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Fecha de Seguimiento_form_listadoPeligroListadoActividaddtabtab2fechaSeguimiento_input'), 
    '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarBAJAMEDIAALTO2'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarSiNoNo Aplica2'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarIIIIIIIV2'), 
    '1')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Actualizar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Medida de intervencin'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo7'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarPrevencin Nivel 1Prevencin Nivel 2Prevencin Nivel 3'), 
    '1')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_listadoPeligroListadoActividaddtabdescripcionMedInter'), 
    'PRUEBAS K')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Recurso Inversin_form_listadoPeligroListadoActividaddtabrecuInvsMedInter'), 
    'PRUEBAS K')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar8'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Anexos'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosj_idt1133'))

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'prueba.pdf'

WebUI.uploadFile(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosdescripcionAnexo'), 
    'Pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosj_idt1140'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Regresar al inicio'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Periodo_principal'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Empresa_principal'), 
    1)

WebUI.closeBrowser()

