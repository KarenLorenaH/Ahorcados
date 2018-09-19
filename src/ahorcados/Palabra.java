/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcados;

/**
 *
 * @author Estudiantes
 */
public class Palabra {
    
    String categoria[]={"Animales","Verbos"};
    String Animales[]={"Caiman","Aguila","Avispa"};
    String Verbos[]={"Correr","Querer"};
    
    public String generarPalabra (int palabra){
        
       int n=0;
       n=(int)(Math.random()*4);
       if(palabra==0){
           return 
       }
       
    }
    
    
    public boolean checarLetra(char letra, String palabra){
        boolean mensaje=false;
        for(int i=0;i<palabra.length();i++){
            if(letra==palabra.charAt(i)){
                mensaje = true;
                break;
            }else{
                mensaje = false;
            }
    
        }
        
        return mensaje;    
    
    }
    
}
