//Made by: Manuel Miranda
//CS 3560.01
import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question{
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;

    public MultipleChoiceQuestion(String q, String a, String b, String c, String d){
        question = q;
        answerA = a;
        answerB = b;
        answerC = c;
        answerD = d;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setCorrectAnswer(String x) {
        if (x.equalsIgnoreCase("a"))
            correctAnswer = answerA;
        else if (x.equalsIgnoreCase("b"))
            correctAnswer = answerB;
        else if (x.equalsIgnoreCase("c"))
            correctAnswer = answerC;
        else if (x.equalsIgnoreCase("d"))
            correctAnswer = answerD;
        else
            throw new RuntimeException("Multiple choice answer must be: a, b, c, or e.");
    }

    public String results(ArrayList<String> a){
        int numOfA = 0;
        int numOfB = 0;
        int numOfC = 0;
        int numOfD = 0;

        for(String element : a){
            if(element.equalsIgnoreCase("a"))
                numOfA++;
            if(element.equalsIgnoreCase("b"))
                numOfB++;
            if(element.equalsIgnoreCase("c"))
                numOfC++;
            if(element.equalsIgnoreCase("d"))
                numOfD++;
        }

        return "A:"+numOfA+" B:"+numOfB+" C:"+numOfC+" D:"+numOfD;
    }

}
