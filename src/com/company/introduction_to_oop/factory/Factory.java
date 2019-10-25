package com.company.introduction_to_oop.factory;

import java.util.Arrays;

public class Factory {

    private Machine machine;
    private Worker[] workers;
    private Manager manager;

    private static final String MESSAGE_WITH_STAFF = "Сейчас на заводе работают рабочие: \"%s\",  управляет менеджер \"%s\" " +
            ", установлены станки %s";
    private static final String MESSAGE_NO_STAFF = "на фабрике нет ни рабочих, ни станков, ни менеджеров";

    public Factory(Machine machine, Worker[] workers, Manager manager) {
        this.machine = machine;
        this.workers = workers;
        this.manager = manager;
    }

    public Factory() {
    }

    public Factory(Machine machine) {
        this(machine, null, null);
    }

    public Factory(Worker[] workers) {
        this(null, workers, null);
    }

    public Factory(Manager manager) {
        this(null, null, manager);
    }

    public Factory(Machine machine, Worker[] workers) {
        this(machine, workers, null);
    }

    public Factory(Worker[] workers, Manager manager) {
        this(null, workers, manager);
    }

    public Factory(Machine machine, Manager manager) {
        this(machine, null, manager);
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void hireStaff(Worker[] workers, Manager manager) {
        hireWorkers(workers);
        hireManager(manager);
    }

    private void hireWorkers(Worker[] workers) {
        this.workers = new Worker[workers.length];
        for (int i = 0; i < workers.length; i++) {
            this.workers[i] = (Worker) workers[i].hire();
        }
    }

    private void hireManager(Manager manager) {
        setManager((Manager) manager.hire());
    }

    public void fireStaff(Worker[] workers, Manager manager) {
        fireWorkers(workers);
        fireManager(manager);
    }

    private void fireWorkers(Worker[] workers) {
        if (this.workers == null || workers == null) {
            return;
        }
        for (Worker workerToFire : workers) {
            this.workers = Arrays.stream(this.workers).filter(
                    worker -> !worker.equals(workerToFire)
            ).toArray(Worker[]::new);

            workerToFire.fire();
        }
        if (this.workers.length == 0) {
            setWorkers(null);
        }
    }

    private void fireManager(Manager manager) {
        setManager(null);
        manager.fire();
    }

    @Override
    public String toString() {
        if ((this.manager == null) && (this.workers == null) && (this.machine == null)) {
            return MESSAGE_NO_STAFF;
        }
        return String.format(MESSAGE_WITH_STAFF,
                this.workers != null ? Arrays.toString(this.workers) : "нет рабочих",
                this.manager != null ? this.manager.getName() : "нет менеджера",
                this.machine != null ? this.machine.getName() : "нет станка");
    }
}
