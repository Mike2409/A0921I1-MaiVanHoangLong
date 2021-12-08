package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
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
        void HienThiSoNguyenToNhoHon100(int n){
            for(int i = 1 ;i<n;i++){
                if(checkNguyenTo(i)){
                    System.out.print(" " +i);
                }
            }
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            HienThiSoNguyenToNhoHon100 lk = new HienThiSoNguyenToNhoHon100();
            int n;
            System.out.println("Nhap n = \n");
            n = sc.nextInt();
            lk.HienThiSoNguyenToNhoHon100(n);
        }
}

