package com.learntocode;

import java.util.ArrayList;
import java.util.List;

public class Dealership {


        private String name;
        private String address;
        private String phone;

        private ArrayList<Vehicle> inventory;
        private List<Vehicle> getVehicleByPrice(double min, double max) {
            return null;
        }
        private List<Vehicle> getVehicleByMakeModel(String make, String Model) {
            return null;
        }
        private List<Vehicle> getVehicleByYear(int min, int max) {
            return null;
        }
        private List<Vehicle> getVehicleByColor(String color) {
            return null;
        }
        private List<Vehicle> getVehicleByMileage(int min, int max) {
            return null;
        }
        private List<Vehicle> getVehicleByType(String vehicleType) {
            return null;
        }
        private List<Vehicle> getAllVehicles() {
            return inventory;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
        public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
        }

        public void removeVehicle(Vehicle vehicle) {

        }


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

}

