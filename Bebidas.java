public class Bebidas extends Produto {
    private int ml;

    public Bebidas(String descricao, double preco, int ml) {
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }
}
