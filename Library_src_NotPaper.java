/**
 * This is an abstract class for objects that are implemented by NotPaper.
 */
public abstract class NotPaper implements Standard {

    private String id;
    private String title;
    private String genre;
    private int yearPublished;

    public NotPaper(String title, int yearPublished) {
        this.title = title.toUpperCase();
        this.yearPublished = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }


}
