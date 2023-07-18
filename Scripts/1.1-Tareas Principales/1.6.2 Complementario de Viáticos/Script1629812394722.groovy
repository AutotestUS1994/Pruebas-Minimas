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

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    '2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
    2)

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Eliminar_complementario'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Si_eliminar'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Nuevo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Filtro Empleado_form_popupEmpleadoj_idt561'), 
        'QUINTERO 45 EMPLEADO')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Filtro Empleado_form_popupEmpleadoj_idt561'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado_Complementario'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Fecha Inicial_form_popupComplementarioViaticofechainicial_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Fecha Final_form_popupComplementarioViaticofechafinal_input'), 
        '01/11/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Cantidad_form_popupComplementarioViaticocantidad'), 
        '10')

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--comple'), 
        '1')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Cdp_form_popupComplementarioViaticodocumento'), 
        '1019')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_TRM Proyectada_form_popupComplementarioViaticotrm'), 
        '5')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Guardar_complemento'))

    String Result0 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_E_ui-icon ui-icon-closethick'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Registro'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Registro'))
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Nuevo'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Nuevo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Modificar una solicitud de vitico'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        '01/07/2021')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        Keys.chord(Keys.ESCAPE))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/td_seleccion_01072021'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/td_seleccion_01072021'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/input_Nmero_form_detalleviaticosNumero'), 
            '5')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/textarea_Motivo Modificacin_form_detalleviaticosmotivoModificacion'), 
            'prueba')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Guardar_modficar'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Desembolsar viáticos/a_Regresar'))

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
            2)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Eliminar_complementario'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Si_eliminar'))
        }
    }
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Autorizada_ui-icon ui-icon-closethick'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Autorizada_ui-icon ui-icon-closethick'))

    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.5.9 Crear Viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        'listado de viaticos')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/li_Listado de Viaticos (act)'), 
        0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
        2)

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Complementario'))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Eliminar_complementario'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Si_eliminar'))
        }
        
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Nuevo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Filtro Empleado_form_popupEmpleadoj_idt561'), 
            'QUINTERO 45 EMPLEADO')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Filtro Empleado_form_popupEmpleadoj_idt561'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_Quintero 45 Empleado_Complementario'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Fecha Inicial_form_popupComplementarioViaticofechainicial_input'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Fecha Final_form_popupComplementarioViaticofechafinal_input'), 
            '01/11/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Cantidad_form_popupComplementarioViaticocantidad'), 
            '10')

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--comple'), 
            '1')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_Cdp_form_popupComplementarioViaticodocumento'), 
            '1019')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/input_TRM Proyectada_form_popupComplementarioViaticotrm'), 
            '5')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Guardar_complemento'), 
            1)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Guardar_complemento'))

        WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
    }
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/a_Eliminar'), 
    1)) {
    

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

