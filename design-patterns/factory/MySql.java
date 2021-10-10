package factory;

public class MySql implements Database{

    @Override
    public String getConnection() {
        return "mysql connection";
    }
    

}
