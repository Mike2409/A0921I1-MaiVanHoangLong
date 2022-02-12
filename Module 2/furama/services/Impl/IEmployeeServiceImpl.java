package furama.services.Impl;

import furama.models.Employee;
import furama.services.IEmployeeService;
import furama.util.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IEmployeeServiceImpl implements IEmployeeService {
    private final String EMPLOYEE_PATH_FILE = "src\\furama\\data\\employee.csv";
    List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        //đọc file
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListFromCSV(EMPLOYEE_PATH_FILE);
        for (int i = 0; i < employeeList.size() ; i++) {
            System.out.println((i+1) + "." + employeeList.get(i));
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        Double phoneNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Hoàn thành việc nhập");

        Employee employee = new Employee(id, name, dayOfBirth, gender, idCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);

        //ghi file
        ReadAndWriteToCSV.writeEmployeeListToCSV("src\\furama\\data\\employee.csv" ,employeeList, true);
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListFromCSV(EMPLOYEE_PATH_FILE);
        System.out.println("Nhập id employee muốn tìm kiếm");
        String idCode = scanner.nextLine();
        boolean checkEmploye = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == Integer.parseInt(idCode)) {
                checkEmploye = true;
                System.out.println("Bạn muốn sửa thông tin nào cho" + employeeList.get(i).getName());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Trình độ");
                System.out.println("8. Vị trí");
                System.out.println("9. Salary");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = scanner.nextLine();
                        employeeList.get(i).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        employeeList.get(i).setDayOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String gender = scanner.nextLine();
                        employeeList.get(i).setGender(gender);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idCard = scanner.nextLine();
                        employeeList.get(i).setIdCard(idCard);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        int phoneNumber = Integer.parseInt(scanner.nextLine());
                        employeeList.get(i).setPhoneNumber(phoneNumber);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = scanner.nextLine();
                        employeeList.get(i).setEmail(email);
                        break;
                    case 7:
                        System.out.println("Nhập trình độ");
                        String level = scanner.nextLine();
                        employeeList.get(i).setLevel(level);
                        break;
                    case 8:
                        System.out.println("Nhập position");
                        String position = scanner.nextLine();
                        employeeList.get(i).setPosition(position);
                        break;
                    case 9:
                        System.out.println("Nhập lương");
                        boolean checkSalary = true;
                        int salary = 0;
                        while (checkSalary) {
                            try {
                                salary = Integer.parseInt(scanner.nextLine());
                                checkSalary = false;
                            } catch (RuntimeException ex) {
                                System.out.println("Nhập số vào: ");
                            }
                        }
                        employeeList.get(i).setSalary(salary);
                        break;
                }
                break;
            }
        }
        if (checkEmploye){
            System.out.println("Hoàn thành việc cập nhật");
            ReadAndWriteToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE, employeeList, false);
        }else {
            System.out.println("Không có id này trong list Employees");
        }

    }

    @Override
    public void delete() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListFromCSV(EMPLOYEE_PATH_FILE);
        display();
        System.out.println("Chọn đối tượng muốn xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        employeeList.remove(chooseDelete - 1);
        ReadAndWriteToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE, employeeList, false);
    }
}
