package com.first;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testPrintAttributes() {
        Person person = new Person("Javier", "Martinez", "123456789", 1990, "Cuba", 'H');

        assertEquals("Javier", person.getFirstName());
        assertEquals("Martinez", person.getLastName());
        assertEquals("123456789", person.getIdNumber());
        assertEquals(1990, person.getBirthDate());
        assertEquals("Cuba", person.getCountryOfBirth());
        assertEquals('H', person.getGender());
    }
}
