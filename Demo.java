import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        ReligionInterface religion;
        Scanner scan = new Scanner(System.in);

        String inputName = "";
        boolean inputInvalid = true;
        System.out.println("Choose your religion type: ");

        while (inputInvalid) {
            System.out.println("Your religion must be polytheistic, monotheistic, or pantheistic.");
            inputName = scan.nextLine();
            if (inputName.equals("polytheistic") || inputName.equals("monotheistic") || inputName.equals("pantheistic")) {
                inputInvalid = false;
            }
            else {
                System.out.println("Invalid religion type.");
                inputInvalid = true;
            }
        }

        System.out.println("Pick a name for a god in this religion.");
        String inputGod = scan.nextLine();

        scan.close();

        if (inputName.equals("polytheistic")) {
            religion = new Polytheism();
        }
        else if (inputName.equals("monotheistic")) {
            religion = new Monotheism();
        }
        else {
            religion = new Pantheism();
        }

        religion.worships(inputGod);
        religion.gods();
    }
}
