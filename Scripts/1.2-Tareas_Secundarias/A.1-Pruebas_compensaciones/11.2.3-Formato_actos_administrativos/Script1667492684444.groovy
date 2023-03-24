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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Empresa 1_form_templatej_idt24_input'), 
    'Formato (act)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/li_Formato (act)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Cambio Del Empleado'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'INGRESO - DEFINITIVO')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_INGRESO - DEFINITIVO'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneHorario Fijo De TiempoNo Registrar En TiempoProgramacion Turno En Tiempos'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneUnivalle - Semestre PromedioUnivalle - Validar EstudianteUnivalle - Validar Ingreso'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SUSTITUCIN PATRONALUNILATERAL DEL EMPLEADOJUSTA CAUSATERMINACION DE'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Vinculacin --.APRENDIZ ETAPA LECTIVAAPRENDIZ ETAPA PRODUCTIVAASISTENTE'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Tipo Puesto --PLANTA DINAMICA               PLANTA FIJA'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Clase Puesto --EMPLEADO                      NUEVA ADMIN                   AMPLEADO'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracionEn el mismo formato en elaboracion'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt273'), 
    '1_Pruebas')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt275'), 
    '2_Pruebas')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String ingresoDefinitivo = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (ingresoDefinitivo == 'Registro Actualizado') {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneHorario Fijo De TiempoNo Registrar En TiempoProgramacion Turno En Tiempos'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneUnivalle - Semestre PromedioUnivalle - Validar EstudianteUnivalle - Validar Ingreso'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SUSTITUCIN PATRONALUNILATERAL DEL EMPLEADOJUSTA CAUSATERMINACION DE'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Vinculacin --.APRENDIZ ETAPA LECTIVAAPRENDIZ ETAPA PRODUCTIVAASISTENTE'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Tipo Puesto --PLANTA DINAMICA               PLANTA FIJA'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Clase Puesto --EMPLEADO                      NUEVA ADMIN                   AMPLEADO'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracionEn el mismo formato en elaboracion'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias'), 
        0)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt273'), 
        '')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt275'), 
        '')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

    String restablecer1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (restablecer1 != 'Registro Actualizado') {
        WebUI.acceptAlert()
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))
}

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'CAMBIO PUESTO')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_Cambio puesto'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneUnivalle - Semestre PromedioUnivalle - Validar EstudianteUnivalle'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi0'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-Seleccione-NoSi'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracionEn el mismo formato en'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ActivoAfectar Retirado'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin1'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias1'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2731'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2751'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String cambioDelEmpleado = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (cambioDelEmpleado == 'Registro Actualizado') {
    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_SeleccioneUnivalle - Semestre PromedioUnivalle - Validar EstudianteUnivalle'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi0'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi1'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-Seleccione-NoSi'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracionEn el mismo formato en'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ActivoAfectar Retirado'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi1'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin1'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias1'), 
        0)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2731'), 
        '')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2751'), 
        '')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

    String restablecer2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (restablecer2 != 'Registro Actualizado') {
        WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'TRASLADO DE FUNCION')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_TRASLADO DE FUNCION_2'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Vinculacin --.APRENDIZ ETAPA LECTIVA_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Tipo Puesto --PLANTA DINAMICA_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Clase Puesto --EMPLEADO_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracion_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera Registro_2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias_2'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt273_2'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt275_2'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String trasladoFuncion = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (trasladoFuncion == 'Registro Actualizado') {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Vinculacin --.APRENDIZ ETAPA LECTIVA_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Tipo Puesto --PLANTA DINAMICA_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Clase Puesto --EMPLEADO_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_NoSi_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--En el mismo formato en elaboracion_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--NoNo AplicaSi_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera Registro_2'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Formato Basicoformato pruebaMaterias_2'), 
        0)

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt273_2'), 
        '')

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt275_2'), 
        '')

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

    String restablecer3 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

    if (restablecer3 != 'Registro Actualizado') {
        WebUI.acceptAlert()
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))
}

verificar2023()

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Vacacines4'))


WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Nuevo4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Formato_form_parametroformatoformato4'), 
    '2023')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Descripcin_form_parametroformatodescripcion4'), 
    'PruebasKatalon')

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_interrupcion de vacaciones4'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_interrupcion de vacaciones4'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_Interrupcin IndividualInterrupcin MasivaInterrupcin Total4'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Adicional_form_parametroformatotabInfoadicional4'), 
    'PruebasAutomaticas')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--APLAZAMIENTOPROGRAMACION DE VACACIONES4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--CorregirDerogar un Acto4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ProcesoInformacin Base del Proceso4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Planilla --PLANILLA APRENDIZPlanilla Prueba4'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione --SiNo4'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Guardar4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2734'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2754'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String vacaciones = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (vacaciones != 'Registro Actualizado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'PRUEBASKATALON')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_PruebasKatalon'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

String eliminar = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (eliminar != 'El formato ha sido eliminado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Ausentismo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Nuevo4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Formato_form_parametroformatoformato5'), 
    '2023')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Descripcin_form_parametroformatodescripcion5'), 
    'PruebasKatalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--InterrupcinTerminacinLicenciaComisionNo AplicaProrroga5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Licencia5'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Adicional_form_parametroformatotabInfoadicional5'), 
    'PruebasAutomaticas')

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_Adm - Prrroga Licencia Ordinaria5'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_Adm - Prrroga Licencia Ordinaria5'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Ausencia  COMISION DE ESTUDIOS REMUNERAD5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--CorregirDerogar un ActoNo AplicaNo Genera Acto Administrativo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ProcesoInformacin Base del Proceso5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Planilla --PLANILLA APRENDIZPlanilla PruebaSALARIO5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione --SiNo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Liberar Puesto TrabajoNo Liberar Puesto Trabajo5'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Guardar4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2735'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2755'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String Ausentismo = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Ausentismo != 'Registro Actualizado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'PRUEBASKATALON')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_PruebasKatalon'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

