package chainofresponsibility;

public class Client {
    
    public static void main(String[] args) {
        
        SupportService supportService = new SupportService();

        DirectorSupport directorSupport = new DirectorSupport();
        ManagerSupport managerSupport = new ManagerSupport();
        SupervisorSupport supervisorSupport = new SupervisorSupport();
        FrontDeskSupport frontDeskSupport = new FrontDeskSupport();

        frontDeskSupport.setNext(supervisorSupport);
        supervisorSupport.setNext(managerSupport);
        managerSupport.setNext(directorSupport);

        supportService.setHandler(frontDeskSupport);


        // Request request = new Request();
        // request.setType(RequestLevel.LEVEL_ONE);
        // supportService.handleRequest(request);
        // System.out.println("Conclusion: "+request.getConclusion());
    
        // Request request = new Request();
        // request.setType(RequestLevel.LEVEL_FOUR);
        // supportService.handleRequest(request);
        // System.out.println("Conclusion: "+request.getConclusion());

        // Request request = new Request();
        // request.setType(RequestLevel.LEVEL_TWO);
        // supportService.handleRequest(request);
        // System.out.println("Conclusion: "+request.getConclusion());

        Request request = new Request();
        request.setType(RequestLevel.LEVEL_THREE);
        supportService.handleRequest(request);
        System.out.println("Conclusion: "+request.getConclusion());


    }
}
