import java.io.*;
import java.util.*;

public class J04stackBasic {
	public static void main(String[] args)
	{
		Stack < String > stck_list = new Stack < String > ();
		stck_list.push("Red");
		stck_list.push("Green");
		stck_list.push("Blue");
		stck_list.push("Yellow");
		stck_list.push("Orange");
 
		System.out.println("Stack Elements : " + stck_list);
	}
}

    
