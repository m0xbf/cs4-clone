package ssl;

import java.net.Socket;

public interface PostAuthentication {
    void clientAuthenticated(Socket socket);
}
