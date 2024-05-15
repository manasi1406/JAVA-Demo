
public class RequestHandler implements Runnable {
    public final String request;

    public RequestHandler(String request) {
        this.request = request;
    }

    public void run() {
        System.out.println("Handling request:" + request);

    }
}
