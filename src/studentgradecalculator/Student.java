package studentgradecalculator;

/**
 * @Author Name: Kimberly Golding
 * @Date: Jun 19, 2017
 * @Subclass Student Description: Subclass with shared methods 
 * for Grad & UnderGrad Subclasses
 */

//Imports
import java.util.ArrayList;
import java.util.Scanner;

//Begin Subclass Student
public class Student {

    //Declarations
    private double aAvg;
    private double dAvg;
    private double mAvg;
    private boolean idea;

    //Create a new scanner object
    Scanner s = new Scanner(System.in);

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * Method to obtain student grades from user
     */
    public void studentGrades() {
        //Ask user for Assignment Grades & put in ArrayList
        System.out.print("Enter the number of Assignment grades: ");
        int numOfAssnGrades = s.nextInt();
        ArrayList<Double> assnArr = new ArrayList<>();
        for (int i = 0; i < numOfAssnGrades; i++) {
            System.out.printf("Enter Assingment grade number %d: ", i + 1);
            assnArr.add(s.nextDouble());
        }
        //Ask user for Discussion Grades & put in ArrayList
        System.out.print("Enter the number of Discussion grades: ");
        int numOfDiscGrades = s.nextInt();
        ArrayList<Double> discArr = new ArrayList<>();
        for (int i = 0; i < numOfDiscGrades; i++) {
            System.out.printf("Enter Discussion grade number %d: ", i + 1);
            discArr.add(s.nextDouble());
        }
        //Ask user for Midweek Assignment Grades & put in ArrayList
        System.out.print("Enter the number of Midweek Assignment grades: ");
        int numOfMidGrades = s.nextInt();
        ArrayList<Double> midArr = new ArrayList<>();
        for (int i = 0; i < numOfMidGrades; i++) {
            System.out.printf("Enter Midweek Assignment grade number %d: ", i + 1);
            midArr.add(s.nextDouble());
        }

        //Send ArrayList & numOfGrades to set methods for Average calculations 
        assnAverage(assnArr, numOfAssnGrades);
        discAverage(discArr, numOfDiscGrades);
        midAverage(midArr, numOfMidGrades);

    }

    /**
     * Set method for Assignment Average
     *
     * @param a
     */
    public void setAssnAvg(double a) {
        aAvg = a;
    }

    /**
     * Get method for Assignment Average
     *
     * @return aAvg
     */
    public double getAssnAvg() {
        return aAvg;
    }

    /**
     * Method to calculate Assignment Average
     *
     * @param arrA
     * @param n
     */
    public void assnAverage(ArrayList<Double> arrA, int n) {
        double sum = 0;
        for (double i : arrA) {
            sum += i;
        }
        double assnAvg = sum / n;
        setAssnAvg(assnAvg);
    }

    /**
     * Set method for Discussion Average
     *
     * @param d
     */
    public void setDiscAvg(double d) {
        dAvg = d;
    }

    /**
     * Get method for Discussion Average
     *
     * @return dAvg
     */
    public double getDiscAvg() {
        return dAvg;
    }

    /**
     * Method to calculate Discussion Average
     *
     * @param arrD
     * @param n
     */
    public void discAverage(ArrayList<Double> arrD, int n) {
        double sum = 0;
        for (double i : arrD) {
            sum += i;
        }
        double discAvg = sum / n;
        setDiscAvg(discAvg);
    }

    /**
     * Set method for Midweek Assignment Average
     *
     * @param m
     */
    public void setMidAvg(double m) {
        mAvg = m;

    }

    /**
     * Get method for Midweek Assignment Average
     *
     * @return mAvg
     */
    public double getMidAvg() {
        return mAvg;
    }

    /**
     * Method to calculate Midweek Assignment Average
     *
     * @param arrM
     * @param n
     */
    public void midAverage(ArrayList<Double> arrM, int n) {
        double sum = 0;
        for (double i : arrM) {
            sum += i;
        }
        double midAvg = sum / n;
        setMidAvg(midAvg);
    }
    
} //End Subclass Student