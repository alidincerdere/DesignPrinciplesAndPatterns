/**
 * Created by adere on 24.05.2019.
 */
// this does not konw anything about database handler
public class MySQLDatabase implements Database {


    @Override
    public void connect() {
        System.out.println("Connecting to MySql Database ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting MySql Database ...");
    }

}
