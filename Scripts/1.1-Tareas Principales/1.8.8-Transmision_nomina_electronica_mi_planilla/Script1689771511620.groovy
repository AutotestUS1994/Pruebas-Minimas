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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.testng.Assert as Assert
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.support.ui.Select as Select

String identificador = GlobalVariable.G_Identificador

String periodo = ''

String banco1 = ''

String banco2 = ''

String banco3 = ''

String banco4 = ''

String banco5 = ''

String banco6 = ''

String banco7 = ''

String banco8 = ''

String banco9 = ''

String banco10 = ''

String banco11 = ''

String banco12 = ''

String banco13 = ''

String banco14 = ''

String banco15 = ''

String banco16 = ''

String banco17 = ''

String banco18 = ''

String banco19 = ''

String estado0 = ''

String estado1 = ''

String estadoFinal = ''

String estado3 = ''

String fecha = ''

String fechanueva = ''

Number i = 1

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/transmision nomina electronica mi planilla/login_transimision_nomina_electronica'), 
    [:], FailureHandling.STOP_ON_FAILURE)

if (identificador != 'wildfly') {
    WebUI.closeBrowser()
} else {
    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
        'Mantenimiento Periodo Nomina (com)')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Mantenimiento Pe'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_NOMINA MENSUAL'))

    fecha = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_fechaFinal'))

    SimpleDateFormat formato = new SimpleDateFormat('dd/MM/yyyy')

    Date fechaDate = formato.parse(fecha)

    int dia = fechaDate.getDate()

    int mes = fechaDate.getMonth() + 1

    int anio = fechaDate.getYear() + 1900

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Generar0'))

    periodo = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/td_30042023_0'))
    int mesperiodo = Integer.valueOf(periodo.substring(3, 5));
	println(mesperiodo) 
    if (mesperiodo == 12) {
        WebUI.acceptAlert()
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/td_30042023_0'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Generar1'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Liquidacin0'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_menu'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_menu'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Reclculo Total'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Si0'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_ContinuarRT'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
            'Generacion Entidad Pago (com)')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/li_Generacion Entidad Pago (com)'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Traer'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/label_Periodo Proceso'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/td_30042023_1'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Aplicar0'))
        //TODO : INICIO OPTIMIZAR CODIGO 
        banco1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_1'))

        banco2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_2'))

        banco3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_3'))

        banco4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_4'))

        banco5 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_5'))

        banco6 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_6'))

        banco7 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_7'))

        banco8 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_8'))

        banco9 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_9'))

        banco10 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_10'))

        banco11 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_11'))

        banco12 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_12'))

        banco13 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_13'))

        banco14 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_14'))

        banco15 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_15'))

        banco16 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_16'))

        banco17 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_17'))

        banco18 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_18'))

        banco19 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/span_Banco De Bogota_19'))

        switch ((((((((((((((((((banco1 || banco2) || banco3) || banco4) || banco5) || banco6) || banco7) || banco8) || 
        banco9) || banco10) || banco11) || banco12) || banco13) || banco14) || banco15) || banco16) || banco17) || banco18) || 
        banco19) {
            case banco1 == 'Banco de Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_1'))

                break
            case banco2 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_2'))

                break
            case banco3 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_3'))

                break
            case banco4 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_4'))

                break
            case banco5 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_5'))

                break
            case banco6 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_6'))

                break
            case banco7 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_7'))

                break
            case banco8 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_8'))

                break
            case banco9 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_9'))

                break
            case banco10 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_10'))

                break
            case banco11 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_11'))

                break
            case banco12 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_12'))

                break
            case banco13 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_13'))

                break
            case banco14 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_14'))

                break
            case banco15 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_15'))

                break
            case banco16 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_16'))

                break
            case banco17 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_17'))

                break
            case banco18 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_18'))

                break
            case banco19 == 'Banco De Bogota':
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/banco/div_Bogota_19'))

                break
            default:
                WebUI.acceptAlert()

                break
        }
        //TODO: FIN OPTIMIZAR CODIGO
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Liquidar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/label_Definitiva'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Aplicar1'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_ContinuarLiqui'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
            0)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
            'Nomina Electronica (com)')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/li_Nomina Electronica (com)'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Nuevo'))

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --Nmina IndividualNmina Individual de Ajuste'), 
            1, FailureHandling.STOP_ON_FAILURE)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --ProduccinPruebas'), 
            1)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_BOGOTACUNDINAMARCANo UsarSANTANDER'), 
            1)

        println(mesperiodo)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
                    mesperiodo)

     
        
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Guardar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Generar2'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_GenerarButton'))

        estado0 = obtenerEstado()

        println(estado0)

        if (estado0 != 'E' ) { //'Generado Sin Transmitir'
            WebUI.acceptAlert()

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))
        } else {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Si0'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

            estado1 = obtenerEstado()

            while ((!estado1.equals("T") && i <= 6) && i++) { //Transmision satisfactoria
                estado1 = obtenerEstado()

                estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))

                if (estado1.equals("T") && estado3.equals("Transmision satisfactoria")) {
                    break
                } else {
                    WebUI.delay(60)

                    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

                    estado1 = obtenerEstado()
                    
					estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))
                }
            }
            
            estadoFinal = obtenerEstado()

            println(estadoFinal)

            if (estadoFinal.equals("T") && estado3.equals("Transmision satisfactoria")) {
                String Resultado = 'Prueba ok'

                WebUI.takeScreenshot()
            } else {
                WebUI.acceptAlert()
            }
        }
    }
}

def obtenerEstado() {
    

	//El bloque de codigo que estaba sobra. el objetivo es obtener la opcion seleccionada de la lista
	//<select > con id que contenga la palabra "estado".  Obtener el texto y evaluar que sea "Transmision satisfactoria"
   
	TestObject selectEstado = findTestObject("1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Select_Estado_NE")
	 String estadoEncabezado=  WebUI.getAttribute(selectEstado,'value')
	 println(estadoEncabezado)	 
    return estadoEncabezado
}

