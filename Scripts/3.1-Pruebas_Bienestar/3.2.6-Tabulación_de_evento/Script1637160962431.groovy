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

WebUI.comment(' OMITIR PRUEBA. genera problemas al eliminar el evento omitir')

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/div_Evaluacin'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/a_Tabulacin Instructor'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/select_--Seleccione--12501250'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/input_puntual_form_popupEvaluacionEventoj_idt17140cantidad'), 
    '100')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/input_claridad_form_popupEvaluacionEventoj_idt17141cantidad'), 
    '100')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/textarea_Encuesta text Ins_form_popupEvaluacionEventoj_idt17142j_idt1718'), 
    'Prueba')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Tabulación_de_evento/a_Actualizar'))

WebUI.comment('OMITIR PRUEBA. genera problemas al eliminar el evento omitir')

