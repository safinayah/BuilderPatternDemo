/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayah
 */
public class Main {

    public static void main(String args[]) {
        PersonBuilder builder = new PersonBuilder();
        builder.setNewCity("ramallah");
        builder.setNewFirstName("ayah");
        builder.setNewIsFemale(true);

        PersonBuilder builder2 = new PersonBuilder();

        builder2.setNewFirstName("foo");
        builder2.setNewIsEmployed(false);
        builder2.setNewLastName("bar");

        //note that in person builder i van build the person using method not contructors 
        Person person;
        person = new Person("safin", "ayah", "nasser", "", null, "", "", "", true, true, true);
    }
}
