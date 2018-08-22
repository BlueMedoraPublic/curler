package bluemedora;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import static org.toilelibre.libe.curl.Curl.curl;

public class Curler {
    public static void main(String[] args) {
        String command = "";
        for (int i = 0; i < args.length; i++) {
            command += args[i] + " ";
        }
        System.out.println("Approximating this curl command:");
        System.out.println("curl " + command);
        System.out.println();
        HttpResponse response = curl(command);
        try {System.out.println("Headers: ");
            System.out.println(response.toString());
            System.out.println("Response: ");
            System.out.println(EntityUtils.toString(response.getEntity(), "UTF-8"));
        } catch ( Exception e){
            e.printStackTrace();
        }
    }
}
