package asg07;


public class NumeralItem implements Item{
	public int value;
	public NumeralItem(int value){
		this.value = value;
	}
	public Item clone(){
		return this;
	}
	public String toString(){
		String s = "" + this.value;
		return s;
	}
	public boolean equals(Item otherItem){
		if(otherItem instanceof Item){
			NumeralItem aNumeralItem = (NumeralItem)otherItem;
			if(aNumeralItem.value == this.value)
				return true;
			else
				return false;
		}
		else 
			return false;
	}
}