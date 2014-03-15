import java.util.Iterator;
 // extends Comparable<E> & Lik>

interface AbstraktSortertEnkelListe<E> {
	void settInn (E element);
	E finn(String key);
	Iterator<E> iterator();

}