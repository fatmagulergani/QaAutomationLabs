package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;


public class BaseTest {

    Actions actions = new Actions(Driver.getDriver());
    QaAutomationLabsMainPage mainPage = new QaAutomationLabsMainPage();
    QaAutomationLabsCheckBoxPage checkBoxPage = new QaAutomationLabsCheckBoxPage();
    QaAutomationLabsRadioButtonPage radioButtonPage = new QaAutomationLabsRadioButtonPage();
    QaAutomationLabsDropDownPage dropDownPage = new QaAutomationLabsDropDownPage();
    QaAutomationLabsFormPage formPage = new QaAutomationLabsFormPage();
    QaAutomationLabsWebTablePage webTablePage = new QaAutomationLabsWebTablePage();
    QaAutomationLabsIFramePage iFramePage = new QaAutomationLabsIFramePage();
    QaAutomationLabsShadowDomPage shadowDomPage = new QaAutomationLabsShadowDomPage();
    QaAutomationLabsDragAndDropPage dragAndDropPage = new QaAutomationLabsDragAndDropPage();
    QaAutomationLabsNotificationsPage notificationsPage = new QaAutomationLabsNotificationsPage();
    QaAutomationLabsAlertPage alertPage = new QaAutomationLabsAlertPage();

    @BeforeMethod
    public void setUp() {
        mainPage.openPage(ConfigReader.getProperty("testLink"));
        mainPage.verifyMainPageIsOpen();
    }

    /*@AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }*/
}
