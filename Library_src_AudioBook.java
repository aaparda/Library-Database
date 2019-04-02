/**
 * This class is used to be created as a Not-Paper Audio Book, in which title, author, time, narrator and yearPublished are defined by the
 * constructor, a unique identifier is automatically created, and the genre is to be determined after creating the instance.
 */
public class AudioBook extends NotPaper implements NonFictionGenre, FictionGenre, SameAsPaper {

    /**
     * Declaring the variables
     */
    private String author;
    private String narrator;
    private int seconds;

    /**
     * The Constructor method
     */
    public AudioBook(String title, String author, String narrator, int yearPublished, int hours, int minutes, int seconds) {
        super(title, yearPublished);
        addAudioBook(author, narrator, hours, minutes, seconds);
    }

    /**
     * Method used to define the Audio Book's variables
     */
    public void addAudioBook(String author, String narrator, int hours, int minutes, int seconds) {
        this.author = author.toUpperCase();
        this.narrator = narrator.toUpperCase();
        super.setId("ab" + makeIDNum() + this.seconds + super.getYearPublished());
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    /**
     * Creates a unique number for the objects identification
     */
    public int makeIDNum() {
        int idNum = 0;
        for (int i = 0; i < super.getTitle().length(); i++) {
            idNum += i + (int) super.getTitle().charAt(i);
        }
        return idNum;
    }

    /*
     * Setting the genre with specified genres -----------------------------------
     */
    public void setFiction() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Fiction");
        } else if (!super.getGenre().contains("FICTION")) {
            super.setGenre(super.getGenre() + ", Fiction");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setNonFiction() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Non Fiction");
        } else if (!super.getGenre().contains("NON FICTION")) {
            super.setGenre(super.getGenre() + ", Non Fiction");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

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
    //---------------------------------------------------------

    /*Getter Methods*/

    public String getAuthor() {
        return author;
    }

    public String getNarrator() {
        return narrator;
    }

    public String getTime() {
        return (seconds / 3600) + "h : " + ((seconds % 3600) / 60) + "m : " + ((seconds % 3600) % 60) + "s";
    }
    //---------------------------------------------------------

    /*Setter Method*/

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    //---------------------------------------------------------

    /**
     * A method used to compare to objects of the AudioBook class to determine if they are the same
     */
    public boolean equals(AudioBook other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    /**
     * These methods are used to compare with the Fiction and NonFiction classes to determine whether
     * the instance has the same author and title for the book.
     */
    @Override
    public boolean sameAsPaper(Fiction other) {
        if (other == null) {
            return false;
        }
        return (other.getAuthor().equals(author) && other.getTitle().equals(super.getTitle()));
    }

    @Override
    public boolean sameAsPaper(NonFiction other) {
        if (other == null) {
            return false;
        }
        return (other.getAuthor().equals(author) && other.getTitle().equals(super.getTitle()));
    }

    /*------------------------------------------------------------*/

    /**
     * The toString() method
     */
    @Override
    public String toString() {
        return "\n" + super.getId() + " Audiobook: " + super.getTitle() + " Written by: " + author + " Narrated by: " + narrator + " Genre(s): " + super.getGenre() + " Year published: " + super.getYearPublished() + " Length: " + (seconds / 3600) + "h : " + ((seconds % 3600) / 60) + "m : " + ((seconds % 3600) % 60) + "s";
    }

}
