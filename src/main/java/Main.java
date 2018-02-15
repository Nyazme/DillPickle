import static spark.Spark.*

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", ((request, response) -> {
            response.redirect("/index.html");
            return null;
        }));
        get("/people",((request, response) -> {
            System.out.println("KosherKrunch");
            response.type("application/json");
            return"{\n" +
        }))
    }
}
