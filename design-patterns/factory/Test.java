package factory;

public class Test {
    
    public static void main(String[] args) {
        DatabaseClient databaseClient = new DatabaseClient();
        Database database = databaseClient.getDatabase(DatabaseType.MYSQL);
        System.out.println(database.getConnection());
        
    }
}
