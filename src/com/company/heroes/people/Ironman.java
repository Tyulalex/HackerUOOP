package com.company.heroes.people;

import com.company.heroes.mutants.Spiderman;

import java.lang.reflect.Method;

public class Ironman {

    public void usePower() throws Exception{

        Spiderman spiderman = new Spiderman();
        Method m = Spiderman.class
                .getDeclaredMethod("shootWithCobwebs");
        m.setAccessible(true);
        m.invoke(spiderman);
    }
}
