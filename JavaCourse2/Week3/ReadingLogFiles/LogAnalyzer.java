
/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         // complete constructor
         this.records=new ArrayList<>();
     }
        
     public void readFile(String filename) {
         // complete method
         FileResource fr=new FileResource(filename);
         for (String line=fr.lines()){
             WebLogParser wp=new WebLogParser();
             records.add(wp.parseEntry(line));
         }
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     
}
