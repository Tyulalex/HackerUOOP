package com.company.advanced_with_java.collections.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteReadApp {

    public static void main(String[] args) {

        // String str = "Hello, world";
        //fromConsoleToFile();
        //charWriterInfoFile(str);
        //charReader(str.toCharArray());

        //charWriter

        byte[] arr = {1, 3, 5, 2, 3, 4, 5, 2, 3, -10, -20};
        magic(arr);
    }

    private static void charReader(char[] chars) {
        try (Reader reader = new CharArrayReader(chars)) {
            int x = 0;
            while ((x = reader.read()) != -1) {
                System.out.print((char) (x));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void charWriterInfoFile(String str) {
        try (Writer writer = new FileWriter("./data/file.txt")) {
            writer.write(str.toCharArray());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void fromConsoleToFile() {
        System.out.println("Enter any text: ");
        InputStream in = System.in;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(in));
             Writer writer = new FileWriter(
                     "./data/file2.txt")) {
            String str = null;
            boolean flag = true;
            while (flag) {
                str = reader.readLine();
                if (str.equals("exit"))
                    break;
                writer.write(str + "\n");
            }

            writer.write(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    private static void magic(byte[] arr) {
        try (OutputStream out = new FileOutputStream(
                "./data/magicBytes"
        )) {
            out.write(arr);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./data/magicBytes"),
                        "UTF-8"))) {
            int x = 0;
            while((x=reader.read())!=-1)

            {
                System.out.print((char) (x));
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

