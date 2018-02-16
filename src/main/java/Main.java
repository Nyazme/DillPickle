import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", ((request, response) -> {
            response.redirect("/index.html");
            return null;
        }));
        get("/hotdog" ,((request, response) -> {
            //System.out.println("blurbs");
            response.type("application/json");
            return "{\n" +
                    "  \"blurbs\": [\n" +
                    "    {\n" +
                    "      \"name\": \"Scott\",\n" +
                    "      \"mention\": \"I like how you explain code.\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\":\"Koddie\",\n" +
                    "      \"mention\":\"Thanks to Koddie for the new snacks!\"\n" +
                    "    },\n" +
                    "\n" +
                    "    {\n" +
                    "      \"name\": \"Mark\",\n" +
                    "      \"mention\":  \"Shout out to Mark!  He's a great partner to work with. \"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\": \"Ted\",\n" +
                    "      \"mention\": \"Ted helped me to better understand my weekend challenge.\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\": \"Joan\",\n" +
                    "      \"mention\": \"Joan helped me better understand the mini challenge.\"\n" +
                    "    },\n" +
                    "\n" +
                    "    {\n" +
                    "      \"name\": \"Manny\",\n" +
                    "      \"mention\": \"Manny his patience and explanations helped me process the peer challenge.\"\n" +
                    "    },\n" +
                    "\n" +
                    "    {\n" +
                    "      \"name\": \"Lori\",\n" +
                    "      \"mention\": \"I think Lori is thinking like a programmer and asking great questions.\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\": \"Zech\",\n" +
                    "      \"mention\": \"Zech walked me through each step and explained things that were confusing to me.\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\": \"Kym\",\n" +
                    "      \"mention\": \"Kym was helpful and patient.\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"name\": \"Jake\",\n" +
                    "      \"mention\": \"Shout out to Jake for working out our group challenge on the timer project.\"\n" +
                    "    }\n" +
                    "\n" +
                    "  ]\n" +
                    "}";
        }));
    }
}
