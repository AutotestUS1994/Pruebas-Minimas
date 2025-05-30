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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/input_Empresa 1_form_templatej_idt24_input'), 
    'requerimiento personal')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_Requerimiento Personal'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_2'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
    } else {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_3'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
        } else {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_4'))
			if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'),
				1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
			}else {
				WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_5'))
				if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'),
					1)) {
				WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
				
				}else {
					WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_6'))
					if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'),
						1)) {
						WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
					} else {
						WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_6'))
						if(WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'),
							1)) {
							WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/span_PRUEBA'))
						} else {
							println("No esta el registro en la página 7")
						}
					}
				}
			}
			
        }
    }
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_Modificar Motivo'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_Modificar Motivo'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/div_Requerimiento Personal'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_Modificar Motivo'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/select_2120 HORAS1240 HORAS0NO DEFINIDO61Pensin Convencional62'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/select_Tcnico AdministrativoOperativo'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/select_1 mes2 meses3 meses6 mesesNo aplicaOtro'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/select_1. volumenes de venta2. Carga en volumenes de operacin3'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/select_Interna AbiertaInterna CerradaExternaInterna y Externa'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Crear_un_requerimiento_según_motivo_y_formato/a_Guardar Directo'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se Actualizo el registro correctamente') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

