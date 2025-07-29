package br.com.learning.tdd;

import br.com.learning.tdd.model.Person;
import br.com.learning.tdd.service.IPersonService;
import br.com.learning.tdd.service.PersonService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {

    IPersonService service;
    Person person;

    @BeforeEach
    void setup(){

        person = new Person("Kevin", "Durant", "kdtrey5@nba.com"
                , "Houston, TX - USA", "M");


        service =  new PersonService();
    }

    @Test
    @DisplayName("When create a person with success it should return a person object.")
    void testCreatePerson_When_Success_ReturnPersonObject(){

        //When
        Person actual = service.createPerson(person);

        //Then
        assertNotNull(actual, () -> "The createPerson() shouldn't have return null.");

        assertEquals(person.getId(), actual.getId(), () -> "The ID is incorrect");

        assertAll(actual.getFirstName(),
                () -> assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The first name is different"),
                () -> assertEquals(person.getLastName(), actual.getLastName(), () -> "The last name is different"));
    }

    @Test
    @DisplayName("Should validate a person email")
    void testCreatePerson_ValidateEmail(){
        //Given
        String substring = "@nba.com";

        //When
        Person actual = service.createPerson(person);

        //Then
        if (person.getEmail().contains(substring)){
            System.out.println("The email is valid");
            assertEquals(person.getEmail(), actual.getEmail(), () -> "The email is not valid");
        }

    }
}
