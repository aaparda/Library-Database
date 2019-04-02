/**
 * This class is used to be created as a Not-Paper Documentary, in which title, yearPublished, mediaType, and time are defined by the
 * constructor, a unique identifier is automatically created, and the genre is to be determined after creating the instance using get
 * methods.
 */
public class Documentary extends NotPaper implements NonFictionGenre {

    /**
     * Declaring the variables
     */
    private String mediaType;
    private int minutes;

    /**
     * The Constructor method
     */
    public Documentary(String title, int yearPublished, String mediaType, int hours, int minutes) {
        super(title, yearPublished);
        this.mediaType = mediaType.toUpperCase();
        super.setId("dc" + makeIDNum() + yearPublished);
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

    /**
     * These methods are used to set the genre of the non-fiction movies -----------------------------------------------
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
     * Methods used to determine if this object has a similar title and author to determine if they are the same book.
     */
    public boolean equals(Documentary other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    /**
     * The toString method
     */
    public String toString() {
        return "\n" + super.getId() + " Documentary: " + super.getTitle() + " Year: " + super.getYearPublished() + " Media Type: " + mediaType + " Genre(s): " + super.getGenre() + " Length: " + (minutes / 60) + "h : " + (minutes % 60) + "m";
    }
}