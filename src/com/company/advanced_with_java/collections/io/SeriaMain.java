package com.company.advanced_with_java.collections.io;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeriaMain {

    private static final Logger LOGGER = Logger.getLogger(
            SeriaMain.class.getName());

    public static void main(String[] args) {


        Salary salary = new Salary(1000, "RUR");
        People p = new People("Bob", 21, "man",
                true, salary);
        serializePeople(p);


        People p1 = deSerializePeople();
        LOGGER.log(
                Level.INFO, "People: {0}", p1);
        //  System.out.println("Name: " + p1.getName());
        //  System.out.println("age: " + p1.getAge());

        // ObjectOutputStream oos = new ObjectOutputStream(out)
    }

    private static void serializePeople(People p) {

        try (OutputStream out = new FileOutputStream(
                "./data/people");
             ObjectOutputStream oos = new ObjectOutputStream(out);
        ) {
            oos.writeObject(p);
        } catch (IOException ex) {
            ex.printStackTrace();
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

    }

    private static People deSerializePeople() {
        People people = null;

        try (InputStream in = new FileInputStream(
                "./data/people");
             ObjectInputStream ois = new ObjectInputStream(in)) {
            people = (People) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            LOGGER.severe(ex.getMessage());
        }
        return people;
    }
}
