import java.util.Scanner;

public class Individu2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input N
    System.out.print("Masukkan nilai N: ");
    int N = scanner.nextInt();
    scanner.close();

    // Cek apakah N minimal 5
    if (N < 5) {
      System.out.println("Nilai tidak valid!");
      return;
    }

    // Cetak segitiga bintang
    for (int i = N; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          System.out.print("*");
        }
      System.out.println();
    }
  }
}
