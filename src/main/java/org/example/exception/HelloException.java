package org.example.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {


        // try-catch block
        try {
            // do something
        } catch (Exception e) {
            // do something if exception is thrown
            e.printStackTrace();
        }
        // do other stuff

        // try-catch-catch block
        try {
            // do something
        } catch (NullPointerException e) {
         // do something if NullPointerException is thrown
        }
        catch (Exception e) {
            // do something if exception is thrown
            e.printStackTrace();
        }
        // do other stuff

        try {
            // do something
        } catch (Exception e) {
            // do something if exception is thrown
        } finally {
            // always gets executed
            // closing the connection to a database, etc.
        }

        // java 7 multi-try-catch
        try {

        } catch (ArithmeticException | NullPointerException e) {

        }

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in)) {
            // do something

        }



    }






}
