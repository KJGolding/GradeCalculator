package studentgradecalculator;

/** 
 * @Author Name: Kimberly Golding
 * @Date: Jun 19, 2017
 * @Subclass UnderGrad Description: Subclass extends Student class 
 * to determine grades for graduate students
 */

//Begin Subclass UnderGrad
public class UnderGrad extends Student {
    
    //Declarations
    private final double ASSNWT = 0.65;
    private final double DISCWT = 0.25;
    private final double MIDWT = 0.10;
    private double grade;
    private double finalGrade;
    
    /**
     * Default constructor
     */
    public UnderGrad() {

    }

    /**
     * Method to Calculate Weighted Grade Average
     */
    public void weightedGrade() {
        studentGrades(); 
        double faAvg = (getAssnAvg()) * ASSNWT;
        double fdAvg = (getDiscAvg()) * DISCWT;
        double fmAvg = (getMidAvg()) * MIDWT;
        
        grade = faAvg + fdAvg + fmAvg;
    }

    /**
     * Method to Calculate Final Grade Average
     * @param i 
     */
    public void FinalGrade(String i) {
        double newGrade;
        if (i.equalsIgnoreCase("Y")) {
            newGrade = grade + 1;
        }
        else 
            newGrade = grade;
        setFinalGrade(newGrade);
    }
    
    /**
     * Set method for final grade average
     * @param f 
     */
    public void setFinalGrade(double f) {
        finalGrade = f;
    }
    
    /**
     * Get method for final grade average
     * @return finalGrade
     */
    public double getFinalGrade() {
        return finalGrade;
    }

} //End Subclass UnderGrad