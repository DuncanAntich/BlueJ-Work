// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.*;
import java.lang.*;

public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0
                || statement.indexOf("parent") >= 0
                || statement.indexOf("family") >= 0)
        {
            response = getFamilyResponse();
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    private String getFamilyResponse()
    {
        int rand = (int) (Math.random()*10);
        ArrayList<String> fam = new ArrayList<String>();
        fam.add("Does your mother bake?");
        fam.add("Where did your father go to school?");
        fam.add("How many siblings do you have?");
        fam.add("What about your grandparents?");
        fam.add("How large is your family?");
        fam.add("I don't remember my parents.");
        fam.add("Do you have any nieces or nephews?");
        fam.add("Are you a twin?");
        fam.add("Where did your family come from?");
        fam.add("Did you know your great grandparents?");
        return fam.get(rand);
    }
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        String[] responses = new String[10];
        responses[0] = "Interesting, tell me more.";
        responses[1] = "Hmmmm....";
        responses[2] = "You don't say.";
        responses[3] = "Some weather we've been having, eh?";
        responses[4] = "What do you think Canada is like?";
        responses[5] = "I would like to birdwatch.";
        responses[6] = "Do you think I am funny?";
        responses[7] = "Am I likeable?";
        responses[8] = "I love talking to other people.";
        responses[9] = "Do you like ham?";
        response = responses[whichResponse];
        return response;
    }
}
