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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares/input_Usuario_form_templatej_idt24_input'), 
    'Usuario')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Seguridad/Crear_Usuario,_contraseña,_Accesos_Particulares (1)/span_Usuario'))

WebUI.setText(findTestObject('PRUEBA/input_Portal_usuarioformaparametroBusqueda'), 'Prueba inscripcion katalon')

WebUI.sendKeys(findTestObject('PRUEBA/input_Portal_usuarioformaparametroBusqueda'), Keys.chord(Keys.ENTER))

while(WebUI.waitForElementVisible(findTestObject('PRUEBA/span_Prueba inscripcion katalon'), 1)) {

WebUI.click(findTestObject('PRUEBA/span_Prueba inscripcion katalon'))

WebUI.click(findTestObject('PRUEBA/a_Acceso Particular'))

while(WebUI.waitForElementVisible(findTestObject('PRUEBA/a_PORTAL SARA_usuarioformatabtabla_roles0j_idt152'), 1))
{
WebUI.click(findTestObject('PRUEBA/a_PORTAL SARA_usuarioformatabtabla_roles0j_idt152'))

WebUI.click(findTestObject('PRUEBA/a_Aceptar_eli_acceso particular'))
}
WebUI.click(findTestObject('PRUEBA/a_Informacin'))

WebUI.click(findTestObject('PRUEBA/a_Eliminar'))

WebUI.click(findTestObject('PRUEBA/a_Aceptar_eli_acceso particular'))

WebUI.setText(findTestObject('PRUEBA/input_Portal_usuarioformaparametroBusqueda'), 'Prueba inscripcion katalon')

WebUI.sendKeys(findTestObject('PRUEBA/input_Portal_usuarioformaparametroBusqueda'), Keys.chord(Keys.ENTER))

}