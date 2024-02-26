import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MyMarvelCollection implements Iterable<Film> {
    private final List<Film> films;


    public MyMarvelCollection() {
        films = new ArrayList<>();
    }


    public void add(Film film) {
        films.add(film);
    }


    @Override
    public Iterator<Film> iterator() {
        return films.iterator();
    }
}