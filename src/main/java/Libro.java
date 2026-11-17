/**
 * Representa un libro de la biblioteca universitaria.
 */
public class Libro {

  private String titulo;
  private String autor;
  private boolean disponible = true;

  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public boolean estaDisponible() {
    return disponible;
  }

  /**
   * Marca el libro como prestado.
   *
   * @throws IllegalStateException si el libro ya está prestado
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException(
          "Libro no disponible"
      );
    }

    disponible = false;
  }

  /**
   * Marca el libro como disponible nuevamente.
   */
  public void devolver() {
    disponible = true;
  }

  public boolean esMismoTitulo(String otroTitulo) {
    return titulo.equals(otroTitulo);
  }
}