
package br.com.project.model;

public class Sales {
    private int id;
    private Client client;
    private String date_sales;
    private double total_sales;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate_sales() {
        return date_sales;
    }

    public void setDate_sales(String date_sales) {
        this.date_sales = date_sales;
    }

    public double getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(double total_sales) {
        this.total_sales = total_sales;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
