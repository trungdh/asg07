package asg07;


public class MyList implements Item{
	Node start;
	Node end;
	public MyList(){
	
	}
	public void append(Item item){
		Node node = new Node( item, null);
		if(this.start == null)
		{
			//start.next = node.next;
			this.start = node;
		}
		else
		
			this.end.next = node;
			this.end = node;
		
	}
	public void appendList(MyList list){
		Node node = list.start;
		while(node != null)
		{
			if(this.start == null)
			{
				this.start = node;
			}
			else
			{
				this.end.next = node;	
				this.end = node;
			}
			node = node.next;
		}
	}
	public Item clone(){
		return this;
	}
	public String toString(){
		String s = "(";
		Node node = this.start;
		while (node != null)
		{
			s += node.data.toString() + ",";
			node = node.next;
		}
		s =	s.substring(0, s.length() - 1)+")";
		return s;
	}
	public int length(){
		int count = 0;
		Node node = this.start;
		while(node !=null)
		{
			count++;
			node = node.next;
		}
		return count;
	}
	public boolean equals(Item items){
		MyList amyList = (MyList)items;
		if(this.length() != amyList.length())
			{
				return false;
			}
		if(items instanceof Item){
			Node node1 = this.start;
			Node node2 = amyList.start;
			boolean b = true;
			while(node1 !=null && node2 != null)
			{
				b = node1.data.equals(node2.data);
				if(b = false)
					break;
				else
				node1 = node1.next;
				node2 = node2.next;
			}
			return b;
		}
		else
			return false;
	}
	public Item find(Item items){
		Node node1 = new Node( items, null);
		if(items instanceof Item){
			Node node2 = this.start;
			boolean b = false;
			while(node2 != null)
			{
				b = node2.equals(node1.data);
				if(b = true)
				{
					break;
				}
				else
				{
					node2 = node2.next;
				}
			}
			return (Item)node2;
		}
		else return null;
	}
	/*public void invert(){
		Node node = this.start;
		for()
	}*/
}