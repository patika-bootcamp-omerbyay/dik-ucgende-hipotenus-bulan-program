# dik-ucgende-hipotenus-bulan-program
Java - Dik Üçgende Hipotenüs Bulan Program

Koduma eklediğim bu kontrol mekanizması aslında geometrideki "Üçgen Eşitsizliği" (Triangle Inequality) kuralıdır. Bir üçgenin oluşabilmesi için herhangi iki kenarın toplamı, her zaman üçüncü kenardan büyük olmalıdır.

Üçgen Alanı ve Hipotenüs Hesaplayıcı

Bu Java programı, kullanıcıdan alınan kenar uzunluklarına göre hem dik üçgenlerde Hipotenüs hesaplaması yapar hem de herhangi bir üçgenin Alanını Heron formülü ile hesaplar.

🚀 Özellikler

  Dinamik Hipotenüs Hesabı: İki dik kenarı girilen üçgenin Pisagor teoremi (a2+b2=c2) ile hipotenüsünü bulur.

  Heron Formülü ile Alan Hesabı: Üç kenarı bilinen bir üçgenin alanını yarı çevre (u) parametresini kullanarak hesaplar.

  Geometrik Doğrulama: Girilen kenarların fiziksel olarak bir üçgen oluşturup oluşturmadığını kontrol eder.

🛠️ Kullanılan Mantık ve Formüller
1. Üçgen Eşitsizliği Kontrolü

Program, hesaplamaya geçmeden önce girilen kenarların geçerliliğini şu mantıkla kontrol eder:


if(a >= b + c || b >= a + c || c >= a + b ){
    System.out.print("Geçersiz üçgen kenar uzunlukları");
    return;
}

  Neden Önemli? Eğer bir kenar, diğer ikisinin toplamından büyük veya ona eşitse, bu doğru parçaları uç uca eklendiğinde bir üçgen (kapalı bir alan) oluşturamaz.

2. Alan Hesaplama (Heron Formülü)

    Yarı Çevre (u): (a+b+c)/2

    Alan: u⋅(u−a)⋅(u−b)⋅(u−c)​

💻 Kurulum ve Çalıştırma

  Projenin .java dosyasını bilgisayarınıza indirin.

  Terminal veya komut istemcisini açın.

  Dosyayı derleyin:
    
```bash
javac Main.java
```

  Programı çalıştırın:

```bash
java Main
```

📝 Örnek Çıktı

--- Hipotenüs Hesaplama ---
1. Dik Kenarı Giriniz: 3
2. Dik Kenarı Giriniz: 4
Hipotenüs Uzunluğu: 5,0

--- Üçgen Alanı Hesaplama (Heron Formülü) ---
1. Kenar Uzunluğunu Giriniz: 3
2. Kenar Uzunluğunu Giriniz: 4
3. Kenar Uzunluğunu Giriniz: 5

Üçgenin Çevresi: 12,0

Üçgenin Alanı: 6,0
