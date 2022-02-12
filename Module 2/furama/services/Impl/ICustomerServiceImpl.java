package furama.services.Impl;

import furama.models.Customer;
import furama.services.ICustomerService;
import furama.util.ReadAndWriteToCSV;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ICustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
//        for (Customer customer : new ReadAndWriteToCSV().readCustomerListFromCSV("src\\furama\\data\\customer.csv")) {
//            System.out.println(customer.toString());
//        };
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFromCSV("src\\furama\\data\\customer.csv");
        for (int i = 0; i < customerList.size() ; i++) {
            System.out.println((i+1) + "." + customerList.get(i));
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Hoàn thành việc nhập");

        Customer customer = new Customer(id, name, dayOfBirth, gender, idCard, phoneNumber, email, typeCustomer, address);
        customerList.add(customer);

        //ghi file
        ReadAndWriteToCSV.writeCustomerListToCSV("src\\furama\\data\\customer.csv", customerList, true);
    }

    //int id, String name, String dayOfBirth, String gender, String idCard, int phoneNumber, String email, String typeCustomer, String address
    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFromCSV("src\\furama\\data\\customer.csv");
        System.out.println("Nhập id customer muốn tìm kiếm");
        String idCode = scanner.nextLine();
        boolean checkCustomer = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == Integer.parseInt(idCode)) {
                checkCustomer = true;
                System.out.println("Bạn muốn sửa thông tin nào cho" + customerList.get(i).getName());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Loai khach hang");
                System.out.println("8. Dia chi");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = scanner.nextLine();
                        customerList.get(i).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        customerList.get(i).setDayOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String gender = scanner.nextLine();
                        customerList.get(i).setGender(gender);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idCard = scanner.nextLine();
                        customerList.get(i).setIdCard(idCard);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        int phoneNumber = Integer.parseInt(scanner.nextLine());
                        customerList.get(i).setPhoneNumber(phoneNumber);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = scanner.nextLine();
                        customerList.get(i).setEmail(email);
                        break;
                    case 7:
                        System.out.println("Nhập loai khach hang");
                        String typeCustomer = scanner.nextLine();
                        customerList.get(i).setTypeCustomer(typeCustomer);
                        break;
                    case 8:
                        System.out.println("Nhập dia chi");
                        String address = scanner.nextLine();
                        customerList.get(i).setAddress(address);
                        break;
                }
                break;
            }
        }
        if (checkCustomer){
            System.out.println("Hoàn thành việc cập nhật");
            ReadAndWriteToCSV.writeCustomerListToCSV("src\\furama\\data\\customer.csv", customerList, false);
        }else {
            System.out.println("Không có id này trong list Customer");
        }
    }

    @Override
    public void delete() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFromCSV("src\\furama\\data\\customer.csv");
        display();
        System.out.println("Chọn đối tượng muốn xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        customerList.remove(chooseDelete - 1);
        ReadAndWriteToCSV.writeCustomerListToCSV("src\\furama\\data\\customer.csv", customerList, false);
    }
}
