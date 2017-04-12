package u3;

import java.util.*;


/**
 * Klassen ItemList är en länkad lista som innehåller noder av Item-objekt.
 * Första noden i listan ( header) innehåller inget objekt.
 */

public class ItemList {
	private Node header;
	int size;

	public ItemList() {
		header = new Node(null);
	}

	/**
	 * Skapar ett ny Node-objekt med ett nytt Item objekt och lägger den i
	 * listan. Ökar värdet av variabel size;
	 */
	public void add(Item newItem) {
		Node temp = header;
		Node newNode = new Node(newItem);
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		size++;
	}

	/**
	 * Skapar ett ny Node objekt med ett nytt Item-objekt och lägger den i
	 * listan på plats index, Ökar värdet av variabel size;
	 */
	public void add(Item newItem, int index) {
		Node temp = new Node(newItem);
		Node cur = header;
		int counter = 0;
		while(cur.next!=null){
			cur = cur.next;
			counter++;
			if(counter == index){
				temp.next = cur.next;
				cur.next = temp;
			}
		}
		size++;
	}

	/**
	 * Returnerar true om det finns ett Item-objekt vars RFIDNR är lika med
	 * metodens parametern id
	 */
	public boolean find(String id) {
		Node temp = header;
		while(temp.next != null)
			if(temp.next.itm.getItemNumber()==id)
				return true;
		return false;
	}

	/**
	 * Ta bort noden som innehåller Item- objektet med viss id
	 */
	public Item remove(String id) {

		return null;
	}

	/**
	 * Räknar och returnerar antalet Item- objekt med ett vis namn oavsett
	 * RFIDNR
	 */

	public int countObjects(String name) {
		Node temp = header;
		int count = 0;
		while(temp.next!=null){
			if(temp.next.itm.getItemName()==name)
				count++;
		}
		return count;
	}

	/**
	 * Skriver ut innehållet i listan
	 */
	public void printList() {
	}

	/**
	 * Returnera true om listan är tom annars false
	 */
	public boolean isEmpty() {
		return true;
	}

	/**
	 * Returnera antlet element i listan
	 */
	public int size() {
		return 0;
	}

}