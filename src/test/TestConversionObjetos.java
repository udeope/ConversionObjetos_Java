package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
        ((Escritor)empleado).getTipoEscritura(); //Downcasting
        
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());
    
        Empleado empleado2 = escritor; //Upcasting
        System.out.println(empleado2.obtenerDetalles());
    
    }
    
}
