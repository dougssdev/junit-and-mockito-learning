package br.com.learning.tdd.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String gender;

    public Person(String firstName, String lastName, String email, String address, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }
}
