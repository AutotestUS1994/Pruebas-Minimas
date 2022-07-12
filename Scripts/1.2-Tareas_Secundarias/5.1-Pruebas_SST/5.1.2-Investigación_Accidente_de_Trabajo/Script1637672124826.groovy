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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('document.body.style.zoom=\'98%\'', null)

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Informes de Accidentes e Incidentes de Trabajo_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Informes de Accidentes e Incidentes de Trabajo_form_templatej_idt24_input'), 
    'Informe Accidente de Trabajo')

WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Informe Accidente de Trabajo (sst)'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Informe Accidente de Trabajo (sst)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Prueba'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Accidentado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_DIAZ BLANCO GUISELL'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Investigaciones'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Prueba2'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Prueba2'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Aceptar_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Investigaciones'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Costo Estimado del Dao_j_idt1827tabInvestigacionAccidentadocosto'), 
    '100')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Propiedad o Equipo Daado_j_idt1827tabInvestigacionAccidentadoequipoDanado'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Naturaleza del Dao_j_idt1827tabInvestigacionAccidentadonaturaleza'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Agente Dao_j_idt1827tabInvestigacionAccidentadoorigenDano'), 
    'null')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_-- SELECCIONAR --GraveLeveUrgente'), 
    '2')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Descripcin del rea de Trabajo en Dnde Ocurri el Accidente_j_idt1827tabInvestigacionAccidentadoareaTrabajo'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Descripcin de la Operacin Desarrollada en el Momento del Accidente_j_idt1827tabInvestigacionAccidentadooperacion'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Acciones Adoptadas Despus del Accidente_j_idt1827tabInvestigacionAccidentadoacciones'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Conclusin_j_idt1827tabInvestigacionAccidentadoconclusion'), 
    'Prueba')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Caracterstica No Obligatoria Investigacin_j_idt1827tabInvestigacionAccidentadoj_idt19321idTexto3'), 
    'null')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Fecha_j_idt1827tabInvestigacionAccidentadoj_idt19322fecha_input'), 
    '01/07/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Guardar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Anlisis Causal'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nuevo1'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar1111-Metodologa 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Descripcin_form_PopupAnalisisCausaldesc'), 
    'prueba')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Observacin_form_PopupAnalisisCausalobservacion'), 
    'prueba')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarBAJAMEDIAALTO'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Guardar_Anlisis Causal'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Determinacin de Causas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nuevo2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Metodologa_causaAccidente_formj_idt513'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar1111-Metodologa 12'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar2'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Metodologa_ui-icon ui-icon-closethick'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarCausas BsicasCausas Inmediatas'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarFactores PersonalesFactores del Trabajo'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarLIMPIEZA, LUBRICACIN, AJUSTE O REPARACIN DE EQUIPO MVIL ELCTRICO O DE PRESIN'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarNo especificada en otra parteTrabajar'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Conclusin_causaAccidente_formobservacion'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Guardar_Causa investigacion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Accin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nuevo3'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarTipo Accion'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/textarea_Descripcin De La  Accin_form_popupRecomendacionInvvpanel_principal_23descripcion'), 
    'Prueba')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Fecha De Accin_form_popupRecomendacionInvvpanel_principal_23recomendacion_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Fecha de Seguimiento_form_popupRecomendacionInvvpanel_principal_23seguimiento_input'), 
    '02/07/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Responsable_form_popupRecomendacionInvvpanel_principal_23j_idt405'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/label_Responsable'))

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ALMANZA NOVOA JOHN ALEXANDRE'), 
    0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ALMANZA NOVOA JOHN ALEXANDRE'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/div_Responsable'), 
    1)) {
    WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ALMANZA NOVOA JOHN ALEXANDRE'), 
        0)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ALMANZA NOVOA JOHN ALEXANDRE'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Responsable De Accin_form_popupRecomendacionInvvpanel_principal_23j_idt409'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1557'), 
    'a')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1557'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_A A A'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Unidad Organizacional_form_popupRecomendacionInvvpanel_principal_23j_idt413'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    'a')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ADMINISTRACION'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarEfectuadoNo Efectuado'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Metodologa_form_popupRecomendacionInvvpanel_principal_23j_idt344'))

if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Metodologa 1'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Metodologa 1'))
} else {
    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar1111-Metodologa 13'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar1111-Metodologa 13'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_Seleccionar1111-Metodologa 13'), 
        1)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Metodologa 1'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Causa_form_popupRecomendacionInvvpanel_principal_23j_idt365'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Causas Bsicas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Guardar3'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Control'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Estado_form_popupRecomendacionInvvpanel_principal_23tablaControlfechaEditable_input'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Estado_form_popupRecomendacionInvvpanel_principal_23tablaControlfechaEditable_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarTipo Control'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Estado_form_popupRecomendacionInvvpanel_principal_23tablaControldescripcionEditable'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Estado_form_popupRecomendacionInvvpanel_principal_23tablaControlj_idt450'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_ALMANZA NOVOA JOHN ALEXANDRE4'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/select_SeleccionarEfectuadoNo Efectuado4'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Estado_form_popupRecomendacionInvvpanel_principal_23tablaControlj_idt462'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/label_Accin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Seguimiento'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Observacin_form_popupRecomendacionInvvpanel_principal_23j_idt464j_idt480'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/label_Tipo  Control'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_Tipo Control'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo (1)/textarea_Observacin_form_popupRecomendacionInvvpanel_principal_23j_idt464obserSeguim'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Observacin_form_popupRecomendacionInvvpanel_principal_23j_idt464j_idt498'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Accion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Equipo de investigacin'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nivel del Cargo_j_idt1810tabInvestigacionAccidentadotablaEquipoj_idt2013'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2086'), 
    'a')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2086'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/span_A A A2'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Nivel del Cargo_j_idt1810tabInvestigacionAccidentadotablaEquipofechaaccidente_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Nivel del Cargo_j_idt1810tabInvestigacionAccidentadotablaEquiporol'), 
    'prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Nivel del Cargo_j_idt1810tabInvestigacionAccidentadotablaEquipoj_idt2022'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Anexos'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Descargar_j_idt1810tabInvestigacionAccidentadotablaAnexosj_idt2030'))

//String creado para redireccionar  los archivos requeridos por el test//
String ra = ''
String ruta = Systema(ra) + 'prueba.pdf'
println(ruta)
WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/input_Descargar_j_idt1810tabInvestigacionAccidentadotablaAnexosdescripcionAnexo'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Investigación_Accidente_de_Trabajo/a_Descargar_j_idt1810tabInvestigacionAccidentadotablaAnexosj_idt2037'))

String Result =WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
if(Result == 'Registro Actualizado') {
	String Resultado = 'PRUEBA OK'
	WebUI.closeBrowser()
}
else {
	WebUI.acceptAlert()
}

def Systema(ra) {
	String RutaA = System.getProperty('os.name')
	if(RutaA == 'Windows 10') {
		
		def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'
		rutaW = rutaW.replace('/', '\\')
		println("Esta es la ruta:" + rutaW)
		ra = rutaW
	}
	else if (RutaA == 'Linux') {
		def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'
		
		println("ESTA ES LA RUTA"+ rutaW)
		ra = rutaW
	}
	else {ra = 'ERROR'
		WebUI.acceptAlert()
	}
}