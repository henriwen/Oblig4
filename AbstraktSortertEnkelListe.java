import java.util.Iterator;
 

interface AbstraktSortertEnkelListe<E> extends Comparable<E> & Lik{
	void settInn (E element);
	E finn(String key);
	Iterator<E> iterator();

}
