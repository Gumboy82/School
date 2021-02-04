import java.util.Scanner;
public class QuizTime {
    
    public static void main(String[] args) {
        Quiz Quiz = new Quiz();
        int i = 1;
        String q = "";
        String a = "";
        Scanner sc = new Scanner(System.in);
        while(i != 0) {
            System.out.println("What is the Question you want to add to the quiz");
            q = sc.nextLine();
            System.out.println("What is the Answer to the Question");
            a = sc.nextLine();


            System.out.println("Do you want to add more questions? (1 for yes, 0 for no)");
            i = sc.nextInt();
            sc.nextLine();
        }
        Quiz.giveQuiz();

    }

}
