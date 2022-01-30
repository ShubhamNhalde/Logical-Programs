package com.bridgelabz.Logicalprograms;

import java.time.Duration;
import java.time.Instant;
import java.util.Locale;
import java.util.Scanner;

public class StopWatch {
	

    static Instant start;
    static Instant stop;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter S to start the stop watch: ");
        char variable = (scanner.next().toUpperCase(Locale.ROOT)).charAt(0);
        if (variable == 'S') {
            start = Instant.now();
            System.out.println("StopWatch has started..");
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter S again to stop the stop watch: ");
        char variable2 = (scanner.next().toUpperCase(Locale.ROOT)).charAt(0);
        if (variable2 == 'S') {
            stop = Instant.now();
            System.out.println("Watch Stopped");
        }
        double elapsedTime = Duration.between(start,stop).toMillis();
        System.out.println("Time elapsed is: "+ elapsedTime/1000 + "  seconds");
    }

}
