import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.2-Ingresar_instructores'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.3-Ingresar entidades'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.4-Filtro_de_asistentes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.5-Publicación_del_evento'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.6-Programación'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.7-Programacion_Múltiple'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.8-Calendario'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.8-Deducción_de_costos_al_plan_inversión'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.9 -inscripción_a_un_evento'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.2.1-Invitación'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.2.2-Inscripción_masiva'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

