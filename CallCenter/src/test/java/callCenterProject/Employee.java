package callCenterProject;

public class Employee {

    private String name;
    private Call currentCall;
    private CallSupervisor callSupervisor;

    Employee(String name, CallSupervisor callSupervisor) {
        this.name = name;
        this.callSupervisor = callSupervisor; // this is the required depedency hence must be there in constructor
    }

    public boolean isFree() {
        return this.currentCall == null;
    }

    private void escalateCall() {
        if (!isFree()) {
            currentCall.incrementRank();
            callSupervisor.putCallInWaitQueue(currentCall);
        }
    }

    public void assignCall(Call call) {
        System.out.println(name + " Received call!");
        currentCall = call;
    }
}


