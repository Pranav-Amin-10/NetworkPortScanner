# Network Port Scanner (Simple Version) using Java

This Java application provides a command-line interface for scanning open ports on a target system within a network. The simple version is designed for ease of use in a non-graphical environment, offering a straightforward way to configure, initiate, and view the results of port scans.

## Features

### 1. Target Host Input
Specify the target host, which can be an IP address or a domain name. This is the system you want to scan for open ports.

### 2. Port Range Configuration
Define the range of ports to scan by specifying the start and end port numbers. This flexibility allows users to narrow down or broaden the scope of the scan.

### 3. Real-time Results Display
View the scan results in the console in real-time. Open ports are listed, providing instant feedback on the status of each port.

### 4. Timeout Mechanism
Each port connection attempt includes a timeout mechanism, preventing the application from hanging on unresponsive ports and improving overall scanning efficiency.

### 5. Error Handling
The application incorporates robust error handling to gracefully manage situations where a connection cannot be established to a specific port, ensuring a smooth user experience.

### 6. Scanning Efficiency
The timeout mechanism and error handling contribute to the overall scanning efficiency, allowing for a reliable and quick assessment of open ports.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK):** Ensure that you have the Java Development Kit installed on your system.

### Usage

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/NetworkPortScannerJava.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd NetworkPortScannerJava
   ```

3. **Configure Scan Parameters:**
   - Open the `PortScannerJava.java` file in a text editor.
   - Update the `targetHost`, `startPort`, and `endPort` variables with your desired values.

4. **Initiate Port Scan:**
   - Save the changes to the `PortScannerJava.java` file.
   - Execute the following commands in the terminal:
     ```bash
     javac PortScannerJava.java
     java PortScannerJava
     ```

5. **View Results:**
   - Results will be displayed in the console, providing detailed information about open ports.

6. **Interpret Results:**
   - Analyze the console output to identify open ports and understand the status of the scanned network.

## Contributing

Contributions are welcome! If you have suggestions for improvements, feature requests, or would like to report issues, feel free to [create an issue](https://github.com/Pranav-Amin-10/NetworkPortScanner/issues) or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

### Additional Information:<br>
🠮 Verify Open Ports using CMD<br>
🠮 Open the Command Prompt.<br>
🠮 Type netstat -aon and hit enter.<br>
🠮 Look for the port numbers in the Listening state.<br>

### Filters for CMD Verification:<br>
🠮 netstat -ano | find "LISTENING" | sort        - To sort by "LISTENING" ports<br>
🠮 netstat -ano | find "ESTABLISHED" | sort      - To sort by "ESTABLISHED" ports<br>
🠮 netstat -ano | find "TIME_WAIT" | sort        - To sort by "TIME_WAIT" ports<br>



