import com.google.gson.Gson;
import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class njsnarya {

    public static void main(String[] args) {
       /* String json = "[\n" +
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
        Wrappers[] temp = gson.fromJson(json, Wrappers[].class);
        System.out.println(temp[1].number);*/
        Wrappers[] array = {new Wrappers(1), new Wrappers(2), new Wrappers(3)};
        System.out.println(array[1].number + array[2].number + "" + array[0].number);
        /*ArrayList<Wrappers> arrayList = new ArrayList<Wrappers>(Arrays.asList(array));
        final int yo = arrayList.get(1).number;
        System.out.println(yo);*/

        System.out.println(arrayToList(array));
        //System.out.println(arrayToList(array).toString());
    }

        static List arrayToList(final Object[] array) {
            final List l = new ArrayList(array.length);

            for (int i = 0; i < array.length; i++) {
                l.add(array[i]);
            }
            return l;
        }
      /* static <T> List<T> arrayToList(final T[] array) {
           final List<T> l = new ArrayList<T>(array.length);

           for (final T s : array) {
               l.add(s);
           }
           return (l);
       }*/



    static class Wrappers{
        int number;
        String title;

        public Wrappers(int i) {
            this.number = i;
        }

        public Wrappers() {

        }

        @Override
        public String toString() {
            return "Wrappers{" +
                    "number=" + number +
                    ", title='" + title + '\'' +
                    '}';
        }
        /*public String toString() {
            return Integer.toString(number);
        }*/
    }
}
