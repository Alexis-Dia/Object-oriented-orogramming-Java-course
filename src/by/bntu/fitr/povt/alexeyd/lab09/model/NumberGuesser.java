package by.bntu.fitr.povt.alexeyd.lab09.model;

import by.bntu.fitr.povt.alexeyd.lab09.util.UserInput;

public class NumberGuesser {
    private UserInput input = new UserInput();

    public void guess(int number) {
        boolean flag = false;
        while (!flag) {

            System.out.println("Input number:");
            int answer = input.input("");
            if (answer < number) {
                System.out.println("Higher");
            } else if (answer > number) {
                System.out.println("Lower");
            }else{
                flag = true;
                System.out.println("Congratulations!!!!");
            }

        }

    }

}
