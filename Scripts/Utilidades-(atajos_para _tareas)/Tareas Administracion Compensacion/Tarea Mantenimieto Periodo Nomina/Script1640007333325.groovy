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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Tarea Mantenimieto Periodo Nomina/input_Actos Administrativos_form_templatej_idt24_input'), 
    GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Tarea Mantenimieto Periodo Nomina/input_Actos Administrativos_form_templatej_idt24_input'), 
    'Mantenimiento Periodo')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Tarea Mantenimieto Periodo Nomina/span_Mantenimiento Periodo'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Tarea Mantenimieto Periodo Nomina/span_Mantenimiento Periodo'))

