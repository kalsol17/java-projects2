import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //weight conversion program
        //Declare variable
        Scanner scanner=new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;
        //welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert kgs to lbs");
        //prompt for user choice
        System.out.print("Choose an Option: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.print("Enter the weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f" , newWeight);
        }else if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f",newWeight);

        }else{
            System.out.println("Your choice is not valid.choose again!");
        }


scanner.close();
    }
}
