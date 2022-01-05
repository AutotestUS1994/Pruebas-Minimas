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

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.6.7 Modificar retroactivos viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.6.8 Guardar retroactivo de viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.6.9 Reporte Entidades Liquidadas Viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.7.1 Crear Histórico Vacaciones'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.7.2 Crear Histórica Incapacidad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.7.3 Eliminar Viàtico'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

