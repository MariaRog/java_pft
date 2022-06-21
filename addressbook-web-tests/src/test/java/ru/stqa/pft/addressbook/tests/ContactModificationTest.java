package ru.stqa.pft.addressbook.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getNavigationHelper().returnHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Maria",
          "Rogovskaya", "+79058075659", "mtishinskikh@mail.ru", "test1"), true);
    }
    app.getContactHelper().selectModificationContact();
    app.getContactHelper().fillContactForm(new ContactData("Семён", "Роговский", "+79221140175", "stilod@mail.ru", null), false);
    app.getContactHelper().updateModificationContact();
    app.getNavigationHelper().returnHomePage();
  }
}
