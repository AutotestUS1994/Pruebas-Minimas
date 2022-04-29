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
import net.bytebuddy.asm.Advice.Return as Return
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import javax.naming.spi.DirStateFactory.Result as Result
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Empresa 1_form_templatej_idt24_input'), 
    'Programa de Capacitacion (cap)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/li_Programa de Capacitacion (cap)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Descripcin_form_datosPlanCapacitaciondescripcion'), 
    'CapacitacionPruebasKATALON' + nombreAlea())

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Inicial_form_datosPlanCapacitacionfechaInicial_input'), 
    fechainicial())

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --.BARRANQUILLABOGOTACALIFRANCIAIBIZA'), 
    '3')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Observacin_form_datosPlanCapacitacionobservacion'), 
    'prueba automatica katalon')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Final_form_datosPlanCapacitacionfechaFinal_input'), 
    fechafinal())

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Responsable_form_datosPlanCapacitacionj_idt595'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868'), 
    '80769954')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_354968431354'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Actividades'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Actividades'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Descripcin_form_actividadesCapacitaciontabActividadesdescripcionActi'), 
    'ActividadKatalon')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Objetivo_form_actividadesCapacitaciontabActividadesobjetivo'), 
    'Prueba automatica')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Cantidad Horas_form_actividadesCapacitaciontabActividadescantidad'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --Evento CapacitacinEvento Capacitacin Grupal'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Presupuesto_form_actividadesCapacitaciontabActividadespresupuesto'), 
    '1000000')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Recurso Disponible_form_actividadesCapacitaciontabActividadesdisponible'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Programacin_form_actividadesCapacitaciontabActividadesfechaprogramacion_input'), 
    fechainicial())

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Programacin_form_actividadesCapacitaciontabActividadesprogramacion'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Tema_form_actividadesCapacitaciontabActividadestema'), 
    'prueba  automatica')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Nmero Funcionarios_form_actividadesCapacitaciontabActividadesfuncionario'), 
    '100')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --MixtaPresencialVirtual'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --Diagnstico de Necesidades de CapacitacinEstrategiaEvaluacin del desempeoOrigen Evento'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Ejecutado_form_actividadesCapacitaciontabActividadesejecutado'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Ejecucin_form_actividadesCapacitaciontabActividadesfechaejecucion_input'), 
    fechafinal())

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Solicita_form_actividadesCapacitaciontabActividadesj_idt710'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868-1'), 
    'Constantino')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868-1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_354968431354-1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Detalle'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Enviar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Aprobar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Cerrar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_Si'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Empresa 1_form_templatej_idt24_input'), 
    'Programa de Capacitacion (cap)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/li_Programa de Capacitacion (cap)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Descripcin_form_datosPlanCapacitaciondescripcion'), 
    'CapacitacionPruebasKATALON' + nombreAlea())

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Inicial_form_datosPlanCapacitacionfechaInicial_input'), 
    fechainicial())

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --.BARRANQUILLABOGOTACALIFRANCIAIBIZA'), 
    '3')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Observacin_form_datosPlanCapacitacionobservacion'), 
    'prueba automatica katalon')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Final_form_datosPlanCapacitacionfechaFinal_input'), 
    fechafinal())

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Responsable_form_datosPlanCapacitacionj_idt595'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868'), 
    '80769954')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_354968431354'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Actividades'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Actividades'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Descripcin_form_actividadesCapacitaciontabActividadesdescripcionActi'), 
    'ActividadKatalon')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Objetivo_form_actividadesCapacitaciontabActividadesobjetivo'), 
    'Prueba automatica')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Cantidad Horas_form_actividadesCapacitaciontabActividadescantidad'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --Evento CapacitacinEvento Capacitacin Grupal'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Presupuesto_form_actividadesCapacitaciontabActividadespresupuesto'), 
    '1000000')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Recurso Disponible_form_actividadesCapacitaciontabActividadesdisponible'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Programacin_form_actividadesCapacitaciontabActividadesfechaprogramacion_input'), 
    fechainicial())

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Programacin_form_actividadesCapacitaciontabActividadesprogramacion'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Tema_form_actividadesCapacitaciontabActividadestema'), 
    'prueba  automatica')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Nmero Funcionarios_form_actividadesCapacitaciontabActividadesfuncionario'), 
    '100')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --MixtaPresencialVirtual'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/select_-- Seleccione --Diagnstico de Necesidades de CapacitacinEstrategiaEvaluacin del desempeoOrigen Evento'), 
    '1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Ejecutado_form_actividadesCapacitaciontabActividadesejecutado'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Fecha Ejecucin_form_actividadesCapacitaciontabActividadesfechaejecucion_input'), 
    fechafinal())

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Solicita_form_actividadesCapacitaciontabActividadesj_idt710'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868-1'), 
    'Constantino')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt868-1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_354968431354-1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Detalle'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Enviar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Rechazar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/textarea_Motivo_popupNoAutorizar_formmotivo'), 
    'Pruebas automaticas katalon')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_No Autorizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Cerrar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/span_Si'))

String Result =WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Programa capacitacion/a_Regresar'))

if (Result =='Periodo cerrado') {
	String Resultado = 'PRUEBA OK'
}
else {
	WebUI.acceptAlert()
}
def fechainicial() {
    Date today = new Date()

    String Dia = today.format('dd')

    String Mes = today.format('MM')

    String Año = today.format('yyyy')

    String fechaN = (((Dia + '/') + Mes) + '/') + Año
}

def fechafinal() {
    Date today = new Date()

    Number Dia = ((today.format('dd')) as Integer)

    Number Mes = ((today.format('MM')) as Integer)

    Number Año = ((today.format('yyyy')) as Integer)

    def sumaD = Dia + 10

    def sumaM = Mes + 1

    def sumaA = Año + 1

    if (sumaD > 30) {
        sumaD = 29

        Mes = sumaM
    } else {
        sumaD
    }
    
    if (sumaM > 12) {
        sumaM = 1

        Año = sumaA
    } else {
        sumaM
    }
    
    String fechaF = (((sumaD + '/') + Mes) + '/') + Año
}

def nombreAlea() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 10)

    String numero = random_double.toString().replace('.0', '')
}

