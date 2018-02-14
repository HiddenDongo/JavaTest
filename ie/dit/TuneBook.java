package ie.dit;

import java.io.*;
//import java.util.ArrayList;

public class TuneBook {

	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook(String s){
		
		String fileName = s;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				tunes.add(line);
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error opening file");
		}		
		catch(IOException ex) {
			System.out.println("Error reading file" + fileName);
		}		
	}
	
    public String toString(){
		
        String s = "";
		
		for(String tune: tunes)
        {
            s.append(tune + "\n");
        }		

        return s.toString();
    }	
	
	public Tune findTune(String title) {
		
		/*utilizes string.contains() to check if each line being read in
		  contains 'title' */
		
	}
}