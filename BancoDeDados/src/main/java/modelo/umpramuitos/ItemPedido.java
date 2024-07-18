package modelo.umpramuitos;

import modelo.basico.Produto;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double preco;

    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto; //Herança

    @ManyToOne
    private Pedido pedido; //Herança

    //Construtor ItemPedido
    public ItemPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    //Construtor ItemPedido e campos
    public ItemPedido(Produto produto, Pedido pedido, int quantidade) {
        super();
        this.setPedido(pedido);
        this.setProduto(produto);
        this.quantidade = quantidade;
    }
    // Início getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null){
            this.setPreco(produto.getPreco());

        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    //Final getters e setters
}
