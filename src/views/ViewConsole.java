package views;

import models.Persona;

public class ViewConsole {

    public void printArray(Persona [] per ){

        for ( Persona p : per){
            System.out.println(p);
        }
        System.out.println();

    }
    
}
