package adaptor;

public class WallSocket implements Socket{

    @Override
    public Volt get240Volt() { return new Volt(240); }
    
}
