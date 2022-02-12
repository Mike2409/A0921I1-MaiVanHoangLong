package ss16_IO_text_file.bai_tap;

public class MainCopyFileTest {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.readFile("src\\ss16_IO_text_file\\data\\number.csv");
        copyFileText.write("src\\ss16_IO_text_file\\data\\result.csv");
    }
}
