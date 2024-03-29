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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos administrativos (act)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Acto cambio del Empleado'))

Eliminar()

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Acto cambio del Empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Nomina'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_cambio de sueldo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Elaborar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Contrato_form_actoCambioPuestoj_idt2043'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt1407'), 
    '185101')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt1407'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Mendoza Cabra Empleado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar0'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input__form_actoCambioPuestoj_idt33530fecha_input'), 
    '02/03/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Fecha Documento'), '02/03/2021')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Fecha Documento'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar1'))

String Salario = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
    'Value')

if (Salario == '689455.00') {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
        '2500000')
} else {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
        '689455')
}

String Salario0 = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
    'Value')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))

legalizar()

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado de Empleados (com)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    Keys.chord(Keys.F5))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    'Mendoza Cabra Empleado')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_185101'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Datos Empleado'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_1.300.000'), 0)

String Sueldo = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_1.300.000'))

String Vigencia = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Vigencia'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/div_Historicos'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Regresin'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_01012021'), 
    1)) {
    String firstResult = 'Resultado ok'
} else {
    WebUI.acceptAlert()
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
    'Generacion Regresion (com)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Tipo Periodo_j_idt61j_idt96'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/td_PM202106'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Contrato_j_idt61contrato'), 
    '185101')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Filtrar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Adicional_ui-chkbox-icon ui-icon ui-icon-check ui-c'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar3'), 
    0)

String SecondResult = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/div_Regresion aplicada satifactoriamente'))

if (SecondResult == 'Regresion aplicada satifactoriamente.') {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar3'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Imprimir'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Descargar'))

    WebUI.switchToWindowTitle('SARA')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/Clowse'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
        'Mantenimiento Regresion (com)')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/select_SeleccionePeriodo AbonadoPeriodo CerradoPeriodo en ProcesoPeriodo no Generado'), 
        3)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/div_Estado_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Reliquidacion'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar4'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Reversar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

    String ResultRev = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/td_No se encontr registros'), 
        2)) {
        /*------------------------------------Cambio de salario------------------------------------------------------------*/
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
            'Actos administrativos (act)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Acto cambio del Empleado'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Acto cambio del Empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Nomina'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_cambio de sueldo'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Elaborar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Contrato_form_actoCambioPuestoj_idt2043'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt1407'), 
            '185101')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt1407'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Mendoza Cabra Empleado'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar0'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input__form_actoCambioPuestoj_idt33530fecha_input'), 
            '01/01/2021')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Fecha Documento'), 
            '01/07/2021')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar1'))

        String Salario2 = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
            'Value')

        if (Salario2 == '1300000.00') {
            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
                '1400000')
        } else {
            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
                '1300000')
        }
        
        String Salario3 = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Sueldo_form_actoCambioPuestosueldo'), 
            'Value')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar2'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))

        legalizar()

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
            'Generacion Regresion (com)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Tipo Periodo_j_idt61j_idt96'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/td_PM202106'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Contrato_j_idt61contrato'), 
            '185101')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Filtrar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Adicional_ui-chkbox-icon ui-icon ui-icon-check ui-c'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

        WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar3'), 
            0)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar3'), FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/Clowse - Copy'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
            'Mantenimiento Regresion (com)')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/select_SeleccionePeriodo AbonadoPeriodo CerradoPeriodo en ProcesoPeriodo no Generado'), 
            3)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/td_Mendoza Cabra Empleado'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Reversar'))
    } else {
        WebUI.acceptAlert()
    }
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos Administrativos (act)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Acto cambio del Empleado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Acto cambio del Empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Nomina'))

while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_cambio de sueldo'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_cambio de sueldo'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Derogar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Contrato_form_popupSeleccionDerogarTrasladoj_idt373'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt896'), 
        '185101')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Filtro Empleado_form_popupEmpleadoj_idt896'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_185101_R'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Fecha Documento'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Fecha Documento'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/select_- No Relacionado1  - Cambio Datos Del Puesto10 - Ingreso Puesto Nuevo11_R'), 
            2)

        String fechaAumento = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input__form_actoIngresoj_idt9851fecha_input'), 
            FailureHandling.STOP_ON_FAILURE)

        if (fechaAumento == '') {
            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input__form_actoIngresoj_idt9851fecha_input'), 
                fecha())
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar_Regresion'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar_Regresion'))

        legalizar()

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Acto cambio del Empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Nomina'))
    } else {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Cerrar1'))

        break
    }
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado de Empleados (com)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Actos Administrativos (act)'))

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    Keys.chord(Keys.F5))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    'Mendoza Cabra Empleado')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Nombre Funcionario_listadoEmpleadoj_idt64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_185101'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Datos Empleado'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_1.300.000'), 0)

SueldoF = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_1.300.000'))

if ((SueldoF == '689.455') || (SueldoF == '2.500.000')) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/div_Historicos'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Regresin'))

    while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_ACTOS ADMINISTRATIVO'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_ACTOS ADMINISTRATIVO'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))

        if (WebUI.waitForElementNotVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_ACTOS ADMINISTRATIVO'), 
            1)) {
            break
        }
    }
} else {
    WebUI.acceptAlert()
}

if ((SueldoF == '689.455') || (SueldoF == '1.300.000')) {
    WebUI.closeBrowser()
}

def fecha() {
    Date today = new Date()

    String Dia = today.format('dd')

    String Mes = today.format('MM')

    String Año = today.format('yyyy')

    String fecha = (((Dia + '/') + Mes) + '/') + Año
}

def Eliminar() {
    String eliminar = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico'))

    String eliminar1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico1'))

    String eliminar2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico2'))

    String eliminar3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico3'))

    if (eliminar == 'Eliminar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar'))
    } else if (eliminar1 == 'Eliminar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar1'))
    } else if (eliminar2 == 'Eliminar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar2'))
    } else if (eliminar3 == 'Eliminar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar3'))
    }
    
    while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Actos Administrativos'), 
        1)) {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Actos Administrativos'), 
            'Cambio De Sueldo')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Actos Administrativos'), 
            Keys.chord(Keys.ENTER))

        String resultado = ''

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'), 
            2)) {
            resultado = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'))
        }
        
        if (resultado == 'Cambio De Sueldo') {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))
            }
        } else {
            break
        }
    }
}

def legalizar() {
    String legalizar = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico'))

    String legalizar1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico1'))

    String legalizar2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico2'))

    String legalizar3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_textico3'))

    if (legalizar == 'Legalizar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar'))
    } else if (legalizar1 == 'Legalizar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar1'))
    } else if (legalizar2 == 'Legalizar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar2'))
    } else if (legalizar3 == 'Legalizar') {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_iconEliminar3'))
    }
    
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Actos Administrativos'), 
        'Cambio De Sueldo')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/input_Actos Administrativos'), 
        Keys.chord(Keys.ENTER))

    String resultado = ''

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'), 
        2)) {
        resultado = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_registro1'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))
            } else {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aceptar'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/span_Si'))

                Eliminar()
            }
        } else {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Continuar0'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Regresion/a_Aplicar0'))
        }
    }
}

