package chainofresponsibility;

import lombok.Data;

@Data
public class Request{
    
    private RequestLevel type;
    private String conclusion = null;
}
