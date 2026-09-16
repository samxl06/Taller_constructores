public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacío
    public Libro(){
        this.disponible = true;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    // Constructor con parámetros
    public Libro(String titulo, String autor, boolean disponible){
        setTitulo(titulo);
        this.autor = autor;
        this.disponible = disponible;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;    
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado con éxito.");
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto con éxito.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }
}