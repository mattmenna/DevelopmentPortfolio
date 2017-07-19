public class Portfolio {

    public static void main(String[] args) {

        Contact myContact = new Contact();
        Experience DPS = new Experience("Dearborn Public Schools", "Math and Science Teacher", "9/2016", "6/2017","7th Grade", "Dearborn", "Michigan");
        Experience AdvancedTechAcademy = new Experience("Advanced Technology Academy", "Math and Science Teacher", "9/2012", "6/2016","9th and 10th Grade", "Dearborn", "Michigan");
        Experience RR = new Experience("River Rouge High School", "Math and Science Teacher", "9/2016", "6/2017","7th Grade", "Dearborn", "Michigan");
        Skills skills = new Skills();
        Education MSU = new Education("Michigan State University", "BS in Astrophysics", "", "Graduated 2007", "", "East Lansing", "Michigan");
        Education UofMDearborn = new Education("University of Michigan - Dearborn", "MA in Education", "", "Graduated 2009", "", "Dearborn", "Michigan");
        Education GrandCircus = new Education("Grand Circus Detroit", "Java Developer Bootcamp", "06/2017", "08/2017", "", "Detroit", "Michigan");

    }
}
