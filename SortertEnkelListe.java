import java.util.Iterator;

// extends Comparable<E> & Lik> 
class SortertEnkelListe<E> implements AbstraktSortertEnkelListe<E>, Comparable<E>, Lik {
	private Node head;
	private Node tail;
	private int nodeCount;

	SortertEnkelListe() {
		head = tail = null;
		nodeCount = 0;
	}
	// @Override
	// public int compareTo (E element) {
	// 	return;
	// }

	public void settInn (E element) {
		if (head == null) {
			head = element;
		}else {
		tail.nextNode = element;
		}
		tail = element;
		nodeCount++;
	}

	public E finn (String s) {

	// 	E e = head.link;
 //        for (int i = nodes; i>0; i--) {
	//     if (p.hentNavn().equals(s)) return p;
	//     else p = p.neste;
 //        }
	// return null;
    }

	public Iterator<E> iterator() {
		return iterator;
	}

	class Node {
		private E data;
		private Node nextNode;

		public Node(E e) {
    		data = e;
    		nextNode = null;
		}

		public E getData() {
		    return data;
		}

		public Node getNextNode (){
		    return nextNode;
		}

		public void setData(E e){
		    data = e;
		}

		public void setLink(Node n){
		    nextNode = n;
		}
	}
}
