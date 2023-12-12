import java.util.Scanner;

public class LoginAkun {

    public String Code[] = {"SKA123","SKB123","PBO321"};
    public String capca;
    public int hitung =-1;
    public LoginAkun(){
        String id;
        String password;
        System.out.println("SELAMAT DATANG DI SUPERMARKET LBCITY");
        System.out.println("====================================");
        System.out.println("Log in  ");
            do{
                Scanner cin = new Scanner(System.in);
                System.out.print("Username         : ");
                id = cin.next();
                System.out.print("Password         : ");
                password = cin.next();
                if(id.equalsIgnoreCase("admin") && password.equals("admin123")){
                    int random = 0;
                    String n;
                    do{
                        if(random>0){
                            System.out.println("Captcha Salah !!!");
                        }
                        random++;
                        hitung ++;
                        hitung %=3;
                        System.out.println("Kode Captcha     : " + Code[hitung]);
                        System.out.print("Entry Captcha    : ");
                        Scanner kode = new Scanner(System.in);
                        capca = kode.next();

                    }while(!capca.equals(Code[hitung]));


                    System.out.println("Akun Ditemukan");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!id.equals("admin") || !password.equals("admin123"));

        
    }
}







