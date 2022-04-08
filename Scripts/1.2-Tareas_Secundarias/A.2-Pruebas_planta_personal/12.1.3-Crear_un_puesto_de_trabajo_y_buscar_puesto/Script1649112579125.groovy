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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/input_Empresa 1_form_templatej_idt24_input'), 
    'Planta personal (tal)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Planta Personal (tal)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Administracion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Posicion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Administracion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/a_Posicion_organigramanuevoPuestoTrabajo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/a_Cargo_datosPuestoTrabajo_formj_idt931'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_ABOGADO'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_-- Seleccione --Planta Dinamica                (1)Planta Fija                    (B1)'), 
    1)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_-- Seleccione --Ampleado                       (Z3)Empleado                       (B3)Mapa'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_-- Seleccione --BloqueadoEliminadoOcupado y disponible'), 
    6)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/label_No es responsable de la Unidad'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/label_No'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Actualizar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/a_Zona Econmica_datosPuestoTrabajo_formj_idt1061'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_ADMINISTRATIVA'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_-- Seleccione empleados_lineacosto --ADMINISTRATIVO -- 1NO RELACIONADA'), 
    1)

WebUI.selectOptionByLabel(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_-- Seleccione Ubicacin Fsica --ABEJORRALABREGOACACIASACANDIACEVEDOACHIAGRADO'), 
    'BOGOTÁ', false)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_2120 HORAS1240 HORAS0NO DEFINIDO61Pensin'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_12kataloonkataloonNOMINA CATORCENALNOMINA'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_0.5APRENDIZ ETAPA LECTIVA6APRENDIZ ETAPA PRODUCTIVA'), 
    7)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/select_ADMINISTRATIVOSAPRENDICESEMPLEADOFBROLESTSMECANICOS'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/input_Mesada_datosPuestoTrabajo_formsueldo'), 
    '150000')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/span_Actualizar'))

String Puesto = WebUI.getAttribute(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/a_puesto'), 
    'Value')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Listado_Empleados/input_Empresa 1_form_templatej_idt24_input (1)'), 'planta personal (tal)')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/span_Planta Personal (ta'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/a_Actos Administrativos_organigramabuscar'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/select_--Seleccione--EmpleadoPuesto'), 
    2)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/a_Cargo_popupBusquedaPlantaj_idt279'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/a_Unidad Organizacional_popupBusquedaPlantaj_idt274'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/input_Unidad_form_popupUnidadUsuarioj_idt880'), 
    'administracion')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/input_Unidad_form_popupUnidadUsuarioj_idt880'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/span_ADMINISTRACION'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/a_Cargo_popupBusquedaPlantaj_idt2790'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/span_ABOGADO'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/input_Buscar'), Puesto)

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/input_Buscar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/span_20139    - Abogado'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Buscar_puesto_de_trabajo/a_Abogado_organigramaj_idt113'))

WebUI.scrollToElement(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas planta personal/Crear_un_puesto_de_trabajo/a_puesto'), 0)

WebUI.closeBrowser()

