

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        MyMarvelCollection myCol = new MyMarvelCollection();


        myCol.add(new Film("Ironman", 2008));
        myCol.add(new Film("Captain America", 2010));
        myCol.add(new Film("The Avengers", 2012));


        System.out.println("Iterator Object...");
        Iterator<Film> iterator = myCol.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For Each Loop...");
        for (Film film : myCol) {
            System.out.println(film);
        }
    }
}
