import com.google.gson.Gson;

public class njsnarya {

    public static void main(String[] args) {
        String json = "[\n" +
                "        {\n" +
                "            \"number\" : \"3\",\n" +
                "                \"title\" : \"hello_world\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"number\" : \"2\",\n" +
                "                \"title\" : \"hello_world\"\n" +
                "        }\n" +
                "]";
        Gson gson = new Gson();
        Wrapper[] temp = gson.fromJson(json, Wrapper[].class);
        System.out.println(temp[1].number);
    }
    class Wrapper{
        int number;
        String title;
    }
}
