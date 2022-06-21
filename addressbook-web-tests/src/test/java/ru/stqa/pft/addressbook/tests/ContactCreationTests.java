package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().createContact(new ContactData("Maria", "Rogovskaya",
        "+79058075659", "mtishinskikh@mail.ru", "test1"), true);
  }
}
