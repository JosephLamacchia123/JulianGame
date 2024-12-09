public class Option {
    int userInputNumberValue;
    String displayMessage;
    String resultMessage;
    Option[] furtherOptions;

    public Option(int userInputNumberValue, String displayMessage, String resultMessage, Option[] furtherOptions) {
        this.userInputNumberValue = userInputNumberValue;
        this.displayMessage = displayMessage;
        this.furtherOptions = furtherOptions;
        this.resultMessage = resultMessage;
    }

    public Option(int userInputNumberValue, String displayMessage, String resultMessage) {
        this.userInputNumberValue = userInputNumberValue;
        this.displayMessage = displayMessage;
        this.resultMessage = resultMessage;
    }
}