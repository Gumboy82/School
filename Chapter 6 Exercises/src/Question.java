public class Question {
    private String Q = "";
    private String A = "";

    public Question(String q, String a) {
        Q = q;
        A = a;
    }
    public Question() {

    }

    public void setQuestion(String q) {
        Q = q;
    }

    public void setAnswer(String a) {
        A = a;
    }


    public String getQuestion() {
        return Q;
    }

    public String getAnswer() {
        return A;
    }

    public boolean answer(String a) {
        if(a.equals(A)) {
            return true;
        }
        else {
            return false;
        }
    }
}
