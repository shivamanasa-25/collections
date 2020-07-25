import java.util.*;
public class CollectionList {

	public static void main(String[] args) {
	
				CustomCollection<String> list=new CustomCollection<String>(11);
				Scanner sc=new Scanner(System.in);
				int index=sc.nextInt();     
				System.out.println("ADD VEGETABLES TO THE LIST");
					list.add("Brinjal");
					list.add("Potato");
					list.add("Tomato");
					list.add("Cabbage");
					list.add("CauliFlower");
					list.add("BitterGuard");
					list.add("Carrot");
					list.add("Cucumber");
					list.add("Pumpkin");
					System.out.println("PRINTING THE LIST");
					list.print();
					System.out.println("REMOVED VEGETABLE IS : "+list.remove(2));
					System.out.println("FETCHING THE VEGETABLE AT GIVEN INDEX");
					System.out.println(list.get(index));
	}
}