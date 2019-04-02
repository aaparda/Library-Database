/**
 * This class is used to be created as a Paper Fiction book, in which title, author, and yearPublished are defined by the
 * constructor, a unique identifier is automatically created, and the genre as well as the coverType are to be determined
 * after creating the instance.
 */
public class Fiction extends Paper implements FictionGenre, SameAsNotPaper {

    /**
     * Declaration(s) of variables
     */
    private String author;
    private int yearPublished;

    /**
     * Constructor method
     */
    public Fiction(String title, String author, int yearPublished) {
        super(title);
        addBook(author, yearPublished);
    }

    /**
     * Used to assign author, yearPublished variables, and create the ID
     */
    private void addBook(String author, int yearPublished) {
        this.author = author.toUpperCase();
        this.yearPublished = yearPublished;
        super.setId("f" + makeIDNum() + yearPublished);
    }

    /**
     * Used to create a unique identification number for the books
     */
    @Override
    public int makeIDNum() {
        int iDCount = 0;
        for (int i = 0; i < super.getTitle().length(); i++) {
            iDCount += i + (int) super.getTitle().charAt(i);
        }
        return iDCount;
    }

    /**
     * Methods to set the genre of the book ----------------------------------------------------------------------------
     */
    @Override
    public void setAdventure() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Adventure");
        } else if (!super.getGenre().contains("ADVENTURE")) {
            super.setGenre(super.getGenre() + ", Adventure");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setDystopian() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Dystopian");
        } else if (!super.getGenre().contains("DYSTOPIAN")) {
            super.setGenre(super.getGenre() + ", Dystopian");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setFantasy() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Fantasy");
        } else if (!super.getGenre().contains("FANTASY")) {
            super.setGenre(super.getGenre() + ", Fantasy");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setHorror() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Horror");
        } else if (!super.getGenre().contains("HORROR")) {
            super.setGenre(super.getGenre() + ", Horror");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setHistorical() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Historical");
        } else if (!super.getGenre().contains("HISTORICAL")) {
            super.setGenre(super.getGenre() + ", Historical");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setMystery() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Mystery");
        } else if (!super.getGenre().contains("MYSTERY")) {
            super.setGenre(super.getGenre() + ", Mystery");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setComedy() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Comedy");
        } else if (!super.getGenre().contains("COMEDY")) {
            super.setGenre(super.getGenre() + ", Comedy");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setParanormal() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Paranormal");
        } else if (!super.getGenre().contains("PARANORMAL")) {
            super.setGenre(super.getGenre() + ", Paranormal");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setSciFi() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("SciFi");
        } else if (!super.getGenre().contains("SCIFI")) {
            super.setGenre(super.getGenre() + ", SciFi");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setRomance() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Romance");
        } else if (!super.getGenre().contains("ROMANCE")) {
            super.setGenre(super.getGenre() + ", Romance");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setThriller() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Thriller");
        } else if (!super.getGenre().contains("THRILLER")) {
            super.setGenre(super.getGenre() + ", Thriller");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    @Override
    public void setAction() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Action");
        } else if (!super.getGenre().contains("ACTION")) {
            super.setGenre(super.getGenre() + ", Action");
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
    public boolean equals(Fiction other) {
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
    public String toString() {
        return "\n" + super.getId() + " Fiction: " + super.getTitle() + " Written by: " + author + " Year: " + yearPublished + " Genre(s): " + super.getGenre() + " Cover Type: " + super.getCoverType();
    }
}
