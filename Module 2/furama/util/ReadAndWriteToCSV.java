package furama.util;

import furama.models.Customer;
import furama.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
        public static void writeEmployeeListToCSV(String pathFile, List<Employee> employeeList, boolean append){
                File file = new File(pathFile);
                FileWriter fileWriter = null;
                BufferedWriter bufferedWriter = null;
                try {
                        fileWriter = new FileWriter(file, append);
                        bufferedWriter = new BufferedWriter(fileWriter);
                        for (Employee employee: employeeList){
                                bufferedWriter.write(employee.toString());
                                bufferedWriter.newLine();
                        }
                } catch (IOException e) {
                        System.out.println("Lỗi ghi file");
                }finally {
                        try {
                                if(bufferedWriter!=null){
                                        bufferedWriter.close();
                                        fileWriter.close();
                                }

                        } catch (IOException e) {
                                System.out.println("Lỗi do đóng file");
                        }
                }
        }

        public static List<Employee> readEmployeeListFromCSV(String pathFile){
                List<Employee> employeeList = new ArrayList<>();
                File file = new File(pathFile);
                FileReader fileReader = null;
                BufferedReader bufferedReader = null;
                try {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        String[] array = null;
                        while((line= bufferedReader.readLine()) != null) {
                                array = line.split(",");
                                //int id, String name, String dayOfBirth, String gender, String idCard, double phoneNumber, String email, String level, String position, int salary
                                Employee employee = new Employee(Integer.parseInt(array[0]),array[1], array[2],array[3],array[4],Double.parseDouble(array[5]),array[6],array[7],array[8],Integer.parseInt(array[9]) );
                                employeeList.add(employee);
                        }

                } catch (IOException e) {
                        System.out.println("Lỗi ghi file");
                }finally {
                        try {
                                if(bufferedReader!=null){
                                        bufferedReader.close();
                                        fileReader.close();
                                }
                        } catch (IOException e) {
                                System.out.println("Lỗi do đóng file");
                        }
                }

                return employeeList;
        }

        public static void writeCustomerListToCSV(String pathFile, List<Customer> customerList, boolean append){
                File file = new File(pathFile);
                FileWriter fileWriter = null;
                BufferedWriter bufferedWriter = null;
                try {
                        fileWriter = new FileWriter(file, append);
                        bufferedWriter = new BufferedWriter(fileWriter);
                        for (Customer customer: customerList){
                                bufferedWriter.write(customer.toString());
                                bufferedWriter.newLine();
                        }
                } catch (IOException e) {
                        System.out.println("Lỗi ghi file");
                }finally {
                        try {
                                if(bufferedWriter!=null){
                                        bufferedWriter.close();
                                        fileWriter.close();
                                }

                        } catch (IOException e) {
                                System.out.println("Lỗi do đóng file");
                        }
                }
        }

        public static List<Customer> readCustomerListFromCSV(String pathFile){
                List<Customer> customerList = new ArrayList<>();
                File file = new File(pathFile);
                FileReader fileReader = null;
                BufferedReader bufferedReader = null;
                try {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        String[] array = null;
                        while((line= bufferedReader.readLine()) != null) {
                                array = line.split(",");
                                //int id, String name, String dayOfBirth, String gender, String idCard, double phoneNumber, String email, String typeCustomer, String address
                                Customer customer = new Customer(Integer.parseInt(array[0]),array[1], array[2],array[3],array[4], Double.parseDouble(array[5]),array[6],array[7],array[8]);
                                customerList.add(customer);
                        }

                } catch (IOException e) {
                        System.out.println("Lỗi ghi file");
                }finally {
                        try {
                                if(bufferedReader!=null){
                                        bufferedReader.close();
                                        fileReader.close();
                                }
                        } catch (IOException e) {
                                System.out.println("Lỗi do đóng file");
                        }
                }

                return customerList;
        }

}
