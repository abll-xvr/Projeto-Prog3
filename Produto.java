package Classes;


public class Produto {
    private int codigo;
    private int armazem;
    private int stock_minimo;
    private int quantidade;
    private String nome;
    private String fornecedor;
    private boolean receitado;

    public Produto(int codigo, int armazem, int stock_minimo, int quantidade, String nome, String fornecedor, boolean receitado) {
        this.codigo = codigo;
        this.armazem = armazem;
        this.stock_minimo = stock_minimo;
        this.quantidade = quantidade;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.receitado = receitado;
    }


    public int getCodigo() {
        return codigo;
    }

    public int getArmazem() {
        return armazem;
    }

    public void setArmazem(int armazem) {
        this.armazem = armazem;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isReceitado() {
        return receitado;
    }

    public void setReceitado(boolean receitado) {
        this.receitado = receitado;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", armazem=" + armazem +
                ", stock_minimo=" + stock_minimo +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", receitado=" + receitado +
                '}';
    }
}
