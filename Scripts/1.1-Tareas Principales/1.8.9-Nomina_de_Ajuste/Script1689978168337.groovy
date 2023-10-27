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

String identificador= GlobalVariable.G_Identificador


String periodo = ''

String periodoN = ''

String periodoNE = ''

String Mes1

String Mes2

String Mes3

String Mes4

String Mes5

String Mes6

String Mes7

String Mes8

String Mes9

String Mes10

String estado3

int numeroP



WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/transmision nomina electronica mi planilla/login_transimision_nomina_electronica'), 
    [:], FailureHandling.STOP_ON_FAILURE)

if(identificador != 'wildfly'){
	
	WebUI.closeBrowser()
}
else {
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

switch (periodo) {
    case periodo = 'M2301':
        periodoNE = '2023-01'

        break
    case periodo = 'M2302':
        periodoNE = '2023-02'

        break
    case periodo = 'M2303':
        periodoNE = '2023-03'

        break
    case periodo = 'M2304':
        periodoNE = '2023-04'

        break
    case periodo = 'M2305':
        periodoNE = '2023-05'

        break
    case periodo = 'M2306':
        periodoNE = '2023-06'

        break
    case periodo = 'M2307':
        periodoNE = '2023-07'

        break
    case periodo = 'M2308':
        periodoNE = '2023-08'

        break
    case periodo = 'M2309':
        periodoNE = '2023-09'

        break
    case periodo = 'M2310':
        periodoNE = '2023-10'

        break
    case periodo = 'M2311':
        periodoNE = '2023-11'

        break
    case periodo = 'M2312':
        periodoNE = '2023-12'

        break
    default:
        println(periodo)}

println(periodoNE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Modo_ui-icon ui-icon-closethick'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Mi Planilla - Pruebas Nmina Elect_form_templatej_idt24_input'), 
    'Nomina Electronica (com)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Mantenimiento Pe'))

mesDetec(periodo, periodoN, periodoNE, numeroP, Mes1, Mes2, Mes3, Mes4, Mes5, Mes6, Mes7, Mes8, Mes9, Mes10)

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

clic(periodo, periodoNE, periodo1, periodo2, periodo3, periodo4, periodo5, periodo6, periodo7, periodo8, periodo9, periodo10)

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Fuera Nomina Concepto'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_Fuera Nomina Concepto'))
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/a_2'))

    clic(periodo, periodoNE, periodo1, periodo2, periodo3, periodo4, periodo5, periodo6, periodo7, periodo8, periodo9, periodo10)
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

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 1)) {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.8.8-Transmision_nomina_electronica_mi_planilla'), [:], FailureHandling.STOP_ON_FAILURE)

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
        periodo = 'M2302'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            2)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/02/2023')
    } else if (periodo == 'M2302') {
        periodo = 'M2303'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            3)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/03/2023')
    } else if (periodo == 'M2303') {
        periodo = 'M2304'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            4)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/04/2023')
    } else if (periodo == 'M2304') {
        periodo = 'M2305'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            5)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/05/2023')
    } else if (periodo == 'M2305') {
        periodo = 'M2306'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            6)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/06/2023')
    } else if (periodo == 'M2306') {
        periodo = 'M2307'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            7)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/07/2023')
    } else if (periodo == 'M2307') {
        periodo = 'M2308'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            8)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/08/2023')
    } else if (periodo == 'M2308') {
        periodo = 'M2309'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            9)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/09/2023')
    } else if (periodo == 'M2309') {
        periodo = 'M2310'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            10)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/10/2023')
    } else if (periodo == 'M2310') {
        periodo = 'M2311'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            11)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/11/2023')
    } else if (periodo == 'M2311') {
        periodo = 'M2312'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            12)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/12/2023')
    } else if (periodo == 'M23012') {
        periodo = 'M2302'

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulio'), 
            2)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/input_Fecha Liquidacion'), 
            '01/02/2023')
    } else {
        println(periodo)

        WebUI.acceptAlert()
    }
    
    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Guardar'))
}

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

