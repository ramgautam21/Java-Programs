import java.io.*;

public class average {
    public static void main(String [] args) {
        String fileName = "score.txt";
        String line = null;
        double sum = 0.0;
        int i=0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
            	sum = sum + Double.parseDouble(line.split(" ")[1]);
            	i++;
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }

        System.out.println("The average marks: "+ sum/i);
    }    
} 

