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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Listado de Viaticos'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    '2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
    5)

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'), 
        Keys.chord(Keys.F5))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))
    } else {
        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/td_QUINTERO 5 EMPLEADO'))

        WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
            '2')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Valor Pagado UD_form_popupcostoviaticosvalorPagadoUD'), 
            '1500000')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Excedente_form_popupcostoviaticosvalorExcedente'), 
            '10000')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfactura'), 
            '5')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfechafactura_input'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'), 
            '1')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Guardar_costo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Cerrar_ventana_Crear'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))
    }
    
    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
    }
    
    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select__--Seleccione--Nota CreditoReembolsoRevisin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select__--Seleccione--Nota CreditoReembolsoRevisin'), 
        '1')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Nota Credito_form'), 
        '5')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha De Nota Crdito_form_Nota credito'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha Resolucin_form_Nota_credito'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor_form_Nota_credito'), 
        '10')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Resolucin_Nota_credito'), 
        '5')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Nota_credito'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        '2')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        'listado de viaticos')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
        0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        '2021')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        Keys.chord(Keys.ENTER))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
        5)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))
    } else {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
    }
    
    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        '3')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_revision'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
        '3')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        'listado de viaticos')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
        0)

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        '2021')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        Keys.chord(Keys.ENTER))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
        5)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Nuevo Reutilizar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
        '2')

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_fecha_01072021'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_fecha_01072021'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'))

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--- Seleccione Tipo Costo --SEGUROViatico prueba'), 
        2)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
        '3')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha_revision'), 
        '01/07/2021')

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor A Revisar_revision'), 
        '10')

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

    WebUI.getText(findTestObject('Alerta/Alerta'))
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
        2)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        '2021')

    WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cerrar Desembolsar'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cerrar Desembolsar'))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha_Cierre desembolso'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_TRM_Cierre desembolso'), 
            '5')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Cierre desembolso'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'), 
            Keys.chord(Keys.F5))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Nuevo1_costo'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Funcionario_form_popupComplementarioViaticoj_idt332'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO2'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO2'))

        WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Complementario de Viáticos/select_--- Seleccione Tipo Costo --Viatico prueba--complementario'), 
            '2')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Valor Pagado UD_form_popupcostoviaticosvalorPagadoUD'), 
            '1500000')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Excedente_form_popupcostoviaticosvalorExcedente'), 
            '10000')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfactura'), 
            '5')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_Factura_form_popupcostoviaticosfechafactura_input'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'), 
            '1')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/input_viatico_form_popupcostoviaticosdestino'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Costos de Viáticos/a_Guardar_costo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Cerrar_ventana_ Crear costos'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))
        } else {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
        }
        
        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            '1')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Nota Credito_form'), 
            '5')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha De Nota Crdito_form_Nota credito'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha Resolucin_form_Nota_credito'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor_form_Nota_credito'), 
            '10')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Resolucin_Nota_credito'), 
            '5')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Nota_credito'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            '2')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            0)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            'listado de viaticos')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
            0)

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            Keys.chord(Keys.ENTER))

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
            5)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            '2021')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))
        } else {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
        }
        
        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            '3')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_revision'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
            '3')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            0)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            'listado de viaticos')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
            0)

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            '2021')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            Keys.chord(Keys.ENTER))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Programada_Anulacion'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Barranquilla (cerrejonn)'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Nuevo Reutilizar'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
            '2')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
            0)

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
            '3')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha_revision'), 
            '01/07/2021')

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor A Revisar_revision'), 
            '10')

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

        WebUI.getText(findTestObject('Alerta/Alerta'))

        WebUI.closeBrowser()
    } else {
        WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.6.1 Costos de Viáticos'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            0)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            'listado de viaticos')

        WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
            0)

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
            Keys.chord(Keys.ENTER))

        WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
            2)

        WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            '2021')

        WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
            Keys.chord(Keys.ENTER))

        if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_fecha_01072021'), 
            1)) {
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Cerrar_ventana_ Crear costos'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_fecha_01072021'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Registro'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cerrar Desembolsar'))

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha_Cierre desembolso'), 
                '01/07/2021')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_TRM_Cierre desembolso'), 
                '5')

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Cierre desembolso'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

            WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'), 
                Keys.chord(Keys.F5))

            WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))

            if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
                1)) {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                    0)

                WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                    '1')

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Nota Credito_form'), 
                    '5')

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha De Nota Crdito_form_Nota credito'), 
                    '01/07/2021')

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha Resolucin_form_Nota_credito'), 
                    '01/07/2021')

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor_form_Nota_credito'), 
                    '10')

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Resolucin_Nota_credito'), 
                    '5')

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Nota_credito'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
                    0)

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                    0)

                WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                    '2')

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'), 
                    0)

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                    0)

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                    'listado de viaticos')

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
                    0)

                WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                    Keys.chord(Keys.ENTER))

                WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
                    '2021')

                WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/input_Ao_form_listadoviaticosanio'), 
                    Keys.chord(Keys.ENTER))

                WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Crear viatico/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
                    5)

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

                WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
                    0)

                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))
            } else {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
            }
            
            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
                '1')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Nota Credito_form'), 
                '5')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha De Nota Crdito_form_Nota credito'), 
                '01/07/2021')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha Resolucin_form_Nota_credito'), 
                '01/07/2021')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor_form_Nota_credito'), 
                '10')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Nmero Resolucin_Nota_credito'), 
                '5')

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Nota_credito'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                '2')

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                0)

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                'listado de viaticos')

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
                0)

            WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                Keys.chord(Keys.ENTER))

            WebUI.selectOptionByIndex(findTestObject('Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--AnuladoAutorizadaDerogadaNo AutorizadaProgramadaSolicitado'), 
                5)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_estado_null'))

            if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'), 
                1)) {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Anular_Costo'))
            } else {
                WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))
            }
            
            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                '3')

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_revision'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_cerrar_costo_viaticos'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Viticos_cerrar_menu'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/label_Viaticos'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Listado Costos Pendientes'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--revision'), 
                '3')

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                0)

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                'listado de viaticos')

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/li_Listado de Viaticos (act)'), 
                0)

            WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
                Keys.chord(Keys.ENTER))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Programada_Anulacion'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/span_Barranquilla (cerrejonn)'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Costos_Anulacion'))

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Nuevo Reutilizar'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoRevisin'), 
                '2')

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_01072021'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Programacin_form_popupcostoviaticosj_idt150'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/td_QUINTERO 5 EMPLEADO'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Guardar_Nuevo_Reutilizar'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'), 
                0)

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Cambiar estado'))

            WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                0)

            WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/select_--Seleccione--Nota CreditoReembolsoRevisin'), 
                '3')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Fecha_revision'), 
                '01/07/2021')

            WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/input_Valor A Revisar_revision'), 
                '10')

            WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Actos Administrativos/Modulo Viáticos/Anulación y Legalización de viáticos/a_Aplicar_Reembolso'))

            WebUI.getText(findTestObject('Alerta/Alerta'))

            WebUI.closeBrowser()
        }
    }
}

