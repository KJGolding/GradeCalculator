package studentgradecalculator;

/** 
 * @Author: Kimberly Golding 
 * @Date: Jun 19, 2017
 * @Subclass Grad Description: Subclass extends Student class 
 * to determine grades for graduate students
 */

//Begin Subclass Grad
public class Grad extends Student {

    //Declarations
    private final double ASSNWT = 0.40;
    private final double DISCWT = 0.15;
    private final double MIDWT = 0.15;
    private final double THESISWT = 0.30;
    private double grade;
    private double finalGrade;

    /**
     * Default constructor
     */
    public Grad() {

    }

    /**
     * Method to Calculate Weighted Grade Average without Thesis
     */
    public void weightedGrade() {
        studentGrades(); 
        double faAvg = (getAssnAvg()) * ASSNWT;
        double fdAvg = (getDiscAvg()) * DISCWT;
        double fmAvg = (getMidAvg()) * MIDWT;
        grade = faAvg + fdAvg + fmAvg;
    }

    /**
     * Method to Calculate Final Grade Average with Thesis & IDEA
     *
     * @param t
     * @param i
     */
    public void FinalGrade(double t, String i) {
        double ftAvg = t * THESISWT;
        grade = grade + ftAvg;
        double newGrade;
        if (i.equalsIgnoreCase("Y")) {
            newGrade = grade + 1;
        } else {
            newGrade = grade;
        }
        setFinalGrade(newGrade);
    }

    /**
     * Set method for final grade average
     *
     * @param f
     */
    public void setFinalGrade(double f) {
        finalGrade = f;
    }

    /**
     * Get method for final grade average
     *
     * @return finalGrade
     */
    public double getFinalGrade() {
        return finalGrade;
    }

} //End Subclass Grad