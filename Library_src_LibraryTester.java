/**
 * LibraryTester is a testing class for the Library Project. It tests the methods located in the different
 * classes to ensure they are optimally functioning.
 */
public class LibraryTester {

    public static void main(String[] args) {
        /*Testing Fiction Class Assigning and Using .equals()*/
        System.out.println("Testing Assigning and .equals() in the Fiction Class");

        Fiction nineteenEightyFour = new Fiction("1984", "George Orwell", 1949);
        nineteenEightyFour.setDystopian();
        nineteenEightyFour.setSciFi();
        nineteenEightyFour.setHardCover();

        Fiction theHandmaidsTale = new Fiction("The Handsmaid's Tale", "Margaret Atwood", 1985);
        theHandmaidsTale.setFantasy();
        theHandmaidsTale.setDystopian();
        theHandmaidsTale.setPaperBack();

        Fiction theGreatGatsby = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        theGreatGatsby.setHistorical();
        theGreatGatsby.setPaperBack();

        Fiction pastTense = new Fiction("Past Tense", "Lee Child", 2018);
        pastTense.setMystery();
        pastTense.setAdventure();
        pastTense.setPaperBack();

        Fiction prideAndPrejudice = new Fiction("Pride and Prejudice", "Jane Austen", 1813);
        prideAndPrejudice.setRomance();
        prideAndPrejudice.setPaperBack();
        prideAndPrejudice.setPaperBack();

        Fiction aGameOfThrones = new Fiction("A Game of Thrones", "George R. R. Martin", 1996);
        aGameOfThrones.setFantasy();
        aGameOfThrones.setHardCover();

        Fiction harryPotterDeathlyHallows = new Fiction("Harry Potter and the Deathly Hallows", "J. K. Rowling", 2007);
        harryPotterDeathlyHallows.setMystery();
        harryPotterDeathlyHallows.setFantasy();
        harryPotterDeathlyHallows.setHardCover();

        FictionWithPictures amulet = new FictionWithPictures("Amulet", "Kazu Kibuishi", 2008, "Kazu Kibuishi");
        amulet.setAdventure();
        amulet.setFantasy();
        amulet.setSciFi();
        amulet.setPaperBack();

        Fiction[] fictions = {nineteenEightyFour, theHandmaidsTale, theGreatGatsby, pastTense, prideAndPrejudice, aGameOfThrones, harryPotterDeathlyHallows, amulet};

        for (Fiction i : fictions) {
            System.out.print(i);
        }

        assert aGameOfThrones.equals(fictions[5]);
        assert !nineteenEightyFour.equals(theHandmaidsTale);
        assert !theGreatGatsby.equals(null);

        System.out.println("\n\nThe ID of \"1984\" is: " + nineteenEightyFour.getId());
        System.out.println("The title of \"The Handmaids Tale\" is: " + theHandmaidsTale.getTitle());
        System.out.println("The author of \"The Great Gatsby\" is: " + theGreatGatsby.getAuthor());
        System.out.println("The year published of \"Past Tense\" is: " + pastTense.getYearPublished());
        System.out.println("The genre of \"Pride and Prejudice\" is: " + prideAndPrejudice.getGenre());
        System.out.println("The cover type of \"A Game of Thrones\" is: " + aGameOfThrones.getCoverType());

        /*Testing Non-Fiction Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the Fiction Class");

        NonFiction thinkingFastAndSlow = new NonFiction("Thinking, Fast and Slow", "Daniel Kahneman", 2011);
        thinkingFastAndSlow.setPsychology();
        thinkingFastAndSlow.setHardCover();

        NonFiction critiqueOfPureReason = new NonFiction("Critique of Pure Reason", "Immanuel Kent", 1781);
        critiqueOfPureReason.setPhilosophy();
        critiqueOfPureReason.setHardCover();

        NonFiction theGodDelusion = new NonFiction("The God Delusion", "Richard Dawkins", 2006);
        theGodDelusion.setReligion();
        theGodDelusion.setPaperBack();

        NonFiction gunsGermsAndSteel = new NonFiction("Guns, Germs, and Steel", "Jared Diamond", 1997);
        gunsGermsAndSteel.setSocialSciences();
        gunsGermsAndSteel.setHardCover();

        NonFiction aBriefHistoryOfTime = new NonFiction("A Brief History of Time", "Stephan Hawking", 1988);
        aBriefHistoryOfTime.setSciences();
        aBriefHistoryOfTime.setHardCover();

        NonFiction theSoulOfANewMachine = new NonFiction("The Soul of a New Machine", "Tracy Kidder", 1981);
        theSoulOfANewMachine.setTechnology();
        theSoulOfANewMachine.setHardCover();

        NonFiction ordinaryMen = new NonFiction("Ordinary Men", "Christopher Browning", 1992);
        ordinaryMen.setHistory();
        ordinaryMen.setHardCover();

        NonFiction[] nonFictions = {thinkingFastAndSlow, critiqueOfPureReason, theGodDelusion, gunsGermsAndSteel, aBriefHistoryOfTime, theSoulOfANewMachine, ordinaryMen};

        for (NonFiction i : nonFictions) {
            System.out.print(i);
        }

        assert theGodDelusion.equals(nonFictions[2]);
        assert !theSoulOfANewMachine.equals(aBriefHistoryOfTime);
        assert !gunsGermsAndSteel.equals(null);

        System.out.println("\n\nThe ID of \"Thinking Fast and Slow\" is: " + thinkingFastAndSlow.getId());
        System.out.println("The title of \"Critique of Pure Reason\" is: " + critiqueOfPureReason.getTitle());
        System.out.println("The author of \"The God Delusion\" is: " + theGodDelusion.getAuthor());
        System.out.println("The year published of \"Guns, Germs and Steel\" is: " + gunsGermsAndSteel.getYearPublished());
        System.out.println("The genre of \"A Brief History of Time\" is: " + aBriefHistoryOfTime.getGenre());
        System.out.println("The cover type of \"The Soul of a New machine\" is: " + theSoulOfANewMachine.getCoverType());

        /*Testing Magazine Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the Magazine Class");

        Magazine architecturalDigestDecember2016 = new Magazine("Architectural Digest", "The White House", 2016, 12);
        architecturalDigestDecember2016.setArchitecture();
        architecturalDigestDecember2016.setPaperBack();

        Magazine mensHealthFebruary2016 = new Magazine("Men's Health", "Get Back In Shape 21-Day Plan", 2016, 2);
        mensHealthFebruary2016.setFitness();
        mensHealthFebruary2016.setHealth();
        mensHealthFebruary2016.setMen();
        mensHealthFebruary2016.setPaperBack();

        Magazine fashionNovember2018 = new Magazine("Fashion", "Sustainability Reboot", 2018, 10);
        fashionNovember2018.setWomen();
        fashionNovember2018.setFashion();
        fashionNovember2018.setPaperBack();

        Magazine flashArtJuly2010 = new Magazine("Flash Art", "Vol. XLIII", 2010, 7);
        flashArtJuly2010.setArt();
        flashArtJuly2010.setPaperBack();

        Magazine theAmericanProspectFebruary2006 = new Magazine("The American Prospect", "Barack Obama has modest goals", 2006, 2);
        theAmericanProspectFebruary2006.setPolitical();
        theAmericanProspectFebruary2006.setPaperBack();

        Magazine scienceDecember2015 = new Magazine("Science", "Why We Age", 2015, 12);
        scienceDecember2015.setScience();
        scienceDecember2015.setPaperBack();

        Magazine[] magazines = {architecturalDigestDecember2016, mensHealthFebruary2016, fashionNovember2018, flashArtJuly2010, theAmericanProspectFebruary2006, scienceDecember2015};

        for (Magazine i : magazines) {
            System.out.print(i);
        }

        assert fashionNovember2018.equals(magazines[0]);
        assert !theAmericanProspectFebruary2006.equals(scienceDecember2015);
        assert mensHealthFebruary2016.equals(null);

        System.out.println("\n\nThe ID of \"Architecture Digest December 2016\" Magazine is: " + architecturalDigestDecember2016.getId());
        System.out.println("The name of \"Men's Health February 2016\" Magazine is: " + mensHealthFebruary2016.getName());
        System.out.println("The title of \"Fashion November 2018\" Magazine is: " + fashionNovember2018.getTitle());
        System.out.println("The genre of \"Flash Art July 2010\" Magazine is: " + flashArtJuly2010.getGenre());
        System.out.println("The date of \"The American Prospect February 2006\" Magazine is: " + theAmericanProspectFebruary2006.getDate());
        System.out.println("The cover type of \"Science December 2015\" Magazine is: " + scienceDecember2015.getCoverType());

        /*Testing eBook Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the EBook Class");

        EBook theMartian = new EBook("The Martian: A Novel", "Andy Weir", 2014);
        theMartian.setFiction();
        theMartian.setSciFi();
        theMartian.setAdventure();
        theMartian.setThriller();

        EBook bornACrime = new EBook("Born a Crime: Stories from a South African Childhood", "Trevor Noah", 2016);
        bornACrime.setNonFiction();
        bornACrime.setComedy();

        EBook nineteenEightyFourEBOOK = new EBook("1984", "George Orwell", 2016);
        nineteenEightyFourEBOOK.setFiction();
        nineteenEightyFourEBOOK.setDystopian();
        nineteenEightyFourEBOOK.setSciFi();

        EBook byChanceAlone = new EBook("By Chance Alone", "Max Eisen", 2016);
        byChanceAlone.setNonFiction();
        byChanceAlone.setHistory();
        byChanceAlone.setReligion();

        EBook origins = new EBook("Origins: Fouteen Billion Years of Cosmic Evolution", "Neil deGrasse Tyson", 2005);
        origins.setNonFiction();
        origins.setSciences();

        EBook aloneWithTheDead = new EBook("Alone with the Dead", "James Nally", 2015);
        aloneWithTheDead.setFiction();
        aloneWithTheDead.setMystery();
        aloneWithTheDead.setThriller();
        aloneWithTheDead.setHorror();

        EBook theEagle = new EBook("The Eagle", "Jillian Dodd", 2016);
        theEagle.setFiction();
        theEagle.setAdventure();
        theEagle.setMystery();
        theEagle.setRomance();
        theEagle.setThriller();

        EBook theGreatGatsbyEBOOK = new EBook("The Great Gatsby", "F. Scott Fitzgerald", 2003);
        theGreatGatsbyEBOOK.setFiction();
        theGreatGatsbyEBOOK.setHistorical();

        EBook[] eBooks = {theMartian, bornACrime, nineteenEightyFourEBOOK, byChanceAlone, origins, aloneWithTheDead, theEagle, theGreatGatsbyEBOOK};

        for (EBook i : eBooks) {
            System.out.print(i);
        }

        assert theMartian.equals(eBooks[0]);
        assert !origins.equals(nineteenEightyFourEBOOK);
        assert !theEagle.equals(null);

        System.out.println("\n\nThe ID of \"The Martian\" eBook is: " + theMartian.getId());
        System.out.println("The title of \"Born A Crime\" eBook is: " + bornACrime.getTitle());
        System.out.println("The author of \"1984\" eBook is: " + nineteenEightyFourEBOOK.getAuthor());
        System.out.println("The year published of \"By Chance Alone\" eBook is: " + byChanceAlone.getYearPublished());
        System.out.println("The genre of \"Origins\" eBook is: " + origins.getGenre());

        /*Testing AudioBook Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the AudioBook Class");

        AudioBook petSematary = new AudioBook("Pet Sematary", "Stephen King", "Michael C. Hall", 2018, 15, 41, 26);
        petSematary.setFiction();
        petSematary.setHorror();
        petSematary.setThriller();

        AudioBook harryPotterSorcerersStone = new AudioBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Jim Dale", 2015, 8, 33, 29);
        harryPotterSorcerersStone.setFiction();
        harryPotterSorcerersStone.setAdventure();
        harryPotterSorcerersStone.setFantasy();

        AudioBook hitchhikersGuideToTheGalaxy = new AudioBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Stephen Fry", 2005, 5, 51, 49);
        hitchhikersGuideToTheGalaxy.setFiction();
        hitchhikersGuideToTheGalaxy.setAdventure();
        hitchhikersGuideToTheGalaxy.setComedy();
        hitchhikersGuideToTheGalaxy.setSciFi();

        AudioBook tattooistOfAuschwitz = new AudioBook("The Tattooist of Auschwitz: A Novel", "Heather Morris", "Richard Armitage", 2018, 7, 25, 48);
        tattooistOfAuschwitz.setFiction();
        tattooistOfAuschwitz.setHistorical();
        tattooistOfAuschwitz.setReligion();

        AudioBook sherlockHolmesRediscoveredRailwayMysteries = new AudioBook("Sherlock Holmes' Rediscovered Railway Mysteries", "John Taylor", "Benedict Cumberbatch", 2015, 2, 4, 27);
        sherlockHolmesRediscoveredRailwayMysteries.setFiction();
        sherlockHolmesRediscoveredRailwayMysteries.setAdventure();
        sherlockHolmesRediscoveredRailwayMysteries.setThriller();

        AudioBook twelfthNight = new AudioBook("Twelfth Night", "William Shakespeare", "Stella Gonet, Gerard Murphy, Jonathan Keeble, Daniel Philpott, Nick Fletcher, Peter Yapp, Jane Whittenshaw, Malcolm Sinclair, David Timson, Lucy Whybrow, Christopher Godwin, Brian Parr, Adam Kotz, Benjamin Soames", 2000, 2, 15, 11);
        twelfthNight.setFiction();
        twelfthNight.setComedy();

        AudioBook whyWeSleep = new AudioBook("Why We Sleep: Unlocking the Power of Sleep and Dreams", "Matthew Walker", "Simon, Schuster", 2017, 13, 51, 58);
        whyWeSleep.setNonFiction();
        whyWeSleep.setPsychology();

        AudioBook astrophysicsForPeopleInAHurry = new AudioBook("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", "Neil deGrasse Tyson", 2017, 3, 41, 9);
        astrophysicsForPeopleInAHurry.setNonFiction();
        astrophysicsForPeopleInAHurry.setSciences();

        AudioBook[] audioBooks = {petSematary, harryPotterSorcerersStone, hitchhikersGuideToTheGalaxy, tattooistOfAuschwitz, sherlockHolmesRediscoveredRailwayMysteries, twelfthNight, whyWeSleep, astrophysicsForPeopleInAHurry};

        for (AudioBook i : audioBooks) {
            System.out.print(i);
        }

        assert astrophysicsForPeopleInAHurry.equals(audioBooks[7]);
        assert !whyWeSleep.equals(twelfthNight);
        assert !sherlockHolmesRediscoveredRailwayMysteries.equals(null);

        System.out.println("\n\nThe ID of \"Pet Sematary\" Audio Book is: " + petSematary.getId());
        System.out.println("The title of \"Harry Potter and the Sorcerer's Stone\" Audio Book is: " + harryPotterSorcerersStone.getTitle());
        System.out.println("The author of \"Hitchhikers Guide to the Galaxy\" Audio Book is: " + hitchhikersGuideToTheGalaxy.getAuthor());
        System.out.println("The year published of \"Tattooist of Auschwitz\" Audio Book is: " + tattooistOfAuschwitz.getYearPublished());
        System.out.println("The genre of \"Sherlock Holmes' Rediscovered Railway Mysteries\" Audio Book is: " + sherlockHolmesRediscoveredRailwayMysteries.getGenre());
        System.out.println("The time length of \"Twelfth Night\" Audio Book is: " + twelfthNight.getTime());
        System.out.println("The narrator of \"Why We Sleep: Unlocking the Power of Sleep and Dreams\" Audio Book is: " + whyWeSleep.getNarrator());

        /*Testing Music Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the Music Class");

        Music butterflyEffect = new Music("BUTTERFLY EFFECT", "Travis Scott", 2017, 3, 10);
        butterflyEffect.setHipHop();

        Music natural = new Music("Natural", "Imagine Dragons", 2018, 3, 9);
        natural.setPop();

        Music future = new Music("Future", "Bohemia", 2012, 3, 29);
        future.setRap();
        future.setWorldMusic();

        Music down = new Music("Down", "Gord Bamford", 2018, 2, 47);
        down.setCountry();

        Music bohemianRhapsody = new Music("Bohemian Rhapsody - Remastered 2011", "Queen", 2011, 5, 54);
        bohemianRhapsody.setRock();

        Music mahiJanda = new Music("Mahi Janda", "Somewhatsuper", 2018, 3, 42);
        mahiJanda.setElectronic();
        mahiJanda.setWorldMusic();

        Music timeless = new Music("Timeless", "John Abercrombie", 1975, 11, 58);
        timeless.setJazz();

        Music etudeNo2 = new Music("Etude No.2", "Philip Glass", 2003, 4, 55);
        etudeNo2.setClassical();

        Music[] music = {butterflyEffect, natural, future, down, bohemianRhapsody, mahiJanda, timeless, etudeNo2};

        for (Music i : music) {
            System.out.print(i);
        }

        assert butterflyEffect.equals(music[0]);
        assert !timeless.equals(mahiJanda);
        assert !music[3].equals(null);

        System.out.println("\n\nThe ID of \"Buttery Effect\" song is: " + butterflyEffect.getId());
        System.out.println("The title of \"Natural\" song is: " + natural.getTitle());
        System.out.println("The year published of \"Future\" song is: " + future.getYearPublished());
        System.out.println("The genre of \"Down\" song is: " + down.getGenre());
        System.out.println("The time length of \"Bohemian Rhapsody\" song is: " + bohemianRhapsody.getTime());

        /*Testing Movie Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the Movie Class");

        Movie spidermanIntoTheSpiderVerse = new Movie("Spider-man: Into the Spider-Verse", 2018, "Blu-ray", 1, 56);
        spidermanIntoTheSpiderVerse.setAction();
        spidermanIntoTheSpiderVerse.setComedy();
        spidermanIntoTheSpiderVerse.setAdventure();
        spidermanIntoTheSpiderVerse.setFantasy();
        spidermanIntoTheSpiderVerse.setSciFi();

        Movie theMatrix = new Movie("The Matrix", 1999, "DVD", 2, 16);
        theMatrix.setAction();
        theMatrix.setSciFi();
        theMatrix.setAdventure();
        theMatrix.setFantasy();
        theMatrix.setDystopian();

        Movie theConjuring = new Movie("The Conjuring", 2013, "Netflix", 1, 52);
        theConjuring.setHorror();
        theConjuring.setMystery();
        theConjuring.setParanormal();

        Movie dunkirk = new Movie("Dunkirk", 2017, "Blu-ray", 1, 46);
        dunkirk.setAction();
        dunkirk.setThriller();
        dunkirk.setHistorical();
        dunkirk.setAdventure();
        dunkirk.setMystery();

        Movie theBigSick = new Movie("The Big Sick", 2017, "Netflix", 2, 0);
        theBigSick.setComedy();
        theBigSick.setRomance();

        Movie antMan = new Movie("Ant-Man", 2015, "Netflix", 1, 58);
        antMan.setAction();
        antMan.setComedy();
        antMan.setAdventure();
        antMan.setSciFi();
        antMan.setThriller();

        Movie[] movies = {spidermanIntoTheSpiderVerse, theMatrix, theConjuring, dunkirk, theBigSick, antMan};

        for (Movie i : movies) {
            System.out.print(i);
        }

        assert spidermanIntoTheSpiderVerse.equals(movies[0]);
        assert !movies[1].equals(dunkirk);
        assert !antMan.equals(null);

        System.out.println("\n\nThe ID of \"Spider-man: Into the Spider-Verse\" movie is: " + spidermanIntoTheSpiderVerse.getId());
        System.out.println("The title of \"The Matrix\" movie is: " + theMatrix.getTitle());
        System.out.println("The year published of \"The Conjuring\" movie is: " + theConjuring.getYearPublished());
        System.out.println("The genre of \"Dunkirk\" movie is: " + dunkirk.getGenre());
        System.out.println("The time length of \"The Big Sick\" movie is: " + theBigSick.getTime());
        System.out.println("The media type of \"Ant-Man\" movie  is: " + antMan.getMediaType());

        /*Testing Documentary Class Assigning and Using .equals()*/
        System.out.println("\n\nTesting Assigning and .equals() in the Documentary Class");


        Documentary examinedLife = new Documentary("Examined Life", 2008, "DVD", 1, 30);
        examinedLife.setPhilosophy();

        Documentary aloneInThePast = new Documentary("Alone in the Past", 2017, "YouTube", 0, 57);
        aloneInThePast.setPsychology();

        Documentary zeitgeist = new Documentary("Zeitgeist", 2007, "YouTube", 2, 3);
        zeitgeist.setReligion();

        Documentary particleFever = new Documentary("Particle Fever", 2013, "DVD", 2, 0);
        particleFever.setSciences();

        Documentary hiroshimaBBC = new Documentary("Hiroshima: BBC History of World War II", 2005, "YouTube", 1, 30);
        hiroshimaBBC.setHistory();

        Documentary nothingToHide = new Documentary("Nothing to Hide", 2017, "YouTube", 1, 26);
        nothingToHide.setTechnology();

        Documentary[] documentaries = {examinedLife, aloneInThePast, zeitgeist, particleFever, hiroshimaBBC, nothingToHide};

        for (Documentary i : documentaries) {
            System.out.print(i);
        }

        assert aloneInThePast.equals(documentaries[2]);
        assert !particleFever.equals(examinedLife);
        assert !hiroshimaBBC.equals(null);

        System.out.println("\n\nThe ID of \"Examined Life\" movie is: " + examinedLife.getId());
        System.out.println("The title of \"Alone in the Past\" movie is: " + aloneInThePast.getTitle());
        System.out.println("The year published of \"Zeitgeist\" movie is: " + zeitgeist.getYearPublished());
        System.out.println("The genre of \"Particle Fever\" movie is: " + particleFever.getGenre());
        System.out.println("The time length of \"Hiroshima: BBC History of World War II\" movie is: " + hiroshimaBBC.getTime());
        System.out.println("The media type of \"Nothing to Hide\" movie  is: " + nothingToHide.getMediaType());

        /*Testing .sameAs*(* other) methods as outlined by SameAsPaper and SameAsNotPaper interfaces*/
        System.out.println("\n\nTesting .sameAs*(* other) methods as outlined by SameAsPaper and SameAsNotPaper interfaces");

        /*Checks the Fiction Class sameAsNotPaper(EBook)*/
        assert nineteenEightyFour.sameAsNotPaper(nineteenEightyFourEBOOK);
        assert !nineteenEightyFour.sameAsNotPaper(theEagle);

        /*Checks the Fiction Class sameAsNotPaper(AudioBook)*/
        AudioBook nineteenEightyFourAudioBook = new AudioBook("1984", "George Orwell", "John Smith", 2007, 4, 32, 31); //For Testing Purposes and NOT Using Real Information

        assert nineteenEightyFour.sameAsNotPaper(nineteenEightyFourAudioBook);
        assert !nineteenEightyFour.sameAsNotPaper(harryPotterSorcerersStone);

        /*Checks the EBook Class sameAsPaper(Fiction)*/
        assert nineteenEightyFourEBOOK.sameAsPaper(nineteenEightyFour);
        assert !nineteenEightyFourEBOOK.sameAsPaper(theHandmaidsTale);

        /*Checks the AudioBook Class sameAsPaper(Fiction)*/
        assert nineteenEightyFourAudioBook.sameAsPaper(nineteenEightyFour);
        assert !nineteenEightyFourAudioBook.sameAsPaper(theGreatGatsby);

    }
}
