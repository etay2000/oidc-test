package test.oidc;


import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 *
 */
public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(
            final String[] args) throws IOException, InterruptedException, ExecutionException, TimeoutException {
        io.helidon.microprofile.server.Main.main(args);
        System.out.println("http://localhost:" + io.helidon.microprofile.server.Main.serverPort() + "/test");
    }

}
