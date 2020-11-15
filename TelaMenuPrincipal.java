package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenuPrincipal extends JFrame implements ActionListener {
    private JButton btnArmazem, btnFornecedor, btnProdutos, btnFiltro, btnSair;
    private JLabel menu, iconeMenu;
    private JMenuBar barra = new JMenuBar();
    private JMenu ficheiro, opcoesPgm;
    private JMenuItem sair, minimizar, maximizar;

    private JPanel pnl, pnlAux1, pnlAux2, pnlAux3;

    public TelaMenuPrincipal() {
        this.setTitle("Menu Principal");
        this.setSize(600, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //this.setResizable(false);

        this.setJMenuBar(barra);
        opcoesPgm = new JMenu("opcoes");
        ficheiro = new JMenu("Ficheiro");
        sair = new JMenuItem("Sair");
        minimizar = new JMenuItem("Minimizar");
        maximizar = new JMenuItem("Maximizar");

        opcoesPgm.add(minimizar);
        opcoesPgm.add(maximizar);
        opcoesPgm.addSeparator();
        opcoesPgm.add(sair);

        barra.add(opcoesPgm);
        barra.add(ficheiro);

        pnl = new JPanel(new GridLayout(5,1,5,5));
        btnProdutos = new JButton("Produtos");
        btnArmazem = new JButton("Armazem");
        btnFornecedor = new JButton("Fornecedor");
        btnFiltro = new JButton("Filtro");
        btnSair = new JButton("Sair");

        pnl.add(btnProdutos);
        pnl.add(btnArmazem);
        pnl.add(btnFornecedor);
        pnl.add(btnFiltro);
        pnl.add(btnSair);


        menu = new JLabel("Menu Principal");
        menu.setHorizontalAlignment(SwingConstants.CENTER);

        pnlAux1=new JPanel();
        pnlAux2=new JPanel();
        pnlAux3=new JPanel();


        this.add("North", menu);
        this.add("West", pnl);
        this.add("East",pnlAux1);
        this.add("Center",pnlAux2);
        this.add("South",pnlAux3);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnSair){
            System.exit(0);
        }
    }
}
