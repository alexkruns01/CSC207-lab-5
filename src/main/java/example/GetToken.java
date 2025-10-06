package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp";
        String response;
        try{
            response = example.run(gradeAPISignUpURL, "username", "CaptainCaprica");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(response);
    }
}
