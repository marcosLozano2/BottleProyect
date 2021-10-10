package Proyect;
public class liquid {
private int amount;
private int colour;
public liquid(int amount, int colour) {
	this.amount=amount;
	this.colour=colour;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getColor() {
	return colour;
}
public void setColor(int colour) {
	this.colour = colour;
}
@Override
public String toString() {
	return "["+amount +"," + colour + "]";
}

}
