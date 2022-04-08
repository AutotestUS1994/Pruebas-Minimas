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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Registrar / Nov')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/li_Registrar  Nov. Caso Atep (sst)'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --SEDE NORTESEDE OCCIDENTESEDE SUR1'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nombre_form_listadoSolicitudElementoj_idt65'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'))

    if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_1010220596 - A A A'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_1010220596 - A A A'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Dictamen'))

        if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_ALMANZA NOVOA JOHN ALEXANDRE'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_ALMANZA NOVOA JOHN ALEXANDRE'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Eliminar2'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_Si2'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Regresar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nombre_form_listadoSolicitudElementoj_idt65'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
            'A A A')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Novedades'))

        if (WebUI.waitForElementPresent(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_Seguridad y Salud en el Trabajo - Parmetro Bsico'), 
            1)) {
            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_Seguridad y Salud en el Trabajo - Parmetro Bsico'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/label_Novedad Caso Atep'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Eliminar3'))

            WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_Si3'))
        }
        
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Regresar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nombre_form_listadoSolicitudElementoj_idt65'))

        WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
            'A A A')

        WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Ver'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Aceptar_Eliminar'))
    }
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_SEDE NORTE_ui-icon ui-icon-closethick'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nuevo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Identificacin_form_popupCasoAteptabj_idt102'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt795'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt795'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --SEDE NORTESEDE OCCIDENTESEDE SUR'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_--Seleccione--AccidenteEnfermedad ComnEnfermedad Laboral'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --Aula InteligenteSala de JuntasSalon ExternoSalon Principal'), 
    4)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --COOPERADOESTUDIANTE O APRENDIZINDEPENDIENTEMISIONPLANTA'), 
    5)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --EPS - ALIANSALUD EPSEPS - CAFESALUDEPS'), 
    8)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --ALMANZA NOVOA JOHN ALEXANDREAYA SILVA CINDY'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Diagnstico Preliminar_form_popupCasoAteptabj_idt139'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/td_Prueba'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Guardar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --SEDE NORTESEDE OCCIDENTESEDE SUR1'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nombre_form_listadoSolicitudElementoj_idt65'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
    'A A A')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt7951'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_A A A'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Novedades'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nuevo1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/label_Novedad Caso Atep'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --ALMANZA NOVOA JOHN ALEXANDREAYA SILVA'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --NOVEDAD SALUD OCUPACIONAL'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/textarea_Observacin_form_popupNovedadAtepobservacion'), 
    'Prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Guardar1'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Regresar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Dictamen'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Nuevo2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/label_Dictamen Caso Atep'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --AFPARLARPEPSJUNTA'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/select_-- SELECCIONAR --ALMANZA NOVOA JOHN'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/label_Calificacin prdida capacidad laboral'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/label_Determinacin Origen'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes/a_Guardar2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas SST/Seguimiento_a_accidente laborales_enfermedades_laborales_y_comunes (1)/span_No se encontr registros_ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

