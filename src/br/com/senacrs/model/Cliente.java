
package br.com.senacrs.model;


public class Cliente {
    private int Codigo;
    private String Nome;
    private String Email;
    private String Usuario;
    private String Senha;
    private String Celular;
    private String Sexo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    
    public String toString() {
        return "Cliente" + "Codigo" + Codigo + "Nome=" + Nome + "Email" + Email + "Usuario " + Usuario + "Senha " + Senha + "Celular " + Celular + "Sexo " + Sexo;
    }
    
   
    
    
    
}
