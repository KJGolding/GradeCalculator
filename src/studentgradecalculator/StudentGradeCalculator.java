package studentgradecalculator; 

/**
  * @Author Name: Kimberly Golding
  * @Date: Jun 19, 2017
  * @Description: Program to find the average and final
  * grade for a college student's course work
  */

//Imports
import java.util.Scanner;

//Begin Class StudentGradeCalculator 
public class StudentGradeCalculator {
    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        String firstName;
        String lastName;
        int studentType;
        String idea;
        String ans;
       
        
        //Create new Scanner object
        Scanner sc = new Scanner(System.in);
        
        //Welcome statemtent & request for student's name
        System.out.println("Welcome to the Student Grade Calculator");
        
        //Begin Do-while loop 
        do {
            
        System.out.print("Enter Student's First Name: ");
        firstName = sc.next();
        System.out.print("Enter Student's Last Name: ");
        lastName = sc.next();
        
        //Request user input to determine student type
        System.out.printf("Select %s %s's student type:\n1. Under Graduate "
                + "Student\n2. Graduate Student\n->: ", firstName, lastName);
        studentType = sc.nextInt();
        
        //case statement to determine final grade based on input for studenttype
        switch (studentType) {
            case 1:
                UnderGrad ug = new UnderGrad();
                ug.weightedGrade();
                System.out.printf("Did %s %s fill out the IDEA Survey? (Y for "
                        + "Yes - N for No): ", firstName, lastName);
                idea = sc.next();
                ug.FinalGrade(idea);
                System.out.printf("%s %s's final grade average is: %.2f\n",
                        firstName, lastName, ug.getFinalGrade());
                break;
            case 2:
                Grad g = new Grad();
                g.weightedGrade();
                System.out.printf("Enter the final Thesis grade for %s %s: ",
                        firstName, lastName);
                double thesis = sc.nextDouble();
                System.out.printf("Did %s %s fill out the IDEA Survey? (Y for "
                        + "Yes - N for No): ", firstName, lastName);
                idea = sc.next();
                g.FinalGrade(thesis, idea);
                System.out.printf("%s %s's final grade average is: %.2f\n",
                        firstName, lastName, g.getFinalGrade());
                break;
            default:
                System.out.println("Data entry error: You did not enter an "
                        + "appropriate value for student type");
                System.exit(1);
        }
        
        //Ask user to use again
            System.out.print("\nWould you like to run another calculation? Y for "
                    + "Yes, N for No: ");
            ans = sc.next();
            System.out.println("");

            //End do-while loop
        } while (ans.equalsIgnoreCase("Y"));
        
    } //End Main Method

} //End Class StudentGradeCalculator
