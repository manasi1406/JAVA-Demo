
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
     final ExecutorService executor;

    public WebServer(int numThreads) {

        executor = Executors.newFixedThreadPool(numThreads);
    }

    public void handleRequest(String request) {
        // Submit a new request to the executor for handling
        executor.submit(new RequestHandler(request));
    }
    public static void main(String[] args) {
        WebServer server = new WebServer(4); // Create a web server with a pool of 4 threads

        // incoming requests
        server.handleRequest("Request 1");
        server.handleRequest("Request 2");
        server.handleRequest("Request 3");
        server.handleRequest("Request 4");
    }
}