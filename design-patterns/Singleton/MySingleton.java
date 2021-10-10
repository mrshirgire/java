package Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

class MySingleton implements Cloneable, Serializable{

    private static final long serialVersionUID = 1L;
    private static volatile MySingleton mySingleton;

    //To void using reflection API
    private MySingleton(){
        throw new RuntimeException("Please get object from getInstance method!");
    }

    public static MySingleton getInstance(){
        if(mySingleton == null){
            synchronized (MySingleton.class){
                if(mySingleton == null){
                    mySingleton = new MySingleton();
                }
            }
        }

        return mySingleton;
    }

    @Override
    public Object clone(){
        throw new RuntimeException("Please get object from getInstance method!");
    }

    private Object readResolve() throws ObjectStreamException {
        return mySingleton;
    }
}
