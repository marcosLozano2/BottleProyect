package Proyect;

import java.io.*;
import java.util.*;

import javax.json.*;
public class ReadJson {

	static Scanner sc = null;
	File myObj=null;
	private String path;
	
	
	public ReadJson(String path) throws Exception{
		this.path = path;
		myObj=new File(path);
		sc=new Scanner(myObj);
	}
	
	public List<BottleList> readPath(){
		String linea="";
		List<BottleList> state = new ArrayList<BottleList>();
		while(sc.hasNextLine()) {
			BottleList listaBotellas =new BottleList();
			liquid liquido=null;
			Botella botella=null;
			linea=sc.nextLine();
			try {
				JsonReader reader = Json.createReader(new StringReader(linea));
				JsonArray jsonObj = reader.readArray();
				for (int contador = 0; contador < jsonObj.size(); contador++) {
					JsonArray array = jsonObj.getJsonArray(contador);
					botella=new Botella(10);
					for(int i=0;i<array.size();i++) {
						JsonArray subArray= array.getJsonArray(i);
						liquido=new liquid(subArray.getInt(0),subArray.getInt(1));
						botella.addLiquid(liquido);
					}
					listaBotellas.addBottle(botella);
				}
				state.add(listaBotellas);
			}catch (Exception ex) {
				
			}
		}
		return state;
		
	}
	
}
