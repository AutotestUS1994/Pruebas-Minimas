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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Usuario_form_templatej_idt24_input'), 
    'Roles')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/li_Roles'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
    1)) {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
        'pruebas katalon')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61 - Copy'), 
        'pruebas katalon')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61 - Copy'), 
        Keys.chord(Keys.ENTER))
}

while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/td_Pruebas katalon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/td_Pruebas katalon'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Acceso Roles'))

    if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_SARA_formtabtabla_roles0j_idt134'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_SARA_formtabtabla_roles0j_idt134'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_link_aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Roles'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_link_aceptar'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
        1)) {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
            'pruebas katalon')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61'), 
            Keys.chord(Keys.ENTER))
    } else {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61 - Copy'), 
            'pruebas katalon')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Portal_formj_idt61 - Copy'), 
            Keys.chord(Keys.ENTER))
    }
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Descripcin_formtabdescripcion'), 
    'Pruebas katalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/select_Seleccin Tipo TolRol ClienteRol Funcional'), 
    2)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/input_Alias_formtabalias'), 
    'pruebas k')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/select_-- Seleccione --Grupo a'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Acceso Roles'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/select_SeleccioneEmpresa 1Empresa 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/select_SeleccioneSaraDS_Jboss (CompensacionDS)'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/select_--Seleccione--NUCLEO SISTEMASARAPORTAL'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Rol_y_Acceso_Roles/a_Filter by Aplicacin_formtabtabla_rolesj_idt135'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se adicionó el registro satisfactoriamente') {
    String Resultado = 'Prueba ok'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

