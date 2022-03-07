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

WebUI.comment('No Ejecutar. Falla con imagen subida')

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

/*-----------------------------------------------------------------------------------------------*/
WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Publicacin'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/span_Si'))
}

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = GlobalVariable.G_rutaarchivos + 'logo_union_soluciones.jpg'

WebUI.uploadFile(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1archivo_input'), 
    ruta)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'), 
    0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.delay(2)

String Imagen = WebUI.getText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/div_Contenido_ql-editor ql-blank'), Imagen)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/div_Contenido_ui-editor-button'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input'), Imagen)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/submit'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Fecha Publicacin_form_publicacionEventofechaInicialPub_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Fecha Final_form_publicacionEventofechaFinalPub_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Evento Bienestar_form_templatej_idt24_input'), 
    'inscripcion evento')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/li_Inscripcion Evento (bie)'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Publicacin'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Crear_un_Evento/a_http192.168.2.808380sarawebrepodocrecursosuid1b4c2139c049d55efdb2cd1490277527_form_publicacionEventotabla10j_idt245'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/span_Si'))
}

//String creado para redireccionar  los archivos requeridos por el test//
String ruta2 = GlobalVariable.G_rutaarchivos + 'saraapp.png'

WebUI.uploadFile(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1archivo_input'), 
    ruta2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.delay(2)

String Imagen2 = WebUI.getText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/div_Contenido_ql-editor ql-blank'), Imagen2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/div_Contenido_ui-editor-button'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input'), Imagen2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/submit'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Fecha Publicacin_form_publicacionEventofechaInicialPub_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Fecha Final_form_publicacionEventofechaFinalPub_input'), 
    FechaF)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/input_Evento Bienestar_form_templatej_idt24_input'), 
    'inscripcion evento')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Publicación del evento/li_Inscripcion Evento (bie)'))

WebUI.delay(3)

WebUI.closeBrowser()

