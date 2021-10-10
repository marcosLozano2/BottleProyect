package Proyect;

import java.util.ArrayList;
import java.util.List;

public class BottleList {

	private List<Botella> listaBotellas = new ArrayList<Botella>();

	public BottleList() {
		this.listaBotellas = listaBotellas;
	}
	
	public void addBottle(Botella bottle) {
		listaBotellas.add(bottle);
	}

	@Override
	public String toString() {
		String chain="[";
		for(int i=0;i<listaBotellas.size();i++) {
			if(i!=listaBotellas.size()-1) {
			chain=chain+listaBotellas.get(i).toString()+",";
			}else {
				chain=chain+listaBotellas.get(i).toString();
			}
		}
		chain=chain+"]";
		return chain;
}
	
	
	
	
	
}
