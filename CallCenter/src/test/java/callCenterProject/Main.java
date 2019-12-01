package callCenterProject;

public class Main {

    public static void main(String[] args) {

        CallSupervisor supervisor = new CallSupervisor();

        supervisor.addRespondant(new Employee("Employee1", supervisor));
        supervisor.addRespondant(new Employee("Employee2", supervisor));
        supervisor.addRespondant(new Employee("Employee3", supervisor));

        supervisor.addSupervisor(new Employee("Supervisor", supervisor));

        supervisor.addManager(new Employee("Manager", supervisor));

        Caller foo = new Caller("foo");

        supervisor.dispatch(foo);
        supervisor.dispatch(new Call());
        supervisor.dispatch(new Call());
        supervisor.dispatch(new Call());
        supervisor.dispatch(new Call());

    }
}
