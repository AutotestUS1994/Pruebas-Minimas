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

borrarUsuario()

borrarEmpresa()

String resultEmpresa = crearEmpresa()

String resultUsuario = crearUsuario()

println(resultEmpresa)

if (resultEmpresa == 'PRUEBA OK') {
	println(resultUsuario())
}

if ((resultUsuario == 'PRUEBA OK') && (resultEmpresa == 'PRUEBA OK')) {
	WebUI.closeBrowser()
}

def crearEmpresa() {
	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'),
		'Empresa')

	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/span_Empresa'))

	if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/td_Pruebas katalon'),
		1)) {
		borrarEmpresa()
	}
	
	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/a_Nuevo'))

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/input_Cdigo_empresa_formcodigoEmpresa'),
		'5')

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/input_Nombre_empresa_formnombreEmpresa'),
		'Pruebas katalon2')

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --generalMexico'),
		1)

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --Aspirantes CALIDADSitio Calidad'),
		2)

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --Grupo a'),
		1)

	WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/a_Actualizar'), 0)

	WebUI.doubleClick(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/a_Actualizar'))

	WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 0)

	String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

	if (Result == 'Se actualizo correctamente el registro' ||Result == 'Se adiciono el registro correctamente') {
		String Resultado = 'PRUEBA  OK'
	} else {
		WebUI.acceptAlert()
	}
}

def crearUsuario() {
	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Usuario_form_templatej_idt24_input'),
		'Usuario')

	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Usuario'))

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/input_usuario'),
		'Pruebas Katalon')

	WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/input_usuario'),
		Keys.chord(Keys.ENTER))

	if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Pruebas Katalon'),
		1)) {
		borrarUsuario()
	}
	
	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Nuevo'))

	/*WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Sesin_usuarioformatablogin'),
		fecha())*/
	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Sesin_usuarioformatablogin'),
		'PruebasKatalon')

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Documento_usuarioformatabdocumento'),
		identificacion())

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Nombre_usuarioformatabnombre'),
		'Pruebas Katalon')

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Correo_usuarioformatabemail'),
		identificacion() + 'noodle@gmail.com')

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/label_Activo'),
		1)

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

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_SeleccioneSaraDS_Jboss (CompensacionDS)'),
		1)

	WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/select_--Seleccione--NUCLEO SISTEMASARAPORTAL'),
		2)

	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/a_Aplicacin_usuarioformatabtabla_rolesj_idt148'))

	WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 0)

	String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

	if (Result == 'Se adicionó el registro satisfactoriamente') {
		String Resultado = 'PRUEBA OK'
	} else {
		WebUI.acceptAlert()
	}
}

def borrarUsuario() {
	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Usuario_form_templatej_idt24_input'),
		'Usuario')

	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Usuario'))

	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/input_usuario'),
		'Pruebas Katalon')

	WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/input_usuario'),
		Keys.chord(Keys.ENTER))

	while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Pruebas Katalon'),
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
}

def borrarEmpresa() {
	WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'),
		'Empresa')

	WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/span_Empresa'))

	while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/td_Pruebas katalon'),
		1)) {
		WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/td_Pruebas katalon'))

		WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/a_Eliminar'))

		WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Empresa/a_link_aceptar'))
	}
}

def fecha() {
	Date today = new Date()

	String todaysDate = today.format('dd/MM/yyyy HH:mm')
}

def identificacion() {
	double random_double = (Math.random() * 9999) + 999

	random_double = Math.round(random_double * 1000)

	String identificacion = random_double.toString().replace('.0', '')
}

