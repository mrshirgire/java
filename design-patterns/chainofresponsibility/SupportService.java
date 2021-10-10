package chainofresponsibility;

import lombok.Data;

@Data
public class SupportService implements SupportServiceItf{
    
    private SupportServiceItf handler = null;
 
    @Override
    public void handleRequest(Request request) {
        handler.handleRequest(request);
    }
}
