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

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/li_Listado de Viaticos (act)'), 
    0)

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    '2021')

WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/select_--Seleccione--Estado'), 
    2)

if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'), 
    2)) {
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/span_5'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'))

    WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'), Keys.chord(
            Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN))

    if (WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'), 
        2)) {
        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'))

        WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Eliminar_Quintero 45 Empleado'), 
            0)

        WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Eliminar_Quintero 45 Empleado'))
    }
    
    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'))

    WebUI.delay(1)

    WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
        '1')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Valor Pagado UD_form_popupcostoviaticosvalorPagadoUD'), 
        '1500000')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Excedente_form_popupcostoviaticosvalorExcedente'), 
        '10000')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfactura'), 
        '5')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfechafactura_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'), 
        '1')

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Guardar_costo'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/p_El registro se ha insertado correctamente'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/span_Cerrar_ Costo viatico'))
} else {
    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo'))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/span_Modificar una solicitud de vitico'))

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        '01/07/2021')

    WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Documento_form_listadoviaticosfechaViat_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_01072021'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        0)

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Fecha_form_detalleviaticosFechaNumero_input'), 
        '01/07/2021')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Nmero_form_detalleviaticosNumero'), 
        '5')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/textarea_prueba'), 'Prueba')

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Guardar'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'))

    WebUI.sendKeys(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Costos'), Keys.chord(
            Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN))

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'))

    WebUI.delay(1)

    WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
        '1')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Valor Pagado UD_form_popupcostoviaticosvalorPagadoUD'), 
        '1500000')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Excedente_form_popupcostoviaticosvalorExcedente'), 
        '10000')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfactura'), 
        '5')

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfechafactura_input'), 
        '01/07/2021')

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'))

    WebUI.setText(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'), 
        '1')

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Guardar_costo'))

    WebUI.waitForElementClickable(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/p_El registro se ha insertado correctamente'), 
        0)

    WebUI.click(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/span_Cerrar_ Costo viatico'))
}

WebUI.getText(findTestObject('Alerta/Alerta'))

