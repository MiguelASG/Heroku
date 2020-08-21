package edu.escuelaing.arep.Procesa;

import java.util.LinkedList;

public class MeanDeviCalculator {
    LinkedList<Double> datos = new LinkedList<Double>();
    public MeanDeviCalculator(LinkedList<Double> datos){
        this.datos = datos;
    }

    public double carcularMedia(){
        double media = 0;
        for(int i=0; i<datos.size(); i++){
            media+=datos.get(i);
        }
        return media/datos.size();
    }

    public double calcularDesviacion(){
        double media = carcularMedia();
        double desviacion = 0;
        for(int i=0; i<datos.size(); i++){
            desviacion += Math.pow(datos.get(i)-media,2);
        }
        desviacion = desviacion/(datos.size()-1);
        return Math.sqrt(desviacion);
    }

}
