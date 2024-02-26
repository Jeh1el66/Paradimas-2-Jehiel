


public class Film {
    private final String title;
    private final int year;

    public Film (String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear () { return this.year; }
    public String getTitle () { return this.title; }

    @Override
    public String toString () {
        return "Film {" +
                "title='" + title + '\'' +
                ", year=" + year +
                " }";
    }
}