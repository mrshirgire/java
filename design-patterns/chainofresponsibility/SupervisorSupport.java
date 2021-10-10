package chainofresponsibility;

import lombok.Data;

@Data
public class SupervisorSupport implements SupportServiceItf{
    
    private SupportServiceItf next = null;
     
    @Override
    public void handleRequest(Request request) {
        
        if(request.getType() == RequestLevel.LEVEL_TWO){
            request.setConclusion("Supervisor solved level two reuqest !!");
        }
        else{
            if(next != null){
                next.handleRequest(request);
            }
            else{
                throw new IllegalArgumentException("No handler found for :: " + request.getType());
            }
        }
    }
}
