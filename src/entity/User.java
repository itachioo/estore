package entity;

public class User {

    /**
     * `id` int not null primary key ,
     *   `username` varchar (60),
     *   `password` varchar (60),
     *   `email` varchar (30),
     *   `role` varchar (100),
     *   `state` int ,
     *   `activecode` varchar(100),
     *   `updatetime` timestamp
     */
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String state;
    private String activecode;
    private String updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getActivecode() {
        return activecode;
    }

    public void setActivecode(String activecode) {
        this.activecode = activecode;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
