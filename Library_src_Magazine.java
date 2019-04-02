/**
 * This class is used to be created as a Paper Magazine, in which title, date, and name are defined by the
 * constructor, a unique identifier is automatically created, and the genre as well as the coverType are to be determined
 * after creating the instance.
 */

import java.time.YearMonth;

public class Magazine extends Paper {

    private String name;
    // Date is represented by int year, int month, int date
    private YearMonth date;

    public Magazine(String name, String title, int year, int month) {
        super(title);
        setMagazine(name, year, month);
    }

    public void setMagazine(String name, int year, int month) {
        this.name = name.toUpperCase();
        this.date = YearMonth.of(year, month);
        super.setId("mag" + makeIDNum() + year + month);
    }

    @Override
    public int makeIDNum() {
        int id = 0;
        for (int i = 0; i < name.length(); i++) {
            id += i + (int) name.charAt(i);
        }

        return id;
    }

    //-------------------------------------------------------------------------

    /*Setter Methods for Genre*/

    public void setArchitecture() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Architecture");
        } else if (!super.getGenre().contains("ARCHITECTURE")) {
            super.setGenre(super.getGenre() + ", ARCHITECTURE");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setArt() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Art");
        } else if (!super.getGenre().contains("ART")) {
            super.setGenre(super.getGenre() + ", Art");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setFashion() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Fashion");
        } else if (!super.getGenre().contains("FASHION")) {
            super.setGenre(super.getGenre() + ", Fashion");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setHealth() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Health");
        } else if (!super.getGenre().contains("HEALTH")) {
            super.setGenre(super.getGenre() + ", Health");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setFitness() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Fitness");
        } else if (!super.getGenre().contains("FITNESS")) {
            super.setGenre(super.getGenre() + ", Fitness");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setMen() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Men");
        } else if (!super.getGenre().contains("MEN")) {
            super.setGenre(super.getGenre() + ", Men");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setPolitical() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Political");
        } else if (!super.getGenre().contains("POLITICAL")) {
            super.setGenre(super.getGenre() + ", Political");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setSatirical() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Satirical");
        } else if (!super.getGenre().contains("SATIRICAL")) {
            super.setGenre(super.getGenre() + ", Satirical");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setScience() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Science");
        } else if (!super.getGenre().contains("SCIENCE")) {
            super.setGenre(super.getGenre() + ", Science");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setTravel() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Travel");
        } else if (!super.getGenre().contains("TRAVEL")) {
            super.setGenre(super.getGenre() + ", Travel");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setTeen() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Teen");
        } else if (!super.getGenre().contains("TEEN")) {
            super.setGenre(super.getGenre() + ", Teen");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    public void setWomen() {
        if (super.getGenre() == null || super.getGenre().length() == 0) {
            super.setGenre("Women");
        } else if (!super.getGenre().contains("WOMEN")) {
            super.setGenre(super.getGenre() + ", WOMEN");
        }
        super.setGenre(super.getGenre().toUpperCase());
    }

    //-------------------------------------

    /*Getter Methods*/

    public String getName() {
        return name;
    }

    public YearMonth getDate() {
        return date;
    }

    //-------------------------------------

    /*Setter Methods*/

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setDate(int year, int month) {
        this.date = YearMonth.of(year, month);
    }

    //-------------------------------------

    public boolean equals(Magazine other) {
        if (other == null) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    /**
     * Finish the toString method!!
     */
    public String toString() {
        return "\n" + super.getId() + " Magazine: " + name + " Title: " + super.getTitle() + " Date: " + date + " Genre(s): " + super.getGenre() + " Cover Type: " + super.getCoverType();
    }
}
