public class Contact {
    private String email="mattmenna@gmail.com";
    private String phoneNum = "734-231-0276";
    private String gitHub = "https://github.com/mattmenna";
    private String linkedIn = "https://www.linkedin.com/in/matthew-menna/";

    public Contact() {
    }

    public Contact(String email, String phoneNum, String gitHub, String linkedIn) {
        this.email = email;
        this.phoneNum = phoneNum;
        this.gitHub = gitHub;
        this.linkedIn = linkedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
}
