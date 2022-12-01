import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Leap year checker!");
    Scanner i = new Scanner(System.in);
    int x;
    System.out.println("Enter your user: ");
    String user =i.nextLine();
    System.out.println("Enter a year: ");
    x = i.nextInt();
    System.out.println(user+" the year "+ x+" is "+leapYear(x));
    leapYear(2022);
    leapYear(2024);
    leapYear(2000);
    leapYear(1900);
     }
  
  public static boolean leapYear(int x) {
    if (x % 100==0 && x%400==0){ 
      return true;
      }
    else if (x %4!=0){
      return false;
    }
    else if (x %4==0){
      return true;
    }
       else{
        return false;
        }
  }



}


