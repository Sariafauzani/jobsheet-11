import java.util.Scanner;

public class Individu3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input N
    System.out.print("Masukkan nilai N: ");
    int N = scanner.nextInt();
    scanner.close();

    // Cek apakah N minimal 3
    if (N >= 3) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                System.out.print(" " +  N);
            } else {
                System.out.print("  ");
            }
      }
      System.out.println();
    }
  }
}
}