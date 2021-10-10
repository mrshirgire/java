package chainofresponsibility;

import lombok.Data;

@Data
public class ManagerSupport implements SupportServiceItf{
    
    private SupportServiceItf next = null;

    @Override
    public void handleRequest(Request request) {
        
        if(request.getType() == RequestLevel.LEVEL_THREE){
            request.setConclusion("Manager solved level one reuqest !!");
        }else{
            if(next != null){
                next.handleRequest(request);
            }else{
                throw new IllegalArgumentException("No handler found for :: "+ request.getType());
            }
        }
        
    }


    
}
