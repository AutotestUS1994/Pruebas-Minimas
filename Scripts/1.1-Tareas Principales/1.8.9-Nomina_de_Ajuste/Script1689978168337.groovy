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

String periodo = ''

String periodoN = ''

int numeroP

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/transmision nomina electronica mi planilla/login_transimision_nomina_electronica'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
    'Mantenimiento Periodo Nomina (com)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Mantenimiento Pe'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_NOMINA MENSUAL'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Generar0'))

periodo = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Periodo Nomina'))

periodoN = periodo.substring(2)

println(periodoN)

numeroP = (Integer.parseInt(periodoN) - 1)

periodo = ('M' + numeroP)

println(periodo)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Modo_ui-icon ui-icon-closethick'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
    'Listado de Empleados')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Mantenimiento Pe'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '995511446')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_Serrano Diana Marcela'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/div_Historicos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Nomina en Proceso'))

String periodo1 

String periodo2

String periodo3

String periodo4

String periodo5

String periodo6

String periodo7

String periodo8 

String periodo9

String periodo10
println(periodo)

clic(periodo, periodo1,periodo2,periodo3,periodo4,periodo5,periodo6,periodo7,periodo8,periodo9,periodo10)



if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Fuera Nomina Concepto'),
	 1)
	) {
	WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Fuera Nomina Concepto'))
	} 

else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_2'))

	clic(periodo, periodo1,periodo2,periodo3,periodo4,periodo5,periodo6,periodo7,periodo8,periodo9,periodo10)
	
	

}


WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Fuera Nomina Concepto'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/td_100'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/td_100'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Eliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_Si'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_mensaje'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_cerrar_mensaje'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_cerrar_concepto'))
    }
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_523 - Copy'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_523 - Copy'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Eliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_Si'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_mensaje'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_cerrar_mensaje'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_cerrar_concepto'))
    }
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Nuevo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Concepto_popupNuevoConceptoHistoricoNominaj_idt2297'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Concepto_formPopupConceptofiltroconcepto'), 
    '100')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Concepto_formPopupConceptofiltroconcepto'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_1100'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Valor_popupNuevoConceptoHistoricoNominaj_idt2300'), 
    '6000000')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Base_popupNuevoConceptoHistoricoNominaj_idt2302'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Guardar Concepto'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Nuevo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Concepto_popupNuevoConceptoHistoricoNominaj_idt2297'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Concepto_formPopupConceptofiltroconcepto'), 
    '523')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Concepto_formPopupConceptofiltroconcepto'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_523'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_523'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Valor_popupNuevoConceptoHistoricoNominaj_idt2300'), 
    '6000000')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_Base_popupNuevoConceptoHistoricoNominaj_idt2302'), 
    '2')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Guardar Concepto'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
    'Nomina Electronica (com)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Mantenimiento Pe'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --Nmina IndividualNmina Individual de Ajuste'), 
    2)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --ProduccinPruebas'), 
    1)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_BOGOTACUNDINAMARCANo UsarSANTANDER'), 
    1)

if (periodo == 'M2301') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        1)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/01/2023')
} else if (periodo == 'M2302') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/02/2023')
} else if (periodo == 'M2303') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        3)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/03/2023')
} else if (periodo == 'M2304') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        4)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/04/2023')
} else if (periodo == 'M2305') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        5)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/05/2023')
} else if (periodo == 'M2306') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        6)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/06/2023')
} else if (periodo == 'M2307') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        7)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/07/2023')
} else if (periodo == 'M2308') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        8)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/08/2023')
} else if (periodo == 'M2309') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        9)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/09/2023')
} else if (periodo == 'M2310') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        10)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/10/2023')
} else if (periodo == 'M2311') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        11)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/11/2023')
} else if (periodo == 'M23012') {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
        12)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
        '01/12/2023')
} else {
    println(periodo)

    WebUI.acceptAlert()
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Guardar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Nuevo Ajuste'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/input_popup_nomina'), 
    '')

String identidad = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_995511446'))

if (identidad == '995511446') {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/div_Nombre_ui-chkbox-box'))
} else {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Aplicar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Generar2'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_GenerarButton'))

