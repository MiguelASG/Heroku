package edu.escuelaing.arep;

import edu.escuelaing.arep.Procesa.MeanDeviCalculator;

import java.util.LinkedList;

import static spark.Spark.*;

public class App 
{
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> {

            return "<h1>Calcular el valor de la media y la desviacion estadar</h1>\n" +
                "\n" +
                "<form action=\"/calcular\">\n" +
                "  <label for=\"datos\">Datos</label>\n" +
                "  <input type=\"text\" id=\"datos\" name=\"datos\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Calcular\">\n" +
                "</form>\n" +
                "\n" +
                "<p>Presiona el boton \"calcular\" para asi poder obtener \n" +
                "la media y desviacion estandar de los datos dados.</p>\n";
                });

        get("/calcular", (req, res) -> {
            String datos = req.queryParams("datos");
            MeanDeviCalculator numeros = new MeanDeviCalculator(datos);

            String media = String.valueOf(numeros.carcularMedia());
            String desviacion = String.valueOf(numeros.calcularDesviacion());

            return
                "<h1>La media y desviacion estandar son:</h1>\n" +
                "\n" +
                "<form action=\"/\">\n" +
                "  <label for=\"media\">La media es: "+media+"</label>\n" +
                "<br>"+
                "<br>"+
                "  <label for=\"desviacion\">La Desviación es: "+desviacion+"</label>\n" +
                "\n"+
                "<br>"+
                "<br>"+
                "  <input type=\"submit\" value=\"Volver al inicio para calcular nuevos valores\">\n" +
                "</form>\n";
        });


    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't se (i.e. on localhost)
    }


}
