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

/*-----------------NUMERO ALEATORIO ------------------------*/
double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

/*------------------------------------------------------------------*/
WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado Hojas de Vida')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/li_Listado Hojas de Vida (hoj)'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Nueva HojaVida'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Identificacin_nuevahoja_formcedula'), 
    identificacion)

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_-- Seleccione --.ASPIRANTEAspirante NPxEspaol Tipo Hoja EmpleadoIngles Tipo Hoja AspirantepruebaTcnico'), 
    4)

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Nueva Solicitud'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2140idTexto'), 
    identificacion)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2141idTexto'), 
    'Francis ' + identificacion)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2142idTexto'), 
    'Chandler')

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2143fecha_input'), 
    '08/10/1990')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a__hojaVidaseccionj_idt2144j_idt254'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_CEDULA CIUDADANIA'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Fecha Expedicin_hojaVidaseccionj_idt2146fecha_input'), 
    '08/10/2008')

WebUI.selectOptionByLabel(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_--Seleccione---- Seleccione--000000ABEJORRA'), 
    'BOGOTÁ', false)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2148idTexto'), 
    '624564654684')

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2149idTexto'), 
    'noodle@gmail.com')

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_--Seleccione--AA-ABAB-BB-OO-'), 
    8)

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aceptar'))

String Nombre = WebUI.getText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__hojaVidaseccionj_idt2140idTexto'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos administrativos')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/li_Listado Hojas de Vida (hoj)'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/i_Actos_glyphicons glyphicons-group'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Actos de Retiro del empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Nomina'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_ingreso definitivo indefinido salario basico'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Elaboracin_glyphicons glyphicons-chronicle x2'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Identificacin_form_actoIngresoj_idt1250'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1762'), 
    identificacion)

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1762'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_Chandler  Francis 1537948e7'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoIngresoj_idt12870fecha_input'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoIngresoj_idt12870fecha_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoIngresoj_idt12871fecha_input'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoIngresoj_idt12871fecha_input'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_10 - Ingreso Puesto Nuevo'), 
    1)

if(WebUI.waitForElementVisible(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_DIAZ BLANCO GUISELL'), 
    1)) {

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_DIAZ BLANCO GUISELL'), 
    1)
}
WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/textarea__form_actoIngresoj_idt12874idTexto5'), 
    'Magister en derecho penal')

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_-- Seleccione --1. Actualizacin por Ascenso del Escalafn Origina2.Actualizacin por Ascenso'), 
    2)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoIngresoj_idt12876idTexto'), 
    'AAAAAA')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a__form_actoIngresoj_idt12877j_idt1327'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Unidad_form_popupUnidadUsuarioj_idt1777'), 
    '1')

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Unidad_form_popupUnidadUsuarioj_idt1777'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_ADMINISTRACION'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a__form_actoIngresoj_idt12878j_idt1327'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_APRENDIZ SENA PRODUCTIVA'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_VALOR4_form_actoIngresoj_idt12879idNumero1'), 
    '3')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_ENTIDAD DE SALUD'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Eps - Aliansalud Eps'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_FONDO DE PENSIONES'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Afp - Colfondos'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_ASEG. RIESGOS PROFESIONALES'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Arl - Seguros Bolivar'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_FONDO DE CESANTIAS'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Fc - Colfondos'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_PAGO DE NOMINA'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Sucursal_entidadempleado_formtabj_idt1562'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Ccf - Cafam'))

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_--Seleccione--003 Familia Popayan'), 
    2)

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Cuenta_entidadempleado_formtabtablaCampos0referencia'), 
    '12345678910')

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Bco Destino_entidadempleado_formtabtablaCampos1valor'), 
    '5')

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Tipo de cuenta_entidadempleado_formtabtablaCampos2sucReferencia'), 
    'Corriente')

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Tipo Cuenta 1ahorro 2 corr_entidadempleado_formtabtablaCampos4tipo'), 
    '1')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aplicar2'))

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Elaboracion Acto Cambio de Empleado/span_CAJA DE COMPENSACION'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Ccf - Compensar'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_10247'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Actualizar(1)'))

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_NOMINA MENSUALNOMINA QUINCENAL'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_ADMINISTRATIVOSAPRENDICESEMPLEADOFBROLESTSMECANICOS'), 
    1)

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Descargar pdf'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aplicar - Copy'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Cancelar'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos administrativos')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Actos Administrativos'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Actos de Retiro del empleado'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Actos de Retiro del empleado_form_ActosAdministrativostabla_principal_10j_idt79'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_terminacion de contrato'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Elaboracin_form_popupSeleccionDerogarj_idt138'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Identificacin_form_actoAusentismoj_idt938'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Filtro Empleado_form_popupEmpleadoj_idt1208'), 
    identificacion)

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Filtro Empleado_form_popupEmpleadoj_idt1208'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Chandler Francis 149223e7'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar0'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input__form_actoAusentismoj_idt15770fecha_input'), 
    '02/07/2021')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar1'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aplicar1'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Si1'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aceptar1'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Eliminar_form_ActosAdministrativostabla_principal_12j_idt79'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Filter by Identificacin_form_ActosAdministrativostabla_principal_actosj_idt118filter'), 
    identificacion)

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/td_Cc'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Continuar3'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aplicar3'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Si3'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/label_EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Aceptar3'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado de Empleados')

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Empleados'))

WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    identificacion)

WebUI.sendKeys(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Chandler Francis_listado empleados'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Terminar Contrato'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Liquidar'))

/*dejo de funcionar en la version 12.05.00
WebUI.setText(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/input_Fecha de Retiro_cancelacion_contratofecharetiro_input'), 
    '02/07/2021')
*/
WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_SUSTITUCIN PATRONALUNILATERAL DEL EMPLEADOJUSTA CAUSATERMINACION DE CONTRATOSIN JUSTA CAUSAPENSIONMUTUO ACUERDO'), 
    '5')

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_---SELECCIONE ---DirectoEntidad de PagoPeriodo de Nomina'), 
    3)

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/select_--SELECCIONE--PM202106PM202107'), 
    2)

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Calculo Nomina'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Prestaciones Sociales'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/span_Si'))

WebUI.click(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Reporte'))

if (WebUI.waitForElementVisible(findTestObject('Modulo compensaciones/Terminación_de_Contrato_Definitivo/a_Regresar'), 1)) {
    WebUI.closeBrowser()
}

