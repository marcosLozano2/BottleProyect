package Proyect;
import java.util.Stack;
public class Botella {

	private Stack<liquid> liquids = new Stack<liquid>();
	private int maxCapacity;
	
	public Botella(Stack<liquid> liquids, int maxCapacity) {
		this.liquids = liquids;
		this.maxCapacity = maxCapacity;
	}
	public Botella(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return liquids.toString(); 
	}
	public Stack<liquid> getLiquids() {
		return liquids;
	}

	public void setLiquids(Stack<liquid> liquids) {
		this.liquids = liquids;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	public int totalLiquid() {
		int total=0;
		liquid liquido=null;
		Stack<liquid> liquidsFinal =new Stack<liquid>();
		while(!liquids.isEmpty()) {
			liquido=liquids.pop();
			liquidsFinal.push(liquido);
			total+=liquido.getAmount();
		}
		while(!liquidsFinal.isEmpty()) {
			liquids.push(liquidsFinal.pop());
		}
		return total;
	}
	public void addLiquid(liquid liquid) throws CapacityException{
		
		if (maxCapacity >= (totalLiquid() + liquid.getAmount())) {
			if (liquids.isEmpty()) {
				liquids.push(liquid);
			} else {
				if (liquid.getColor() == liquids.peek().getColor()) {
					liquids.peek().setAmount(liquid.getAmount() + liquids.peek().getAmount());
				} else {
					liquids.push(liquid);
				}
			}
		} else {
//			System.out.println("CapacityExceeded");
//			throw new CapacityException("Capacity exceeded");
		}
	}
	
	public liquid removeLiquid() throws EmptyBottle{
		liquid liquid=null;
		if(liquids.isEmpty()) {
			throw new EmptyBottle("Capacity exceeded");
		}else {
			liquid= liquids.pop();
		}
		return liquid;
	}

	
	
}
