
// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args) {

        // The actual code for creating an Array to hold DVD's.
        DVD[] dvdCollection = new DVD[15];

        DVD avengersDvd = new DVD("The Avengers",2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");


        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = incrediblesDVD;
        dvdCollection[7] = avengersDvd;
        dvdCollection[9] = findingDoryDVD;

        for (DVD dvd : dvdCollection) {
            System.out.println(dvd);
        }

    }
}