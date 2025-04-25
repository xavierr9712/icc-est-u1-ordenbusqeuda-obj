package controllers;

import models.Persona;

public class PersonaControllers {

    // ;etodo de ordenamiento desendete
    public void sorByDireccionCodigo (Persona [] personas){
        for ( int i = 0; i < personas.length; i ++){
            int indexMayor = i;

            for ( int j = i +1; j < personas.length; j++ ){
                if (personas[j].compareCodigoDirrecion(personas[i])){
                    indexMayor = j;
                }
                // if (personas[j].getCodigoDreccion()> personas[indexMayor].getCodigoDreccion()){
                //     indexMayor = j;
                // }
                
            }
            if (i != indexMayor){
                Persona aux = personas [indexMayor];
                personas [indexMayor] = personas[i];
                personas[i] = aux;
            }
        }
        

    }
    public Persona findPersonaByCodigoDirreccion (Persona [] personas, int codigo){

        int bajo = 0;
        int alto =0;

        while (bajo <= alto) {
            int center = (bajo + alto)/2;

            if (personas[center].equalsByCodigoDirrecion(codigo)){
                return personas[center];
        
            }else if (personas[center].compareCodigoDirrecion(codigo)) {
                bajo = center +1;
            }else{
                alto = center -1;
            }
        }
        return null;
    }
}

