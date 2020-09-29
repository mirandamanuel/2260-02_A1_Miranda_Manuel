//Made By: Manuel Miranda
//CS 3560.01
public class SimulationDriver {
    public static void main(String[] args) {
        System.out.println("Student Voting Service Simulation by Manuel Miranda\n");
        //number of students from 20-99
        int numOfStudents = (int)(Math.random()*79+20);
        System.out.println("Number of students in class: "+numOfStudents);

        //multiple-choice simulation
        System.out.println("\nInitiating multiple-choice question...");
        MultipleChoiceQuestion multiChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?","Glub Glub","Baaaaaa","Bark","Yaaa");
        VotingService votingMC = new VotingService();
        System.out.println("Students are answering...");
        for(int i=0; i<numOfStudents; i++){
            int studentId = (int)(Math.random()*1000000000);
            int studentAnswerRNG = (int)(Math.random()*4+1);
            String studentAnswer = null;
            if(studentAnswerRNG==1)
                studentAnswer = "A";
            if(studentAnswerRNG==2)
                studentAnswer = "B";
            if(studentAnswerRNG==3)
                studentAnswer = "C";
            if(studentAnswerRNG==4)
                studentAnswer = "D";
            votingMC.addSubmission(studentId,studentAnswer);
        }
        System.out.println("Results are in!");
        System.out.println("The results for this multiple-choice question are as follows: "+ multiChoiceQuestion.results(votingMC.getSubmissionAnswers()));

        //single-answer simulation
        System.out.println("\nInitiating single-answer question...");
        SingleAnswerQuestion singleAnswerQuestion = new SingleAnswerQuestion("Select a number between 1-10.","1");
        VotingService votingSC = new VotingService();
        System.out.println("Students are answering...");
        for(int i=0; i<numOfStudents; i++){
            int studentId = (int)(Math.random()*1000000000);
            String studentAnswer =""+((int)(Math.random()*10));
            votingSC.addSubmission(studentId,studentAnswer);
        }
        System.out.println("Results are in!");
        System.out.println("The results for this single-answer question are as follows: "+singleAnswerQuestion.results(votingSC.getSubmissionAnswers()));
    }
}
