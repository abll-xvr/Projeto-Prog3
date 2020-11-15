package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame implements ActionListener {
    private JButton btnEntrar, btnLimpar;
    private JLabel lblUsuario, lblSenha, lblBemVindo;
    private JMenuBar barra=new JMenuBar();
    private JMenu ficheiro;
    private JTextField txtUsuario;
    private JPasswordField pswdSenha;
    private JPanel pnl1, pnl2;
    private JMenuItem sair, minimizar, maximizar;

    public TelaLogin(){
        this.setSize(380,180);
        this.setTitle("Sistema de Gestão Farmaceutica");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        this.setJMenuBar(barra);
        ficheiro=new JMenu("Ficheiro");
        maximizar=new JMenuItem("Maximizar");
        minimizar=new JMenuItem("Minimizar");
        sair=new JMenuItem("Sair");
        ficheiro.add(minimizar);
        minimizar.addActionListener(this);
        ficheiro.add(maximizar);
        maximizar.addActionListener(this);
        ficheiro.addSeparator();
        ficheiro.add(sair);
        sair.addActionListener(this);
        barra.add(ficheiro);

        lblBemVindo=new JLabel();
        lblBemVindo.setText("Bem vindo ao Sistema de Gestão Farmaceutica");
        lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);

        pnl1=new JPanel(new GridLayout(2,2,5,5));
        lblUsuario=new JLabel();
        lblUsuario.setText("Usuario:");
        lblSenha=new JLabel();
        lblSenha.setText("Senha:");
        txtUsuario=new JTextField(20);
        pswdSenha=new JPasswordField(20);
        pswdSenha.setEchoChar('*');

        pnl1.add(lblUsuario);
        pnl1.add(txtUsuario);
        pnl1.add(lblSenha);
        pnl1.add(pswdSenha);

        pnl2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnEntrar=new JButton("Entrar");
        btnLimpar=new JButton("Limpar");
        btnLimpar.addActionListener(this);
        pnl2.add(btnEntrar);
        pnl2.add(btnLimpar);


        this.add("North",lblBemVindo);
        this.add("Center", pnl1);
        this.add("South",pnl2);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnLimpar){
            txtUsuario.setText("");
            pswdSenha.setText("");
        }
        if (e.getSource()==sair){
            System.exit(0);
        }
        if (e.getSource()==minimizar){
            this.setExtendedState(JFrame.ICONIFIED);
            //maximizar.setEnabled(false);
        }
        if(e.getSource()==maximizar){
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
           // minimizar.setEnabled(false);
        }
    }
}
