package ExercicioOne;

public class IngressosMeia extends Cinema {
    protected static int IngressoMeia;

    protected IngressosMeia() {
    }

    protected IngressosMeia(int IngressoMeia) {
        IngressosMeia.IngressoMeia = IngressoMeia;
    }

    protected static int getIngressoMeia() {
        return IngressoMeia;
    }

    protected void setIngressoMeia(int ingressoMeia) {
        IngressoMeia = ingressoMeia;
    }
}