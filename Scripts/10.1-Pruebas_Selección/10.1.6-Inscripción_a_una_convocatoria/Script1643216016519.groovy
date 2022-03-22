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

WebUI.comment('no se puede realizar inscripcion ')

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
    'convocatoria')

WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

String pk1 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy'))

if (pk1 == 'pruebas katalon 10.1.5') {
    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 0'))

    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
        'constantino')

    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
        1)) {
        WebUI.closeBrowser()
    } else {
        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
            'proceso de seleccion')

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
            '52')

        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
            'convocatoria')

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 0'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
            'constantino')

        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
    }
} else {
    String pk2 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 0'))

    if (pk2 == 'pruebas katalon 10.1.5') {
        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 1'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
            'constantino')

        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

        if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
            1)) {
            WebUI.closeBrowser()
        } else {
            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                'proceso de seleccion')

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                '52')

            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                Keys.chord(Keys.ENTER))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                'convocatoria')

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 1'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                'constantino')

            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                Keys.chord(Keys.ENTER))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
        }
    } else {
        String pk3 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 1'))

        if (pk3 == 'pruebas katalon 10.1.5') {
            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 2'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                'constantino')

            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                Keys.chord(Keys.ENTER))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

            if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                1)) {
                WebUI.closeBrowser()
            } else {
                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                    'proceso de seleccion')

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                    '52')

                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                    Keys.chord(Keys.ENTER))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                    'convocatoria')

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 2'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                    'constantino')

                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                    Keys.chord(Keys.ENTER))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
            }
        } else {
            String pk4 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 2'))

            if (pk4 == 'pruebas katalon 10.1.5') {
                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 3'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                    'constantino')

                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                    Keys.chord(Keys.ENTER))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                    1)) {
                    WebUI.closeBrowser()
                } else {
                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                        'proceso de seleccion')

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                        '52')

                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                        Keys.chord(Keys.ENTER))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                        'convocatoria')

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 3'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                        'constantino')

                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                        Keys.chord(Keys.ENTER))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                }
            } else {
                String pk5 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 3'))

                if (pk5 == 'pruebas katalon 10.1.5') {
                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 4'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                        'constantino')

                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                        Keys.chord(Keys.ENTER))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                        1)) {
                        WebUI.closeBrowser()
                    } else {
                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                            'proceso de seleccion')

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                            '52')

                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                            Keys.chord(Keys.ENTER))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                            'convocatoria')

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 4'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                            'constantino')

                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                            Keys.chord(Keys.ENTER))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                    }
                } else {
                    String pk6 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 4'))

                    if (pk6 == 'pruebas katalon 10.1.5') {
                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 5'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                            'constantino')

                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                            Keys.chord(Keys.ENTER))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                        if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                            1)) {
                            WebUI.closeBrowser()
                        } else {
                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                'proceso de seleccion')

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                '52')

                            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                Keys.chord(Keys.ENTER))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                'convocatoria')

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 5'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                'constantino')

                            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                Keys.chord(Keys.ENTER))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                        }
                    } else {
                        String pk7 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 5'))

                        if (pk7 == 'pruebas katalon 10.1.5') {
                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 6'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                'constantino')

                            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                Keys.chord(Keys.ENTER))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                            if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                                1)) {
                                WebUI.closeBrowser()
                            } else {
                                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                    'proceso de seleccion')

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                    '52')

                                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                    Keys.chord(Keys.ENTER))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                    'convocatoria')

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 6'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                    'constantino')

                                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                    Keys.chord(Keys.ENTER))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                            }
                        } else {
                            String pk8 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 6'))

                            if (pk8 == 'pruebas katalon 10.1.5') {
                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 7'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                    'constantino')

                                WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                    Keys.chord(Keys.ENTER))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                                if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                                    1)) {
                                    WebUI.closeBrowser()
                                } else {
                                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                        'proceso de seleccion')

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                        '52')

                                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                        Keys.chord(Keys.ENTER))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                        'convocatoria')

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 7'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                        'constantino')

                                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                        Keys.chord(Keys.ENTER))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                                }
                            } else {
                                String pk9 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 7'))

                                if (pk9 == 'pruebas katalon 10.1.5') {
                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 8'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                    WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                        'constantino')

                                    WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                        Keys.chord(Keys.ENTER))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                    WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                                    if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                                        1)) {
                                        WebUI.closeBrowser()
                                    } else {
                                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                            'proceso de seleccion')

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                            '52')

                                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                            Keys.chord(Keys.ENTER))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                            'convocatoria')

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 8'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                            'constantino')

                                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                            Keys.chord(Keys.ENTER))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                                    }
                                } else {
                                    String pk10 = WebUI.getText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_pruebas katalon 10.1.5 - Copy 8'))

                                    if (pk10 == 'pruebas katalon 10.1.5') {
                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 9'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                        WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                            'constantino')

                                        WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                            Keys.chord(Keys.ENTER))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                        WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))

                                        if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/p_El candidato ha sido registrado correctamente'), 
                                            1)) {
                                            WebUI.closeBrowser()
                                        } else {
                                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                                'proceso de seleccion')

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/li_Proceso de Seleccion (tal)'))

                                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                                '52')

                                            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Nmero_filtro_procesoseleccionj_idt73'), 
                                                Keys.chord(Keys.ENTER))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_8028     - Analista De Sistemas'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/div_Candidato'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Registro Candidato'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/td_Constantino  Jhon'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Eliminar'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Si'))

                                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Empresa 1_form_templatej_idt24_input'), 
                                                'convocatoria')

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Convocatoria'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Ver - 9'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_Inscribirse'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Identificacin_seleccion_procesopanelCandidatoj_idt744'))

                                            WebUI.setText(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                                'constantino')

                                            WebUI.sendKeys(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/input_Filtro Hoja de Vida_form_popUpCandidatosSeleccionj_idt261'), 
                                                Keys.chord(Keys.ENTER))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/span_CONSTANTINO  JHON'))

                                            WebUI.click(findTestObject('Modulo Selección/Inscripción_a_una_convocatoria/a_Guardar'))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

