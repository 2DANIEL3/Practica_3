
package practica_3;


public class Television extends Dispoditivo_Electronico implements  IFunciones, ConfiguracionTelevisor{

    //Gets y sets del color de la Television
    public String getColorTV() {
        return ColorTV;
    }

    
    public void setColorTV(String ColorTV) {
        this.ColorTV = ColorTV;
    }

    public Television(){
        
    }
    
    //Atributod de las interfaces
    @Override
    public void encender() {
       System.out.println("Television Encende");
    }

    
    @Override
    public String apagar() {
       return "Television Apagando";
    }

        @Override
    public String BajarCanal() {
        return "Television Baja de Canal";
    }
    
    @Override
    public String SubirCanal() {
         return "Television Sube de Canal";
    }

    @Override
    public void SubirVolumen() {
        System.out.println("Television Subiendo de volumen");
    }

    @Override
    public void BajarVolumen() {
       System.out.println("Television Bajando de volumen");
    }


    
    private String ColorTV;

    @Override
    public void SubirBrillo() {
        System.out.println("Subiendo brillo");
    }

    @Override
    public void BajarBrillo() {
        System.out.println("Bajando brillo");
    }

    @Override
    public void SubirContraste() {
        System.out.println("Subiendo contraste");
    }

    @Override
    public void BajarContraste() {
        System.out.println("Bajando contraste");
    }

    @Override
    public void ImagenDinamica() {
        System.out.println("Imagen en modo dinamico");
    }

    @Override
    public void ImagenPelicuola() {
        System.out.println("Imagen en modo pelicula");
    }

    @Override
    public void ImagenNormal() {
        System.out.println("Imagen en modo normal");
    }

    @Override
    public void ImagenPersonalisada() {
        System.out.println("Imagen en modo personalisado");
    }
    
}
