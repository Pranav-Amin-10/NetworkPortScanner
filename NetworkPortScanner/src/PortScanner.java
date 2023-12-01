import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class PortScanner {
    public static void main(String[] args) {
        // Specify the target IP address
        String ipAddress = "localhost"; // Replace with the target IP address

        // Specify the range of ports to scan
        int startPort = 1;
        int endPort = 1024; // You can adjust the range based on your needs

        System.out.println("Scanning ports...");

        // Loop through the specified port range
        for (int port = startPort; port <= endPort; port++) {
            try {
                // Create a socket and attempt to connect to the target IP address and port
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(ipAddress, port), 1000); // Timeout in milliseconds
                socket.close();

                // If the connection is successful, the port is open
                System.out.println("Port " + port + " is open");
            } catch (IOException e) {
                // If an IOException is caught, the port is likely closed
                // Connection could not be established within the specified timeout
            }
        }

        System.out.println("Port scanning completed.");
    }
}


/*

* Verify Open Ports using CMD

1) Open the Command Prompt. ...
2) Type “netstat -aon” and hit enter.
3) Look for the port numbers in the Listening state. ...

Filters:

* To sort by "LISTENING" ports:

    netstat -ano | find "LISTENING" | sort

* To sort by "ESTABLISHED" ports:

    netstat -ano | find "ESTABLISHED" | sort

* To sort by "TIME_WAIT" ports:

    netstat -ano | find "TIME_WAIT" | sort

*/
