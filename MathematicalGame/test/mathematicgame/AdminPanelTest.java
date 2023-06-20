package mathematicgame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class AdminPanelTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
        // Set up any necessary configurations or dependencies before each test
    }

    @AfterEach
    public void tearDown() {
        // Clean up any resources after each test
    }

    @Test
    public void testGetA() {
        AdminPanel.setA(5);
        int result = AdminPanel.getA();
        assertEquals(5, result);
    }

    @Test
    public void testSetA() {
        AdminPanel.setA(10);
        int result = AdminPanel.getA();
        assertEquals(10, result);
    }

    @Test
    public void testGetB() {
        AdminPanel.setB(7);
        int result = AdminPanel.getB();
        assertEquals(7, result);
    }

    @Test
    public void testSetB() {
        AdminPanel.setB(3);
        int result = AdminPanel.getB();
        assertEquals(3, result);
    }

    @Test
    public void testGetN() {
        AdminPanel.setN(20);
        int result = AdminPanel.getN();
        assertEquals(20, result);
    }

    @Test
    public void testSetN() {
        AdminPanel.setN(15);
        int result = AdminPanel.getN();
        assertEquals(15, result);
    }
}
