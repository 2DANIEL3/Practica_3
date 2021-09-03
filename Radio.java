
package practica_3;


public class Radio extends Dispoditivo_Electronico implements IFunciones, ConfiguracionRadio{

    //Gets y sets del color de la Television

    public String getColorRD() {
        return ColorRD;
    }
    
    public void setColorRD(String ColorRD) {
        this.ColorRD = ColorRD;
    }

    public Radio(){
        
    }

    @Override
    public void encender() {
        System.out.println("Television Encende");
    }

    @Override
    public String apagar() {
        return "Radio Apagando";
    }

    @Override
    public String SubirCanal() {
      return "Radio Sube de Estacion";
    }


    @Override
    public String BajarCanal() {
        return "Radio Baja de Estacion";
    }

    @Override
    public void SubirVolumen() {
        System.out.println("Radio Subiendo de volumen");
    }

    @Override
    public void BajarVolumen() {
        System.out.println("Radio Subiendo de volumen");
    }
    
    
    private String ColorRD;

    @Override
    public void FrecuenciaFM() {
        System.out.println("Cambiando de frecuencia FM");
    }

    @Override
    public void FrecuenciaAM() {
        System.out.println("Cambiando de frecuencia AM");
    }
    
}
