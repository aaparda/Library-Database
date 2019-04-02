/**
 * This class is used to be created as a Paper Non-Fiction book, in which title, author, and yearPublished are defined by the
 * constructor, a unique identifier is automatically created, and the genre as well as the coverType are to be determined
 * after creating the instance.
 */
public class NonFiction extends Paper implements NonFictionGenre, SameAsNotPaper {

    /**
     * Declaring the variables
     */

    private String author;
    private int yearPublished;

    /**
     * The Constructor method
     */
    public NonFiction(String title, String author, int yearPublished) {
        super(title);
        addBook(author, yearPublished);
    }

    private void addBook(String author, int yearPublished) {
        this.author = author.toUpperCase();
        this.yearPublished = yearPublished;
        super.setId("nf" + makeIDNum() + yearPublished);
    }

    /**
     * This method is used to create a Identification number for the non-fiction books
     */
    @Override
    public int makeIDNum() {
        int iDCount = 0;
        for (int i = 0; i < super.getTitle().length(); i++) {
            iDCount += i + (int) super.getTitle().charAt(i);
        }
        return iDCount + yearPublished;
    }

    /**
     * These methods are used to set the genre of the non-fiction book -------------------------------------------------
     */
    @Override
    public void setPhilosophy() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Philosophy");
        } else if (!super.getGenre().contains("PHILOSOPHY")) {
            super.setGenre(super.getGenre() + ", Philosophy");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setPsychology() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Psychology");
        } else if (!super.getGenre().contains("PSYCHOLOGY")) {
            super.setGenre(super.getGenre() + ", Psychology");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setReligion() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Religion");
        } else if (!super.getGenre().contains("RELIGION")) {
            super.setGenre(super.getGenre() + ", Religion");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setSocialSciences() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Social Sciences");
        } else if (!super.getGenre().contains("SOCIAL SCIENCES")) {
            super.setGenre(super.getGenre() + ", Social Sciences");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setSciences() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Sciences");
        } else if (!super.getGenre().contains("SCIENCES")) {
            super.setGenre(super.getGenre() + ", Sciences");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setTechnology() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Technology");
        } else if (!super.getGenre().contains("TECHNOLOGY")) {
            super.setGenre(super.getGenre() + ", Technology");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setLiterature() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Literature");
        } else if (!super.getGenre().contains("LITERATURE")) {
            super.setGenre(super.getGenre() + ", LITERATURE");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setHistory() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("History");
        } else if (!super.getGenre().contains("HISTORY")) {
            super.setGenre(super.getGenre() + ", History");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    //------------------------------------------------------------------------------------------------------------------

    /*Setter Methods*/

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //------------------------------------------------------------

    /*Getter Methods*/

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    //------------------------------------------------------------

    /**
     * Method used to compare 2 objects of the Fiction class to determine whether they are the same.
     */
    public boolean equals(NonFiction other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    /**
     * Methods used to determine if this object has a similar title and author to determine if they are the same book.
     */

    @Override
    public boolean sameAsNotPaper(EBook other) {
        if (other == null) {
            return false;
        }
        return (other.getAuthor().equals(author) && other.getTitle().equals(super.getTitle()));
    }

    @Override
    public boolean sameAsNotPaper(AudioBook other) {
        if (other == null) {
            return false;
        }
        return (other.getAuthor().equals(author) && other.getTitle().equals(super.getTitle()));
    }

    /*------------------------------------------*/

    /**
     * The toString method
     */
    @Override
    public String toString() {
        return "\n" + super.getId() + " Non - Fiction: " + super.getTitle() + " Written by: " + author + " Year: " + yearPublished + " Genre(s): " + super.getGenre() + " Cover Type: " + super.getCoverType();
    }
}
