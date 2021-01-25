import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class GiveOrKeep {
    public static void giceOrKeep() {
        Scanner Choice = new Scanner(System.in);
        System.out.println(1 + ": Give the scientist the pouch of berries.");
        System.out.println(2 + ": Keep the berries! ");
    }
}
