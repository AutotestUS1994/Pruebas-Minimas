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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    '2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
    2)

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/span_5_autorizado'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/span_5_autorizado'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Cerrar Desembolsar'), 
        1)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Cerrar Desembolsar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero Resolucin_form_popupViaticoCierreDesembolsonumero'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero Resolucin_form_popupViaticoCierreDesembolsonumero'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Fecha_form_popupViaticoCierreDesembolsofecha_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_TRM_form_popupViaticoCierreDesembolsotrm'), 
        '5')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Aplicar1'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'))
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Nuevo_Modificar'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Nuevo_Modificar'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/span_Modificar una solicitud de vitico'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_fecha_busqueda_01072021'), 
        '01/07/2021')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_fecha_busqueda_01072021'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_fecha_busqueda_01072021'), 
        Keys.chord(Keys.ESCAPE))
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/td_seleccion_01072021'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/td_seleccion_01072021'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero_form_detalleviaticosNumero_MODIFICAR SOLICITUD'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/textarea_Motivo Modificacin_form_detalleviaticosmotivoModificacion'), 
        'prueba')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Guardar_modficar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'))
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/span_No se encontr registros_ui-icon ui-icon-closethick'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/span_No se encontr registros_ui-icon ui-icon-closethick'))

    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.5.9 Crear Viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Detalle_programacion'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Regresar_programacion'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Regresar_programacion'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Registro'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Cerrar Desembolsar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Cerrar Desembolsar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero Resolucin_form_popupViaticoCierreDesembolsonumero'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero Resolucin_form_popupViaticoCierreDesembolsonumero'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Fecha_form_popupViaticoCierreDesembolsofecha_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_TRM_form_popupViaticoCierreDesembolsotrm'), 
        '5')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Aplicar1'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Desembolso'))
}
salir()
def salir() {
	WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Empresa 1_cerrar_menu'))
	
	WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Administrador_glyphicons glyphicons-exit'))
	
	WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/div_Ingresar Olvide Mi Clave'), 0)
	
	
	WebUI.closeBrowser()
}
