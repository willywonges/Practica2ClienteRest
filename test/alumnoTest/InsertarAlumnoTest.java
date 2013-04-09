/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoTest;

import alumno.negocio.AlumnoNegocio;
import com.sun.jersey.api.client.UniformInterfaceException;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author u05521
 */
public class InsertarAlumnoTest {
    
    public InsertarAlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  @Test
    // public void hello() {}
   public void insertarAlumnoTest()throws UniformInterfaceException
{

AlumnoNegocio neg=new AlumnoNegocio();
try {
neg.insertarAlumno("0006", "Pérez Sosa", "Olga Xanna", "1970-01-01");
            System.out.println("Se insertó nuevo alumno");
        } catch (UniformInterfaceException e) {
            Assert.fail("Fallo: " + e.getMessage());
        }
    }



  

   
}
