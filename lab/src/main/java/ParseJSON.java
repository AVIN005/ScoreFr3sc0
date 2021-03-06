import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParseJSON {
    static String json =" {\n" +
            "   \"pageInfo\": {\n" +
            "         \"pageName\": \"Homepage\",\n" +
            "         \"logo\": \"https://www.example.com/logo.jpg\",\n" +
            "\t\t \"no\": [\"1\", \"2\", \"4\", \"88\"]\n" +
            "    },\n" +
            "    \"posts\": [\n" +
            "         {\n" +
            "              \"post_id\": \"0123456789\",\n" +
            "              \"actor_id\": \"1001\",\n" +
            "              \"author_name\": \"Jane Doe\",\n" +
            "              \"post_title\": \"How to parse JSON in Java\",\n" +
            "              \"comments\": [],\n" +
            "              \"time_of_post\": \"1234567890\"\n" +
            "         }\n" +
            "    ]\n" +
            "}";
    public static void main(String[] args) {
        /*JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        String pageName = jsonObject.getAsJsonObject("pageInfo").get("pageName").getAsString();
        System.out.println(pageName);

        njsnarya arr = jsonObject.getAsJsonArray("posts");
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            String post_id = arr.get(i).getAsJsonObject().get("post_id").getAsString();
            System.out.println(post_id);
        }
        njsnarya no = jsonObject.getAsJsonObject("pageInfo").getAsJsonArray("no");
        System.out.println(no.size());
        for (int i = 0; i < no.size(); i++) {
            String post_id = no.get(i).getAsString();
            System.out.println(post_id);
        }*/


        String json = "{\"brand\":\"Jeep\", \"doors\": 3,\"no\": [\"1\", \"2\", \"4\", \"88\"]}";

        Gson gson = new Gson();

        Car car = gson.fromJson(json, Car.class);
        System.out.println(car.no.get(2));
    }

}
/*
https://stackoverflow.com/questions/5490789/json-parsing-using-gson-for-java
        Each time gson sees a {}, it creates a Map (actually a gson StringMap )

        Each time gson sees a '', it creates a String

        Each time gson sees a number, it creates a Double

        Each time gson sees a [], it creates an ArrayList

        You can use this facts (combined) to your advantage*/
