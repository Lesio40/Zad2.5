import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner  scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe");
    double a = scanner.nextDouble();
    System.out.println("Podaj liczbe");
    double b = scanner.nextDouble();
    System.out.println("Podaj liczbe");
    double c = scanner.nextDouble();
    double maks=0;
    if(a>=maks)
    {
      maks=a;
    } 
    if(b>=maks)
    {
      maks=b;
    } 
    if(c>=maks)
    {
      maks=c;
    } 
    System.out.println("Maksymalna liczba to: " + maks);
  }}