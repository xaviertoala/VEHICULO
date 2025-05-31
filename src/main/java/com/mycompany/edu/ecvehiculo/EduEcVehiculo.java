package com.mycompany.edu.ecvehiculo;

import com.mycompany.edu.ecvehiculo.Vehiculo.clases.Automovil;
import com.mycompany.edu.ecvehiculo.Vehiculo.clases.Color;
import com.mycompany.edu.ecvehiculo.Vehiculo.clases.TipoAutomovil;
import com.mycompany.edu.ecvehiculo.Vehiculo.clases.TipoCombustible;

public class EduEcVehiculo {

    public static void main(String[] args) {
        Automovil x = new Automovil ("BMW", 100, 1.0, 4, 6, 400, 0, Color.ROJO, TipoCombustible.BIODIESEL, TipoAutomovil.FAMILIAR);
        //VALORES DEL CONSTRUCTOR: 
        x.imprimirAutomovil();
        System.out.println("---------------------------");
        //VALORES SET AND GET
        x.setMarca("Ford");
        x.setModelo (150);
        x.setMotor (2.0);
        x.setNumeroPuertas (4);
        x.setCantidadAsientos (8);
        x.setVelocidadMaxima (400);
        x.setVelocidadActual(100);
        x.setColor(Color.NEGRO);
        x.setTipoCombustible(TipoCombustible.DIESEL);
        x.setTipoAutomovil(TipoAutomovil.EJECUTIVO);
        
        //x.imprimirAutomovil(); IMPRIME LO MISMO PERO ACTUALIZADO. 
        
        System.out.println("AUTOMOVIL: "+ x.getMarca() );
        System.out.println("MODELO: "+x.getModelo());
        System.out.println("MOTOR:"+x.getMotor ());
        System.out.println("NUMERO PUERTAS: "+x.getNumeroPuertas());
        System.out.println("NUMERO ASIENTOS: "+ x.getCantidadAsientos());
        System.out.println("VELOCIDAD MAXIMA: "+x.getVelocidadMaxima());
        System.out.println("VELOCIDAD ACTUAL:"+x.getVelocidadActual());
        System.out.println("COLOR: "+x.getColor());
        System.out.println("TIPO COMBUSTIBLE: "+x.getTipoCombustible ());
        System.out.println("TIPO AUTOMOVIL: "+x.getTipoAutomovil());
        System.out.println("TIEMPO DE LLEGADA CON VELOCIDAD ACTUAL: "+ x.tiempoLlegada(5000)/*<-DISTANCIA*/);
        System.out.println("VELOCIDAD ACTUAL ACELERADA: "+x.acelerar());
        System.out.println("VELOCIDAD ACTUAL DESACELERADA: "+ x.desacelerar());
        System.out.println("FRENAR AUTOMOVIL:"+x.frenar());
        
    }
}
