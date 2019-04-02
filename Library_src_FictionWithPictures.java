public class FictionWithPictures extends Fiction {
    private String illustrator;

    public FictionWithPictures(String title, String author, int yearPublished, String illustrator) {
        super(title, author, yearPublished);
        this.illustrator = illustrator.toUpperCase();
    }

    public String getIllustrator() {
        return illustrator.toUpperCase();
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator.toUpperCase();
    }

    @Override
    public String toString() {
        return "\n" + super.getId() + " Fiction: " + super.getTitle() + " Written by: " + super.getAuthor() + " Illustrator: " + illustrator + " Year: " + super.getYearPublished() + " Genre(s): " + super.getGenre() + " Cover Type: " + super.getCoverType();
    }

    public boolean equals(FictionWithPictures other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }
}
