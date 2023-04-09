public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebidas bebida;

    public Combo(Burger burger, Sobremesa sobremesa, Bebidas bebida) {
        this.burger = burger;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public static Combo comboMaster() {
        Burger burger = new Burger("Cheeseburger", 12.0, 150);
        Sobremesa sobremesa = new Sobremesa("Sorvete", 6.0, "Médio");
        Bebidas bebida = new Bebidas("Refrigerante", 4.0, 350);
        return new Combo(burger, sobremesa, bebida);
    }

    public static Combo comboSuper() {
        Burger burger = new Burger("Hambúrguer de frango", 10.0, 120);
        Sobremesa sobremesa = new Sobremesa("Torta", 8.0, "Grande");
        Bebidas bebida = new Bebidas("Suco natural", 5.0, 300);
        return new Combo(burger, sobremesa, bebida);
    }

    public void exibirItens() {
        System.out.println("Burger: " + burger.getDescricao() + " (" + burger.getGramas() + "g)");
        System.out.println("Sobremesa: " + sobremesa.getDescricao() + " (" + sobremesa.getTamanho() + ")");
        System.out.println("Bebida: " + bebida.getDescricao() + " (" + bebida.getMl() + "ml)");
    }

    @Override
    public String toString() {
        return "Combo [burger=" + burger + ", sobremesa=" + sobremesa + ", bebida=" + bebida + "]";
    }

    
}