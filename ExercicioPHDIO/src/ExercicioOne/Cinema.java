package ExercicioOne;


public class Cinema {
    public static void main(String[] args) {
        Filme filme = new Filme();
        
        filme.setName("Rei Leão"); // Define o nome
        filme.setLinguagem("Português"); // Define a linguage
        IngressosFML.setIng(250); // Define um valor inicial
        System.out.println("Valor inicial (sem desconto): " + IngressosFML.getIng());

        IngressosFML.setIng(3); // Testa o desconto com ing = 3
        System.out.println("Valor com desconto: " + IngressosFML.getIng() + " Reais de Desconto");
        IngressosMeia ingressosMeia2 = new IngressosMeia();
		ingressosMeia2.setIngressoMeia(125);
        
        
        
        System.out.println(filme.getName()); // Imprime o nome
        System.out.println(filme.getLinguagem()); // Imprime a linguagem
        System.out.println(IngressosFML.getIng());
		System.out.println("Ingresso para estudante: " + IngressosMeia.getIngressoMeia()); 
    }
    
}