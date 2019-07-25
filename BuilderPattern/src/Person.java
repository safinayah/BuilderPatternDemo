/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayah
 */

    
    public class Person
{
   private final String lastName;
   private final String firstName;
   private final String middleName;
   private final String salutation;
   private final String suffix;
   private final String streetAddress;
   private final String city;
   private final String state;
   private final boolean isFemale;
   private final boolean isEmployed;
   private final boolean isHomewOwner;

   public Person(
      final String newLastName,
      final String newFirstName,
      final String newMiddleName,
      final String newSalutation,
      final String newSuffix,
      final String newStreetAddress,
      final String newCity,
      final String newState,
      final boolean newIsFemale,
      final boolean newIsEmployed,
      final boolean newIsHomeOwner)
   {
      this.lastName = newLastName;
      this.firstName = newFirstName;
      this.middleName = newMiddleName;
      this.salutation = newSalutation;
      this.suffix = newSuffix;
      this.streetAddress = newStreetAddress;
      this.city = newCity;
      this.state = newState;
      this.isFemale = newIsFemale;
      this.isEmployed = newIsEmployed;
      this.isHomewOwner = newIsHomeOwner;
   }
   
   
}
