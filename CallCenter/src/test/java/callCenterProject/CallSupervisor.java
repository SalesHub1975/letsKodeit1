package callCenterProject;

import java.util.ArrayList;
import java.util.List;


public class CallSupervisor {

    List<List<Employee>> employeeLevels;
    List<List<Call>> waitQueue;

    CallSupervisor() {
        this.employeeLevels = new ArrayList<List<Employee>>();
        this.employeeLevels.add(new ArrayList<Employee>());
        this.employeeLevels.add(new ArrayList<Employee>());
        this.employeeLevels.add(new ArrayList<Employee>());
        this.waitQueue = new ArrayList<List<Call>>();
    }

    private Employee findCallHandler(Call call) {
        /* check all respondants */
        for (Employee respondant: employeeLevels.get(0)) {
            if (respondant.isFree()) return respondant;
        }

    /* check all supervisor */
    for (Employee supervisor: employeeLevels.get(1)) {
        if (supervisor.isFree()) return supervisor;
    }

    /* check all manager */
    for (Employee manager: employeeLevels.get(2)) {
        if (manager.isFree()) return manager;
    }

    // No one is free
    return null; // returning null is not a good idea
}

    public void addRespondant(Employee emp) {
        employeeLevels.get(0).add(emp);
    }

    public void addSupervisor(Employee emp) {
        employeeLevels.get(1).add(emp);
    }

    public void addManager(Employee emp) {
        employeeLevels.get(2).add(emp);
    }

    public void dispatch(Caller caller) {
        dispatch(new Call(caller));
    }

    public void dispatch(Call call) {
        /* check if any respondant is free */
        Employee handler = findCallHandler(call);
        if (handler == null) {
            System.out.println("Sorry, the line is busy, your call is going in wait queue");
            putCallInWaitQueue(call);
            return;
        }
        handler.assignCall(call);
        call.setEmployee(handler);
    }

    public void putCallInWaitQueue(Call call) {
        waitQueue.get(call.getRank()).add(call);
    }
}
