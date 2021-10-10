package chainofresponsibility;


public class FrontDeskSupport implements SupportServiceItf{
    
    private SupportServiceItf next = null;
   
    public void setNext(SupportServiceItf next) {
        this.next = next;
    }


    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestLevel.LEVEL_ONE){
            request.setConclusion("Front desk solved level one reuqest !!");
        }
        else{
            if(next != null){
                next.handleRequest(request);
            }
            else{
                throw new IllegalArgumentException("No handler found for :: "+ request.getType());
            }
        }
    }
}
