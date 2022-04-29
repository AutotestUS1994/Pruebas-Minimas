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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/div_Grupos'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Registro'))

    while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba1'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba1'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Aceptar_Eliminar'))
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Nuevo'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Cdigo_popupGruposEvento_formcodigo'), 
        '5')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Descripcin_popupGruposEvento_formdescripcion'), 
        'Pruebas k')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Horario_popupGruposEvento_formhorario'), 
        '16:00')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Cupo_popupGruposEvento_formcupo'), 
        '50')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Guardar'))
} else {
    WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/4.1-Pruebas_Capacitación/4.1.1-Nuevo_Curso'), [:], FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/div_Grupos'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Registro'))

        if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba1'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/td_Prueba1'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Eliminar'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Aceptar_Eliminar'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Nuevo'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Cdigo_popupGruposEvento_formcodigo'), 
            '5')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Descripcin_popupGruposEvento_formdescripcion'), 
            'Prueba')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Horario_popupGruposEvento_formhorario'), 
            '16:00')

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/input_Cupo_popupGruposEvento_formcupo'), 
            '50')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Crear_un_Grupo-Curso_Tipo_Evento_Grupal/a_Guardar'))
    }
}

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if(Result == 'El grupo ha sido adicionado correctamente') {
	
	String Resultado = 'PRUEBA OK'
	WebUI.closeBrowser()
}
else {
WebUI.acceptAlert()
}


