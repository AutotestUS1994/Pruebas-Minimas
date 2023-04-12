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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

String link = GlobalVariable.G_Login_Seguridad

String login = GlobalVariable.G_Login

WebUI.comment('No Aparece el correo pendiente')

WebUI.openBrowser(link)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginusuario'), 
    GlobalVariable.G_Usuario)

WebUI.setEncryptedText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginpassword'), 
    'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Ingresar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Empresa 1_form_templatej_idt24_input'), 
    'Usuario')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/li_Usuario'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Portal_usuarioformaparametroBusqueda'), 
    'Prueba_Contraseña')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Portal_usuarioformaparametroBusqueda'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Prueba_Contrasea'), 
    2)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Prueba_Contrasea'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Eliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Aceptar'))
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_esta pagina no funciona'), 
    1)) {
    String falla = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_esta pagina no funciona'))

    if (falla == 'Esta página no funciona') {
        WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Portal_usuarioformaparametroBusqueda'), 
            'Prueba_Contraseña')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Portal_usuarioformaparametroBusqueda'), 
            Keys.chord(Keys.ENTER))

        if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Prueba_Contrasea'), 
            2)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Prueba_Contrasea'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Eliminar'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Aceptar'))
        }
    }
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Nuevo'))
}

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Sesin_usuarioformatablogin'), 
    'Prueba')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Documento_usuarioformatabdocumento'), 
    '2237')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Nombre_usuarioformatabnombre'), 
    'Prueba_Contraseña')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Correo_usuarioformatabemail'), 
    'pruebas.automaticas.union@gmail.com')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Habilitar_usuarioformatabfechaabilitar_input'), 
    Fecha())

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/label_Activo'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/select_-- Seleccione --acceso empresa calidad2Grupo a'), 
    2)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Guardar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Contrasea'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Contrasea_usuarioformatabpasswordNuevo'), 
    'saraadmin1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Confirmar_usuarioformatabpasswordConfirma'), 
    'saraadmin1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Actualizar'))

WebUI.openBrowser(login)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Olvide Mi Clave'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Ingrese Login o Correo_form_recordarClaveloginEmail'), 
    'pruebas.automaticas.union@gmail.com')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Enviar'))

String Result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.openBrowser(link)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginusuario'), 
    GlobalVariable.G_Usuario)

WebUI.setEncryptedText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginpassword'), 
    'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Ingresar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Empresa 1_form_templatej_idt24_input'), 
    'Administrador de correos')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/li_Usuario'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Destinatario_listado_correoj_idt69'), 
    'pruebas.automaticas.union@gmail.com')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
    'Generar Claves Usuario')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
    Keys.chord(Keys.ENTER))

Number Contador = 0

while (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_Prueba_Contrasea'), 
    1)) {
    WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Empresa 1_form_templatej_idt24_input'), 
        'Administrador de correos')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/li_Usuario'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Destinatario_listado_correoj_idt69'), 
        'pruebas.automaticas.union@gmail.com')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
        'Generar Claves Usuario')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/td_pruebas.automaticas.uniongmail.com'), 
        1)) {
        Number suma = Contador + 1

        Contador = suma

        if (suma == '100') {
            WebUI.acceptAlert()
        }
    }
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'), 
    1)) {
    WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'))
} else {
    WebUI.refresh()

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Destinatario_listado_correoj_idt69'), 
        'pruebas.automaticas.union@gmail.com')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
        'Generar Claves Usuario')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'), 
        1)) {
        WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'))
    } else {
        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Destinatario_listado_correoj_idt69'), 
            Keys.chord(Keys.F5))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Destinatario_listado_correoj_idt69'), 
            'pruebas.automaticas.union@gmail.com')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
            'Generar Claves Usuario')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Asunto_listado_correoj_idt71'), 
            Keys.chord(Keys.ENTER))

        if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'), 
            1)) {
            WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/span_20052022 0949'))
        } else {
            WebUI.acceptAlert()
        }
    }
}

if (Result1 == 'Señor usuario, se ha remitido un correo electrónico al correo asociado.') {
    WebUI.openBrowser('http://192.168.2.19:8380/saraweb/')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginusuario1'), 
        'Prueba')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Olvide Mi Clave_loginpassword1'), 
        'SoloAutomaticas2023*')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Ingresar1'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_No_cerrar_menu'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_No_j_idt44password'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Nueva Clave_usuarioforma_cambiarClavepasswordNuevo'), 
        'saraadmin2')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/input_Confirmar Clave_usuarioforma_cambiarClavepasswordConfirma'), 
        'saraadmin2')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/a_Actualizar1'))

    String Result2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Recordar_Contraseña/p_Se actualiz Clave'))

    if (Result2 == 'Se actualizó Clave...') {
        String Resultado = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

def Fecha() {
    Date today = new Date()

    String Fecha = today.format('dd/MM/yyyy')

    String Hora = today.format('hh:mm')

    String Total = (Fecha + ' ') + Hora
}

