import javax.swing.plaf.ActionMapUIResource;

public class Student {
    //Attributes:
    private String stdName;
    private double assignmentOne;
    private double assignmentTwo; //

    private double totalMarks;





    //Constructor(s):
    public Student(){
        this.stdName = "Un-Known";
    }
    public Student(String stdName,double assignmentOne,double assignmentTwo){
        this.stdName = stdName;
        this.assignmentOne = assignmentOne;
        this.assignmentTwo = assignmentTwo;
        //I will calculate the total mark for each student.
        this.totalMarks = this.assignmentOne +this.assignmentTwo;
    }

    //Methods:

    //Jones Eduard: Assignment1 – 60 Assignment2 - 80 Total – 14
    public String stdReport(){
        String report = String.format("%S:\tAssignment1 – %.2f\tAssignment2 - %.2f\tTotal – %.2f",
                this.stdName,this.assignmentOne,this.assignmentTwo,this.totalMarks);
        return report;
    }

    //We have to create getters & setters methods for the above private attributes.


}
