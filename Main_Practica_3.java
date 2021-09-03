
package practica_3;

import java.util.Scanner;

public class Main_Practica_3 {


    public static void main(String[] args) {
     
        //Scanner Global
        Scanner scn = new Scanner(System.in);
        
        /*Se le informa al usuario de como sera el funcionamiento se llevara 
        *acabo de una guia rapida del producto
        */
        Television TV = new Television ();
        System.out.print("\nTELEVISION\n");
        System.out.print("\nSe Verificara el funcionamiento del televisor\n");
        System.out.print("\nPara ello ingrese los siguientes datos\n");
      
        System.out.print("\nIngrese la marca de su televisor:");
        TV.setMarca(scn.nextLine());
        System.out.print("\nIngrese la modelo de su televisor:");
        TV.setModelo(scn.nextLine());
        System.out.print("\nIngrese el color de su televisor:");
        TV.setColorTV(scn.nextLine());
        
        //Acciones a realizar con el mando
        System.out.print("\nFavor de ralizar las siguientes acciones\n");
        System.out.print("\nSuba de Canal");
        System.out.print("\n");
        System.out.print("" + TV.SubirCanal());
        System.out.print("\nBaje de Canal");
        System.out.print("\n");
        System.out.print("" + TV.BajarCanal());
        System.out.print("\nSuba de volumen");
        System.out.print("\n");
        TV.SubirVolumen();
        System.out.print("\nBaje de volumen");
        System.out.print("\n");
        TV.BajarVolumen();
        System.out.print("\nApague y Encienda el Televisor una vez terminada la ultima accion verificar el menu ");
        System.out.print("\n");
        System.out.print("" + TV.apagar());
        TV.encender();
        System.out.print("\nSu televisor esta funcoina correctamente");
        System.out.print("\nFavor de ir configurar para cambiar la configuracion");
        TV.SubirBrillo();
        TV.BajarBrillo();
        TV.SubirContraste();
        TV.BajarContraste();
        TV.ImagenPersonalisada();
        TV.ImagenPelicuola();
        TV.ImagenNormal();
        TV.ImagenDinamica();
        System.out.print("\nConfiguracion terminada, que disfrute de la experiencia.\n");
        
        Radio RD = new Radio ();
        
        /*Se le informa al usuario de como sera el funcionamiento se llevara 
        /*acabo de una guia rapida del producto
        */
        System.out.print("\nRADIO\n");
        System.out.print("\nSe Verificara el funcionamiento del Radio\n");
        System.out.print("\nPara ello ingrese los siguientes datos\n");
      
        System.out.print("\nIngrese la marca de su Radio:");
        RD.setMarca(scn.nextLine());
        System.out.print("\nIngrese el modelo de su Radio:");
        RD.setModelo(scn.nextLine());
        System.out.print("\nIngrese el color de su Radio:");
        RD.setColorRD(scn.nextLine());
        
        //Acciones a realizar 
        System.out.print("\nFavor de ralizar las siguientes acciones\n");
        System.out.print("\nSuba de Estacion");
        System.out.print("\n");
        System.out.print("" + RD.SubirCanal());
        System.out.print("\nBaje de Estacion");
        System.out.print("\n");
        System.out.print("" + RD.BajarCanal());
        System.out.print("\nSuba de volumen");
        System.out.print("\n");
        RD.SubirVolumen();
        System.out.print("\nBaje de volumen");
        System.out.print("\n");
        RD.BajarVolumen();
        System.out.print("\nApague y Encienda la radio ");
        System.out.print("\n");
        System.out.print("" + RD.apagar());
        RD.encender();        
        System.out.print("\nSu radio esta funcoina correctamente");
        System.out.print("\nFavor de ir configurar para cambiar de frecuencia ya sea AM a FM\n");
        System.out.println("\nCambio de frecuencia\n");
        RD.FrecuenciaFM();
        RD.FrecuenciaAM();
        
         
        Calculadora CLCLD = new Calculadora ();
        int a;
        int b;
        
        
        /*Se le informa al usuario de como sera el funcionamiento se llevara 
        /*acabo de una guia rapida del producto
        */
        System.out.print("\nCALCULADORA\n");
        System.out.print("\nSe Verificara el funcionamiento del Calculadora\n");
        System.out.print("\nPara ello ingrese los siguientes datos\n");
      
        System.out.print("\nIngrese la marca de su Calculadora:");
        CLCLD.setMarca(scn.nextLine());
        System.out.print("\nIngrese el modelo de su Calculadora:");
        CLCLD.setModelo(scn.nextLine());
        System.out.print("\nIngrese el color de su Calculadora:");
        CLCLD.setColorCLCLD(scn.nextLine());
        
        //Acciones a realizar 
        System.out.print("\nFavor de ralizar las siguientes acciones\n");
        System.out.print("\nSumatoria de dos numeros enteros");
        System.out.print("\nPrimer variable:");
         a = scn.nextInt();
        System.out.print("\nSegunda variable:");
         b = scn.nextInt();
        System.out.print("\nResultado" + CLCLD.suma(a, b));
        System.out.print("\n");
        
        System.out.print("\nResta de dos numeros enteros");
        System.out.print("\nPrimer variable:");
         a = scn.nextInt();
        System.out.print("\nSegunda variable:");
        b= scn.nextInt();
        System.out.print("\nResultado:" + CLCLD.resta(a, b));
        System.out.print("\n");
        
        System.out.print("\nMultiplicacion de dos numeros enteros");
        System.out.print("\nPrimer variable:");
        a = scn.nextInt();
        System.out.print("\nSegunda variable:");
        b= scn.nextInt();
        System.out.print("\nResultado" + CLCLD.multiplicacion(a, b));
        System.out.print("\n");
        
        System.out.print("\nDivivsion de dos numeros enteros");
        System.out.print("\nPrimer variable:");
         a = scn.nextInt();
        System.out.print("\nSegunda variable:");
        b= scn.nextInt();
        System.out.print("\nResultado:" + CLCLD.division(a, b));
    }
    
}
 