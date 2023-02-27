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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/input_Beneficios_form_templatej_idt24_input'), 
    'beneficio')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/li_Beneficio (bie)'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/td_PRUEBAS K'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/td_PRUEBAS K'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Filtro Seccin'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_CONYUGUE_form_dirigidoTipoBeneficiariotabla_dirigido0j_idt689'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_CONYUGUE_form_dirigidoTipoBeneficiariotabla_dirigido0j_idt689'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Registro'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Aceptar'))
}

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Nuevo'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/input_Cdigo_formDetalleTipoBeneficioBienestarcodigoTipoBeneficio'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/input_Descripcin_formDetalleTipoBeneficioBienestardescripcionTipoBeneficio'), 
    'PRUEBAS KATALON')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --Auxilio de SaludAUXILIO DE VIVIENDAAUXILIO EDUCATIVOPrueba'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --Solicitante Y Seccion HojaSolicitanteSeccion Hoja'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --DescuentoNo RecaudoNovedad hacia NminaPrestamo'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --familia'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --Control por TarifaManejo TarifaNo Relacionar'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_-- Seleccione --SiNo'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_--Seleccione--NoSi'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_Convenio--Seleccione--NoSi'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/select_--Seleccione --No requiere formalizar'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Crear_tipo_de_beneficio_CASO1_(Novedad_nómina)/a_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se Guardó el registro correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

