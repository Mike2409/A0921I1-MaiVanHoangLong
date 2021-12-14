package ss5_modifier_method_property.bai_tap.LopChiGhiTrongJava;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student(){};

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }


}
