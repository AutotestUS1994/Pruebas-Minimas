import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.bcel.internal.generic.RETURN as RETURN
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

String identificacion = WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Acto Cambio del Empleado'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
    '01/12/2018')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
    '01/12/2018')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'), 
    GlobalVariable.G_TimeOut)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'))
} else {
    WebUI.refresh()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'))
}

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_10 - Ingreso Puesto Nuevo'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/textarea__form_actoIngresoj_idt10124j_idt1025'), 
    'Magister en derecho penal')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --1 Actualizacin'), 
    '2')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10126j_idt1022'), 
    'AAAAAA')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
    '1')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'))

/*WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Nmina Eletrnica popup'), 
    '3')*/
WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_PAGO DE NOMINA'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Sucursal_entidadempleado_formtabj_idt1219'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/Input_Entidad de salud'), 
    'Ccf - Cafam')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/Input_Entidad de salud'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Cafam'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--Seleccione--003 Familia Popayan'), 
    2)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Cuenta_entidadempleado_formtabtablaCampos0referencia'), 
    '12345678910')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Bco Destino_entidadempleado_formtabtablaCampos1valor'), 
    '5')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo de cuenta_entidadempleado_formtabtablaCampos2sucReferencia'), 
    'corriente')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo Cuenta 1ahorro 2 corr_entidadempleado_formtabtablaCampos4tipo'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar2'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'))

String Puesto = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10418'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'))

WebUI.selectOptionByValue(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--- Seleccione Tipo de'), 
    '2', true)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_clasificacion'), 
    '3')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Descargar pdf'), 
    0)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'))

