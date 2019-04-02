/**
 * This is an abstract class for objects that are implemented by Paper.
 */
public abstract class Paper implements Standard {

    private String id;
    private String title;
    private String coverType;
    private String genre;

    public Paper(String title) {
        this.title = title.toUpperCase();
    }

    public void setPaperBack() {
        this.coverType = "pb";
    }

    public void setHardCover() {
        this.coverType = "hc";
    }

    public String getCoverType() {
        return coverType;
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


}
