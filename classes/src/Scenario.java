package classes.src;

import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.IOException;
// import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Random;
import classes.src.Company;
import classes.src.Senator;

public class Scenario {
    private Company subject;
    private Senator[] presentSenators;
    private Lobbyist lobbyist;
    private Senator senator;

    public Scenario(Senator[] presentSenators, Senator senator) {
        this.presentSenators = presentSenators;
        this.senator = senator;
    }

    public boolean collectVote(Senator[] senators) {
        // ToDo:  iterate through array of senators and collect vote percentage
        return true; // FixIt: this needs to depend on vote outcome
    }

    public void resolve(String vote, boolean isReplay) {
        if (this.senator.buyStock(this.getSubject()) && vote.equalsIgnoreCase("y") || isReplay && vote.equalsIgnoreCase("y")) {
            this.senator.addInfluence(this.lobbyist);
        }
    }

    public Company getSubject() {
        return this.subject;
    }

    public Senator[] getSenators() {
        return this.presentSenators;
    }

    public String issue() {
        this.lobbyist = new Lobbyist("Default");
        Random random = new Random();
        int randomNumber = random.nextInt(18) + 1;
    
        switch (randomNumber) {
            case 1:
            case 7:
            case 13:
            for (Company c : Company.getList()) {
                if (c.getName().equals("McWeapons")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            case 2:
            case 8:
            case 14:
            for (Company c : Company.getList()) {
                if (c.getName().equals("ACME-Weapons")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            case 3:
            case 9:
            case 15:
            for (Company c : Company.getList()) {
                if (c.getName().equals("McTech")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            case 4:
            case 10:
            case 16:
            for (Company c : Company.getList()) {
                if (c.getName().equals("ACME-Tech")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            case 5:
            case 11:
            case 17:
            for (Company c : Company.getList()) {
                if (c.getName().equals("McBuilder")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            case 6:
            case 12:
            case 18:
            for (Company c : Company.getList()) {
                if (c.getName().equals("ACME-Builder")) {
                    this.subject = c;
                    this.lobbyist = c.getEmployee();
                    break;
                }
            }
            break;
            default:
            break;
        }

        if (randomNumber > 12) {
            this.lobbyist.greet();
        }
        
        String filename = randomNumber < 13 ? "/resources/issues/scenario-" + randomNumber + ".txt" : "/resources/dialogues/dialogue-" + randomNumber + ".txt";
        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename)));
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
