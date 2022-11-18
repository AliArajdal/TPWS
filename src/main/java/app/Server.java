package app;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8989/", new BanqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:8989");
    }
}
