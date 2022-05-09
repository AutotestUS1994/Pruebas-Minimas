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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
    'Liquidacion Nomina')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/li_Liquidacion Nomina (com)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Periodo Nomina_LiquidacionNominaj_idt68'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_P. MensualJulio2021'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Nombre Persona_LiquidacionNominaj_idt124'), 
    '1026588953')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Nombre Persona_LiquidacionNominaj_idt124'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/td_Aya Silva Cindy Ximena'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidacin Periodica'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Ver'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Pagos o Descuentos Extra'), 
        1)) {
        String Resultado = 'PRUEBA OK'

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Concepto'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Si'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidacin Periodica'))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Ver'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Pagos o Descuentos Extra'), 
            1)) {
            String Resultado = 'PRUEBA OK'

            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    } else {
        WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/A.1-Pruebas_compensaciones/11.1.4-Fuente_General'), [:], 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Empresa 1_form_templatej_idt24_input'), 
            'Liquidacion Nomina')

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/li_Liquidacion Nomina (com)'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Periodo Nomina_LiquidacionNominaj_idt68'))

        WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
            2)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_P. MensualJulio2021'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Nombre Persona_LiquidacionNominaj_idt124'), 
            '1026588953')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/input_Nombre Persona_LiquidacionNominaj_idt124'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/td_Aya Silva Cindy Ximena'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidacin Periodica'))

        if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Ver'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Pagos o Descuentos Extra'), 
                1)) {
                String Resultado = 'PRUEBA OK'

                WebUI.closeBrowser()
            } else {
                WebUI.acceptAlert()
            }
        } else {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Concepto'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidar'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Si'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Liquidacin Periodica'))

            if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'), 
                1)) {
                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/span_Prestamo Compaa'))

                WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Ver'))

                if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Liquidación_Nomina/a_Pagos o Descuentos Extra'), 
                    1)) {
                    String Resultado = 'PRUEBA OK'

                    WebUI.closeBrowser()
                } else {
                    WebUI.acceptAlert()
                }
            } else {
                WebUI.acceptAlert()
            }
        }
    }
}

