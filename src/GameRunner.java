import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {

        boolean gameIsRunning = true;
        Location entryWay = new Location("Main Entry Way", null);
        Location livingRoom = new Location("Living Room", entryWay);
        Location kitchen = new Location("Kitchen", livingRoom);



        Option goToBed = new Option(0, "Go to bed", "You lay in the bed and fall asleep");

        Option pickUpSword = new Option(0, "Pick up the sword", "You pick up the sword and blah blah");
        Option breakSword = new Option(1,"Break the sword", "You break the sword and blah blah");

        Option[] swordOptions = new Option[] {pickUpSword, breakSword};

        Option selectSword = new Option(1, "Examine the sword", "This is the description of the sword", swordOptions);

        Option[] bedroomOptions = new Option[] {goToBed, selectSword};


        Location bedroom = new Location("Main Entry Way", kitchen, bedroomOptions);

        Location  currentLocation = bedroom;
        Option[] currentOptions = currentLocation.options;
        Option selectedOption = null;

        Scanner scanner = new Scanner(System.in);

        while(gameIsRunning) {

            System.out.println("You are in the " + currentLocation.description);
            System.out.println();

            for (int i = 0; i < currentOptions.length; i = i + 1) {
                System.out.println(currentOptions[i].displayMessage);
                System.out.println("[" + currentOptions[i].userInputNumberValue + "]");
                System.out.println();
            }

            int input = scanner.nextInt();

            selectedOption = currentOptions[input];

            if (selectedOption.furtherOptions != null) {
                currentOptions = selectedOption.furtherOptions;
            }
            else {
                System.out.println();
                System.out.println(selectedOption.resultMessage);
            }







        }

    }
}
