
package atlas.DTO;


public class ClubDeportivo {
    
    private String Rol;
    private String NombreDelClub;
    private String NombreDelFundador;
    private int AnoDeFundacion;
    private String Pais;
    private String Lema;
    private String Colores;
    private String ValorSuscripcion;

    public ClubDeportivo(String Rol, String NombreDelClub, String NombreDelFundador, int AnoDeFundacion, String Pais, String Lema, String Colores, String ValorSuscripcion) {
        this.Rol = Rol;
        this.NombreDelClub = NombreDelClub;
        this.NombreDelFundador = NombreDelFundador;
        this.AnoDeFundacion = AnoDeFundacion;
        this.Pais = Pais;
        this.Lema = Lema;
        this.Colores = Colores;
        this.ValorSuscripcion = ValorSuscripcion;
    }
    public ClubDeportivo(){
        this.Rol = "";
        this.NombreDelClub = "";
        this.NombreDelFundador = "";
        this.AnoDeFundacion = 0;
        this.Pais = "";
        this.Lema = "";
        this.Colores = "";
        this.ValorSuscripcion = "";

    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombreDelClub() {
        return NombreDelClub;
    }

    public void setNombreDelClub(String NombreDelClub) {
        this.NombreDelClub = NombreDelClub;
    }

    public String getNombreDelFundador() {
        return NombreDelFundador;
    }

    public void setNombreDelFundador(String NombreDelFundador) {
        this.NombreDelFundador = NombreDelFundador;
    }

    public int getAnoDeFundacion() {
        return AnoDeFundacion;
    }

    public void setAnoDeFundacion(int AnoDeFundacion) {
        this.AnoDeFundacion = AnoDeFundacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public String getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(String ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
    
    
}
