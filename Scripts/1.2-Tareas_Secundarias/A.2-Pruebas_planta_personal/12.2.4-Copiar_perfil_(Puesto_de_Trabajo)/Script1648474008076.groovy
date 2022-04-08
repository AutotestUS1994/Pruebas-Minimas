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

WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/A.2-Pruebas_planta_personal/12.1.6-Buscar_puesto_de_trabajo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/span_20145    - 40 Mil Staff'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/div_Salgado . Paula 40 Mil Staff'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Salgado . Paula_organigramaj_idt111'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Aceptar'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Copiar Perfil'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Unidad Organizacional_popupCopiarPerfilj_idt2011'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    'administracion')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/input_Unidad Organizacional_formPopUpUnidaddescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/span_ADMINISTRACION'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Cargo_popupCopiarPerfilj_idt2016'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/span_40 MIL STAFF'))

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/select_Reemplazar RegistrosAdicionar Registros'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/span_Puesto_ui-chkbox-icon ui-icon ui-icon-check ui-c'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Continuar'))

WebUI.check(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/div_Descripcin_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/a_Aplicar'))

if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Copiar_perfil_(Puesto_de_Trabajo)/p_Se ha realizado la copia del perfil a los puestos de trabajo seleccionados'), 
    1)) {

WebUI.closeBrowser()
}
