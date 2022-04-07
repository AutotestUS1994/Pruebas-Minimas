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

WebUI.setText(findTestObject('input_Empresa 1_form_templatej_idt24_input'), 'Inconsistencias Evento')

WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/li_Inconsistencias Evento (get)'))

WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/a_Inconsistencia Marcacin'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Inconsistencias_Evento/td_ALMANZA ROSAS SILVIS'), 
    1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/td_ALMANZA ROSAS SILVIS'))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/a_Solucionar'))

    WebUI.setText(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Hora Final_formPopupSolucionInconsistenciahoraFin_input'), 
        '23/03/2019')

    WebUI.sendKeys(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Hora Final_formPopupSolucionInconsistenciahoraFin_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Inconsistencias_Evento/label_Inconsistencias'), 0)

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/label_Inconsistencias'))

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Guardar'))
} else {
    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/a_Nuevo'))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/a_Nombres_formPopupRelojj_idt199'))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Filter by Nombre_formPopupRelojj_idt204j_idt207filter'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/td_Almanza Rosas Silvis2'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Fecha Inicial_formPopupRelojfechaIni_input'), 
        '23/03/2019')

    WebUI.setText(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Hora_formPopupRelojhoraIni'), '06')

    WebUI.setText(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input__formPopupRelojminutoIni'), '10')

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/label_Evento'))

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Guardar'))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/td_ALMANZA ROSAS SILVIS'))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/a_Solucionar'))

    WebUI.setText(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Hora Final_formPopupSolucionInconsistenciahoraFin_input'), 
        '2019/03/23 11:29 AM')

    WebUI.sendKeys(findTestObject('Modulo control tiempo/Inconsistencias_Evento/input_Hora Final_formPopupSolucionInconsistenciahoraFin_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.click(findTestObject('Modulo control tiempo/Inconsistencias_Evento/label_Inconsistencias'))

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Guardar'))
}

