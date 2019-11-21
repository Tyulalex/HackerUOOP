package com.company.advanced_with_java.collections.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryWithResources {

    private static final Logger LOGGER =
            Logger.getLogger(TryWithResources.class.getName());

    //реализуют интерфейс AutoClosable
    public static void main(String[] args) {
        /*try (Connection connection = DriverManager.getConnection("URL")) {
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }*/

        try(Peoplee p1 = new Peoplee()) {
            System.out.println("ждем вызова файнал");
        }catch (Exception ex){
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }
}


class Peoplee implements AutoCloseable {

    private static final Logger LOGGER = Logger.getLogger(
            Peoplee.class.getName());

    @Override
    public void close() throws Exception {
        LOGGER.log(Level.INFO, "People closed");
    }
}
