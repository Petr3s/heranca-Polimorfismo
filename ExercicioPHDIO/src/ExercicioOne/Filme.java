package ExercicioOne;

public class Filme extends Cinema {
    protected String name;
    protected String linguagem;

    // Construtor padrão
    public Filme() {
    }

    // Construtor com parâmetros
    public Filme(String name, String linguagem) {
        this.name = name;
        this.linguagem = linguagem;
    }

    /* @return the name */
    public String getName() {
        return name;
    }

    /* @param name the name to set */
    public void setName(String name) {
        this.name = name;
    }

    /* @return the linguagem */
    public String getLinguagem() {
        return linguagem;
    }

    /* @param linguagem the linguagem to set */
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}