/*	C16357813
	DT228/2
	Object Oriented Programming
*/

package ie.dit;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

//TuneBook class
public class TuneBook {
	
	//create ArrayList of Tune objects named tunes 
	//Significant errors here as objects can't be added to tunes
	ArrayList<Tune> tunes = new ArrayList<Tune>();

	//Tunebook constructor
	public TuneBook(String s){
		
		String fileName = s;
		
		String line = null;
		
		//utilizes try/catch error handling
		try {
			
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			/*iterate through the file, placeing each line in the String line, while line
			  does not equal EOF/null*/
			while((line = bufferedReader.readLine()) != null)
			{
				//uses .add() to add each line to the tunes ArrayList
				tunes.add(line);
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error opening file" + fileName);
		}		
		catch(IOException ex) {
			System.out.println("Error reading file" + fileName);
		}		
	}
	
	//toString method
    public String toString(){
		
        String s = "";
		
		//iterates through the tunes ArrayList
		for(String tune:tunes)
        {
			//uses .append to add each ArrayList element to s
            s.append(tune + "\n");
        }		

		//returns s using toString()
        return s.toString();
    }	
	
	//findTune method
	public Tune findTune(String title) {
		
		/*utilizes string.contains() to check if each line being read in
		  contains 'title' */
		  
		//iterates through the tunes ArrayList  
		for(String t:tunes){
			
			//returns the string t if it contains the specified title
			if(t.contains(title)){
				
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
		
		Tune t = tb.findTune("Scotsman over the Border");
		//t.play();
	}
}