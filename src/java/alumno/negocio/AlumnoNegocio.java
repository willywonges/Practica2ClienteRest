/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.negocio;

import alumno.modelo.TbAlumno;
import alumno.rest.AlumnoCliente;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.UniformInterfaceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u05521
 */
public class AlumnoNegocio {
  
       public void insertarAlumno(String codigo, String apellidos, String nombres, String fecNacimiento)throws UniformInterfaceException
{

AlumnoCliente client1=new AlumnoCliente();
ClientResponse response=client1.findAll_XML(ClientResponse.class);

GenericType<List<TbAlumno>> genericType = new GenericType<List<TbAlumno>>() {};
// Returns an ArrayList of Players from the web service
List<TbAlumno> data= new ArrayList<TbAlumno>();
data=(response.getEntity(genericType));

TbAlumno p=new TbAlumno();
p.setCodAlumno(codigo);
p.setApellidos(apellidos);
p.setNombres(nombres);
p.setFecNacimiento(java.sql.Date.valueOf(fecNacimiento));
client1.create_XML(p);
}
       
       public void listarAlumnos()throws UniformInterfaceException
{

AlumnoCliente client1=new AlumnoCliente();
ClientResponse response=client1.findAll_XML(ClientResponse.class);


GenericType<List<TbAlumno>> genericType = new GenericType<List<TbAlumno>>() {};
// Returns an ArrayList of Players from the web service
List<TbAlumno> data= new ArrayList<TbAlumno>();
data=(response.getEntity(genericType));
System.out.println("Retreiving and Displaying Players Details");
for( TbAlumno players:data ){
System.out.println("Codigo   : "+players.getCodAlumno());
System.out.println("Apellidos: "+players.getApellidos());
System.out.println("Nombres  : "+players.getNombres());
System.out.println("Fecha Nac: "+players.getFecNacimiento());
}
}
       
      public void eliminarAlumno(String codigo)throws UniformInterfaceException
{

AlumnoCliente client1=new AlumnoCliente();
client1.remove(codigo);
       
}
      
      public void buscarAlumnoXCodigo(String codigo)throws UniformInterfaceException
{

AlumnoCliente client1=new AlumnoCliente();
ClientResponse response=client1.find_XML(ClientResponse.class, codigo);

GenericType<TbAlumno> genericType = new GenericType<TbAlumno>() {};
TbAlumno player=response.getEntity(genericType);
System.out.println("Codigo   : "+player.getCodAlumno());
System.out.println("Apellidos: "+player.getApellidos());
System.out.println("Nombres  : "+player.getNombres());
System.out.println("Fecha Nac: "+player.getFecNacimiento());       
}

public List<TbAlumno> buscarAlumnoXApellidos(String apellidos) throws UniformInterfaceException, Exception {

        AlumnoCliente client1=new AlumnoCliente();
        ClientResponse response = client1.findByApellidos(ClientResponse.class, apellidos);
        GenericType<List<TbAlumno>> genericType = new GenericType<List<TbAlumno>>() {
        };
        List<TbAlumno> data =(response.getEntity(genericType));

        if (data.isEmpty()) {
            return null;
        } else { 
            
            System.out.println("Codigo   : "+data.get(0).getCodAlumno());
            System.out.println("Apellidos: "+data.get(0).getApellidos());
            System.out.println("Nombres  : "+data.get(0).getNombres());
            System.out.println("Fecha Nac: "+data.get(0).getFecNacimiento());
            
            return data;
        }
    }
}


    

