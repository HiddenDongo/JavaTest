package ie.dit;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

//Tune class
public class Tune {
	
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	//toString method
    public String toString()
    {
        String s = "";
		
		//iterates through each element of
		for(String tune:tunes)
        {
				s.append(tune + " ,");
        }		

        return s.toString();
    }	
}