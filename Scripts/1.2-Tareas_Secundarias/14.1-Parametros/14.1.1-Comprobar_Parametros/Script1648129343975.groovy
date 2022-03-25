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

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametro Plan Sucesion (cap)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

planSucesion()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Bienestar (bie)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parBienestar()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Capacitacion (cap)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parCapacitacion()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Compensacion (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parCompensacion()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Contratacion (tal)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parConstratacion()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Eventos (sst)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parEventos()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Generales (tal)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parGenerales()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Plantillas (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Viaticos (act)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.comment('NO FUNCIONA')

WebUI.back()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros del Cargo (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parCargo()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros (get)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Cartera (cae)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

parCartera()

WebUI.acceptAlert()

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Estado Seleccion (tal)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Generales (gna)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Horarios (get)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Reporte (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Valor (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros de Costeo (com)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

WebUI.setText(findTestObject('Modulo Parametros/Comprobar Parametros/input_Empresa 1_form_templatej_idt24_input'), 'Parametros Entidad/Instructor (bie)')

WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/li_Parametros'))

def parCartera() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Etapas'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Lnea  De Crdito'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Lnea  De Crdito-Etapa'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Modalidades'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parCargo() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nivel Cargo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Categora'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Clasificacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Cargo Genrico'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Cargo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Rol'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parGenerales() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Unidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Planta'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Clase De Puesto'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Ubicacin  Fsica'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Gestin Sucursales'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Sucursal'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Objetivo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Unidad Transversal'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parEventos() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Modalidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Proveedor'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Evento - Copy'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Origen Evento'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  De Calificacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Resumen Evaluacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Evaluaciones'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Costo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Medios Audiovisual'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Salones'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tema'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Formulario Necesidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Fuente necesidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parConstratacion() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Documento'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Momento'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Origen Contratacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parCompensacion() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Concepto'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Consolidador'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Estado Laboral'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Formulacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_tem Flexible'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Motivo De Retiro'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Planilla Flexible'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Ausencia'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Cambio'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Embargo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  De Liquidacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Prestamo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Grupo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Rango'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Turno'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Variables'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Novedad Fecha'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Variables De Concepto'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Concepto De Jornadas'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Variable De Liquidacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Vinculacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Abono Pension'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Motivo Terminacion'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def parCapacitacion() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Modalidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Proveedor'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Evento'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Origen Evento'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  De Calificacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Resumen Evaluacin'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Evaluaciones'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Costo'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Medios Audiovisual'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Salones'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tema'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Formulario Necesidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Fuente necesidad'))

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

def planSucesion() {
    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/input_Parmetros_planilla_formfiltro'), 
        1)
}

def parBienestar() {
    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Eje Bienestar'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Disciplina'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nivel'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  Evento'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Resumen Evaluacin (1)'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementNotVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 1)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Evaluacin'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Entidad Bienestar'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Instructor Bienestar'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Costo'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Salones o Escenarios'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo Beneficio'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Medio Audiovisual'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Tipo  De Calificacin (1)'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Modulo Parametros/Comprobar Parametros/a_Nuevo'), 0)
}

