package bluemedora;

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
        System.out.println("Response: ");
        System.out.println(curl(command));
    }
}
