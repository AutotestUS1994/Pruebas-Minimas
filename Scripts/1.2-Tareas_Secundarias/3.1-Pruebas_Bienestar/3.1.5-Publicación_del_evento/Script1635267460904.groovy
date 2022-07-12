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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.cli.Main as Main
import groovy.inspect.swingui.ObjectBrowser as ObjectBrowser
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import sun.corba.Bridge as Bridge
import sun.util.resources.CalendarData as CalendarData
import org.eclipse.osgi.internal.framework.SystemBundleActivator as SystemBundleActivator
import org.openqa.selenium.Keys as Keys
import java.util.Date as Date
import javax.lang.model.element.VariableElement as VariableElement
import javax.wsdl.Import as Import
import java.util.Calendar as Calendar
import java.lang.reflect.Array as Array
import java.time.LocalDateTime as LocalDateTime
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

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

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_Prueba-S'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_Publicacin'))

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_Si'))
}

//String creado para redireccionar  los archivos requeridos por el test//
String ruta = Systema() + 'logo_union_soluciones.jpg'

WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1archivo_input'), 
    ruta)

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'), 
    0)

String Imagen = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/div_Contenido_ql-editor ql-blank'), 
    Imagen)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/div_Contenido_ui-editor-button'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input'), Imagen)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/submit'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Fecha Publicacin_form_publicacionEventofechaInicialPub_input'), 
    FechaI)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Fecha Final_form_publicacionEventofechaFinalPub_input'), 
    FechaF)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Evento Bienestar_form_templatej_idt24_input'), 
    'inscripcion evento')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/li_Inscripcion Evento (bie)'))

String Es10 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio1'))

if (Es10 == Imagen) {
    String Prueba10 = 'PRUEBA OK'
} else {
    String Es20 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio2'))

    if (Es20 == Imagen) {
        String Prueba20 = 'PRUEBA OK'
    } else {
        String Es30 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio3'))

        if (Es30 == Imagen) {
            String Prueba30 = 'PRUEBA OK'
        } else {
            String Es40 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio4'))

            if (Es40 == Imagen) {
                String Prueba40 = 'PRUEBA OK'
            } else {
                String Es50 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio5'))

                if (Es50 == Imagen) {
                    String Prueba50 = 'PRUEBA OK'
                } else {
                    WebUI.acceptAlert()
                }
            }
        }
    }
}

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_Prueba-S-SH'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_Publicacin'))

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab_form_publicacionEventotabla10j_idt241'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_un_Evento/a_http192.168.2.808380sarawebrepodocrecursosuid1b4c2139c049d55efdb2cd1490277527_form_publicacionEventotabla10j_idt245'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_Si'))
}

//String creado para redireccionar  los archivos requeridos por el test//
String ra = ''
String ruta2 = Systema(ra) + 'saraapp.png'
println(ruta2)
WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1archivo_input'), 
    ruta2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Choose_form_publicacionEventotabla1subir'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'), 
    0)

String Imagen2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/span_httplocalhost8380sarawebrepodocrecursosuid9dc2ce980076ceb250408bf7ce50f4ab'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/div_Contenido_ql-editor ql-blank'), 
    Imagen2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/div_Contenido_ui-editor-button'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input'), Imagen2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/submit'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Fecha Publicacin_form_publicacionEventofechaInicialPub_input'), 
    FechaI)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Fecha Final_form_publicacionEventofechaFinalPub_input'), 
    FechaF)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/a_Actualizar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/input_Evento Bienestar_form_templatej_idt24_input'), 
    'inscripcion evento')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/li_Inscripcion Evento (bie)'))

String Es1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio1'))

if (Es1 == Imagen2) {
    String Prueba1 = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    String Es2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio2'))

    if (Es2 == Imagen2) {
        String Prueba2 = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        String Es3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio3'))

        if (Es3 == Imagen2) {
            String Prueba3 = 'PRUEBA OK'

            WebUI.closeBrowser()
        } else {
            String Es4 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio4'))

            if (Es4 == Imagen2) {
                String Prueba4 = 'PRUEBA OK'

                WebUI.closeBrowser()
            } else {
                String Es5 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Publicación del evento/td_espacio5'))

                if (Es5 == Imagen2) {
                    String Prueba5 = 'PRUEBA OK'

                    WebUI.closeBrowser()
                } else {
                    WebUI.acceptAlert()
                }
            }
        }
    }
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
