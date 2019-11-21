package com.company.advanced_with_java.collections.io;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOMain {

    private static final Logger LOGGER = Logger.getLogger(
            IOMain.class.getName());

    static {
        LOGGER.setLevel(Level.FINE);
    }

    private static void writeToFile(byte[] arr) {
        try (OutputStream out = new FileOutputStream("data.txt", true)) {
            out.write(arr);
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    private static void readInFile() {
        try (InputStream in = new FileInputStream("data.txt")) {
            int x = 0;
            while ((x = in.read()) != -1) {
                System.out.println((byte) x);
            }
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    private static void writeToFileBuffered(byte[] arr) {
        try (OutputStream out =
                     new BufferedOutputStream(new FileOutputStream("data2.txt"))) {
            out.write(arr);
            LOGGER.log(Level.INFO, "Hello");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    private static void readInFileBuffered() {
        try (InputStream in = new BufferedInputStream(
                new FileInputStream("data2.txt")
        )) {
            int x = 0;
            while ((x = in.read()) != -1) {
                System.out.println((byte) (x));
            }

        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        //InputStream
        //OutPutStream байтовые потоки
        byte[] arr = {-10, 100, -100, 5, 6, 18, 21, -18, 13};
        // writeToFile(arr);
        //readInFile();

        writeToFileBuffered(arr);
        readInFileBuffered();

/*
        byte[] arr = {-1, -2, 3, 4, 5, 6, 7, 8, 9};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (byte b : arr) {
                out.write(b);
        }
        System.out.println("fgfg");
        for(byte b: out.toByteArray()) {
            System.out.println(b);
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(
                out.toByteArray());


        int x = 0;

        while((x = inputStream.read()) != -1) {
            System.out.println(x);
        }

       File newFile = new File("./mytest.txt");

        try {
            newFile.createNewFile();
        } catch (IOException ex){
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        File files = new File("./");

        for(File file: files.listFiles()) {
            if (!file.isDirectory()) {
                System.out.println(file);
            }
        }*/
    }
}
