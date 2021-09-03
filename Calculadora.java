
package practica_3;


public class Calculadora extends Dispoditivo_Electronico implements Operaciones_Aritmeticas{

//Gets y sets del color de la Television
    public String getColorCLCLD() {
        return ColorCLCLD;
    }

    public void setColorCLCLD(String ColorCalcul) {
        this.ColorCLCLD = ColorCalcul;
    }

    @Override
    public void encender() {
        System.out.println("Calculadora Encende");
    }

    @Override
    public String apagar() {
         return "Calculadora Apagando";
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public float division(int a, int b) {
        return a/b;
    }

    
      private String ColorCLCLD;
    
}
