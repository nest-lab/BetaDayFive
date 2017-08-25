/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DEJI
 */
/*The sentence.java file reads contents from lessig-court-transcript.txt file.
Add lessig-court-transcript.txt to your project parent directory or specify it's path in sentence.java so as to read from it
*/
public class Sentences {
    public static void main(String[] args) throws FileNotFoundException{
        String sResult = "This is a test. Mr, Dayne, this is a T.L.A. test.";
        Scanner output = new Scanner(new FileReader("Lessig-court-transcript.txt"));
        while(output.hasNext()){
        String Result = output.nextLine();
        String[] sSentence = Result.split("(?<=[a-z])\\.\\,\\s+");
        for(int i=0;i<sSentence.length;i++){
            //if statement conditions to check for presence of titles.
            if (sSentence[i].equals("Mr")||sSentence[i].equals("Mr.")||sSentence[i].equals("MR.")
                    ||sSentence[i].equals("Dr.")||sSentence[i].equals("Prof.")
                    ||sSentence[i].equals("Mrs.")||sSentence[i].equals("MRS.")||sSentence[i].equals("DR.")
                    ||sSentence[i].equals("mr.")||sSentence[i].equals("mrs.")
                    ||sSentence[i].equals("dr.")||sSentence[i].equals("miss.")||sSentence[i].equals("Miss.")
                    ||sSentence[i].equals("MISS.")||sSentence[i].equals("prof.")
                    ||sSentence[i].equals("PROF.")){
                System.out.print(""+sSentence[i]+". ");
            }
            else{
            System.out.println(sSentence[i]);
            }
        }
    }
    
}
}
