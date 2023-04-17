// DARREN LARKENS NOVEMBER EXAM 2022
package Paper1;
import java.awt.*;

import javax.swing.JOptionPane;

public class LeagueTwenty {

    //Q2 2.1
    //Q2 2.2
    public static double PlayerAverage;
    public static String currentPlayerName;
    public static int currentPlayerFifties;
    public static String MVP = "";
    public static String HighestScoring;
    public static double HighestPlayerAvg = 0.0;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int playersPlayed = 0;

        //Q3 3.1
        currentPlayerName = JOptionPane.showInputDialog("Please input the current plaers name");

        //Q3 3.2
        System.out.println("============================================\n          PLAYER STATS      \n==================================");
        //PrintPlayerStatsHeader();

        //Q 3 3.3
        while (!currentPlayerName.equals("XXX")) {

            PlayerAverage = 0;
            //Q3 3.4
            System.out.println("Name: " + currentPlayerName);

            //Q3 3.6
            playersPlayed = playersPlayed + 1;

            generatePlayer();

            System.out.println("");
            System.out.println("");

            //Q3 3.5
            currentPlayerName = JOptionPane.showInputDialog("Please input the current plaers name");
            
            
        }
        System. out. println(ANSI_RED + "This text is colored" + ANSI_RESET);
        System.out.println("");
        System.out.println("=================== TEAM STATS =====================");
        System.out.println("MVP count: " + currentPlayerFifties);
        System.out.println("MVP'S:" + MVP);
        System.out.println("MVP WINNER: " + HighestScoring);
        System.out.println("HIGHEST AVERAGE: " + HighestPlayerAvg);

    }

    public static void generatePlayer() {

        // DOESNT WORK NB DONT WORK YET!
        int playerExperiance = (int) ((Math.random() * (4 - 1) + 1));
        String playerExperianceValue = "";

        switch (playerExperiance) {
            case 1:
                playerExperianceValue = "junior";
                System.out.println("EXP:" + playerExperianceValue);
                break;

            case 2:
                playerExperianceValue = "senior";
                System.out.println("EXP:" + playerExperianceValue);
                break;

            case 3:
                playerExperianceValue = "expert";
                System.out.println("EXP:" + playerExperianceValue);

                break;

            default:
                System.out.println("Mehtod generatePlayer has encountered an error please contact support");

        }

        int Namelenght = currentPlayerName.length();

        String codeName = "";

        for (int f = 0; f < 3; f++) {
            codeName = codeName + currentPlayerName.charAt(f);
        }

        codeName = codeName.toUpperCase();
        System.out.println("CODE: " + codeName + Namelenght);

        int scoreForGame = 0;
        int Isgreater = 0;
        
        for (int i = 0; i < 5; i++) {
            switch (playerExperiance) {
                case 1:
                    scoreForGame = (int) (Math.random() * (50 - 0) + 0);
                    break;

                case 2:
                    scoreForGame = (int) (Math.random() * (100 - 0) + 0);
                    break;

                case 3:
                    scoreForGame = (int) (Math.random() * (150 - 0) + 0);

                    break;

                default:
                    System.out.println("The generate score part of method generatePlayer has encountered an unexpected error please contact support");
                    break;
            }
            PlayerAverage = PlayerAverage + scoreForGame;
            
            if (scoreForGame > 50) {
                Isgreater = Isgreater + 1;

            }
        }

        PlayerAverage = (PlayerAverage / 5.0 * 10);
        PlayerAverage = Math.round(PlayerAverage);
        PlayerAverage = PlayerAverage / 10;

        System.out.println("AVG: " + PlayerAverage);

        
        String isNominie = "False";
        if (Isgreater >= 3) {
            currentPlayerFifties = currentPlayerFifties + 1;
            MVP = MVP + " " + currentPlayerName;
            isNominie = "True";
            if(PlayerAverage > HighestPlayerAvg){
                HighestScoring = currentPlayerName;
                HighestPlayerAvg = PlayerAverage;
            }
        } else {
            isNominie = "Flase";
        }

        System.out.println("Nominie: " + isNominie);

    }
}
