import com.zxc.learning.Main;
import com.zxc.learning.Pages.Autorization;
import com.zxc.learning.Pages.MailMainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailEntry extends Main {

    @Test
    public void test1(){
        Autorization autorization = new Autorization(getDriver());
        MailMainPage mailMainPage = new MailMainPage(getDriver());

        autorization.fillField(autorization.emailForm,"timursalakhov96@gmail.com");
        autorization.nextButton.click();
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(autorization.passwordForm));
        autorization.fillField(autorization.passwordForm,"G1nesG1nes");
        autorization.nextButton.click();
        try{
        mailMainPage.inboxMessages.click();}
        catch (StaleElementReferenceException e){
            mailMainPage.inboxMessages.click();
        }
        //Assert.assertEquals("https://mail.google.com/mail/u/0/#inbox",getDriver().getCurrentUrl());
    }
}
