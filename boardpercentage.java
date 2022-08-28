import java.util.Scanner;
public class boardpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of english :");
        float eng = sc.nextFloat();

        System.out.println("Enter the marks of hindi :");
        float hindi = sc.nextFloat();

        System.out.println("Enter the marks of maths :");
        float maths = sc.nextFloat();

        System.out.println("Enter the marks of science :");
        float science = sc.nextFloat();

        System.out.println("Enter the marks of social study");
        float socialstudy = sc.nextFloat();

        float percenatge = ((eng+hindi+maths+science+socialstudy)/500)*100;

        System.out.println("the percentage of student is :"+ percenatge);

    }
}
