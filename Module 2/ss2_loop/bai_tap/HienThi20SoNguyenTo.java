package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
        boolean checkNguyenTo(int n){
            if(n<=2){
                return true;
            }else {
                for(int i =2;i<=Math.sqrt(n);i++){
                    if(n % i == 0)
                        return false;
                }
            }
            return true;
        }
        void HienThi20SoNguyenTo(int n){
            for(int i = 1 ;i<n;i++){
                if(checkNguyenTo(i)){
                    System.out.print(" " +i);
                }
            }
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            HienThi20SoNguyenTo lk = new HienThi20SoNguyenTo();
            int n = 20;
            lk.HienThi20SoNguyenTo(n);
        }
}
