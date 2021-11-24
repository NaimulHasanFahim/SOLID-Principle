package DesignPrinciple.DependencyInversion.Inefficient;

class Worker {

    public void work() {
        System.out.println("Hey, I'm a simple working working in 3rd floor of the building.");
    }
}

// This is a huge class with lot of bussiness logic
class Manager {
    Worker worker;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}

// Now CEO decided to add a Accountant to this branch who will work under
// Manager.
class Accountant {
    public void work() {
        System.out.println("Hey, I'm the accountant of this company.");
    }
}

// But the problem is now Manager has to Edit his implementation as new
// accountant hass been added to the office.
// Mean High level class is depended on low level class which violates the DIP
public class DependencyInversionInefficient {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Manager manager = new Manager();
        // Accountant accountant = new Accountant();
        manager.setWorker(worker);
        manager.manage();

        // If we want manager to manage Accountant we have to change the implementation
        // of manager
        // manager.setWorker(accountant); which is not possible due to implementation
    }
}

// In the Efficient folder I have proposed a good version of thiscode.
