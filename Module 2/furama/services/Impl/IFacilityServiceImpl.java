package furama.services.Impl;

import furama.models.Facility;
import furama.models.Villa;
import furama.services.IFacilityService;
import furama.util.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IFacilityServiceImpl implements IFacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT ="^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA= "^([3-9]\\d|[1-9]\\d{2,})$";

    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()){
            System.out.println("Service" + element.getKey() + "Số lần thuê" + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        //String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor
        String idFacility = inputId();
        String nameService = inputName();
        double areaUse =  Double.parseDouble(inputArea());
        System.out.println("Nhập giá tiền thuê: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng khách ở: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê (dài hạn/ ngắn hạn): ");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập kiểu villa: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        Double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.println("Hoàn thành việc nhập");

        Villa villa = new Villa(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityList.put(villa, 0);
        System.out.println("Đã thêm mới villa thành công");

    }

    private String inputId(){
        System.out.println("Nhap ID, ma dich vu: ");
        return RegexData.RegexStr(scanner.nextLine(), REGEX_ID_VILLA, "Ban da nhap sai dinh dang");
    }
    private String inputName(){
        System.out.println("Nhap ten dich vu: ");
        return RegexData.RegexStr(scanner.nextLine(), REGEX_STR, "Ban da nhap sai dinh dang");
    }
    private String inputArea(){
        System.out.println("Nhap dien tich dich vu: ");
        return RegexData.RegexStr(scanner.nextLine(), REGEX_AREA, "Ban da nhap sai dinh dang");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
