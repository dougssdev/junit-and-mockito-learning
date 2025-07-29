package br.com.learning.tdd.service;

import br.com.learning.tdd.model.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService{

    @Override
    public Person createPerson(Person person) {
        long id = new AtomicLong().incrementAndGet();
        person.setId(id);
        return person;
    }
}
