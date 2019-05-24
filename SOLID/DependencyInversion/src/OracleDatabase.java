/**
 * Created by adere on 24.05.2019.
 */
public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database ...");
    }


    @Override
    public void disconnect() {
        System.out.println("Disconnecting Oracle Database ...");
    }
}
