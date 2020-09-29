//Made by: Manuel Miranda
//CS 3560.01
import java.util.ArrayList;
public class SingleAnswerQuestion extends Question {
    public SingleAnswerQuestion(String q, String a){
        question = q;
        correctAnswer = a;
    }

    public String results(ArrayList<String> a){
        int numRight = 0;
        int numWrong = 0;


        for(String element : a){
            if(element.equalsIgnoreCase(correctAnswer))
                numRight++;
            else
                numWrong++;
        }

        return "Right: "+numRight+" Wrong: "+numWrong;
    }
}
