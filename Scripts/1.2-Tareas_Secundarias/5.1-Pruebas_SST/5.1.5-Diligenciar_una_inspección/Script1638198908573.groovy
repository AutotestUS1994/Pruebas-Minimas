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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Inspecciones')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/li_Inspecciones (sst)'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/td_PRUEBAS KATALON'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/td_PRUEBAS KATALON'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Programacin1'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/td_1010220596'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/td_1010220596'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/button_Si'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Detalle_principal'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Eliminar2'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Aceptar2'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/textarea_Descripcin_form_datobasicoinspecciondescripcion'), 
    'PRUEBAS KATALON')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/select_SeleccionarDe rea o punto crticoNo planeadaPlaneada'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/select_SeleccionarSEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/select_SeleccionarMENSUALBIMESTRALANUALSEMANALTRIMESTRALSEMESTRALDIARIA'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Fecha Inicial_form_datobasicoinspeccionfechaInPeriodicidad_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Fecha Final_form_datobasicoinspeccionfechaFnPeriodicidad_input'), 
    '10/07/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Responsable_form_datobasicoinspeccionj_idt599'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt895'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt895'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/select_Seleccionar001002003GESTIN HSE1'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Formulario_form_datobasicoinspeccionj_idt6181'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8951'), 
    ' A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8951'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/span_A A A'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Fecha_form_datobasicoinspeccionfecha_input'), 
    '01/07/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Programacin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Nuevo1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Responsable_form_detalleProgramacionXj_idt714'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8953'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt8953'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/span_A A A3'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Fecha Programacin_form_detalleProgramacionXprogramacionf_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Nmero_form_detalleProgramacionXnumero'), 
    '5')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Guardar1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Evidencias'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_subir'))

//String creado para redireccionar  los archivos requeridos por el test//
String ra = ''

String ruta = Systema(ra) + 'prueba.pdf'

println(ruta)

WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/input_Descargar_form_evidenciastabladescripcion'), 
    'pruebas k')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Diligenciar_una_inspección/a_Descargar_form_evidenciastablaj_idt776'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Registro Actualizado') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def Systema(def ra) {
    String RutaA = System.getProperty('os.name')

    if (RutaA == 'Windows 10') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'

        rutaW = rutaW.replace('/', '\\')

        println('Esta es la ruta:' + rutaW)

        ra = rutaW
    } else if (RutaA == 'Linux') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'

        println('ESTA ES LA RUTA' + rutaW)

        ra = rutaW
    } else {
        ra = 'ERROR'

        WebUI.acceptAlert()
    }
}

