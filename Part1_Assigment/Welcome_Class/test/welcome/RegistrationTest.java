/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package Welcome;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertaion.*;
//port Welcome.Registration;
        

/**
 *
 * @author tyatya
 */
public class RegistrationTest {
     Registration registration;
    
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       registration = new Registration();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Registration.
     */
    @org.junit.Test
    public void testcheckUserName() {
        String username = "kyl_l";
        assertTrue( Registration.checkUserName(username), "User is correctly formatted");
                
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertTrue(boolean checkUserName, String username_is_correctly_formatted) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
