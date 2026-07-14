import java.util.Scanner;

public class Quiz_Game{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"Is this program fire?",
                                "Is HC fire?",
                                "Is java fire", 
                                "Is Bro code fire?"};
        String[][] options = {{"1. Yes","2.No"},
                                {"1. Yes","2.No"},
                                {"1. Yes","2.No"},
                                {"1. Yes","2.No"},
                                {"1. Yes","2.No"}
                            };
        int [] answers = {1,1,1,1};
        int score = 0;
        int guess;
        System.out.println(" Welcome");
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            guess = scanner.nextInt();
            for(String option: options[i]){
                System.out.println(option);
            }
        }
        scanner.close();
     }
}