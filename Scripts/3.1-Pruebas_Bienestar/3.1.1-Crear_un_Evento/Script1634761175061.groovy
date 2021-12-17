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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import sun.util.resources.CalendarData as CalendarData
import org.eclipse.osgi.internal.framework.SystemBundleActivator as SystemBundleActivator
import org.openqa.selenium.Keys as Keys
import java.util.Date as Date
import java.util.Calendar as Calendar
import java.time.LocalDateTime as LocalDateTime

WebUI.comment('PENDIENTE Eliminar Registro')

Date fecha = new Date()

Number Dia = fecha.getDate()

Number Mes = fecha.getMonth() + 1

Number MesN = fecha.getMonth() + 1

Number Año = fecha.getYear() + 1900

Number AñoN = fecha.getYear() + 1900

Number DiaF = Dia + 10

Number MesF = Mes + 1

Number AñoF = Año + 1

if (DiaF > 30) {
    DiaF = (DiaF - Dia)

    Mes = MesF
} else {
    DiaF

    Mes
}

if (MesF > 12) {
    año = AñoF

    MesF = 1
}

String FechaI = (((Dia + '/') + MesN) + '/') + AñoN

String FechaF = (((DiaF + '/') + Mes) + '/') + Año

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_CostoEvento'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_SALON 1'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_TEST FB_form_costoEventolistaCostoEvento0j_idt663'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar Eliminar -1'))
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_02112021'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_02112021'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'), 
            1)) {
            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'))

            WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar_eliminar'))
        }
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/span_Fecha Inscripcin_ui-icon ui-icon-closethick'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Registro'))

    if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_MAR-MIE 0500-0600'), 1)) {
        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Boto borrar'))

        WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar Eliminar 0'))

        WebUI.delay(2)
    }
    
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar2'))
}

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S-SH'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/td_Prueba-S-SH'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aceptar2'))
}

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --aprea de Saludrea Formativarea Deportivarea de cienciasrea Social'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Promocin y prevencinActivate Acompaamiento psicosocial Semana de la SaludSeguimiento puestos de trabajo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Evento grupo Bienestar MultipleEvento Grupo Bienestar Multiple SIEvento Grupo Bienestar nicoEvento Individual Multiple SS'), 
    5)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'), 0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 'Prueba-S')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inicial Desarrollo_formEventosfechaIn_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Final Desarrollo_formEventosfechaFin_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cdigo_popupMomentoEvento_formcodigo'), '355682169')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_popupMomentoEvento_formpMENombre'), 
    'prueba')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --ESCENARIO DE PRUEBASALON 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --FemeninaMasculinaMixta'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Nivel BsicoNivel IntermedionicoNivel Avanzado'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Mximo_popupMomentoEvento_formpMECupoMaximo'), 
    '150')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Minimo_popupMomentoEvento_formpMECupoMinimo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --CanceladoProgramada'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar1'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Regresar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --aprea de Saludrea Formativarea Deportivarea de cienciasrea Social'), 
    5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Promocin y prevencinActivate Acompaamiento psicosocial Semana de la SaludSeguimiento puestos de trabajo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Evento grupo Bienestar MultipleEvento Grupo Bienestar Multiple SIEvento Grupo Bienestar nicoEvento Individual Multiple SS'), 
    2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_formEventosfENombre'), 'Prueba-S-SH')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inicial Desarrollo_formEventosfechaIn_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Final Desarrollo_formEventosfechaFin_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cdigo_popupMomentoEvento_formcodigo'), '355682169')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Nombre_popupMomentoEvento_formpMENombre'), 
    'prueba-S-SH')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --ESCENARIO DE PRUEBASALON 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --FemeninaMasculinaMixta'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Nivel BsicoNivel IntermedionicoNivel Avanzado'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Mximo_popupMomentoEvento_formpMECupoMaximo'), 
    '150')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Cupo Minimo_popupMomentoEvento_formpMECupoMinimo'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --Canizalez Acero Marta BrigitteMendoza 1010 Empleado'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/select_-- Seleccione --CanceladoProgramada'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Guardar1'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_Regresar'))

