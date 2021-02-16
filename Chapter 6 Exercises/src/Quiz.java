import java.util.Scanner;
public class Quiz {
    private Question[] Questions;
    private Question[] Responses;
    private int qnumber = 0;
    private Scanner sc = new Scanner(System.in);
    

    public Quiz() {
        Questions = new Question[25];
        Responses = new Question[25];
        for(int i = 0; i <25; i++) {
            Questions[i] = new Question();
        }
    }

    public void addQuestion(String Q, String A) {
        Questions[qnumber].setQuestion(Q);
        Questions[qnumber].setAnswer(A);
        System.out.println("You can add " + (24-qnumber) + " more questions");
        qnumber++;
    }

    public void giveQuiz() {        
        int cr = 0;
        String a = "";
        int c = 0;
        for(int i = 0;i<25;i++) {
            if(Questions[i].getQuestion() != "") {
            	System.out.print("Question "+i+": ");
                System.out.println(Questions[i].getQuestion());
                a = sc.nextLine();
                Responses[i] = new Question(Questions[i].getQuestion(), a);
                if(Questions[i].answer(a)) {
                    cr++;
                    c++;
                }
            }
            
        }
        System.out.println("You got "+cr+" correct answers out of "+c+" Questions");
        for(int i = 0;i<25;i++) {
            if(Questions[i].getQuestion() != "") {
                System.out.println("Question "+i+": "+Questions[i].getQuestion()+". Correct Response is "+Questions[i].getAnswer()+", your response was "+Responses[i].getAnswer());
            }
        }   
    }

}
