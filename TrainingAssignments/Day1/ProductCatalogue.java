package com.techment.day6;
import java.util.*;

//Creating a class product to store product id, price,name
class Product {
	private  int id , price ;
	private  String name;
	
	public void putId(int id)
	{
		this.id=id;
	}
	public void putPrice(int price)
	{
		this.price=price;
	}
	public void putName(String name)
	{
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
}


public class ProductCatalogue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int id, price;
		String name;

//Declaring ArrayList to store the product objects
		ArrayList<Product> productObject = new ArrayList<Product>();
		System.out.print("Enter number of products to add to catalogue : ");
		int no_of_products = s.nextInt();

		
		//Taking user input for every products id, name, price
		for(int i=1 ; i <= no_of_products; i++) 
		{
			System.out.print("\n" + "Enter the id of product " + i + " : ");
			id = s.nextInt(); 
			System.out.print(  "Enter the name of product " + i + " : ");
			name = s.next(); 
			System.out.print( "Enter the price of product " + i + " : ");
			price = s.nextInt(); 

			Product ob = new Product();
			ob.putId(id);
			ob.putName(name);
			ob.putPrice(price);
			
			//Adding the object to the ArrayList
			productObject.add(ob);

		}
		int flag=0;
		
		//Asking user for the id to get details
		System.out.print("Enter the id of product to find details : ");
		int searchId = s.nextInt();
		
		//Checking if the id matches
		for(Product obj : productObject)
		{
			if(obj.getId() == searchId)
			{
				flag=1;
				System.out.println("Product Found!!!! \nWith id : " + obj.getId());
				System.out.println("Name : " + obj.getName());
				System.out.println("Price : " + obj.getPrice());
				break;
			}

		}	
		if(flag==0)
			System.out.println("Product not found!!!!!");
		s.close();
	}

}
