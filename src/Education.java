public class Education {
    private String school;
    private String major;
    private String startDate;
    private String endDate;
    private String description;
    private String city;
    private String state;

    public Education(String school, String major, String startDate, String endDate, String description, String city, String state) {
        this.school = school;
        this.major = major;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.city = city;
        this.state = state;
    }

    public Education() {

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
