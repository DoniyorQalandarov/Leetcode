package leetCodeExamples;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(goalParse("G()(al)"));
    }

    public static String goalParse(String command) {
        String newString = "";
        for (int i = 0; i < command.length(); i++) {
            newString = command.replace("()", "o").replace("(al)", "al");
        }
        return newString;
    }
}
