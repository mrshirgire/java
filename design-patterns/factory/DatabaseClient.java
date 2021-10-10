package factory;

public class DatabaseClient {
    
    public Database getDatabase(DatabaseType type){

        switch(type) {
            
            case MYSQL:
                return new MySql();
            case ORACLE:
                return new Oracle();
            
        }

        return null;
    }

}
