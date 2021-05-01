package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abc", "name", "NamE", "4us.er", "-3USER", "B01"})
    public void isTrueWithThreeOrMoreCharacter(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "AB?!", "AB", "A B"})
    public void isFalseWithLessThenThreeCharacters(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user!", "?!$#", "User%12", "żćźę" })
    public void isFalseWithNotAllowedCharacters(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldThrowExceptionWhenUsernameIsNull (String username) {
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWithEmptyUsername (String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"mail@test.pl", "123.mail@123.pl", "mail.mail@test.pl"})
    public void isTrueWhenEmailContainsCorrectCharacters (String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"?!mail@mail.?*#.com", "mail.1@mail?!.com", "mail!@mail.com"})
    public void isFalseWhenEmailContainsNotAllowedCharacters (String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"mail.mail.pl", "mail.com", "@mail.com", "mail.com@"})
    public void IsFalseWhenEmailDoesNotHaveAtInCorrectPlace (String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void  shouldThrowExceptionWhenEmailIsNull (String email) {
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(email));
    }

    @ParameterizedTest
    @EmptySource
    public void isTrueWhenEmailIsEmpty (String email) { //dlaczego jest True?
        assertTrue(userValidator.validateEmail(email));
    }
}