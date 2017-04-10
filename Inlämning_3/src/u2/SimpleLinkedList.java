package u2;

import java.util.*;

/**
 * Klassen SimpleLinkedList är en länkad lista som innehåller noder av objekt.
 * Första noden i listan innehåller inget objekt.
 */

public class SimpleLinkedList {
	private ListNode header;

	public SimpleLinkedList() {
		header = new ListNode(null);
	}

	/**
	 * Skapar en ny ListNode med ett nytt objekt och lägger den i listan
	 */
	public void insert(String theobj) {
		ListNode nynode = new ListNode(theobj);

		ListNode temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = nynode;
	}

	/*
	 * Ta bort noden som innehåller respektive objekt
	 */
	public void remove(String theobj) {
		ListNode node = header;

		while (node.next != null) {
			if (node.next.element.equals(theobj)) {
				node.next = node.next.next;
				break;
			}
			node = node.next;
		}
	}

	/**
	 * Skriver ut innehållet i listan
	 */
	public void print() {
		ListNode node = header.next;
		while (node != null) {
			System.out.println(node.element);
			node = node.next;
		}
	}

	public void insert2(String theobj) {
		ListNode nynode = new ListNode(theobj, header.next);
		header.next = nynode;
	}

	// Detta skall du göra
	public void insert(String obj, int index) {

	}

	// Returnerar och tar bort ett objkt från lista
	public String remove(String obj, int index) {
		// temporär return
		return null;
	}

	// returnerar storleken på listan. Lägg till i klasssen en variabel för
	// detta
	// uppdatera variabeln när det är fallet

	public int size() {
		// temporär return

		return 0;
	}

	public String toString() {

		// temporär return
		return null;
	}

	public static void main(String[] arg) {
		// testa metoderna från klassen SimpleLinkedList
		SimpleLinkedList klassLista = new SimpleLinkedList();
		klassLista.insert("Olle");
		klassLista.insert2("Nina");
		klassLista.print();
		klassLista.remove("Nina");
		klassLista.print();
	}
}
