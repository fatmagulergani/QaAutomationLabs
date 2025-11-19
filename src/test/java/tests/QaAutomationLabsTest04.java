package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Form under Tools Demo
5. Verify 'Input form validations Demo' is visible
6. Click 'Submit'
7. Verify that the first name field is required
8. Fill the 'First Name' field
9. Click 'Submit'
10.Verify that the middle name field is required
11.Fill the 'Middle Name' field with ' '
12.Click 'Submit'
13.Verify that the last name field is required
14.Fill the 'Last Name' field
15.Click 'Submit'
16.Verify that the email field is required
17.Fill the 'Email' field with invalid format
18.Verify that the email field is valid format
19.Click 'Submit'
20.Verify that the email field is required
21.Fill the 'Email' field with valid format
22.Click 'Submit'
23.Verify that the password field is required
24.Fill the 'Password' field with invalid format
25.Click 'Submit'
26.Verify that the password invalid format
27.Fill the 'Password' field with valid format
28.Click 'Submit'
29.Verify that the address field is required
30.Fill the 'Address' field
31.Click 'Submit'
32.Verify that the city field is required
33.Fill the 'City' field
34.Click 'Submit'
35.Verify that the state field is required
36.Fill the 'State' field
37.Click 'Submit'
38.Verify that the pin code field is required
39.Fill the 'Pin Code' field
40.Click 'Submit'
41.Verify all fields are required
42.Fill the 'Middle Name' field
43.Verify that the form was successfully submitted
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class QaAutomationLabsTest04 extends BaseTest {

    @Test
    public void test04() {
        mainPage.formButton.click();
        Assert.assertTrue(formPage.formTitle.isDisplayed());

        formPage.submitButton.click();
        String actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.firstName);
        String expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.firstName.sendKeys("Fatoshi");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.middleName);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.middleName.sendKeys(" ");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.lastName);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.lastName.sendKeys("Last");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.email);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.email.sendKeys("fatoshi");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.email);
        expectedText = "Please include an '@' in the email address. 'fatoshi' is missing an '@'.";
        Assert.assertEquals(actualText, expectedText);

        formPage.email.clear();
        formPage.email.sendKeys("fatoshi@nehaber.com");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.password);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.password.sendKeys("1111");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.password);
        expectedText = "Please lengthen this text to 6 characters or more (you are currently using 4 characters).";
        Assert.assertEquals(actualText, expectedText);

        formPage.password.sendKeys("11");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.address);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.address.sendKeys("address");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.city);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.city.sendKeys("City");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.state);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.state.sendKeys("State");

        formPage.submitButton.click();
        actualText = (String) ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].validationMessage;", formPage.pinCode);
        expectedText = "Please fill out this field.";
        Assert.assertEquals(actualText, expectedText);

        formPage.pinCode.sendKeys("1111");

        formPage.submitButton.click();

        Alert alerts = Driver.getDriver().switchTo().alert();
        String message = alerts.getText();
        Assert.assertEquals(message, "All fields are required.");
        alerts.accept();

        formPage.middleName.sendKeys("Middle");
        formPage.submitButton.click();

        actualText = formPage.message.getText();
        expectedText = "Form submitted successfully";
        Assert.assertEquals(actualText, expectedText);


    }
}
