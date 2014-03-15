

class Tabell<E> implements AbstraktTabell {
	<E>[] tabellData;

	Tabell(int tabellStr) {
		tabelldata = (E[]) new Object[tabellStr];

	}
	boolean settInn (E element) {
		for(int i = 0; i < tabelldata.length(); i++) {
			if(tabelldata[i]==null) {
				tabelldata[i] = element;
				return true;
			} return false;
		}
	}
	<E> finn (int index) {
		return tabelldata[index];

	}
	Iterator<E> it() {
		Iterator itr = new tabelldata.iterator();
     	return itr;
	}
class Iterator implements Iterator