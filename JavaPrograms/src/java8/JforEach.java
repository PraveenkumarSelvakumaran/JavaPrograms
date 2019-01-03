/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Praveenkumar.S
 *
 */

/*forEach method helps in having the logic for iteration and business logic
 *at separate place resulting in higher separation of concern and cleaner code.*/
public class JforEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i = 0; i<=10; i++) {
			lst.add(i);
		}
		
		Iterator itr = lst.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// using forEach() method
		
		lst.forEach(new Consumer<Integer>(){
			public void accept(Integer i) {
				System.out.println(i);
			}
		});

	}

}
