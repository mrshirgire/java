package adaptor;

public class MobileAdaptorImpl implements MobileAdaptor{

    private Socket  socket;
    MobileAdaptorImpl(Socket socket){
        this.socket = socket;
    }

    @Override
    public Volt get3Volt() {

        int voltValue = socket.get240Volt().getValue()/80;
        return new Volt(voltValue);
    }
    
}
