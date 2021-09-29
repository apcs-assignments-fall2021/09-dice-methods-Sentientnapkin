public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int)((Math.random()*6)+1);
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        boolean isSix = false;
        double correct = 0.0;
        int dice = 0;
        for (int i = 0; i < 10000; i++) {
            for(int j = 0;j<6;j++){
                dice = rollDie();
                if(dice==6)
                    isSix = true;
            }
            if (isSix)
                correct++;
            isSix = false;
        }

        return 100*(correct/10000);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        boolean isSix = false;
        double correct = 0.0;
        int dice = 0;
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            for(int j = 0;j<12;j++){
                dice = rollDie();
                if(dice==6)
                    count++;
                if(count==2)
                    isSix = true;
            }
            count = 0;
            if (isSix)
                correct++;
            isSix = false;
        }

        return 100*(correct/10000);
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        boolean isSix = false;
        double correct = 0.0;
        int dice = 0;
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            for(int j = 0;j<18;j++){
                dice = rollDie();
                if(dice==6)
                    count++;
                if(count==3)
                    isSix = true;
            }
            count = 0;
            if (isSix)
                correct++;
            isSix = false;
        }

        return 100*(correct/10000);
    }

    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
