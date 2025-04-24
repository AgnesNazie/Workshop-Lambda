package se.lexicon;

import se.lexicon.data.DataStorage;
import se.lexicon.model.Gender;
import se.lexicon.model.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;

public class Exercises {

    private final static DataStorage storage = DataStorage.INSTANCE;

    /*
       1.	TODO: Find everyone that has firstName: “Erik” using findMany().
    */
    public static void exercise1(String message) {
        System.out.println(message);
        // Use findMany() to get all persons with first name "Erik"
        List<Person> eriks = storage.findMany(person -> person.getFirstName().equals("Erik"));

        // Print each matching person
        for (Person erik : eriks) {
            System.out.println(erik);
        }

        System.out.println("----------------------");
    }

    /*
        2.	TODO: Find all females in the collection using findMany().
     */
    public static void exercise2(String message) {
        System.out.println(message);
        // Use findMany to filter all persons with gender FEMALE
        List<Person> females = storage.findMany(person -> person.getGender().equals(Gender.FEMALE));

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("----------------------");
    }

    /*
        3.	TODO: Find all who are born after (and including) 2000-01-01 using findMany().
     */
    public static void exercise3(String message) {
        System.out.println(message);
        LocalDate date = LocalDate.of(2000, 1, 1);
        List<Person> bornAfter2000 = storage.findMany(person -> person.getBirthDate().isAfter(date) || person.getBirthDate().isEqual(date));

        for (Person person : bornAfter2000) {
            System.out.println(person);
        }

        System.out.println("----------------------");
    }

    /*
        4.	TODO: Find the Person that has an id of 123 using findOne().
     */
    public static void exercise4(String message) {
        System.out.println(message);
        Person person = storage.findOne(p -> p.getId() == 123);
        if (person != null) {
            System.out.println(person);
        } else {
            System.out.println("No person found with id 123");

        }


        System.out.println("----------------------");
    }

    /*
        5.	TODO: Find the Person that has an id of 456 and convert to String with following content:
            “Name: Nisse Nilsson born 1999-09-09”. Use findOneAndMapToString().
     */
    public static void exercise5(String message) {
        System.out.println(message);
        String result = storage.findOneAndMapToString(p -> p.getId() == 456,
                p -> "Name: " + p.getFirstName() + " " + p.getLastName() + " born " + p.getBirthDate()
        );
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No person found with id 456");

        }


        System.out.println("----------------------");
    }

    /*
        6.	TODO: Find all male people whose names start with “E” and convert each to a String using findManyAndMapEachToString().
     */
    public static void exercise6(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        7.	TODO: Find all people who are below age of 10 and convert them to a String like this:
            “Olle Svensson 9 years”. Use findManyAndMapEachToString() method.
     */
    public static void exercise7(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        8.	TODO: Using findAndDo() print out all people with firstName “Ulf”.
     */
    public static void exercise8(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        9.	TODO: Using findAndDo() print out everyone who have their lastName contain their firstName.
     */
    public static void exercise9(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        10.	TODO: Using findAndDo() print out the firstName and lastName of everyone whose firstName is a palindrome.
     */
    public static void exercise10(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        11.	TODO: Using findAndSort() find everyone whose firstName starts with A sorted by birthdate.
     */
    public static void exercise11(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        12.	TODO: Using findAndSort() find everyone born before 1950 sorted reversed by lastest to earliest.
     */
    public static void exercise12(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

    /*
        13.	TODO: Using findAndSort() find everyone sorted in following order: lastName > firstName > birthDate.
     */
    public static void exercise13(String message) {
        System.out.println(message);
        //Write your code here

        System.out.println("----------------------");
    }

}