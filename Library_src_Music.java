/**
 * This class is used to be created as a Not-Paper Music, in which title, time, artist, and yearPublished are defined by the
 * constructor, a unique identifier is automatically created, and the genre is to be determined after creating the instance.
 */
public class Music extends NotPaper {

    /**
     * Declaring the Variables
     */
    private String artists;
    private int seconds;

    /**
     * The Constructor
     */
    public Music(String title, String artists, int yearPublished, int min, int sec) {
        super(title, yearPublished);
        this.artists = artists;
        this.seconds = min * 60 + sec;
        super.setId("ms" + makeIDNum() + super.getYearPublished());
    }

    public int makeIDNum() {
        int idNum = 0;
        for (int i = 0; i < super.getTitle().length(); i++) {
            idNum += i + (int) super.getTitle().charAt(i);
        }
        return idNum;
    }

    /*Setter methods for the Music genre*/

    public void setRock() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Rock");
        } else if (!super.getGenre().contains("ROCK")) {
            super.setGenre(super.getGenre() + ", Rock");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setJazz() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Jazz");
        } else if (!super.getGenre().contains("JAZZ")) {
            super.setGenre(super.getGenre() + ", Jazz");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setPop() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Pop");
        } else if (!super.getGenre().contains("POP")) {
            super.setGenre(super.getGenre() + ", Pop");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setFolk() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Folk");
        } else if (!super.getGenre().contains("FOLK")) {
            super.setGenre(super.getGenre() + ", Folk");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setBlues() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Blues");
        } else if (!super.getGenre().contains("BLUES")) {
            super.setGenre(super.getGenre() + ", Blues");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setHipHop() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Hip Hop");
        } else if (!super.getGenre().contains("HIP HoP")) {
            super.setGenre(super.getGenre() + ", Hip Hop");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setClassical() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Classical");
        } else if (!super.getGenre().contains("CLASSICAL")) {
            super.setGenre(super.getGenre() + ", Classical");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setCountry() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Country");
        } else if (!super.getGenre().contains("COUNTRY")) {
            super.setGenre(super.getGenre() + ", Country");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setHeavyMetal() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Heavy Metal");
        } else if (!super.getGenre().contains("HEAVY METAL")) {
            super.setGenre(super.getGenre() + ", Heavy Metal");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setElectronic() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Electronic");
        } else if (!super.getGenre().contains("ELECTRONIC")) {
            super.setGenre(super.getGenre() + ", Electronic");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setDisco() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Disco");
        } else if (!super.getGenre().contains("DISCO")) {
            super.setGenre(super.getGenre() + ", Disco");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setRap() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Rap");
        } else if (!super.getGenre().contains("RAP")) {
            super.setGenre(super.getGenre() + ", Rap");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setDubstep() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Dubstep");
        } else if (!super.getGenre().contains("DUBSTEP")) {
            super.setGenre(super.getGenre() + ", Dubstep");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setWorldMusic() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("World Music");
        } else if (!super.getGenre().contains("WORLD MUSIC")) {
            super.setGenre(super.getGenre() + ", World Music");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setOrchestra() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Orchestra");
        } else if (!super.getGenre().contains("ORCHESTRA")) {
            super.setGenre(super.getGenre() + ", Orchestra");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }
    //----------------------------------------

    /*Getter Methods*/

    public String getArtists() {
        return artists;
    }

    public String getTime() {
        return (seconds / 60) + "m : " + (seconds % 60) + "s";
    }

    //----------------------------------------

    /*Setter Methods*/

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public void setTime(int minutes, int seconds) {
        this.seconds = minutes * 60 + seconds;
    }

    //----------------------------------------
    public boolean equals(Music other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    public String toString() {
        return "\n" + super.getId() + " Music: " + super.getTitle() + " Artist(s): " + artists + " Year: " + super.getYearPublished() + " Genre(s): " + super.getGenre() + " Length: " + (seconds / 60) + ":" + (seconds % 60);
    }

}