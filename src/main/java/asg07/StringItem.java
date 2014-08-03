package asg07;


public class StringItem implements Item{
	public String value;
	public StringItem(String str){
		this.value = str;
	}
	public Item clone(){
		return this;
	}
	public String toString(){
		String str = "" + value;
		return str;
	}
	public boolean equals(Item otherItem){
		if(otherItem instanceof Item){
			StringItem aStringItem = (StringItem)otherItem;
			if(aStringItem.value == this.value) // bien value thi phai de public, thi moi get set theo kieu item.value.
				return true; 
			else
				return false;
		}
		else 
			return false;
	}
}