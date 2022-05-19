package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String homeTelefon;
  private final String email;

  public ContactData(String firstName, String lastName, String homeTelefon, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeTelefon = homeTelefon;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getHomeTelefon() {
    return homeTelefon;
  }

  public String getEmail() {
    return email;
  }
}
