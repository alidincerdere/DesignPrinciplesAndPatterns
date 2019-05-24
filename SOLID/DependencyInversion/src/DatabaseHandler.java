/**
 * Created by adere on 24.05.2019.
 */
public class DatabaseHandler {

    //this does nont knonw anything about database

    //no instantiation !!!

    //loose coupling

    //no need to modify this code to use another database
    private Database database;

    public DatabaseHandler(Database database) {
        this.database = database;
    }

    public void connect() {
        database.connect();
    }

    public void disconnect() {
        database.disconnect();
    }
}
