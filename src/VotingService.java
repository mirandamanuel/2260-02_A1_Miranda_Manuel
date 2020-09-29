//Made by: Manuel Miranda
//CS 3560.01
import java.util.ArrayList;
public class VotingService {
    private ArrayList<String> submissionAnswers;
    private ArrayList<Integer> submissionIds;

    public VotingService(){
        submissionAnswers = new ArrayList<String>();
        submissionIds = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getSubmissionIds() {
        return submissionIds;
    }

    public ArrayList<String> getSubmissionAnswers() {
        return submissionAnswers;
    }

    public void addSubmission(int id, String answer){
        //if-statement checks for a student resubmitting an answer and replaces their old answer with the new one
        if(submissionIds.contains(id)){
            int replacementIndex = submissionIds.indexOf(id);
            submissionAnswers.set(replacementIndex, answer);
        }
        //if the ID is new, both the ID and its associated answer are added to their respective ArrayLists
        else {
            submissionIds.add(id);
            submissionAnswers.add(answer);
        }
    }
}
