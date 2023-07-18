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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Tarea Actos Administrativos'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/i_Acto Movimento de planta_gly'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/i_Acto Movimento de planta_gly'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Actos de Retiro del empleado'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Actos de Retiro del empleado'))

Elaborar()

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt134'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt134'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Identificacin_form_actoAusentismoj_idt1208'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Identificacin_form_actoAusentismoj_idt1208'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input_Filtro Empleado_form_actoAusentismoj_idt1434'), 
    '354968431354')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input_Filtro Empleado_form_actoAusentismoj_idt1434'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_SALGADO PAULA'), 
    0)

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_SALGADO PAULA'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input__form_actoAusentismoj_id'), 
    '31/12/2018')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar_1'), 
    0)

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar_1'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aplicar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aceptar0'))

eliminar()

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/td_66666'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aplicar1'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_Si1'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aceptar1'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/p_No existen datos'), 
    1)) {
    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def Elaborar() {
    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoElaborar'))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))
        } else {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoElaborar1'))

            if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
                1)) {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))
            } else {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoElaborar2'))

                if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
                    1)) {
                    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))
                } else {
                    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoElaborar3'))

                    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
                        1)) {
                        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))
                    }
                }
            }
        }
    }
}

def eliminar() {
    String text1 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar'))

    String text2 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar1'))

    String text3 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar2'))

    String text4 = WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar3'))

    if (text1 == 'Eliminar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar - Copy'))
    } else if (text2 == 'Eliminar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar1 - Copy'))
    } else if (text3 == 'Eliminar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar2 - Copy'))
    } else if (text4 == 'Eliminar') {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_iconoEliminar3 - Copy'))
    } else {
        WebUI.acceptAlert('falla')
    }
}

