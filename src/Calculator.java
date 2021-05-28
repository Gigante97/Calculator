import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double result=0;
        int count =0;
        boolean check =true;
        Scanner scanner = new Scanner(System.in);
       while (check==true) {
           if (count!=0){
               System.out.println("Введите операцию");
               while (check==true) {

                   switch (scanner.nextLine()) {
                       case "+":
                           System.out.println("Введите число");
                           double x = scanner.nextDouble();
                           System.out.println(summ(result,x));
                           result=summ(result,x);
                           System.out.println("Введите операцию");
                           break;
                       case "-":
                           System.out.println("Введите число");
                           double a = scanner.nextDouble();
                           System.out.println(min(result,a));
                           result=min(result,a);
                           System.out.println("Введите операцию");
                           break;
                       case "*":
                           System.out.println("Введите число");
                           double s = scanner.nextDouble();
                           System.out.println(xxx(result,s));
                           result=xxx(result,s);
                           System.out.println("Введите операцию");
                           break;

                       case "/":
                           System.out.println("Введите число");
                           double f = scanner.nextDouble();
                           if (f==0.0){
                               System.out.println("На ноль делить нельзя");
                               break;
                           }
                           System.out.println(del(result,f));
                           result=del(result,f);
                           System.out.println("Введите операцию");
                           break;

                       case "C":
                           result=0;
                           count=0;
                           System.out.println("Введите первое число");
                           break;
                       case "Q":
                           System.out.println(result);
                           check=false;
                           break;



                   }
               }
           } else {
               System.out.println("Введите первое число");
               double x = scanner.nextDouble();
               scanner.nextLine();
               System.out.println("Введите операцию");
               switch (scanner.nextLine()) {
                   case "+":
                       System.out.println("Введите число");
                       double y = scanner.nextDouble();
                       result=summ(x,y);
                       System.out.println(result);
                       count++;
                       break;
                   case "-":
                       System.out.println("Введите число");
                       double z = scanner.nextDouble();
                       result=min(x,z);
                       System.out.println(result);
                       count++;
                       break;
                   case "*":
                       System.out.println("Введите число");
                       double c = scanner.nextDouble();
                       result=xxx(x,c);
                       System.out.println(result);
                       count++;
                       break;
                   case "/":
                       System.out.println("Введите число");
                       double v = scanner.nextDouble();
                       if (v==0.0){
                           System.out.println("На ноль делить нельзя");
                           break;
                       }
                       result=del(x,v);
                       System.out.println(result);
                       count++;
                       break;

                   case "C":
                       result=0;
                       count=0;
                       System.out.println("Введите первое число");
                       break;
                   case "Q":
                       System.out.println(result);
                       check=false;
                       break;

                  

               }

       }


        }




    }
    public static double summ(double x, double y) {
        return x+y;
    }
    public static double min (double x, double y) {
        return x-y;
    }
    public static double xxx (double x, double y) {
        return x*y;
    }
    public static double del (double x, double y) {
        return x/y;
    }
}