import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args) {

        int score = getStudentScore(); 

        String grade = calculateGrade(score);

        System.out.print("Your Grade is: " + grade);


    }
    public static int getStudentScore(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Score: ");
        return scanner.nextInt();
    }
    public static String calculateGrade(int score){


        if (score >= 90){
            return "A";
        }
        else if(score >= 80 && score < 89){
            return "B";
        }
        else if(score >= 70 && score < 79){
            return "C";
        }
        else if (score >= 60 && score < 69){
            return "D";
        }
        else {
            return "F";
        }
    }
}