println(estado0)

if (estado0 != 'E' ) {
	WebUI.acceptAlert()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Transmitir'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Si0'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

    estado1 = obtenerEstado()

    Number i = 0

    while ((!estado1.equals("T") && i <= 6)) { //Transmision satisfactoria
		
		estado1 = obtenerEstado()		
		
		estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))
		println(estado1)
		
		if(estado1.equals("T") && estado3.equals("Transmision satisfactoria")) {
			break
		}else {
		
        WebUI.delay(60)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

        estado1 = obtenerEstado()
		
		estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))
		}
        i++
    }
    
    estadoFinal = obtenerEstado()

    println(estadoFinal)

    if (estadoFinal.equals("T") && estado3.equals("Transmision satisfactoria")) {
        String Resultado = 'Prueba ok'

        WebUI.takeScreenshot()
    } else if (estadoFinal.equals("P") || estadoFinal == 'Proceso validacion del operador') {
        Number j = 0

        println(estadoFinal)

        while ((!estadoFinal.equals("T") || (estadoFinal != 'Transmision satisfactoria') && (j <= 3)) && j++) {
            
			estadoFinal = obtenerEstado()
			
			estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))
			
			println(estadoFinal)
			if(estadoFinal == 'T' && estado3 == 'Transmision satisfactoria') {
				break
			}
			else {
			WebUI.delay(120)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/a_Resumen'))

            estadoFinal = obtenerEstado()
			
			estado3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/span_Valor_ campo_none'))
			}
        }
        
        if (estadoFinal == 'T' && estado3=='Transmision satisfactoria') {
            Resultado = 'Prueba ok'

            WebUI.takeScreenshot()
        } else {
            WebUI.acceptAlert()
        }
    } else {
        WebUI.acceptAlert()
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

def clic(def periodo, def periodoNE, def periodo1, def periodo2, def periodo3, def periodo4, def periodo5, def periodo6, def periodo7, def periodo8, def periodo9, def periodo10) {
    println(periodo)

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'), 
        1)) {
        periodo1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'), 
        1)) {
        periodo2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'), 
        1)) {
        periodo3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'), 
        1)) {
        periodo4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'), 
        1)) {
        periodo5 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'), 
        1)) {
        periodo6 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'), 
        1)) {
        periodo7 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'), 
        1)) {
        periodo8 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'), 
        1)) {
        periodo9 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'), 
        1)) {
        periodo10 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
    }
    
    if (periodo == 'M2301') {
        if (periodo1 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202301') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2302') {
        if (periodo1 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202302') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2303') {
        if (periodo1 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202303') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2304') {
        if (periodo1 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202304') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2305') {
        if (periodo1 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202305') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2306') {
        if (periodo1 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202306') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2307') {
        if (periodo1 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202307') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2308') {
        if (periodo1 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202308') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2309') {
        if (periodo1 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202309') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    } else if (periodo == 'M2310') {
        if (periodo1 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202301'))
        } else if (periodo2 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202302'))
        } else if (periodo3 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202303'))
        } else if (periodo4 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202304'))
        } else if (periodo5 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202305'))
        } else if (periodo6 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202306'))
        } else if (periodo7 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202307'))
        } else if (periodo8 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202308'))
        } else if (periodo9 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202309'))
        } else if (periodo10 == 'M202310') {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Nomina_de_ajuste/span_M202310'))
        }
    }
    
    switch (periodo) {
        case periodo = 'M2301':
            periodoNE = '2023-01'

            break
        case periodo = 'M2302':
            periodoNE = '2023-02'

            break
        case periodo = 'M2303':
            periodoNE = '2023-03'

            break
        case periodo = 'M2304':
            periodoNE = '2023-04'

            break
        case periodo = 'M2305':
            periodoNE = '2023-05'

            break
        case periodo = 'M2306':
            periodoNE = '2023-06'

            break
        case periodo = 'M2307':
            periodoNE = '2023-07'

            break
        case periodo = 'M2308':
            periodoNE = '2023-08'

            break
        case periodo = 'M2309':
            periodoNE = '2023-09'

            break
        case periodo = 'M2310':
            periodoNE = '2023-10'

            break
        case periodo = 'M2311':
            periodoNE = '2023-11'

            break
        case periodo = 'M2312':
            periodoNE = '2023-12'

            break
        default:
            println(periodo)}
    
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

def mesDetec(def periodo, def periodoN, def periodoNE, def numeroP, def Mes1, def Mes2, def Mes3, def Mes4, def Mes5, def Mes6, def Mes7, def Mes8, def Mes9, def Mes10) {
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes1'), 
        1)) {
        Mes1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes1'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes2'), 
        1)) {
        Mes2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes2'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes3'), 
        1)) {
        Mes3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes3'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes4'), 
        1)) {
        Mes4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes4'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes5'), 
        1)) {
        Mes5 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes5'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes6'), 
        1)) {
        Mes6 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes6'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes7'), 
        1)) {
        Mes7 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes7'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes8'), 
        1)) {
        Mes8 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes8'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes9'), 
        1)) {
        Mes9 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes9'))
    } else if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes10'), 
        1)) {
        Mes10 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/transmision nomina electronica mi planilla/Mes_NM/td_mes10'))
    } else {
        WebUI.acceptAlert()
    }
    
    println(periodo)

    if (((((((((((((Mes1 == '2023-01') && (periodo == 'M2301')) || ((Mes1 == '2023-02') && (periodo == 'M2302'))) || ((Mes1 == 
    '2023-03') && (periodo == 'M2303'))) || ((Mes1 == '2023-04') && (periodo == 'M2304'))) || ((Mes1 == '2023-05') && (periodo == 
    'M2305'))) || ((Mes1 == '2023-06') && (periodo == 'M2306'))) || ((Mes1 == '2023-07') && (periodo == 'M2307'))) || ((Mes1 == 
    '2023-08') && (periodo == 'M2308'))) || ((Mes1 == '2023-09') && (periodo == 'M2309'))) || ((Mes1 == '2023-10') && (periodo == 
    'M23010'))) || ((Mes1 == '2023-11') && (periodo == 'M2311'))) || ((Mes1 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes2 == '2023-01') && (periodo == 'M2301')) || ((Mes2 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes2 == '2023-03') && (periodo == 'M2303'))) || ((Mes2 == '2023-04') && (periodo == 'M2304'))) || ((Mes2 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes2 == '2023-06') && (periodo == 'M2306'))) || ((Mes2 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes2 == '2023-08') && (periodo == 'M2308'))) || ((Mes2 == '2023-09') && (periodo == 'M2309'))) || ((Mes2 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes2 == '2023-11') && (periodo == 'M2311'))) || ((Mes2 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes3 == '2023-01') && (periodo == 'M2301')) || ((Mes3 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes3 == '2023-03') && (periodo == 'M2303'))) || ((Mes3 == '2023-04') && (periodo == 'M2304'))) || ((Mes3 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes3 == '2023-06') && (periodo == 'M2306'))) || ((Mes3 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes3 == '2023-08') && (periodo == 'M2308'))) || ((Mes3 == '2023-09') && (periodo == 'M2309'))) || ((Mes3 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes3 == '2023-11') && (periodo == 'M2311'))) || ((Mes3 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes4 == '2023-01') && (periodo == 'M2301')) || ((Mes4 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes4 == '2023-03') && (periodo == 'M2303'))) || ((Mes4 == '2023-04') && (periodo == 'M2304'))) || ((Mes4 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes4 == '2023-06') && (periodo == 'M2306'))) || ((Mes4 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes4 == '2023-08') && (periodo == 'M2308'))) || ((Mes4 == '2023-09') && (periodo == 'M2309'))) || ((Mes4 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes4 == '2023-11') && (periodo == 'M2311'))) || ((Mes4 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes5 == '2023-01') && (periodo == 'M2301')) || ((Mes5 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes5 == '2023-03') && (periodo == 'M2303'))) || ((Mes5 == '2023-04') && (periodo == 'M2304'))) || ((Mes5 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes5 == '2023-06') && (periodo == 'M2306'))) || ((Mes5 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes5 == '2023-08') && (periodo == 'M2308'))) || ((Mes5 == '2023-09') && (periodo == 'M2309'))) || ((Mes5 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes5 == '2023-11') && (periodo == 'M2311'))) || ((Mes5 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes6 == '2023-01') && (periodo == 'M2301')) || ((Mes6 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes6 == '2023-03') && (periodo == 'M2303'))) || ((Mes6 == '2023-04') && (periodo == 'M2304'))) || ((Mes6 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes6 == '2023-06') && (periodo == 'M2306'))) || ((Mes6 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes6 == '2023-08') && (periodo == 'M2308'))) || ((Mes6 == '2023-09') && (periodo == 'M2309'))) || ((Mes6 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes6 == '2023-11') && (periodo == 'M2311'))) || ((Mes6 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes7 == '2023-01') && (periodo == 'M2301')) || ((Mes7 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes7 == '2023-03') && (periodo == 'M2303'))) || ((Mes7 == '2023-04') && (periodo == 'M2304'))) || ((Mes7 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes7 == '2023-06') && (periodo == 'M2306'))) || ((Mes7 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes7 == '2023-08') && (periodo == 'M2308'))) || ((Mes7 == '2023-09') && (periodo == 'M2309'))) || ((Mes7 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes7 == '2023-11') && (periodo == 'M2311'))) || ((Mes7 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes8 == '2023-01') && (periodo == 'M2301')) || ((Mes8 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes8 == '2023-03') && (periodo == 'M2303'))) || ((Mes8 == '2023-04') && (periodo == 'M2304'))) || ((Mes8 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes8 == '2023-06') && (periodo == 'M2306'))) || ((Mes8 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes8 == '2023-08') && (periodo == 'M2308'))) || ((Mes8 == '2023-09') && (periodo == 'M2309'))) || ((Mes8 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes8 == '2023-11') && (periodo == 'M2311'))) || ((Mes8 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes9 == '2023-01') && (periodo == 'M2301')) || ((Mes9 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes9 == '2023-03') && (periodo == 'M2303'))) || ((Mes9 == '2023-04') && (periodo == 'M2304'))) || ((Mes9 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes9 == '2023-06') && (periodo == 'M2306'))) || ((Mes9 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes9 == '2023-08') && (periodo == 'M2308'))) || ((Mes9 == '2023-09') && (periodo == 'M2309'))) || ((Mes9 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes9 == '2023-11') && (periodo == 'M2311'))) || ((Mes9 == '2023-12') && (periodo == 'M2312'))) {
    } else if (((((((((((((Mes10 == '2023-01') && (periodo == 'M2301')) || ((Mes10 == '2023-02') && (periodo == 'M2302'))) || 
    ((Mes10 == '2023-03') && (periodo == 'M2303'))) || ((Mes10 == '2023-04') && (periodo == 'M2304'))) || ((Mes10 == '2023-05') && 
    (periodo == 'M2305'))) || ((Mes10 == '2023-06') && (periodo == 'M2306'))) || ((Mes10 == '2023-07') && (periodo == 'M2307'))) || 
    ((Mes10 == '2023-08') && (periodo == 'M2308'))) || ((Mes10 == '2023-09') && (periodo == 'M2309'))) || ((Mes10 == '2023-10') && 
    (periodo == 'M23010'))) || ((Mes10 == '2023-11') && (periodo == 'M2311'))) || ((Mes10 == '2023-12') && (periodo == 'M2312'))) {
    } else {
        WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.8.8-Transmision_nomina_electronica_mi_planilla'), [:], 
            FailureHandling.STOP_ON_FAILURE)
    }
}

