public class Summary {
    private String summaryStatement = "I am currently in a Java Developer Bootcamp with Grand Circus - " +
            "Detroit to deepen my programming skills in Java 8. I am changing careers from the education " +
            "field to a technology career because I've used a variety of types of technology in the " +
            "classroom and have seen how technology can make life easier for people. I would like to " +
            "contribute to that type of work and bring in my own unique experiences from the education field.";

    public Summary() {
    }

    public Summary(String summaryStatement) {
        this.summaryStatement = summaryStatement;
    }

    public String getSummaryStatement() {
        return summaryStatement;
    }

    public void setSummaryStatement(String summaryStatement) {
        this.summaryStatement = summaryStatement;
    }
}
