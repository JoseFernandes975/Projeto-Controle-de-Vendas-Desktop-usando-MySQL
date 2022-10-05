
package br.com.project.model;

public class Providers extends Client{
    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
    
    
}
