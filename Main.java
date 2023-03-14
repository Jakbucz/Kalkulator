import java.util.Scanner;

public class Main {

public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
 
  
  System.out.print("Wybierz opcje (1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz): ");
  
  int wybór = scanner.nextInt();

  System.out.print("Podaj pierwszą liczbę; ");
  double liczba1 = scanner.nextDouble();

  System.out.print("Podaj drugą liczbę: ");
  double liczba2 = scanner.nextDouble();

  double wynik = 0.0;

  switch (wybór) {
    
    case 1:
      wynik = liczba1 + liczba2;
      break;
    
    case 2:
      wynik = liczba1 - liczba2;
      break;

    case 3:
      wynik = liczba1 * liczba2;
      break;

    case 4:
      if (liczba2 == 0) {
        System.out.print("nie można dzielic przez zero!?! ");
          return;
      }
      wynik = liczba1 / liczba2;
      break;
    default:

      System.out.println("Zly wybor");
      return;
      
      
  }
  System.out.println("wynik: " + wynik);
}
}