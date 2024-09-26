import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    int rounds;
    Scanner in;
    in = new Scanner(System.in);
    int responseNum = 0;
    int round = 0;
    String[] responses = {"Hmmm...", "That's so cool!", "Very interesting"};
    
    System.out.println("How many rounds?");
    rounds = in.nextInt();
    // Asks for the desired number of conversation rounds and stores that in integer variable rounds

    System.out.println("Hi there! What's on your mind?");
    for (int i = 0; i < (rounds + 1); ++i) {
    // Loops conversational pattern. As of 9.25.24, pattern is user input -> one response from array is used in response, repeat until conversation ends
      String response = in.nextLine();
        if (round != 0) {
          System.out.println(responses[responseNum]);
        }
      responseNum += 1;
      round += 1;
      if (responseNum >= 3) {
        responseNum = 0;
      }
    }
    System.out.println("See ya!");
    in.close();
  }
}

