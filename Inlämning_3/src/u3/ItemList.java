package u3;

import java.util.*;


/**
 * Klassen ItemList �r en l�nkad lista som inneh�ller noder av Item-objekt.
 * F�rsta noden i listan ( header) inneh�ller inget objekt.
 */

public class ItemList {
	private Node header;
	int size;

	public ItemList() {
		header = new Node(null);
	}

	/**
	 * Skapar ett ny Node-objekt med ett nytt Item objekt och l�gger den i
	 * listan. �kar v�rdet av variabel size;
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
	 * Skapar ett ny Node objekt med ett nytt Item-objekt och l�gger den i
	 * listan p� plats index, �kar v�rdet av variabel size;
	 */
	public void add(Item newItem, int index) {
		Node temp = new Node(newItem);
		Node cur = header;
		int counter = 0;
		while(cur.next!=null){
			if(counter == index){
				temp.next = cur.next;
				cur.next = temp;
			}
			cur = cur.next;
			counter++;
		}
		size++;
	}

	/**
	 * Returnerar true om det finns ett Item-objekt vars RFIDNR �r lika med
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
	 * Ta bort noden som inneh�ller Item- objektet med viss id
	 */
	public Item remove(String id) {
		Node temp = header;
		Item result = null;
		while(temp.next !=null){
			if(temp.next.itm.getItemName() == id){
				result = temp.next.itm;
				temp.next = temp.next.next;
				size--;
				return result;
			}
			temp = temp.next;
		}
		return null;
	}

	/**
	 * R�knar och returnerar antalet Item- objekt med ett vis namn oavsett
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
	 * Skriver ut inneh�llet i listan
	 */
	public void printList() {
		Node temp = header;
		while(temp.next != null){
			System.out.println(temp.next.itm.getItemName() + " RFID:" + temp.next.itm.getItemNumber());
			temp = temp.next;
		}
	}

	/**
	 * Returnera true om listan �r tom annars false
	 */
	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}

	/**
	 * Returnera antlet element i listan
	 */
	public int size() {
		return size;
	}

}