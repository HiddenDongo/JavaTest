package ie.dit;

import java.io.*;

public class Tune {
	
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
    public String toString()
    {
        String s = "";
		
		for(String tune: tunes)
        {
            s.append(tune + "\n");
        }		

        return s.toString();
    }	
}