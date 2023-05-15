package com.learntocode;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//            UserInterface() {
//                   private void init()
//            }
        public void display () {

            int choice = -1;
            while (choice != 10) {
                System.out.println("Welcome to D & B Used Cars! :D");
                System.out.println("===============================");
                System.out.println("1 - Find vehicles within price range");
                System.out.println("2 - Find vehicles by make/model");
                System.out.println("3 - Find vheicles by year range");
                System.out.println("4 - Find vehicles by color");
                System.out.println("5 - Find vehicles by mileage range");
                System.out.println("6 - Find vehicles by type(car, truck, SUV, van)");
                System.out.println("7 - List ALL vehicles:");
                System.out.println("8 - Add a vehicle");
                System.out.println("9 - Remove a vehicle");
                System.out.println("10 - quit");
                System.out.println("Please choose an option(1-10)");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        processGetByPriceRequest();
                        break;
                    case 2:
                        processGetByMakeModel();
                        break;
                    case 3:
                        processGetByYearRequest();
                        break;
                    case 4:
                        processGetByColorRequest();
                        break;
                    case 5:
                        processGetByMileageRequest();
                        break;
                    case 6:
                        processGetByVehicleTypeRequest();
                    case 7:
                        processGetAllVehicleRequest();
                        break;
                    case 8:
                        processAddVehicleRequest();
                        break;
                    case 9:
                        processRemoveVehicleRequest();
                        break;
                    case 10:
                        System.out.println("Exiting the application. Goodbye!");
                    default:
                        System.out.println("Invaid choice!");
                        break;
                }
            }
        }
    }
}