String estado0 = ''

estado0 = obtenerEstado()

if (estado0 != 'Generado Sin Transmitir') {
    WebUI.acceptAlert()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Si0'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))



    estado1 = obtenerEstado()

    while (((estado1 != 'Transmitido') && (i <= 3)) && i++) {
        WebUI.delay(90)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

        estado1 = obtenerEstado()
    }
    
    estadoFinal = obtenerEstado()

    println(estadoFinal)

    if (estadoFinal == 'Transmision satisfactoria') {
        String Resultado = 'Prueba ok'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

def obtenerEstado() {
    String estado0 = ''

    Boolean option1 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option1'), 
        'selected')

    Boolean option2 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option2'), 
        'selected')

    Boolean option3 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option3'), 
        'selected')

    Boolean option4 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option4'), 
        'selected')

    Boolean option5 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option5'), 
        'selected')

    Boolean option6 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option6'), 
        'selected')

    Boolean option7 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option7'), 
        'selected')

    Boolean option8 = WebUI.getAttribute(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option8'), 
        'selected')

    println(option1)

    println(option2)

    println(option3)

    println(option4)

    println(option5)

    println(option6)

    println(option7)

    println(option8)

    switch ((((((((option1 != true) || (option2 != true)) || (option3 != true)) || (option4 != true)) || (option5 != true)) || 
    (option6 != true)) || (option7 != true)) || ((option8 != true) && println(((((((((option1 + option2) + option3) + option4) + 
        option5) + option6) + option5) + option6) + option7) + option8))) {
        case option1 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option1'))

            break
        case option2 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option2'))

            break
        case option3 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option3'))

            break
        case option4 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option4'))

            break
        case option5 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option5'))

            break
        case option6 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option6'))

            break
        case option7 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option7'))

            break
        case option8 == true:
            estado0 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/option8'))

            break
        default:
            WebUI.acceptAlert()

            break
    }
    
    return estado0
}
def clic(periodo, periodo1,periodo2,periodo3,periodo4,periodo5,periodo6,periodo7,periodo8,periodo9,periodo10){
		
	println(periodo)
	
	if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'),
		1)) {
	 periodo1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
	}
	
	if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'),
		1)) {
	 periodo2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
	}
	
	if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'),
		1)) {
	 periodo3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
	}
		
	if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'),
		1)) {
	 periodo4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'),
		1)) {
	 periodo5 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'),
		1)) {
	 periodo6 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'),
		1)) {
	 periodo7 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'),
		1)) {
	 periodo8 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'),
		1)) {
	 periodo9 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
	}
	 if(WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'),
		1)) {
	 periodo10 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
	}
	

	if(periodo == 'M2301') {
		if(periodo1 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202301') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo =='M2302') {
		if(periodo1 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202302') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo== 'M2303'){

	if(periodo1 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
	else if(periodo2 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
	else if(periodo3 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
	else if(periodo4 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
	else if(periodo5 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
	else if(periodo6 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
	else if(periodo7 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
	else if(periodo8 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
	else if(periodo9 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
	else if(periodo10 =='M202303') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo== 'M2304') {
		if(periodo1 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202304') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo == 'M2305') {
		if(periodo1 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202305') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if (periodo == 'M2306') {
		if(periodo1 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202306') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo == 'M2307') {
		if(periodo1 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202307') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo == 'M2308') {
		if(periodo1 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202308') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo == 'M2309') {
		if(periodo1 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202309') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	else if(periodo == 'M2310') {
		if(periodo1 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))}
		else if(periodo2 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))}
		else if(periodo3 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))}
		else if(periodo4 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))}
		else if(periodo5 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))}
		else if(periodo6 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))}
		else if(periodo7 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))}
		else if(periodo8 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))}
		else if(periodo9 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))}
		else if(periodo10 =='M202310') {WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))}
	}
	println(periodo1)
	println(periodo2)
	println(periodo3)
	println(periodo4)
	println(periodo5)
	println(periodo6)
	println(periodo7)
	println(periodo8)
	println(periodo9)
	println(periodo10)

}
