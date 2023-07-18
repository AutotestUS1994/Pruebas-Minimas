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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Empresa 1_form_templatej_idt24_input'), 
    'Fuente general')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/li_fuente general (gna)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Fuente_form_FuenteGeneralfiltroFuenteGeneral'), 
    'Actualizar Entidad empl')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Fuente_form_FuenteGeneralfiltroFuenteGeneral'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_actualizar entidad empl'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_actualizar entidad empl'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Servicios'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Actualizar Jefe'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Actualizar Jefe'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_Servicio'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar servicio'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Campos'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_camp1'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_camp1'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_campos'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar campos'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Entrada'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Pru1'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_N_btn-minieliminar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar entrada'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Bsica'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_basica'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar servicio'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneArchivo PlanoServicio Web'), 
    1)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Descripcin_form_FuenteGeneraltabdescripcion'), 
    'Actualizar Entidad empl')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneAGRUPAMIENTOROMPIMIENTOUNICO REGISTRO'), 
    3)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--COMAPIPELINEPUNTO COMASIN SEPARADORTAB'), 
    5)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--Por el orden de los gruposPor el orden de los servicios'), 
    1)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--NOSI'), 
    2)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--Proceso por aplicacionProceso por base datos(segundo plano)Proceso por base de datos'), 
    3)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Cdigo_form_FuenteGeneraltabcodigo'), 
    'Actual')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneNoSi3'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Entrada'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Entrada'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_No se encontr registros_form_FuenteGeneraltabtabla_entradadescripcion'), 
    'Pru1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneDecimalFechaLlave GeneradaLoginNumeroTexto'), 
    6)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneNoSi1'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_No se encontr registros_btn-miniadicionar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Campos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Nuevo_Campo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Descripcin_form_popupfuentecampodescripcion'), 
    'camp1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--DecimalFechaLlave GeneradaLoginNumeroTexto'), 
    5)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Columna_form_popupfuentecampocolumna'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_NoSi2'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Servicios'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Nuevo_Servicio'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneActo Cambio Empleado - Accion (No Aplica)'), 
    12)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Orden_form_popupServiciotaborden'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneAl final del procesoEn cada Item'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/label_No'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_CamposSUB'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--ARCOSD-ENTIDADESARCOSD'), 
    10)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/textarea_Codigo de la empresa a la que pertenece el empleado_form_popupServiciotabtabla_campos_serv3j_idt316'), 
    '{Campo1}')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_--Seleccione--ARCOSD-ENTIDADESARCOSD-ESTADO CIVILHomologacin'), 
    11)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/textarea_Nmero de cdula del nuevo Jefe_form_popupServiciotabtabla_campos_serv4j_idt316'), 
    '{Campo2}')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Guardar'), 
    30)

/*--------------------------------------------------*/
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_No se encontr registros_ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover'))

/* SE OMITE PROVICIONALMENTE MIENTRAS SE REPARA 
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Notificacin'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/select_SeleccioneFijoLogin Par'), 
    1)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_No se encontr registros_form_FuenteGeneraltabtablaNotificacioncorreo'), 
    'prueba@null.com')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_No se encontr registros_form_FuenteGeneraltabtablaNotificaciondescr'), 
    'Prueba')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_No se encontr registros_form_FuenteGeneraltabtablaNotificacionpopupplantilla'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/input_Buscar'), 
    'html')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_ico_lupa'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_01  .jasper'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_No se encontr registros_btn-miniadicionar2'))
*/
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Servicios'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Actualizar Jefe'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Actualizar Jefe'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_Servicio'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar servicio'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Campos'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_camp1'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_camp1'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_campos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar campos'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Entrada'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/td_Pru1'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_N_btn-minieliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar entrada'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Bsica'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Eliminar_basica'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/cargue fuente general/a_Aceptar_eliminar servicio'))

