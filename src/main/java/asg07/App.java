package asg07;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    
		MyList l = new MyList();
		l.append(new NumeralItem(1)); 
		l.append(new NumeralItem(2));
		System.out.println( "l List : " + l); // (1, 2)
		MyList l2 = new MyList();
		l2.append(new StringItem("a")); 
		l2.append(new StringItem("b"));
		System.out.println("l2 List : " + l2); // (a, b)
		l.append(l2);
		System.out.println("l2 item add to l List: " + l); // (1, 2, (a, b))
		System.out.println("Length of l list : " + l.length());
		l.appendList(l2);
		System.out.println("l2 List add to l List: " + l); // (1, 2, (a, b), a, b)
		System.out.println("Length of l list : " + l.length());
		l2.append(new NumeralItem(5));
		System.out.println("add to l2 List" + l2); // (a, b, 5)
		System.out.println(l); // (1, 2, (3, 4), 3, 4)
		System.out.println("Length of l list : " + l.length());
		MyList l3 = new MyList();
		//l3.appendList(l);
		//System.out.println(l3);
		//boolean b = (l.equals(l3));
		//System.out.println(b);
        System.out.println( "Hello World!" );
    }
}
