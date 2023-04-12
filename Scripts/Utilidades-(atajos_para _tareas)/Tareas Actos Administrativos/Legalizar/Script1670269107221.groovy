import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.xml.internal.ws.api.pipe.NextAction as NextAction
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import org.openqa.selenium.Keys as Keys

actualizar()

WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Acto cambio del Empleado'))

String text1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Elaborar'))

String text2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Eliminar'))

String text3 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Legalizar'))

String text4 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Modificar'))

if (text1 == 'Legalizar') {
    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico1'))
} else if (text2 == 'Legalizar') {
    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico2'))
} else if (text3 == 'Legalizar') {
    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico3'))
} else if (text4 == 'Legalizar') {
    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico4'))
} else {
    WebUI.acceptAlert()
}

WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
    'Ingreso Definitivo Indefinido Salario Basico')

WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
    Keys.chord(Keys.ENTER))

while (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Legalizar/td_Ingreso Definitivo Indefinido Salario Basico'), 
    2)) {
    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/td_Ingreso Definitivo Indefinido Salario Basico'))

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Continuar'))

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Aplicar'))

    if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 1)) {
        String puesto = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        String contador = puesto.length()

        String TokenCount = Integer.parseInt(contador)

        int TokenCount1 = Integer.parseInt(TokenCount)

        System.out.println(TokenCount1)

        String subPuesto = ''


        
        if (puesto == 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
            
        }
		else if (TokenCount1 == 49) {
			subPuesto = puesto.substring(43, 48)
		} else if (TokenCount1 == 36) {
			subPuesto = puesto.substring(29, 35)
			
		} else {
			println(TokenCount1)
			
			WebUI.acceptAlert()
			
			println(TokenCount1)
		}
		
		if (puesto != 'EL SISTEMA HA GENERADO EL ACTO ADMINISTRATIVO CORRECTAMENTE') {
			liberar(subPuesto)
		}
        WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Empresa 1_form_templatej_idt24_input'), 'Actos Administrativos')

        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/li_Planta Personal (tal)'))

        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Acto cambio del Empleado'))

        String text5 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Elaborar'))

        String text6 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Eliminar'))

        String text7 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Legalizar'))

        String text8 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Modificar'))

        if (text5 == 'Legalizar') {
            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico1'))
        } else if (text6 == 'Legalizar') {
            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico2'))
        } else if (text7 == 'Legalizar') {
            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico3'))
        } else if (text8 == 'Legalizar') {
            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico4'))
        } else {
            WebUI.acceptAlert()
        }
    }
    
    if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Cancelar'), 1)) {
        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Cancelar'))
    }
    
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
        'Ingreso Definitivo Indefinido Salario Basico')

    WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
        Keys.chord(Keys.ENTER))

    while (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Legalizar/td_Ingreso Definitivo Indefinido Salario Basico'), 
        1)) {
        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/td_Ingreso Definitivo Indefinido Salario Basico'))

        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Continuar'))

        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Aplicar'))

        while (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_incluir'), 1)) {
            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_incluir'))
        }
        
        if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 1)) {
            String puesto = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

            String subPuesto = puesto.substring(43, 48)

            println(subPuesto)

            liberar(subPuesto)

            WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Empresa 1_form_templatej_idt24_input'), 'Actos Administrativos')

            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/li_Planta Personal (tal)'))

            WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Acto cambio del Empleado'))

            String text5 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Elaborar'))

            String text6 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Eliminar'))

            String text7 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Legalizar'))

            String text8 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Modificar'))

            if (text5 == 'Legalizar') {
                WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico1'))
            } else if (text6 == 'Legalizar') {
                WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico2'))
            } else if (text7 == 'Legalizar') {
                WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico3'))
            } else if (text8 == 'Legalizar') {
                WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_ico4'))
            } else {
                WebUI.acceptAlert()
            }
        }
        
        WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
            'Ingreso Definitivo Indefinido Salario Basico')

        WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Filtrar por Actos Administrativos_form_ActosAdministrativostabla_principal_actosj_idt115filter'), 
            Keys.chord(Keys.ENTER))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Cancelar'), 2)) {
        WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Cancelar'))
    }
}

def actualizar() {
    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_SHIFT)

	robot.keyPress(KeyEvent.VK_R)
	
	robot.keyRelease(KeyEvent.VK_CONTROL)
	
	robot.keyRelease(KeyEvent.VK_SHIFT)
    
	robot.keyRelease(KeyEvent.VK_R)
}

def liberar(def subPuesto) {
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Empresa 1_form_templatej_idt24_input'), 'Planta Personal (tal)')

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/li_Planta Personal (tal)'))

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Parametros de Formularios_organigramabuscar'))

    WebUI.selectOptionByIndex(findTestObject('3-OBJECTS UTILIDADES/Legalizar/select_--Seleccione--EmpleadoPuestoUnidad Organizacional'), 
        2, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Puesto_popupBusquedaPlantapuesto'), subPuesto)

    WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/Legalizar/input_Puesto_popupBusquedaPlantapuesto'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/td_20139    - Abogado'))

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/a_Abogado_organigramaj_idt114'))

    WebUI.selectOptionByIndex(findTestObject('3-OBJECTS UTILIDADES/Legalizar/select_-- Seleccione --BloqueadoEliminadoOcupado y disponibleOcupado y disponible'), 
        6)

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Legalizar/span_Actualizar'))
}

