import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        double a, b, c, u, cevre, alan;
        Scanner input = new Scanner(System.in);

        // 1. KISIM: Hipotenüs Hesaplama (Dik Üçgen Varsayımı)
        System.out.println("--- Hipotenüs Hesaplama ---");
        System.out.print("1. Dik Kenarı Giriniz: ");
        a = input.nextDouble();
        System.out.print("2. Dik Kenarı Giriniz: ");
        b = input.nextDouble();

        // Pisagor: c^2 = a^2 + b^2 -> Math.sqrt ile karekök alıyoruz
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs Uzunluğu: " + String.format("%.1f", c));

        System.out.println("\n--- Üçgen Alanı Hesaplama (Heron Formülü) ---");
        // 2. KISIM: Ödev (Üç Kenarı Verilen Üçgenin Alanı)
        // Burada kullanıcıdan üçüncü kenarı da almamız gerekiyor
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = input.nextDouble();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = input.nextDouble();
        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = input.nextDouble();

        if(a >= b + c || b >= a + c || c >= a + b ){
            System.out.print("Geçersiz üçgen kenar uzunlukları");
            return;
        }

        // Çevre hesabı: 2u = a + b + c
        cevre = a + b + c;
        u = cevre / 2.0;

        // Alan Formülü: Alan * Alan = u * (u - a) * (u - b) * (u - c)
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + String.format("%.1f", cevre));
        System.out.println("Üçgenin Alanı: " + String.format("%.1f", alan));

        input.close();
    }
}
