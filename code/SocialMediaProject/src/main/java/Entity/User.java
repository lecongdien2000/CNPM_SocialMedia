package Entity;

public class User {
    private String id;
    private String fullname;
    private String username;
    private String password;
    private Date dateCreated;

    public User(){
        //default value
        this.id = "-1";
        this.dateCreated = new Date(1,1,2000);
        this.username = "";
        this.password="";
    }

    public User(String id, String fullname, String username, String password, Date dateCreated) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.dateCreated = dateCreated;
        this.fullname = fullname;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }




}