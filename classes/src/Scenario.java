package classes.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Random;
import classes.src.Company;
import classes.src.Senator;

public class Scenario {
    private Company subject;
    private Senator[] presentSenators;

    public Scenario(Company subject, Senator[] presentSenators) {
        this.subject = subject;
        this.presentSenators = presentSenators;
    }

    public boolean collectVote(Senator[] senators) {
        // ToDo:  iterate through array of senators and collect vote percentage
        return true; // FixIt: this needs to depend on vote outcome
    }

    public String issue() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
    
        String filename = "/resources/issues/scenario-" + randomNumber + ".txt";
        System.out.println(filename);
        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
