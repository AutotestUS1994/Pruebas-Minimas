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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Empresa 1_form_templatej_idt24_input'), 
    'importar fuente general')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/li_fuente general (gna)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    'Creación prestamos')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/td_Creacin Prestamos'))
String ra = ''
String ruta = Systema() + 'carguePrestamo.txt'

WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Cargar_formImportarFuentetabarchivo_input'), 
    ruta)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/a_Importar'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Ejecutar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

String Result = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/mensaje'))

if (Result == '') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Regresar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/td_Creacin Prestamos'))

    String ruta1 = Systema() + 'carguePrestamo1.txt'

    WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Cargar_formImportarFuentetabarchivo_input'), 
        ruta1)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/a_Importar'))

    WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'), 
        0)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Ejecutar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

    String Result1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/mensaje'))

    if (Result1 == '') {
        String Resultado = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Empresa 1_form_templatej_idt24_input'), 
            'Liquidacion Nomina (com)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/li_fuente general (gna)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Periodo Nomina_LiquidacionNominaj_idt68'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
            2)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/td_P. MensualJulio2021'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Nombre Persona_LiquidacionNominaj_idt124'), 
            '1026588953')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Nombre Persona_LiquidacionNominaj_idt124'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/td_Aya Silva Cindy Ximena'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Concepto'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Reversar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/span_Si'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Empresa 1_form_templatej_idt24_input'), 
            'Listado de Empleados (com)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/li_fuente general (gna)'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
            '1026588953')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/span_Aya Silva Cindy Ximena'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Liquidacin Periodica'))

        while(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/span_Prestamo Compaa'), 
            1)) {

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/span_Prestamo Compaa'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_ReversarEliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Aceptar'))
        }
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/input_Empresa 1_form_templatej_idt24_input'), 
            'importar fuente general')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/li_fuente general (gna)'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
            'Creación prestamos')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/td_Creacin Prestamos'))

        String ruta2 = Systema() + 'carguePrestamo1.txt'

        WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Cargar_formImportarFuentetabarchivo_input'), 
            ruta2)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/a_Importar'))

        WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'), 
            0)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Ejecutar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/a_Continuar'))

        String Result2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Fuente_General/mensaje'))

        if (Result2 == '') {
            String Resultado = 'PRUEBA OK'

            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
}
def Systema(ra) {
	String RutaA = System.getProperty('os.name')
	println(RutaA)
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
