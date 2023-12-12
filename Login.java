import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Login {
    public static void main(String[] args) {

            // Scanner cin = new Scanner(System.in);
            // System.out.print("Masukkan Akun : ");
            // String n = cin.next();
            // if(n.equals("admin123")){
            //     System.out.print("Masukkan Password :");
            //     String m = cin.next();
            //     if(m.equals("admin12345")){
            //         System.out.println("Hai Admin");
            //     }else{
            //         System.out.println("Password Salah");
            //     }
            // }else{
            //     System.out.println("Akun Salah");
            // }

            // String akun;

            // do{
            //     Scanner cin = new Scanner(System.in);
            //     System.out.print("Masukkan Akun : ");
            //     akun = cin.next();
            //     if(akun.equals("rizkiolders")){
            //         System.out.println("Akun Ditemukan");
            //     }else{
            //         System.out.println("Coba Lagi");
            //     }
            // }while(!akun.equals("rizkiolders"));
            // String kunci;
            // do{
            //     Scanner cin = new Scanner(System.in);
            //     System.out.print("Masukkan Akun : ");
            //     kunci = cin.next();
            //     if(akun.equals("admin123")){
            //         System.out.println("Login Berhasil");
            //     }else{
            //         System.out.println("Coba Lagi");
            //     }
            // }while(!kunci.equals("admin123"));


            String id;
            String password;

            do{
                Scanner cin = new Scanner(System.in);
                System.out.print("Masukkan Akun     : ");
                id = cin.next();
                System.out.print("Masukkan Password : ");
                password = cin.next();
                if(id.equalsIgnoreCase("admin") && password.equals("admin123")){
                    int random;
                    String n;
                    do{
                        System.out.println("Captcha STV123" );
                        // Random rand = new Random();
                        // random = rand.nextInt(100000);
                        // System.out.println(random);
                        // Scanner inte = new Scanner(System.in);
                        System.out.print("Masukkan Captcha : ");
                        n = cin.next();
                    }while(!n.equalsIgnoreCase("STV123"));

                    System.out.println("Akun Ditemukan");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!id.equals("admin") || !password.equals("admin123"));

    }
}
