package Question_2;

public class Student {
    private int rollNo;
    private String name;
    private int marks;
    private char grade;

public Student(){

}
    
    public Student(int rollNo, String name, int marks, char grade) {
        super();

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }


    public static void DisplayDetails(int rollNo;String name;int marks;char grade) {
        

        char grade = calculateGrade(marks);
        new Student( rollNo,marks,name,grade);


    System.out.println("Student Details ------");
    System.out.println("Student name"+name);
    System.out.println("Student Marks"+marks);
    System.out.println("Student Rollno"+rollNo);
    System.out.println("Student Grade"+grade);
    System.out.println("-----------------------");

    }
    


    private String calculateGrade(int marks) {
        if(marks>=500){
            return "A";
        }
        else if(marks<500 && marks>=400){
            return "B";
        }
        else{
            return "C";
        }
    }

    public void DisplayDetails(int i, String string) {
    }

    public void DisplayDetails(int roll, String name2, int marks2) {
    }
}
