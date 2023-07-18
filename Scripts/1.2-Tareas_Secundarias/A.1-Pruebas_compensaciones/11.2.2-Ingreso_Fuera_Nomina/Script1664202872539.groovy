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

String numero = aleatorio()

String filePath = ''

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

puesto(filePath)

String numPuesto = puesto(filePath)

println(numPuesto)

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado Hojas de Vida (hoj)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/li_Listado Hojas de Vida (hoj)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Nueva HojaVida'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Identificacin_nuevahoja_formcedula'), 
    numero)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_-- Seleccione --.ASPIRANTEAspirante NPxEspaol Tipo Hoja EmpleadoIngles Tipo Hoja AspirantepruebaTcnico'), 
    4)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Nueva Solicitud'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1960idTexto'), 
    numero)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1961idTexto'), 
    'Brian hugn')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1962idTexto'), 
    'Warner' + numero)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1963fecha_input'), 
    '08/10/1990')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_--Seleccione---- Seleccione--000000ABEJORRAL'), 
    12)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a__hojaVidaseccionj_idt1964j_idt236'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_CEDULA CIUDADANIA (COLOMBIA)'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Fecha Expedicin_hojaVidaseccionj_idt1966fecha_input'), 
    '08/10/2018')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_--Seleccione---- Seleccione--000000ABEJORRAL'), 
    '12')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1968idTexto'), 
    '300' + numero)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__hojaVidaseccionj_idt1969idTexto'), 
    ('prueba' + numero) + '@null.com')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_--Seleccione--AA-ABAB-BB-OO-'), 
    '7')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a__hojaVidaseccionj_idt19611j_idt236'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt875'), 
    'Bogotá')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt875'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_11001     BOGOT'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a__hojaVidaseccionj_idt19612j_idt236'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Colombiana'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Aceptar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
    'Actos Administrativos (act)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/li_Listado Hojas de Vida (hoj)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Acto cambio del Empleado'))

Elaborar()

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Nomina'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_ingreso - definitivo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Elaboracin_form_popupSeleccionDerogarj_idt405'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Identificacin_form_actoIngresoj_idt1076'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1436'), 
    numero)

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1436'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_idenfiticacion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Continuar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11150fecha_input'), 
    '16/05/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11151fecha_input'), 
    '01/04/2040')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11152fecha_input'), 
    '16/05/2021')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_10 - Ingreso Puesto Nuevo'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/textarea__form_actoIngresoj_idt11154idTexto5'), 
    'NULL')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11155idTexto'), 
    'NULL')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11156fecha_input'), 
    '01/07/2008')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input__form_actoIngresoj_idt11157idTexto'), 
    numero)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_-- Seleccione Sucursal--BOGOTANO RELACIONADA'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_-- Seleccione --1'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_unidadDeOrigen'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Unidad_form_popupUnidadUsuarioj_idt14512'), 
    'B5')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Unidad_form_popupUnidadUsuarioj_idt14512'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_A1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a__unidad'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Unidad_form_popupUnidadUsuarioj_idt14512'), 
    'B5')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Unidad_form_popupUnidadUsuarioj_idt14512'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_A1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a__form_actoIngresoj_idt111512j_idt1155'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_ABOGADO'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_ENTIDAD DE SALUD'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/Input_caja de compensacion'), 
    'compensar')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/Input_caja de compensacion'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Ccf - Compensar - Copy'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_CAJA DE COMPENSACION'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/Input_entidad de salud'), 
    'Compensar')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/Input_entidad de salud'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Eps - Compensar - Copy'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Continuar'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Puesto'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Puesto'), numPuesto)

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Puesto'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Puesto 10590'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Actualizar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/select_NOMINA_MENSUALNOMINA_QUINCENAL'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Aplicar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Aceptar'))

Legalizar()

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Filtrar por Identificacin_form_ActosAdministrativostabla_principal_actosj_idt119filter'), 
    numero)

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Filtrar por Identificacin_form_ActosAdministrativostabla_principal_actosj_idt119filter'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/td_2581130'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Continuar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Aplicar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Aceptar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/a_form_preguntaPlanilla'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_Nombre Entidad'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/a_Entidad Riesgos Labores'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_Nombre Entidad'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Guardar'))

println(aleatorio())

def aleatorio() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String numeroRandom = random_double.toString().replace('.0', '')
}

def Elaborar() {
    String titulo1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title1'))

    String titulo2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title2'))

    String titulo3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title3'))

    String titulo4 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title4'))

    switch (((titulo1 || titulo2) || titulo3) || titulo4) {
        case titulo1 == 'Elaborar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico1'))

            break
        case titulo2 == 'Elaborar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico2'))

            break
        case titulo3 == 'Elaborar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico3'))

            break
        case titulo4 == 'Elaborar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico4'))

            break
    }
}

def Legalizar() {
    String titulo1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title1'))

    String titulo2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title2'))

    String titulo3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title3'))

    String titulo4 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/span_Title4'))

    switch (((titulo1 || titulo2) || titulo3) || titulo4) {
        case titulo1 == 'Legalizar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico1'))

            break
        case titulo2 == 'Legalizar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico2'))

            break
        case titulo3 == 'Legalizar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico3'))

            break
        case titulo4 == 'Legalizar':
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/a_Ico4'))

            break
    }
}

def puesto(def filePath) {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
        'Planta personal (tal)')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Ingreso_Fuera_Nomina/li_Listado Hojas de Vida (hoj)'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_Administracion'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/a_Posicion_organigramanuevoPuestoTrabajo'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/a_Cargo_datosPuestoTrabajo_formj_idt878'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/input_Cargo_popupCargo_Formj_idt1159'), 
        'ABOGADO')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/input_Cargo_popupCargo_Formj_idt1159'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_ABOGADO'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_-- Seleccione --Planta Dinamica                (1)Planta Fija                    (B1)'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_-- Seleccione --Ampleado                       (Z3)Empleado                       (B3)Mapa'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_-- Seleccione --BloqueadoEliminadoOcupado y disponibleOcupado y disponible x'), 
        6)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/label_No es responsable de la Unidad'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/label_No'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_Actualizar0'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/a_Zona Econmica_datosPuestoTrabajo_formj_idt1008'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_ADMINISTRATIVA'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_-- Seleccione empleados_lineacosto --ADMINISTRATIVO -- 1NO RELACIONADA -- .SUBCENTROS -- 9999'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_-- Seleccione Ubicacin Fsica --ABEJORRAL'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_2120 HORAS1240 HORAS0NO DEFINIDO61Pensin'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_12kataloonkataloonNOMINA CATORCENALNOMINA CATORCENALNOMINA MENSUALNOMINA'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_0.5APRENDIZ ETAPA LECTIVA6APRENDIZ ETAPA PRODUCTIVA96ASISTENTE DE INVESTIGACION'), 
        8)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/select_ADMINISTRATIVOSAPRENDICESEMPLEADOFBROLESTSMECANICOSNO APLICANOMINA'), 
        1)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/input_Mesada_datosPuestoTrabajo_formsueldo'), 
        '1800000')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/span_Actualizar0'))

    filePath = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/ingreso_fuera_nomina_2/input_Cargo_datosPuestoTrabajo_formcargocodigo'), 
        'value')

    return filePath
}

