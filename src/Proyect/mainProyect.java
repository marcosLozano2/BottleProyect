package Proyect;
import com.google.gson.*;
import java.io.*;
import java.util.List;
public class mainProyect {
	
 public static void main (String [] args) {
	 
	 try {
	 ReadJson js=new ReadJson("C:\\Users\\marco\\Downloads\\botellas.json");
	 printState( js.readPath());
	
		 
	 }catch(Exception e){
		 System.out.println(e.getStackTrace());
	 } 
 }
 
 	public static void printState(List<BottleList> state) {
 		for(int i=0;i<state.size();i++) {
 			System.out.println(state.get(i));
 		}
 		System.out.println(state.size());
 		
 	}
 
}
