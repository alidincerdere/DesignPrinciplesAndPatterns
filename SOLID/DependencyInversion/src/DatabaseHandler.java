/**
 * Created by adere on 24.05.2019.
 */
public class DatabaseHandler {

    private MySQLDatabase mySQLDatabase;
    private OracleDatabase oracleDatabase;

    public DatabaseHandler() {
        this.mySQLDatabase = new MySQLDatabase();
    }

    public void connect() {
        mySQLDatabase.connect();
    }

    public void disconnect() {
        mySQLDatabase.disconnect();
    }
}
