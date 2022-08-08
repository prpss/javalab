package fourth;

public class Item {
	String name,id;
	int price;
	Item(String name,String id,int price){
		this.name = name;
		this.id = id ;
		this.price = price;
	}
	public String toString() {
		return ("Item name :"+name+"Item id :"+id+"item Price :"+price);
		
	}
}