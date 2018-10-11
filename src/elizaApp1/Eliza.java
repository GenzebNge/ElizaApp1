package elizaApp1;

public class Eliza {
    private String initialMessage;
    private String userMessage;
    private String repitedQuestions;
    private String printUserMessage;

    public String getInitialMessage() {

        initialMessage ="Good day. What is your problem? ";
        return initialMessage;
    }

    public void setInitialMessage(String initialMessage) {
        this.initialMessage = initialMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getRepitedQuestions() {
        repitedQuestions ="Enter your response here or Q to quit:";
        return repitedQuestions;
    }

    public void setRepitedQuestions(String repitedQuestions) {
        this.repitedQuestions = repitedQuestions;
    }

    public String getPrintUserMessage() {

        return printUserMessage;
    }

    public void setPrintUserMessage(String printUserMessage) {
        this.printUserMessage = printUserMessage;
    }



}
