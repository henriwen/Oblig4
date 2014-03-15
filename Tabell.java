import java.util.Iterator;
import java.util.NoSuchElementException;

class Tabell<E> implements AbstraktTabell<E> {
	E[] tabelldata;

	Tabell(int tabellStr) {
		tabelldata = (E[]) new Object[tabellStr];

	}
	public boolean settInn (E element) {
		for(int i = 0; i < tabelldata.length; i++) {
			if(tabelldata[i]==null) {
				tabelldata[i] = element;
				return true;
			} return false;
		} return false;
	}
	public E finn (int index) {
		return tabelldata[index];

	}
	public Iterator<E> iterator() {
     	return new TabellIterator();
	}
	class TabellIterator implements Iterator<E> {
		int i = 0;
		
		TabellIterator() {
			while (i < tabelldata.length && tabelldata[i] == null) {
				i++;
			}
		}
		public boolean hasNext() {
			return i < tabelldata.length;
		}
		public E next() {
			if (i < tabelldata.length) {
				E e = tabelldata[i];
				do {
					i++;
				} while (i < tabelldata.length && tabelldata[i] == null); 
					return e;
				} else {	 
				throw new NoSuchElementException();
				}
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}