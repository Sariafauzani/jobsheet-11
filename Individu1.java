import java.util.Scanner;

public class Individu1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input N
    System.out.print("Masukkan nilai N: ");
    int N = scanner.nextInt();
    scanner.close();

    // Cek apakah N minimal 3
    if (N < 3) {
      System.out.println("Nilai tidak valid!");
      return;
    }

    // Cetak segitiga angka
    for (int i = 1; i <= N; i++) {
      for (int j = N; j >= i; j--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
