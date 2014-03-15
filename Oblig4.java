interface AbstraktTabell<E> {
	boolean settInn (E element);
	int finn(int index);
	Iterator it();
}

interface AbstraktSortertEnkelListe<E> implements Comparable, Lik {
	void settInn (E element);
	<E> finn(String key);
	Iterator it();

}
interface Lik {
	boolean samme(String s);
}

class Tabell<E> implements AbstraktTabell {
	<E>[] tabellData;

	Tabell(int tabellStr) {
		tabelldata = new Tabell<E>[tabellStr];

	}
}