package tn.esprit.spring.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
class UserServiceImplTest {

   // @Disabled("This test is disabled and should not run.")
    @Test
    void testAddUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");

   


  

        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }

    }


     @Test
    void testRemoveUser() {
        // Your test logic for removing a user
        assertTrue(true); // Example assertion
    }

    @Test
    void testUpdateUser() {
        // Your test logic for updating a user
        assertTrue(true); // Example assertion
    }

    @Test
    void testGetUser() {
        // Your test logic for getting a user
        assertTrue(true); // Example assertion
    }

   
  
}