import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        
        String q1 = "What color are apples?\n" + "(a)red\n(b)orange\n(c)magenta\n";

        String q2 = "What color are bananas?\n" + "(a)red\n(b)blue\n(c)yellow\n";

        Question [] questions = {
            new Question(q1, "a"),
            new Question(q2, "c")
        };

        takeTest(questions);
    }

    public static void takeTest(Question[] questions){

        int score = 0;
        Scanner KeyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = KeyboardInput.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }

        System.out.println("You got " + score + "/" + questions.length);

        KeyboardInput.close ();
    }


}