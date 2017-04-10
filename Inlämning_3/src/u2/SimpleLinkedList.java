package u2;

import java.util.*;

/**
 * Klassen SimpleLinkedList �r en l�nkad lista som inneh�ller noder av objekt.
 * F�rsta noden i listan inneh�ller inget objekt.
 */

public class SimpleLinkedList {
	private ListNode header;

	public SimpleLinkedList() {
		header = new ListNode(null);
	}

	/**
	 * Skapar en ny ListNode med ett nytt objekt och l�gger den i listan
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
	 * Ta bort noden som inneh�ller respektive objekt
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
	 * Skriver ut inneh�llet i listan
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

	// Detta skall du g�ra
	public void insert(String obj, int index) {

	}

	// Returnerar och tar bort ett objkt fr�n lista
	public String remove(String obj, int index) {
		// tempor�r return
		return null;
	}

	// returnerar storleken p� listan. L�gg till i klasssen en variabel f�r
	// detta
	// uppdatera variabeln n�r det �r fallet

	public int size() {
		// tempor�r return

		return 0;
	}

	public String toString() {

		// tempor�r return
		return null;
	}

	public static void main(String[] arg) {
		// testa metoderna fr�n klassen SimpleLinkedList
		SimpleLinkedList klassLista = new SimpleLinkedList();
		klassLista.insert("Olle");
		klassLista.insert2("Nina");
		klassLista.print();
		klassLista.remove("Nina");
		klassLista.print();
	}
}
