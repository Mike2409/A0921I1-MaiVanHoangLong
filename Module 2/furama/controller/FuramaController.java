package furama.controller;

import furama.services.Impl.ICustomerServiceImpl;
import furama.services.Impl.IEmployeeServiceImpl;
import furama.services.Impl.IFacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        boolean check = true;
        while (check){
            System.out.println("---Furama Management---");
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:{
                    FuramaController.displayEmployeeMenu();
                    break;
                }
                case 2:{
                    FuramaController.displayCustomerMenu();
                    break;
                }
                case 3:{
                    FuramaController.displayFacilityMenu();
                    break;
                }
                case 4:{
                    FuramaController.displayMainMenu();
                    break;
                }
                default:
                    System.out.println("Mời nhập lại");
                    FuramaController.displayMainMenu();
            }
        }
    }

    public static void displayEmployeeMenu(){
        IEmployeeServiceImpl employeeService = new IEmployeeServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Display list employees:\n"+
                    "2. Add new employee:\n" +
                    "3. Edit employee:\n" +
                    "4. Back to main menu:");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 3:{
                    employeeService.edit();
                    break;
                }
                case 4:{
                    FuramaController.displayMainMenu();
                    break;
                }
                default:
                    System.out.println("Vui lòng chọn lại số");
                    displayEmployeeMenu();
                    break;
            }
        }
    }
    public static void displayCustomerMenu() {
        ICustomerServiceImpl customerService = new ICustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers:\n" +
                    "2. Add new customer:\n" +
                    "3. Edit customer:\n" +
                    "4. Back to main menu:");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.edit();
                    break;
                }
                case 4: {
                    FuramaController.displayMainMenu();
                    break;
                }
                default:
                    System.out.println("Vui lòng chọn lại số");
                    displayEmployeeMenu();
                    break;
            }
        }
    }

    public static void displayFacilityMenu(){
        IFacilityServiceImpl facilityService = new IFacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display facility:\n" +
                    "2. Display facility maintain:\n" +
                    "3. Add new facility:\n" +
                    "4. Back to main Menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.display();
                    break;
                }
                case 2: {
                    facilityService.displayMaintain();
                    break;
                }
                case 3: {
                    FuramaController.addNewFacilityMenu();
                    break;
                }

                case 4: {
                    FuramaController.displayMainMenu();
                }
                default:
                    System.out.println("Vui lòng nhập lại");
                    FuramaController.displayFacilityMenu();
            }
        }
    }

    public static void addNewFacilityMenu(){
        IFacilityServiceImpl facilityService = new IFacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add new villa:\n" +
                    "2. Add new room:\n" +
                    "3. Add new house:\n" +
                    "4. Back to facility menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
                case 2: {
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                }
                case 3: {
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                }

                case 4: {
                    FuramaController.displayFacilityMenu();
                }
                default:
                    System.out.println("Vui lòng nhập lại");
                    FuramaController.addNewFacilityMenu();
            }
        }
    }
}



