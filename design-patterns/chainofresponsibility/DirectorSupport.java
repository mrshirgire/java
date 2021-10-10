package chainofresponsibility;
public class DirectorSupport implements SupportServiceItf{
    
    private SupportServiceItf next = null;
    

    public SupportServiceItf getNext() {
        return next;
    }


    @Override
    public void handleRequest(Request request) {
       
        if(request.getType() == RequestLevel.LEVEL_FOUR){
            request.setConclusion("Director solved level four request!!");
        }else{
            if(next != null){
                next.handleRequest(request);
            }else{
                request.setConclusion("Your problem is out of box");
                throw new IllegalArgumentException("Your problem is out of box"+request.getType());
            }
        }
    }
}
