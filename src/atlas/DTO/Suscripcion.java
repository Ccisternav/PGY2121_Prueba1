
package atlas.DTO;

import java.util.Date;


public class Suscripcion {
    
private int NumeroSuscripcion;
private Usuario Usuario;
private Date InicioSuscripcion;
private int AbonoTotal;
private ClubDeportivo ClubDeportivo;

    public Suscripcion(int NumeroSuscripcion, Usuario Usuario, Date InicioSuscripcion, int AbonoTotal, ClubDeportivo ClubDeportivo) {
        this.NumeroSuscripcion = NumeroSuscripcion;
        this.Usuario = Usuario;
        this.InicioSuscripcion = InicioSuscripcion;
        this.AbonoTotal = AbonoTotal;
        this.ClubDeportivo = ClubDeportivo;
    }
    
    public Suscripcion(){
        this.NumeroSuscripcion = 0;
        this.Usuario = new Usuario();
        this.InicioSuscripcion = new Date();
        this.AbonoTotal = 0;
        this.ClubDeportivo = new ClubDeportivo();

    }

    public int getNumeroSuscripcion() {
        return NumeroSuscripcion;
    }

    public void setNumeroSuscripcion(int NumeroSuscripcion) {
        this.NumeroSuscripcion = NumeroSuscripcion;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Date getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(Date InicioSuscripcion) {
        this.InicioSuscripcion = InicioSuscripcion;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public ClubDeportivo getClubDeportivo() {
        return ClubDeportivo;
    }

    public void setClubDeportivo(ClubDeportivo ClubDeportivo) {
        this.ClubDeportivo = ClubDeportivo;
    }
    
}