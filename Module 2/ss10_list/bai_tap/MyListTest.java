package ss10_list.bai_tap;

public class MyListTest {
    static class Student{
        private int id;
        private String name;
        private String[] say;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
        Student a = new Student(1,"Long");
        Student b = new Student(2,"Anh");
        Student c = new Student(3,"Thịnh");
        Student d = new Student(4,"Thắng");
        Student e = new Student(5,"Vân");
        Student f = new Student(6,"Hưng");
        Student g = new Student(7,"Hân");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyArrayList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

        studentMyList.add(f);

        newMyArrayList = studentMyList.clone();
//        for(int i = 0 ; i < newMyArrayList.size ; i++){
//            System.out.println(newMyArrayList.get(i).getName());
//        }
        System.out.println(newMyArrayList.remove(0).getName());
        for(int i = 0 ; i < newMyArrayList.size ; i++){
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
