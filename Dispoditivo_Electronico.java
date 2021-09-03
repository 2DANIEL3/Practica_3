
package practica_3;


public abstract class Dispoditivo_Electronico {


    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    
    private String Marca;
    private String Modelo;
    
    public abstract void encender();
    public abstract String apagar ();
}
