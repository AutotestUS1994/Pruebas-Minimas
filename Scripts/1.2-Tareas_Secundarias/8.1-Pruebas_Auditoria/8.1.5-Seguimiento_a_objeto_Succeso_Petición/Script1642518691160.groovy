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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Auditoria'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/a_Suceso Peticin'), 
    FailureHandling.STOP_ON_FAILURE)

String Cedula = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/td_712854829'))

String fecha0 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/td-Fecha'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Inicial_form_visorj_idt253fechaInicial_input'), 
    '')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Actualización/input_Fecha Final_form_visorj_idt253fechaFinal_input'), 
    '')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/input_Fecha final'), 
    fecha0 + ' PM')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/input_Vista Suceso Acceso Peticion_form_peticionj_idt337j_idt340'), 
    Keys.chord(Keys.ENTER))

String Cedula1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/td_1907626860'))

String fecha = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/td-Fecha'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/input_Fecha Final'), 
    fecha + " PM")

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/input_Vista Suceso Acceso Peticion_form_peticionj_idt337j_idt340'), 
    Keys.chord(Keys.ENTER))

String peticion1 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion'))

String peticion2 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion1'))

String peticion3 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion2'))

String peticion4 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion3'))

String peticion5 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion4'))

String peticion6 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion5'))

String peticion7 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion6'))

String peticion8 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion7'))

String peticion9 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion8'))

String peticion10 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion9'))

String peticion11 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion10'))

String peticion12 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion11'))

String peticion13 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion12'))

String peticion14 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion13'))

String peticion15 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion14'))

String peticion16 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion15'))

String peticion17 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion16'))

String peticion18 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion17'))

String peticion19 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion18'))

String peticion20 = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/Peticiones/td_Peticion19'))

if ((((((((((((((((((((peticion1 == Cedula1) || (peticion2 == Cedula1)) || (peticion3 == Cedula1)) || (peticion4 == Cedula1)) || 
(peticion5 == Cedula1)) || (peticion6 == Cedula1)) || (peticion7 == Cedula1)) || (peticion8 == Cedula1)) || (peticion9 == 
Cedula1)) || (peticion10 == Cedula1)) || (peticion11 == Cedula1)) || (peticion12 == Cedula1)) || (peticion13 == Cedula1)) || 
(peticion14 == Cedula1)) || (peticion15 == Cedula1)) || (peticion16 == Cedula1)) || (peticion17 == Cedula1)) || (peticion18 == 
Cedula1)) || (peticion19 == Cedula1)) || (peticion20 == Cedula1)) {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    def i = 0

    while (i <= 5 && i++) {
        

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Auditoria/Seguimiento_a_objeto_Succeso_Petición/icon_next'))

        peticion1

        peticion2

        peticion3

        peticion4

        peticion5

        peticion6

        peticion7

        peticion8

        peticion9

        peticion10

        peticion11

        peticion12

        peticion13

        peticion14

        peticion15

        peticion16

        peticion17

        peticion18

        peticion19

        peticion20

        if ((((((((((((((((((((peticion1 == Cedula1) || (peticion2 == Cedula1)) || (peticion3 == Cedula1)) || (peticion4 == 
        Cedula1)) || (peticion5 == Cedula1)) || (peticion6 == Cedula1)) || (peticion7 == Cedula1)) || (peticion8 == Cedula1)) || 
        (peticion9 == Cedula1)) || (peticion10 == Cedula1)) || (peticion11 == Cedula1)) || (peticion12 == Cedula1)) || (peticion13 == 
        Cedula1)) || (peticion14 == Cedula1)) || (peticion15 == Cedula1)) || (peticion16 == Cedula1)) || (peticion17 == 
        Cedula1)) || (peticion18 == Cedula1)) || (peticion19 == Cedula1)) || (peticion20 == Cedula1)) {
            break
        }
		println(i)
    }

    if (i >= 5) {
        WebUI.acceptAlert()
    }
}

