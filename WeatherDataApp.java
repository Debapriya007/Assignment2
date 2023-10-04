package com.calculator;
import java.util.Scanner;

public class WeatherDataApp {
    public static void main(String[] args) {
        WeatherDataApi api = new WeatherDataApi(); 
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    getTemperature(api, scanner);
                    break;
                case 2:
                    getWindSpeed(api, scanner);
                    break;
                case 3:
                    getPressure(api, scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Get Temperature");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void getTemperature(WeatherDataApi api, Scanner scanner) {
        System.out.print("Enter the date with time (e.g., '2023-10-03 14:30'): ");
        String dateTime = scanner.nextLine();
        double temperature = api.getTemperature(dateTime);
        System.out.println("Temperature on " + dateTime + " is " + temperature + " degrees Celsius.");
    }

    private static void getWindSpeed(WeatherDataApi api, Scanner scanner) {
        System.out.print("Enter the date with time (e.g., '2023-10-03 14:30'): ");
        String dateTime = scanner.nextLine();
        double windSpeed = api.getWindSpeed(dateTime);
        System.out.println("Wind Speed on " + dateTime + " is " + windSpeed + " m/s.");
    }

    private static void getPressure(WeatherDataApi api, Scanner scanner) {
        System.out.print("Enter the date with time (e.g., '2023-10-03 14:30'): ");
        String dateTime = scanner.nextLine();
        double pressure = api.getPressure(dateTime);
        System.out.println("Pressure on " + dateTime + " is " + pressure + " hPa.");
    }
}

class WeatherDataApi {
    public double getTemperature(String dateTime) {
        
        return 25.5;
    }

    public double getWindSpeed(String dateTime) {
        
        return 5.8;
    }

    public double getPressure(String dateTime) {
        
        return 1013.2;
    }
}

