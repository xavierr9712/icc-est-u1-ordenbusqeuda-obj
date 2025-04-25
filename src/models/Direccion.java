package models;

public class Direccion {

    private String calle;
    private int numerocalle;
    private int codigo;
    public Direccion(String calle, int numerocalle, int codigo) {
        this.calle = calle;
        this.numerocalle = numerocalle;
        this.codigo = codigo;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumerocalle() {
        return numerocalle;
    }
    public void setNumerocalle(int numerocalle) {
        this.numerocalle = numerocalle;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Dirrecion [calle=" + calle + ", numerocalle=" + numerocalle + ", codigo=" + codigo + "]";
    }

    


    
    
}
