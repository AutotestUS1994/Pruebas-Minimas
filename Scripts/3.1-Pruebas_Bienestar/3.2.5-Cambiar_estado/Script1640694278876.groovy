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
/*para mensajes en pantalla*/ import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane
import javax.swing.ImageIcon as ImageIcon
import javax.swing.*
import java.awt.event.*
import java.awt.*

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/div_Participante'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Individual'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/td_1010220596'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Cambiar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/td_A A A'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Cambiar Datos'))

    WebUI.delay(2)

    String ventana = JOptionPane.showMessageDialog(null, 'No se puede modificar el campo Estado')

    if (ventana == null) {
        WebUI.closeBrowser()
    }
} else {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Nuevo'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Nombre_grupoEventoj_idt427'))

    WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/input_Filtro Empleado_form_popupFiltroEmpleadofiltroEmpleado'), 
        'A A A')

    WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/input_Filtro Empleado_form_popupFiltroEmpleadofiltroEmpleado'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/span_A A A'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/select_-- Seleccione --prueba-S-SH'), 
        1)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Guardar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Cambiar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/td_A A A'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Cambiar_estado/a_Cambiar Datos'))

    WebUI.delay(2)

    String ventana = JOptionPane.showMessageDialog(null, 'No se puede modificar el campo Estado')

    if (ventana == null) {
        WebUI.closeBrowser()
    }
}

WebUI.comment('El campo "estado" esta bloqueado para modificar')

