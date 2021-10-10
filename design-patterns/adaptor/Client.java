package adaptor;

public class Client {

    public static void main(String[] args) {

        Socket socket = new WallSocket();
        System.out.println("WallScoket Volt Value: "+socket.get240Volt().getValue());

        MobileAdaptor mobileAdaptor = new MobileAdaptorImpl(socket);
        System.out.println("Converted volt value by Mobile adaptor: "+mobileAdaptor.get3Volt().getValue());
        
    }
    
}
