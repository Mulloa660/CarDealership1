package com.learntocode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    private static final String file = "CarDealership.csv";

    public static void main(String[] args) {

    }

    private Dealership getDealership() {
        return null;
    }

    private void saveDealer(Dealership dealership) {

    }

    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                Dealership dealership = null;
                if (lineNumber == 0) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name, address, phone);
                } else {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);

                }

            }
        } catch (Exception e) {
            System.out.println("An error has occurred!");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(file);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
