package formularios;

/**
 * Clase para manejo de registro de usuarios
 */
public class Registro {
    private String usuario;
    private String password;
    
    public Registro() {
    }
    
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String mostrarUser() { return usuario; }
    public String mostrarPass() { return password; }
    public void quitarUser() { this.usuario = null; }
}