String eliminar1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (eliminar1 != 'El formato ha sido eliminado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Terminacin Del Contrato'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Nuevo4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Formato_form_parametroformatoformato5'), 
    '2023')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Descripcin_form_parametroformatodescripcion5'), 
    'PruebasKatalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--InterrupcinTerminacinLicenciaComisionNo AplicaProrroga5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Licencia5'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Adicional_form_parametroformatotabInfoadicional5'), 
    'PruebasAutomaticas')

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_Prueba'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_Prueba'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Ausencia  COMISION DE ESTUDIOS REMUNERAD5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--CorregirDerogar un ActoNo AplicaNo Genera Acto Administrativo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ProcesoInformacin Base del Proceso5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Planilla --PLANILLA APRENDIZPlanilla PruebaSALARIO5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione --SiNo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Liberar Puesto TrabajoNo Liberar Puesto Trabajo5'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Guardar4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2735'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2755'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String TerminacionContrato = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (TerminacionContrato != 'Registro Actualizado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'PRUEBASKATALON')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_PruebasKatalon'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

String eliminar2 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (eliminar2 != 'El formato ha sido eliminado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Especiales'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Nuevo4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Formato_form_parametroformatoformato5'), 
    '2023')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Descripcin_form_parametroformatodescripcion5'), 
    'PruebasKatalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--InterrupcinTerminacinLicenciaComisionNo AplicaProrroga5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Licencia5'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Adicional_form_parametroformatotabInfoadicional5'), 
    'PruebasAutomaticas')

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_12'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_12'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Ausencia  COMISION DE ESTUDIOS REMUNERAD5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--CorregirDerogar un ActoNo AplicaNo Genera Acto Administrativo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ProcesoInformacin Base del Proceso5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Planilla --PLANILLA APRENDIZPlanilla PruebaSALARIO5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione --SiNo5'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Guardar4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2735'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2755'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String Especiales = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Especiales != 'Registro Actualizado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'PRUEBASKATALON')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_PruebasKatalon'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

String eliminar3 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (eliminar3 != 'El formato ha sido eliminado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Movimiento Planta'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Nuevo4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Formato_form_parametroformatoformato5'), 
    '2023')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Descripcin_form_parametroformatodescripcion5'), 
    'PruebasKatalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--InterrupcinTerminacinLicenciaComisionNo AplicaProrroga5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Licencia5'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Adicional_form_parametroformatotabInfoadicional5'), 
    'PruebasAutomaticas')

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_123123123'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_CAMBIO DE UBICACION'))
} else {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Predecesor_form_parametroformatotabInfoj_idt143 - Copy'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_CAMBIO DE UBICACION'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Ausencia  COMISION DE ESTUDIOS REMUNERAD5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Frmula --ACTO ADM - AUMENTO DE SUELDO (TODAS LAS VINCULAC)5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--CorregirDerogar un ActoNo AplicaNo Genera Acto Administrativo5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--No Genera RegistroNo Requiere LegalizacinRequiere Legalizacin5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_--Seleccione--Afecta ProcesoInformacin Base del Proceso5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione Planilla --PLANILLA APRENDIZPlanilla PruebaSALARIO5'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/select_-- Seleccione --SiNo5'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Guardar4'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 1_form_parametroformatotabInfoj_idt2735'), 
    'Pruebas 1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Titulo 2_form_parametroformatotabInfoj_idt2755'), 
    'Pruebas 2')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Actualizar'))

String MovimientoPlanta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (MovimientoPlanta != 'Registro Actualizado') {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Regresar'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    'PRUEBASKATALON')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/span_PruebasKatalon'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

String eliminar4 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (eliminar4 != 'El formato ha sido eliminado') {
    WebUI.acceptAlert()
} else {
    WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
}

def verificar2023() {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Vacacines4'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        '2023')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

        String result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (result1 != '') {
        } else {
            WebUI.acceptAlert()
        }
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Ausentismo'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        '2023')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

        String result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (result1 != '') {
        } else {
            WebUI.acceptAlert()
        }
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Terminacin Del Contrato'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        '2023')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

        String result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (result1 != '') {
        } else {
            WebUI.acceptAlert()
        }
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Especiales'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        '2023')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

        String result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (result1 != '') {
        } else {
            WebUI.acceptAlert()
        }
    }
    
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Movimiento Planta'))

    WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        '2023')

    WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/input_Bsqueda_form_parametroformatoconceptofiltro'), 
        Keys.chord(Keys.ENTER))

    if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'), 
        1)) {
        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/td_2023'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Eliminar'))

        WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Formato_actos_administrativos/a_Aceptar'))

        String result1 = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

        if (result1 != '') {
        } else {
            WebUI.acceptAlert()
        }
    }
}

