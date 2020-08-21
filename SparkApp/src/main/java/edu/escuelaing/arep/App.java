package edu.escuelaing.arep;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        port(getPort());
        get("/calcular", (req, res) -> "Pronto calcula");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't se (i.e. on localhost)
    }


}