String informacion = ''

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_informacion'), 
    1)) {
    informacion = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_informacion'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aceptar'))

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (informacion == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Empresa 1_form_templatej_idt24_input'), 
        'Planta personal')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Planta Personal'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Parmetros_organigramabuscar'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--Seleccione--EmpleadoPuesto'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Puesto_popupBusquedaPlantapuesto'), 
        Puesto)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Puesto_popupBusquedaPlantapuesto'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_20139    - Abogado'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Abogado_organigramaj_idt113'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --BloqueadoEliminadoOcupado y disponibleOcupado'), 
        6)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --No ReservadoReservado'), 
        1)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar_planta_personal'))

    String identificacion0 = WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Acto Cambio del Empleado'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
        '01/12/2018')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
        '01/12/2018')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_10 - Ingreso Puesto Nuevo'), 
        '1')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/textarea__form_actoIngresoj_idt10124j_idt1025'), 
        'Magister en derecho penal')

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --1 Actualizacin'), 
        '2')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10126j_idt1022'), 
        'AAAAAA')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
        '1')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'))

    /* WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Nmina Eletrnica popup'), 
        '3')*/
    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_PAGO DE NOMINA'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Sucursal_entidadempleado_formtabj_idt1219'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Cafam'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--Seleccione--003 Familia Popayan'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Cuenta_entidadempleado_formtabtablaCampos0referencia'), 
        '12345678910')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Bco Destino_entidadempleado_formtabtablaCampos1valor'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo de cuenta_entidadempleado_formtabtablaCampos2sucReferencia'), 
        'corriente')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo Cuenta 1ahorro 2 corr_entidadempleado_formtabtablaCampos4tipo'), 
        '1')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar2'))

    if(WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'), 
        0)) {
		WebUI.scrollToElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'),
			0)
    }

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'))

    WebUI.selectOptionByValue(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--- Seleccione Tipo de'), 
        '2', true)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_clasificacion'), 
        '3')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Descargar pdf'), 
        0)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aceptar'))

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], FailureHandling.STOP_ON_FAILURE)

    elaborar()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Nomina'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ingreso definitivo indefinido salario basico ANTIGUO'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'), 
        1)) {
        WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt144'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Identificacin_form_popupSeleccionarDerogarIngresoj_idt154'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        identificacion0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Pruebas_automaticas  Empleado6520781'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_Ingreso Definitivo Indefinido Salario Basico'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_No se encontr registros'), 
        1)) {
        WebUI.closeBrowser()
    } else {
        WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar4'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/p_EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE'))

        String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (Alerta == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
            WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
    //WebUI.closeBrowser()
} else if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 1) || (informacion == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE')) {
    WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Empresa 1_form_templatej_idt24_input'), 
        'Planta personal')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Planta Personal'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Parmetros_organigramabuscar'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--Seleccione--EmpleadoPuesto'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Puesto_popupBusquedaPlantapuesto'), 
        Puesto)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Puesto_popupBusquedaPlantapuesto'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_20139    - Abogado'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Abogado_organigramaj_idt113'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --BloqueadoEliminadoOcupado y disponibleOcupado'), 
        6)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --No ReservadoReservado'), 
        1)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar_planta_personal'))

    String identificacion0 = WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Acto Cambio del Empleado'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
        '01/12/2018')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10120fecha_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
        '01/12/2018')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10121fecha_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Motivo ingreso'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_10 - Ingreso Puesto Nuevo'), 
        '1')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/textarea__form_actoIngresoj_idt10124j_idt1025'), 
        'Magister en derecho penal')

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_-- Seleccione --1 Actualizacin'), 
        '2')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input__form_actoIngresoj_idt10126j_idt1022'), 
        'AAAAAA')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10127j_idt1042'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
        '1')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Unidad_form_actoIngresoj_idt1334'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ADMINISTRACION'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a__form_actoIngresoj_idt10128j_idt1042'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ABOGADO'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Nmina Eletrnica popup'), 
        '3')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ENTIDAD DE SALUD'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Eps - Aliansalud Eps'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE PENSIONES'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Afp - Colfondos'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ASEG RIESGOS PROFESIONALES'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Arl - Seguros Bolivar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_FONDO DE CESANTIAS'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Fc - Colfondos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_PAGO DE NOMINA'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Sucursal_entidadempleado_formtabj_idt1219'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Cafam'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--Seleccione--003 Familia Popayan'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Cuenta_entidadempleado_formtabtablaCampos0referencia'), 
        '12345678910')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Bco Destino_entidadempleado_formtabtablaCampos1valor'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo de cuenta_entidadempleado_formtabtablaCampos2sucReferencia'), 
        'corriente')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Tipo Cuenta 1ahorro 2 corr_entidadempleado_formtabtablaCampos4tipo'), 
        '1')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar2'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Ccf - Compensar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_10247'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Actualizar'))

    WebUI.selectOptionByValue(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_--- Seleccione Tipo de'), 
        '2', true)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Zona Econmica_form_actoIngresoj_idt11656j_idt1204'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_B1'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/select_clasificacion'), 
        '3')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar (1)'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Descargar pdf'), 
        0)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar'))

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Cancelar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Nomina'))

    elaborar()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ingreso definitivo indefinido salario basico ANTIGUO'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'), 
        1)) {
        WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt144'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Identificacin_form_popupSeleccionarDerogarIngresoj_idt154'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        identificacion0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Pruebas_automaticas  Empleado6520781'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_Ingreso Definitivo Indefinido Salario Basico'))

    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar4'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/p_EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE'))

    String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Alerta == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
        WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Cancelar'))

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], FailureHandling.STOP_ON_FAILURE)

    elaborar()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Nomina'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_ingreso definitivo indefinido salario basico ANTIGUO'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt144'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Identificacin_form_popupSeleccionarDerogarIngresoj_idt154'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        identificacion)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1421'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_Pruebas_automaticas  Empleado6520781'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/td_Ingreso Definitivo Indefinido Salario Basico'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'), 
        1)) {
        WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Continuar3'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/a_Aplicar4'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/p_EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE'))

    String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (Alerta == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
        WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Legalizar'), [:], 
            FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.acceptAlert()
    }
}

def elaborar() {
    String text1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/text1'))

    String text2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/text2'))

    String text3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/text3'))

    String text4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/text4'))

    if (text1 == 'Elaborar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/icono1'))
    } else if (text2 == 'Elaborar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/icono2'))
    } else if (text3 == 'Elaborar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/icono3'))
    } else if (text4 == 'Elaborar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/icono4'))
    } else {
        WebUI.acceptAlert()
    }
}

