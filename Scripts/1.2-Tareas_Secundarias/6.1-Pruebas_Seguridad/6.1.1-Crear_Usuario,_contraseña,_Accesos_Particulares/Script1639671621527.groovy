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
import java.text.SimpleDateFormat as SimpleDateForma

/*GENERADOR DE FECHA Y HORA*/
Date today = new Date()

String todaysDate = today.format('dd/MM/yyyy HH:mm')

/*--------------------------------------------------------*/
/*GENERADOR DE NUMERO ALEATORIO*/
double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

/*----------------------------------------------------------------------------*/
WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Usuario_form_templatej_idt24_input'), 
    'Usuario')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Usuario'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Pruebas Katalon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Pruebas Katalon'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Acceso Particular'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_SARA_usuarioformatabtabla_roles0j_idt147'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_SARA_usuarioformatabtabla_roles0j_idt147'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_link_aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Informacin'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_link_aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Sesin_usuarioformatablogin'), 
    todaysDate)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Documento_usuarioformatabdocumento'), 
    identificacion)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Nombre_usuarioformatabnombre'), 
    'Pruebas Katalon')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Correo_usuarioformatabemail'), 
    identificacion + 'noodle@gmail.com')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/label_Activo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_-- Seleccione --Grupo a'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Contrasea'))

WebUI.setEncryptedText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Contrasea_usuarioformatabpasswordNuevo'), 
    'MkG4/TYiCFC3cb2driP7+Q==')

WebUI.setEncryptedText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Confirmar_usuarioformatabpasswordConfirma'), 
    'MkG4/TYiCFC3cb2driP7+Q==')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Acceso Particular'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_Seleccione1ADMINISTRADORADMINISTRADOR_MASIVO'), 
    15)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_SeleccioneEmpresa 1Empresa 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_SeleccioneSaraDS_Jboss (CompensacionDS)SaraDS_weblogic (CompensacionDS)seguridad jdbcSeguridadDS_Jboss'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA PRIMESARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Aplicacin_usuarioformatabtabla_rolesj_idt148'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se adicionó el registro satisfactoriamente') {
    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Cerrar_sesion_sara/cerrar_sesion'), [:], FailureHandling.STOP_ON_FAILURE)

    String Resultado = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

