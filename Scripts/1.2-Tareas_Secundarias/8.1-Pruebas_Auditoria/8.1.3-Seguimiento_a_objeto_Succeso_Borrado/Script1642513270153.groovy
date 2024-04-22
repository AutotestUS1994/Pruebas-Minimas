import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Auditoria'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/a_Suceso Borrado'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/input_Filtro_form_visorj_idt253j_idt257'), 
    'saraadmin')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/input_Filtro_form_visorj_idt253j_idt257'), 
    Keys.chord(Keys.ENTER))

if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/td_06122021 075237'), 
    1)) {

	WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/td_06122021 075237'), 
	    0)
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Inicial_form_visorj_idt253fechaInicial_input'), 
    '')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Final_form_visorj_idt253fechaFinal_input'), 
    '')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/input_Filtro_form_visorj_idt253j_idt257'), 
    'weblogic')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/input_Filtro_form_visorj_idt253j_idt257'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/a_1'), 
    0)

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/td_14012022 093405'), 
    1)) {
    String Resultado = 'PRUEBA OK'
} else {
    def i = 0

    while ((WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/span_con.seek.next'), 
        1) && (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/td_14012022 093405'), 
        1) == false)) && (i <= 5)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/span_con.seek.next'))

        i = i++

        println(i++)

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Borrado/td_14012022 093405'), 
            1)) {
            String Resultado = 'PRUEBA OK'
        }
    }
}

