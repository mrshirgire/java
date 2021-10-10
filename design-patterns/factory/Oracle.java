package factory;

public class Oracle implements Database{

    @Override
    public String getConnection() {
        return "Oracle connection";
    }
    
    
}
