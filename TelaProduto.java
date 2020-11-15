package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import Classes.*;

public class TelaProduto extends JFrame implements ActionListener {

    private JTextField txtNome, txtCodigo, txtQuantidade, txtStock, txtArmazem;
    private JLabel lblNome, lblQuantidade, lblCodigo, lblStock, lblFornecedor, lblReceitado, lblProduto, lblArmazem;
    private JCheckBox receitado;
    private JComboBox fornecedor;
    private JPanel pnl1, pnl2, pnl3, pnl4;
    private JButton gravar, atualizar, apagar;
    private JMenuBar barra = new JMenuBar();
    private JMenu ficheiro, opcoesPgm;
    private JTable tabela;
    private Vector<String> nomeColunas =new Vector<>(7);
    private Vector<String> vecProdutos =new Vector<>(7);



    public TelaProduto() throws HeadlessException {
        this.setTitle("Produtos");
        this.setSize(600, 350);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(barra);

        ficheiro = new JMenu("Ficheiro");
        opcoesPgm = new JMenu("Opcoes");
        barra.add(opcoesPgm);
        barra.add(ficheiro);

        lblProduto = new JLabel("Produtos");
        lblProduto.setHorizontalAlignment(SwingConstants.CENTER);

        pnl1 = new JPanel(new GridLayout(4, 2,3,0));
        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(10);
        lblCodigo = new JLabel("Codigo:");
        txtCodigo = new JTextField(10);
        lblFornecedor = new JLabel("Fornecedor:");
        fornecedor = new JComboBox(); // adicionar vector com fornecedores;
        lblArmazem=new JLabel("Armazem:");
        txtArmazem=new JTextField(10);
        pnl1.add(lblNome);
        pnl1.add(txtNome);
        pnl1.add(lblCodigo);
        pnl1.add(txtCodigo);
        pnl1.add(lblFornecedor);
        pnl1.add(fornecedor);
        pnl1.add(lblArmazem);
        pnl1.add(txtArmazem);

        pnl2 = new JPanel(new GridLayout(3, 2,6,6));
        lblQuantidade = new JLabel("Quantidade:");
        txtQuantidade = new JTextField(15);
        lblStock = new JLabel("Stock Minimo:");
        txtStock = new JTextField(15);

        lblReceitado = new JLabel("Receitado:");
        receitado = new JCheckBox();
        //receitado.setText("Receitado");
        pnl2.add(lblQuantidade);
        pnl2.add(txtQuantidade);
        pnl2.add(lblStock);
        pnl2.add(txtStock);
        pnl2.add(lblReceitado);
        pnl2.add(receitado);

        pnl3 = new JPanel(new FlowLayout(4));
        gravar = new JButton("Gravar");
        atualizar = new JButton("Atualizar");
        apagar = new JButton("Apagar");
        pnl3.add(gravar);
        pnl3.add(atualizar);
        pnl3.add(apagar);

        tabela = new JTable(vecProdutos,nomeColunas);

        pnl4 = new JPanel(new BorderLayout());
        pnl4.add("Center", pnl1);
        pnl4.add("East", pnl2);
        pnl4.add("South", tabela);

        this.add("North", lblProduto);
        this.add("Center", pnl4);
        this.add("South", pnl3);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

if (e.getSource()==gravar){
    new Produto(Integer.getInteger(txtCodigo.getText()),Integer.getInteger(txtArmazem.getText()),Integer.getInteger(txtStock.getText()),Integer.getInteger(txtQuantidade.getText()),txtNome.getText(),fornecedor.getItemAt(0).toString(),receitado.isSelected());

}
    }
}
