public class Producto {

    public String CodProd;
    public String name;
    public int precio;
    private int costo;
    public String descripcion;

    public Producto(String codProd, String name, int precio, int costo, String descripcion){
        this.CodProd = codProd;
        this.name = name;
        this.precio = precio;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public int getCosto(){
        return this.costo;
    }

    public int setCosto(int costo){
        return this.costo = costo;
    }

}
