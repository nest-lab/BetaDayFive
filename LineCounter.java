/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author BetaTeam
 */
public class LineCounter {
    static int total = 0;
    //The counter's check covers single line comments and empty lines only.
    //Empty line comments are excluded as they MAY be commented part of written codes
    public static void main(String[] args) throws IOException{
        File dir = new File("C://Users/DEJI/Documents/NetBeansProjects/NESTlab/src/nestlab"); //replace with path to your project's source package
        File[] files = dir.listFiles();
        for(File javaFile : files){
            if(javaFile.getName().endsWith(".java")){
            System.out.println(javaFile.getAbsolutePath());
                getLines(javaFile.getAbsolutePath());
            }else{
                
            }
        }
    }
    private static void getLines(String f) throws IOException { 
    FileReader fr=new FileReader(new File(f));
    BufferedReader br=new BufferedReader(fr); 
    int i=0;
    boolean isEOF=false;
    do{
    String t=br.readLine();
    if(t!=null){
    isEOF=true;
    t=t.replaceAll("\\n|\\t|\\s", "");
    if((!t.equals("")) && (!t.startsWith("//"))) {
    i = i + 1;
    }
    }
    else {
    isEOF=false;
    }
    }while(isEOF);{
    br.close();
    fr.close();
    total+=i;
    System.out.println(i);
    }
     System.out.println(total);   
    }
    
    
}
