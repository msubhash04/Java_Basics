package MQTT_HHS45_TEST;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PortChecker {
    public static void main(String[] args) {
        String domain = "https://quantumaeonupi.in";
        int port = 5601;
        int timeoutMillis = 3000; // 3-second timeout

        try (Socket socket = new Socket()) {
            // Attempts to connect to the domain and port within the timeout limit
            socket.connect(new InetSocketAddress(domain, port), timeoutMillis);
            System.out.println("Successfully connected to " + domain + " on port " + port);
        } catch (IOException e) {
            System.err.println("Could not connect to " + domain + " on port " + port + ": " + e.getMessage());
        }
    }
}