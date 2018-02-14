package ie.dit;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook {

	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook(String s){
		
		String fileName = s;
		
		String line = null;
		
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
		
		for(String tune:tunes)
        {
            s.append(tune + "\n");
        }		

        return s.toString();
    }	
	
	public Tune findTune(String title) {
		
		/*utilizes string.contains() to check if each line being read in
		  contains 'title' */
		  
		//iterates through the tunes ArrayList  
		for(String t:tunes){
			
			//returns the string t if it contains the specified title
			if(t.contains(title){
				return t;
			}
		}
		
		//Error message if no song with that name is found
		System.out.println("No tune with the name " + title);
		
	}
	
	//main method
	public static void main(String[] args){
		TuneBook tb = new TuneBook("hnj0.abc");
		System.out.println(tb);
		
		//Tune t = tb.findTune("Scotsman over the Border");
		//t.play();
	}
}