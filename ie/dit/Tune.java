package ie.dit;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune {
	
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
    public String toString()
    {
        String s = "";
		
		for(String tune:tunes)
        {
            s.append(tune + "\n");
        }		

        return s.toString();
    }	
}