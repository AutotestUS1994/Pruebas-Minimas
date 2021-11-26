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

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Listado Caso Atep_form_templatej_idt24_input'), 
    'Matriz de peligros')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/li_Matriz de peligros (sst)'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarPeriodo 2018Periodo No. 1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    6)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Descripcin_form_datosMatrizPeligrodescripcion'), 
    'prueba')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarNo VigenteVigente'), 
    2)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Fecha Vigencia_form_datosMatrizPeligrofechaVigencia_input'), 
    '01/07/2021')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Actividades'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo1'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Cdigo_form_datosActividadMatrizcodigo'), 
    '1122334455')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_datosActividadMatrizdescripcion'), 
    'PRUEBAS K')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarNoSi'), 2)

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo2'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Cdigo_form_detalleTareaMatrizcodigoTar'), 
    '66778899')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_detalleTareaMatrizdescripcionTar'), 
    'Pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo3'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarFsicoPrueba cdigo repetidoCondiciones de SeguridadPsicosocialBiomecnicoAuditivoFenmenos NaturalesVisualMotriz'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Seleccionar'), '1')

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Efecto Posible_form_listadoPeligroListadoActividaddtabconsecuencia'), 
    'prueba k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Controles Existentes'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo4'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_SeleccionarIndividuoFuenteMedio'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/textarea_Descripcin_form_listadoPeligroListadoActividaddtabdescripcionMedControl'), 
    'pruebas k')

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar4'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Niveles de Riesgo'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Nuevo5'))

WebUI.setText(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/input_Fecha Original_form_listadoPeligroListadoActividaddtabtab2fechaOriginal_input'), 
    '01/07/2021')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/select_Seleccionar5'), null)

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Guardar5'))

WebUI.click(findTestObject('Modulo Pruebas SST/Creación_de_Matriz_de_Peligros/a_Seguimiento'))

