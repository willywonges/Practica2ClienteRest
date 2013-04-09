/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoTest;

import alumno.excepcion.DAOExcepcion;
import alumno.rest.AlumnoCliente;
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
public class CuentaAlumnosTest {
    
    public CuentaAlumnosTest() {
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
  public void cuenta() {

        AlumnoCliente neg = new AlumnoCliente();

        try {
            String cuenta = neg.countREST();
            System.out.println("Total de alumnos = "+cuenta);
        } catch (UniformInterfaceException e) {
            Assert.fail("Fallo: " + e.getMessage());
        }
    }
    
}