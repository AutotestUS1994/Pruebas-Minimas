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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Empresa 1_form_templatej_idt24_input'), 
    'Usuario')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/li_Usuario'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Portal_usuarioformaparametroBusqueda'), 
    'Usuario')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Portal_usuarioformaparametroBusqueda'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/span_Usuario'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/span_Usuario'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Roles'))

    while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_administrador_usuarioformatabtabla_roles_individual0j_idt160'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_administrador_usuarioformatabtabla_roles_individual0j_idt160'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso Roles'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Particular'))

    while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_roles0j_idt151'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_roles0j_idt151'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso particular'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso particular'))
        } else {
            break
        }
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Informacin'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_informacion'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Sesin_usuarioformatablogin'), 
    'Usuario')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Documento_usuarioformatabdocumento'), 
    identificacion())

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Nombre_usuarioformatabnombre'), 
    'Usuario')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Correo_usuarioformatabemail'), 
    identificacion() + 'noodle@gmail.com')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/label_Activo'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_-- Seleccione --acceso empresa calidad2Grupo a'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Guardar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Contrasea'))

WebUI.setEncryptedText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Contrasea_usuarioformatabpasswordNuevo'), 
    'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

WebUI.setEncryptedText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Confirmar_usuarioformatabpasswordConfirma'), 
    'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Actualizar'))

WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 0)

Empresas()

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Roles'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONA'), 
    3)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/icon_Mas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONA'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONA'), 
    'EMPLEADO', false)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_administrador_usuarioformatabtabla_roles_individualj_idt1611'))

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seleccionar_Empresa'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
    'Pruebas Katalon')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/span_Pruebas Katalon'), 
    1)) {
    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
        'Empresa 1')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/td_Empresa 1'), 
        1)) {
        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
            'Calidad')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Perfil_popupMopdulotablaBusquedaglobalFilter'), 
            Keys.chord(Keys.ENTER))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/td_Calidad'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/td_Calidad'))

            WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Empresa 1_form_templatej_idt24_input'), 
                'Usuario')

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/li_Usuario'), 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Portal_usuarioformaparametroBusqueda'), 
                'Usuario')

            WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/input_Portal_usuarioformaparametroBusqueda'), 
                Keys.chord(Keys.ENTER))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/span_Usuario'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/span_Usuario'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Roles'))

                while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_administrador_usuarioformatabtabla_roles_individual0j_idt160'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_administrador_usuarioformatabtabla_roles_individual0j_idt160'))

                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso Roles'))
                }
                
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Particular'))

                while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_roles0j_idt151'), 
                    1)) {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_roles0j_idt151'))


                    if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso particular'), 
                        1))
                    {
                    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_Acceso particular'))
                    }
					else {break}
                }
                
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Informacin'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Eliminar'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Aceptar_informacion'))
            }
            
            salir()

            WebUI.closeBrowser()
        }
    }
} else {
    WebUI.acceptAlert()
}

def salir() {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Empresa 1_cerrar_menu'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Administrador_glyphicons glyphicons-exit'))

    WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/div_Ingresar Olvide Mi Clave'), 
        0)
}

def Empresas() {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_Acceso Particular'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_No se encontr registros_usuarioformatabtabla_rolesj_idt152'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        13)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_No se encontr registros_usuarioformatabtabla_rolesj_idt152 - Copy'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        14)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        5)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_No se encontr registros_usuarioformatabtabla_rolesj_idt152 - Copy (1)'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        9)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1523'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        8)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1524'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        7)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1525'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        6)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1526'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        5)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        5)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1527'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        4)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1528'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_Seleccione1234234administradorAdministrador Calidad 3ADMONAspirantesAspirantesjjAuditoriaCAPACITACIONCOLABORADOR'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneCALIDADEmpresa 1Pruebas katalon'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_SeleccioneaspirantesempleadosDSflexoPruebasFlexoPruebasJboosInformixjavaSaraDS'), 
        3)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/select_--Seleccione--NUCLEO SISTEMASARAPORTAL SARASARA APPSARA APPSOFIASEGURIDADLMSSERVICIOSREGISTRO PERSONA'), 
        2)

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/6.1.7-Seleccionar Empresa/a_SARA_usuarioformatabtabla_rolesj_idt1529'))
}

def identificacion() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String id = random_double.toString().replace('.0', '')
}

