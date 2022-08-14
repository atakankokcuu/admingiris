import java.util.Scanner;

public class kullanici {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("kullanici adini girin");
        String admin=scanner.nextLine();
        System.out.print("sifreyi  girin");
        String password=scanner.nextLine();
        if(admin.equals("elma")&&password.equals("123")){
            System.out.print("başarılı şekilde giriş yaptınız");
        }else {
            System.out.println("kullanıcı adı ve şifreniz yanlış");
            System.out.println("şifrenizi sıfırlamak istiyorsanız 0 basınız\nçıkmak için 1 basnız");
            int ata=scanner.nextInt();
            switch (ata){
                case 0:
                    System.out.print("yeni şifrenizi girin");
                    String passaword2=scanner.next();
                    if(passaword2==password) {
                        System.out.print("şifreniz bir öncekiş şifreyle aynı başka şifre girin");
                        break;
                    }
                else{
                        System.out.print("şifreniz başarıyla değiştirildi. yeni şifrenizle giriş yapabilirsiniz");
                        password=passaword2;
                    }



                case 1:
                    System.out.print("çıkış yapıldı");
                    break;

                    }
            }

        }
    }

