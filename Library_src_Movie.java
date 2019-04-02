/**
 * This class is used to be created as a Not-Paper Movie, in which title, yearPublished, mediaType, and time are defined by the
 * constructor, a unique identifier is automatically created, and the genre is to be determined after creating the instance using get
 * methods.
 */
public class Movie extends NotPaper implements FictionGenre {

    /**
     * Declaring the Variables
     */
    private String mediaType;
    private int minutes;

    /**
     * The Constructor Method
     */
    public Movie(String title, int yearPublished, String mediaType, int hours, int minutes) {
        super(title, yearPublished);
        this.mediaType = mediaType.toUpperCase();
        super.setId("dc" + makeIDNum() + super.getYearPublished());
        this.minutes = hours * 60 + minutes;
    }

    /**
     * Used to create a unique identification number for the books
     */
    @Override
    public int makeIDNum() {
        int idNum = 0;
        for (int i = 0; i < super.getTitle().length(); i++) {
            idNum += i + (int) super.getTitle().charAt(i);
        }
        return idNum;
    }

    /*
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

    /*Getter Methods*/

    public String getMediaType() {
        return mediaType;
    }

    public String getTime() {
        return (minutes / 60) + "h : " + (minutes % 60) + "m";
    }

    //-------------------

    /*Setter Methods*/

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public void setTime(int hours, int minutes) {
        this.minutes = hours * 60 + minutes;
    }

    //-------------------

    /**
     * Method used to compare 2 objects of the Fiction class to determine whether they are the same.
     */
    public boolean equals(Movie other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    /**
     * The toString method
     */
    public String toString() {
        return "\n" + super.getId() + " Movie: " + super.getTitle() + " Year: " + super.getYearPublished() + " Media Type: " + mediaType + " Genre(s): " + super.getGenre() + " Length: " + (minutes / 60) + "h : " + (minutes % 60) + "m";
    }
}
