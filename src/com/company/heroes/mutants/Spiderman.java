package com.company.heroes.mutants;

public class Spiderman {

    public void breath() {
        System.out.println("breath");
    }

    protected void jump(){
        System.out.println("jump");
    }

    protected void runFast(){
        System.out.println("run fast");
    }

    private void shootWithCobwebs(){
        System.out.println("shoot with cobmebs");
    }

    public void usePower() {
        breath();
        jump();
        runFast();
        shootWithCobwebs();
    }
}
