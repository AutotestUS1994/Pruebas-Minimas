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
/*librerias para ejecutar botones con java sript*/ import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Listado Caso Atep_form_templatej_idt24_input'), 
    'Matriz de peligros')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/li_Matriz de peligros (sst)'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_Periodo_principal'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_Empresa_principal'), 
    1)

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_PRUEBA KATALON'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Fsico. - Riesgo Fsico_form_listadoMatrizPeligrotablaMatrizPeligroDetalle1j_idt138'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Anexos_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_Pruebas k'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_Pruebas k'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_prueba.pdf_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/span_Si'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Medida de intervencin_Eliminar'), 
        FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_PRUEBAS K (1)'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_PRUEBAS K (1)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar0'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar0'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Niveles de Riesgo_Eliminar'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_1'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar1'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Controles Existentes_Eliminar'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_Individuo'), 
        1)) {
        /*--------------------------------------------------------------------------------------------*/
        WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_Individuo'), 
            30)

        WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_Individuo'))

        /*--------------------------------------------------------------------------------------------*/
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar2'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Detalle'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar3'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar3'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar4'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar4'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar5'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar5'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Eliminar6'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Aceptar_Eliminar6'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarPeriodo 2018Periodo No. 1'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_SeleccionarCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Descripcin_form_datosMatrizPeligrodescripcion'), 
    'PRUEBA KATALON')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarNo VigenteVigente'), 
    2)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Fecha Vigencia_form_datosMatrizPeligrofechaVigencia_input'), 
    '01/07/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Actividades'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo1'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Cdigo_form_datosActividadMatrizcodigo'), 
    '1122334455')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Descripcin_form_datosActividadMatrizdescripcion'), 
    'PRUEBAS K')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarNoSi'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo2'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Cdigo_form_detalleTareaMatrizcodigoTar'), 
    '66778899')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Descripcin_form_detalleTareaMatrizdescripcionTar'), 
    'Pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo3'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_SeleccionarFsicoPrueba cdigo repetidoCondiciones de SeguridadPsicosocialBiomecnicoAuditivoFenmenos NaturalesVisualMotriz'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_Seleccionar'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Efecto Posible_form_listadoPeligroListadoActividaddtabconsecuencia'), 
    'prueba k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Controles Existentes'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo4'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarIndividuoFuenteMedio'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Descripcin_form_listadoPeligroListadoActividaddtabdescripcionMedControl'), 
    'pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar4'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Niveles de Riesgo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo6'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Fecha Original_form_l5'), 
    '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_SeleccionarBAJAMEDIAALTO'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarSiNoNo Aplica'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarIIIIIIIV'), 
    '1')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar6'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Seguimiento'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/td_4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Fecha de Seguimiento_form_listadoPeligroListadoActividaddtabtab2fechaSeguimiento_input'), 
    '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_SeleccionarBAJAMEDIAALTO2'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarSiNoNo Aplica2'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarIIIIIIIV2'), 
    '1')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Medida de intervencin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Nuevo7'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/select_SeleccionarPrevencin Nivel 1Prevencin Nivel 2Prevencin Nivel 3'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Descripcin_form_listadoPeligroListadoActividaddtabdescripcionMedInter'), 
    'PRUEBAS K')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/2/textarea_Recurso Inversin_form_listadoPeligroListadoActividaddtabrecuInvsMedInter'), 
    'PRUEBAS K')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Guardar8'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Anexos'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosj_idt1133'))

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'prueba.pdf'

WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/input_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosdescripcionAnexo'), 
    'Pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Descargar_form_listadoPeligroListadoActividaddtabtablaAnexosj_idt1140'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/a_Regresar al inicio'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_Periodo_principal'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Creación_de_Matriz_de_Peligros/1/select_Empresa_principal'), 
    1)

WebUI.closeBrowser()

