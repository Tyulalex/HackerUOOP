package com.company.introduction_to_oop.hm2_additional_tasks.computer;

public class Computer {

    private KeyBoard keyBoard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer() {
        this.keyBoard = new KeyBoard();
        this.monitor = new Monitor();
        this.mouse = new Mouse();
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(
                computer.getKeyBoard().getName() + ", " + computer.getMouse().getName() + ", " + computer.getMonitor().getName());
    }
}
