package br.com.project.model;

public class Employees extends Client {
    
    private String password;
    private String office;
    private String accessLevel;
    
    public Employees(){
    }

    public Employees(String password, String office, String accessLevel) {
        this.password = password;
        this.office = office;
        this.accessLevel = accessLevel;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    
}
