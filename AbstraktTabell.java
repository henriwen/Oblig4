import java.util.Iterator;

interface AbstraktTabell<E> extends Iterable<E>{
	boolean settInn (E element);
	E finn(int index);
	Iterator<E> iterator();
}