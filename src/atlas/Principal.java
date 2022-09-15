
package atlas;

import atlas.DTO.Usuario;
import java.util.Date;


public class Principal {

   
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setID(1000);
        usuario1.setPrimerNombre("Diego");
        usuario1.setSegundoNombre("Luis");
        usuario1.setApellidoPaterno("Cogiolle");
        usuario1.setApellidoMaterno("Parra");
        usuario1.setrut(169779597);
        usuario1.setDV("k");
        usuario1.setFechaDeNacimiento(new Date(10000,10,07));
        usuario1.setTelefono(6224698);
        usuario1.setEmail("Diego.Cogiolle@gmail.com");
        usuario1.setNombreDeUsuario("dcog");
        usuario1.setContrasena("Afds22231");
        
        Usuario usuario2 = new Usuario();
        usuario2.setID(1001);
        usuario2.setPrimerNombre("Giovanni");
        usuario2.setSegundoNombre("Luis");
        usuario2.setApellidoPaterno("Adere");
        usuario2.setApellidoMaterno("Vega");
        usuario2.setrut(169779597);
        usuario2.setDV("k");
        usuario2.setFechaDeNacimiento(new Date(10000,10,07));
        usuario2.setTelefono(6224698);
        usuario2.setEmail("Giovanni.Adere@gmail.com");
        usuario2.setNombreDeUsuario("ggft");
        usuario2.setContrasena("G1ovanniGg34");
        
        Usuario usuario3 = new Usuario();
        usuario3.setID(1002);
        usuario3.setPrimerNombre("Sergio");
        usuario3.setSegundoNombre("Marcelo");
        usuario3.setApellidoPaterno("Villanueva");
        usuario3.setApellidoMaterno("Vargas");
        usuario3.setrut(169779597);
        usuario3.setDV("k");
        usuario3.setFechaDeNacimiento(new Date(10000,10,07));
        usuario3.setTelefono(6224698);
        usuario3.setEmail("Sergio.Villanueva@gmail.com");
        usuario3.setNombreDeUsuario("scodiio");
        usuario3.setContrasena("5534Gato33");
    }
    
    
}
