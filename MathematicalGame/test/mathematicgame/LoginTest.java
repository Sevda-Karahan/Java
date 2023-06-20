/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mathematicgame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LoginTest {

    @Test
    public void testIsAbleToLogin_ValidCredentials_ReturnsTrue() {
        Login login = new Login();
        login.getjTextField1().setText("sevda");  // Setting a valid username to the username field
        login.getjPasswordField1().setText("1q2w3e");  // Setting a valid password to the password field

        boolean result = login.isAbleToLogin();

        assertTrue(result);
    }

    @Test
    public void testIsAbleToLogin_InvalidCredentials_ReturnsFalse() {
        Login login = new Login();
        login.getjTextField1().setText("invalid_username");  //  // Setting an invalid username to the username field
        login.getjPasswordField1().setText("invalid_password");  // Setting an invalid password to the password field

        boolean result = login.isAbleToLogin();

        assertFalse(result);
    }
}

