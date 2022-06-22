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
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane
import javax.swing.ImageIcon as ImageIcon
import javax.swing.*
import java.awt.event.*
import java.awt.*

WebUI.callTestCase(findTestCase('0.1.1-Login_detector'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_Categora_buscar glyphicons glyphicons-search'), 
    0)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_Categora_buscar glyphicons glyphicons-search'), 
    'categoria')

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_categoria'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_categoria'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/input_Actos Administrativos_form_categoriaSeccionj_idt61'), 
    'prueba')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/input_Actos Administrativos_form_categoriaSeccionj_idt61'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_prueba'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/span_prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/input_Descripcin_form_categoriaSecciondescripcion'), 
    'prueba')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/input_Orden_form_categoriaSeccionorden'), 
    '5')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nueva_Categoria/a_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se adiciono el registro correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

