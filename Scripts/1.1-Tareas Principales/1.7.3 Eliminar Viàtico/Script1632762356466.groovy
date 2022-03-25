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

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Listado de Viaticos')

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    '2021')

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
    5)

WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Nuevo'))

WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Modificar una solicitud de vitico'))

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Documento_form_listadoviaticosfechaViat_input'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Documento_form_listadoviaticosfechaViat_input'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_01072021'), 
    1)) {
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_01072021'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        0)

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        '01/07/2021')

    WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/input_Nmero_form_detalleviaticosNumero'), 
        '5')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/textarea_Motivo Modificacin_form_detalleviaticosmotivoModificacion'), 
        'pruebas katalon')

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Guardar'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Complementario'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 45 EMPLEADO'), 
        1)) {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 45 EMPLEADO'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Complementario'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si'))
    }
    
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Costos'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 5 EMPLEADO'), 
        1)) {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 5 EMPLEADO'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar'))
    }
    
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Programacin'))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_5'), 
        1)) {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_5'))

        WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Archivo'), 
            0)

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Archivo'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_ archivo'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_ archivo'))

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Aceptar'))
        }
        
        WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Otras Entidades'), 
            0)

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Otras Entidades'))

        if(WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Otras Entidades'), 
            0)) {

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Otras Entidades'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_Otras Entidades'))
        }
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Entidades Vigiladas'))

        if(WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_123'), 
            1))
        {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_eliminar_Entidades Vigiladas'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar Entidades vigiladas'))
        }
        WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Detalle'), 
            0)

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Detalle'))
		
		WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Programacion'),
			1){
		
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Programacion'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_eliminar Programacion'))
        }
		}
    
    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Viatico'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_viatico'))
} else {
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Cerrar_Modificar_viaticos'))

    WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
        2)

    if (WebUI.waitForElementPresent(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Prueba Plan Inversin'), 
        1)) {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Prueba Plan Inversin'))

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Complementario'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 45 EMPLEADO'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 45 EMPLEADO'))

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Complementario'))

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si'))
        }
        
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Costos'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 5 EMPLEADO'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_QUINTERO 5 EMPLEADO'))

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar'))
        }
        
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Programacin'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_5'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_5'))

            WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Archivo'), 
                0)

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Archivo'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_ archivo'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_ archivo'))

                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Aceptar'))
            }
            
            WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Otras Entidades'), 
                0)

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Otras Entidades'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Otras Entidades'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Otras Entidades'))

                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_Otras Entidades'))
            }
            
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Entidades Vigiladas'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/td_123'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_eliminar_Entidades Vigiladas'))

                if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar Entidades vigiladas'), 
                    1)) {
                    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar Entidades vigiladas'))
                } else {
                    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_eliminar_Entidades Vigiladas - Copy'))

                    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar Entidades vigiladas'))
                }
            }
            
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Detalle'), FailureHandling.STOP_ON_FAILURE)

            if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Programacion'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Programacion'))

                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_eliminar Programacion'))

                WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/p_El registro ha sido borrado'), 
                    0)
            }
        }
        
        WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'), 
            0)

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'))

        if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_viaticos2'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_viaticos2'))

            WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_viatico'), 
                0)

            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_viatico'))
        }
        
        if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Detalle'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Detalle'))

            if (WebUI.waitForElementPresent(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar'))

                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si'))
            }
        }
        
        if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'), 
            1)) {
            WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Registro'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Viatico'), 
                1)) {
                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/a_Eliminar_Viatico'))

                WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Eliminar Viàticos/span_Si_Eliminar_viatico'))
            }
        }
    }
}

