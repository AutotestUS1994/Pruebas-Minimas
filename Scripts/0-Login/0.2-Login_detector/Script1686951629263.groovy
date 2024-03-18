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

String identificador = GlobalVariable.G_Identificador

if (identificador != 'weblogic') {
    WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    version()
}

def version() {
    String user = GlobalVariable.G_Usuario

    WebUI.openBrowser('http://192.168.20.44:7001/console/')

    WebUI.maximizeWindow()

    WebUI.getText(findTestObject('0-Login/0.1-Login/div_Versin de WebLogic Server 12.2.1.0.0'))

    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_T)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.keyRelease(KeyEvent.VK_T)

    WebUI.switchToWindowIndex(1)

    String url = GlobalVariable.G_Login

    WebUI.navigateToUrl(url)

    WebUI.setText(findTestObject('0-Login/0.1-Login/input_Olvid mi Clave_loginusuario'), user)

    WebUI.setEncryptedText(findTestObject('0-Login/0.1-Login/input_Olvid mi Clave_loginpassword'), 'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

    WebUI.click(findTestObject('0-Login/0.1-Login/a_Ingresar'))

    if (WebUI.waitForElementVisible(findTestObject('0-Login/0.1-Login/input_Empresa 1_form_templatej_idt24_input'), 0)) {
        String Result = 'login ok'
    } else {
        WebUI.acceptAlert()
    }
}

