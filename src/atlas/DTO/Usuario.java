
package atlas.DTO;

import java.util.Date;

public class Usuario {
    
//deben estar identificados por su ID, nombre completo,
//rut, digito verificador, fecha de nacimiento, teléfono, 
//email, nombre de usuario y contraseña.
    
    private int ID;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int rut;
    private String DV;
    private Date FechaDeNacimiento;
    private int Telefono;
    private String Email;
    private String NombreDeUsuario;
    private String Contrasena;

    public Usuario(int ID, String PrimerNombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, int rut, String DV, Date FechaDeNacimiento, int Telefono, String Email, String NombreDeUsuario, String Contrasena) {
        this.ID = ID;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.rut = rut;
        this.DV = DV;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreDeUsuario = NombreDeUsuario;
        this.Contrasena = Contrasena;
    }
    public Usuario(){
        this.ID = 0;
        this.PrimerNombre = "";
        this.SegundoNombre = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.rut = 0;
        this.DV = "";
        this.FechaDeNacimiento = new Date();
        this.Telefono = 0;
        this.Email = "";
        this.NombreDeUsuario = "";
        this.Contrasena = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String NombreDeUsuario) {
        if(NombreDeUsuario.length()>=4)
        this.NombreDeUsuario = NombreDeUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    
    
}
