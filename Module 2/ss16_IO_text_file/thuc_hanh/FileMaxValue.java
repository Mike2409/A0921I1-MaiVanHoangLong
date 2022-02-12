package ss16_IO_text_file.thuc_hanh;

import java.util.List;

public class FileMaxValue {
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbers=readAndWriteFile.readFile("src\\ss16_IO_text_file\\data\\numbers.txt");
        int maxvalue=findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_IO_text_file\\data\\text.txt",maxvalue);
    }
}
