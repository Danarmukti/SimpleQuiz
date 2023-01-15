import java.util.Scanner;
public class Quiz {
    static int score=0;
    public static void main(String[] args) {
        
        System.out.println("-Quiz-");
        System.out.println("------");
        System.out.println();
        quiz1();
        quiz2();
        quiz3();
        quiz4();
        quiz5();
        hasil(score);
        
    }
    
    public static void quiz1() {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("| Pertanyaan yang ke-1      | ");
        System.out.println("| Apa nama ibukota Jepang ? | ");
        System.out.println("| A. Jakarta                | ");
        System.out.println("| B. Tokyo                  | ");
        System.out.println("| C. Dubai                  | ");
        System.out.println("| D. Mumbai                 | ");
        System.out.print("| Jawab : "); pilih = input.nextLine();
        switch (pilih) {
            case "b","B":
                score++;
            break;
        }
    }
    public static void quiz2() {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("| Pertanyaan ke-2                    | ");
        System.out.println("| Apa penyebab perang dunia ke 2  ?  | ");
        System.out.println("| A. Penyerangan Amerika ke Iraq     | ");
        System.out.println("| B. Invasi Jepang ke Indonesia      | ");
        System.out.println("| C. Invasi German ke Poland         | ");
        System.out.println("| D. Terbunuhnya raja Austria        | ");
        System.out.print("| Jawab : "); pilih = input.nextLine();
        switch (pilih) {
            case "c","C":
            score++;
            break;
        }
    }
    public static void quiz3() {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("| Pertanyaan yang ke-3                                   | ");
        System.out.println("| Runtuhnya Tembok Berlin di german terjadi pada tahun ? | ");
        System.out.println("| A. 9 November 1989                                     | ");
        System.out.println("| B. 17 Agustus 1945                                     | ");
        System.out.println("| C. 10 November 1989                                    | ");
        System.out.println("| D. 9 November 1991                                     | ");
        System.out.print("| Jawab : "); pilih = input.nextLine();
        switch (pilih) {
            case "a","A":
                score++;
            break;
        }
    }
    public static void quiz4() {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("| Pertanyaan yang ke-4                           | ");
        System.out.println("| Terjadinya peristiwa pearl harbor pada tahun ? | ");
        System.out.println("| A. 7 Desember 1941                             | ");
        System.out.println("| B. 6 Agustus  1945                             | ");
        System.out.println("| C. 9 Agustus  1945                             | ");
        System.out.println("| D. 17 Agustus 1945                             | ");
        System.out.print("| Jawab : "); pilih = input.nextLine();
        switch (pilih) {
            case "a","A":
                score++;
            break;
        }
    }
    public static void quiz5() {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("| Pertanyaan yang ke-5                              | ");
        System.out.println("| Siapa saja yang menjadi sekutu German pada PD2  ? | ");
        System.out.println("| A. Jepang,Amerika                                 | ");
        System.out.println("| B. Itali,China                                    | ");
        System.out.println("| C. Jepang,Rusia                                   | ");
        System.out.println("| D. Jepang,itali                                   | ");
        System.out.print("| Jawab : "); pilih = input.nextLine();
        switch (pilih) {
            case "d","D":
                score++;
            break;
        }
    }
    public static void hasil(int score) {
        System.out.println("Anda Berhasil menjawab "+score+" / 5 pertanyaan!");
    }
}
