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
import static org.junit.Assert.*;

/**
 *
 * @author u05521
 */
public class BuscarAlumnoXCodigoTest {
    
    public BuscarAlumnoXCodigoTest() {
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
       public void buscarAlumnoXCodigoTest()throws UniformInterfaceException
{

AlumnoNegocio neg=new AlumnoNegocio();
try {
neg.buscarAlumnoXCodigo("0006");
  System.out.println("Se encontró el alumno");
        } catch (UniformInterfaceException e) {
            Assert.fail("Fallo: " + e.getMessage());
        }
    }
}