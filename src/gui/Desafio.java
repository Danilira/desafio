package gui;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.dao.EspacoDAO;
import model.dao.PessoaDAO;
import model.dao.SalaDAO;

public class Desafio extends javax.swing.JFrame {

    public Desafio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCadastrarPessoa = new javax.swing.JButton();
        btBuscarPessoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCadastrarEspaco = new javax.swing.JButton();
        btBuscarEspaco = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCadastrarSala = new javax.swing.JButton();
        btBuscarSala = new javax.swing.JButton();
        btIniciarTreinamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sala");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Pessoa "));

        btCadastrarPessoa.setText("Cadastrar pessoa");
        btCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPessoaActionPerformed(evt);
            }
        });

        btBuscarPessoa.setText("Buscar pessoa");
        btBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPessoaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(67, 67, 67)
                .add(btCadastrarPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 112, Short.MAX_VALUE)
                .add(btBuscarPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btCadastrarPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btBuscarPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Espaço "));

        btCadastrarEspaco.setText("Cadastrar espaço");
        btCadastrarEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEspacoActionPerformed(evt);
            }
        });

        btBuscarEspaco.setText("Buscar espaço");
        btBuscarEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEspacoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(67, 67, 67)
                .add(btCadastrarEspaco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 169, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btBuscarEspaco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btCadastrarEspaco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btBuscarEspaco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Sala "));

        btCadastrarSala.setText("Cadastrar sala");
        btCadastrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarSalaActionPerformed(evt);
            }
        });

        btBuscarSala.setText("Buscar sala");
        btBuscarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarSalaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(67, 67, 67)
                .add(btCadastrarSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 112, Short.MAX_VALUE)
                .add(btBuscarSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCadastrarSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btBuscarSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btIniciarTreinamento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btIniciarTreinamento.setText("Iniciar treinamento");
        btIniciarTreinamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarTreinamentoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btIniciarTreinamento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(182, 182, 182))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 112, Short.MAX_VALUE)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btIniciarTreinamento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(119, 119, 119)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Pessoa");
        jPanel2.getAccessibleContext().setAccessibleName(" Sala");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPessoaActionPerformed
        CadastroPessoaGUI cadastroPessoaGUI = new CadastroPessoaGUI();
        cadastroPessoaGUI.setVisible(true);
    }//GEN-LAST:event_btCadastrarPessoaActionPerformed

    private void btBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPessoaActionPerformed
        ConsultaPessoaGUI consultarPessoaGUI = new ConsultaPessoaGUI();
        consultarPessoaGUI.setVisible(true);
    }//GEN-LAST:event_btBuscarPessoaActionPerformed

    private void btCadastrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarSalaActionPerformed
        CadastroSalaGUI cadastroSalaGUI = new CadastroSalaGUI();
        cadastroSalaGUI.setVisible(true);
    }//GEN-LAST:event_btCadastrarSalaActionPerformed

    private void btBuscarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarSalaActionPerformed
        ConsultaSalaGUI consultaSalaGUI = new ConsultaSalaGUI();
        consultaSalaGUI.setVisible(true);
    }//GEN-LAST:event_btBuscarSalaActionPerformed

    private void btCadastrarEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEspacoActionPerformed
        CadastroEspacoGUI cadastroEspacoGUI = new CadastroEspacoGUI();
        cadastroEspacoGUI.setVisible(true);
    }//GEN-LAST:event_btCadastrarEspacoActionPerformed

    private void btBuscarEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEspacoActionPerformed
        ConsultaEspacoGUI consultaEspacoGUI = new ConsultaEspacoGUI();
        consultaEspacoGUI.setVisible(true);
    }//GEN-LAST:event_btBuscarEspacoActionPerformed

    private void btIniciarTreinamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarTreinamentoActionPerformed
        PessoaDAO pessoaDao = new PessoaDAO();
        SalaDAO salaDao = new SalaDAO();
        EspacoDAO espacoDao = new EspacoDAO();
        if (pessoaDao.buscarNumeroPessoas() == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhuma pessoa cadastrada para iniciar o treinamento");
        } else if (salaDao.buscarNumeroSala() == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhuma sala cadastrada para iniciar o treinamento");
        } else if (espacoDao.buscarNumeroEspacos() == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhum espaço cadastrado para iniciar o treinamento");
        } else {
            HashMap<Integer, Integer> valoresUm = new HashMap<>();
            valoresUm = pessoaDao.buscarSalasEtapasUm();
            int i = 0;
            if (valoresUm.size() > 0 ) {
                for (int j = 0; j < valoresUm.size(); j++) {
                    for (int k = 0; k < valoresUm.size(); k++) {
                        if (valoresUm.get(j) > valoresUm.get(k) + 1) {
                            i++;
                        }
                    }
                }
            }
            
            HashMap<Integer, Integer> valoresDois = new HashMap<>();
            valoresDois = pessoaDao.buscarSalasEtapasDois();
            int l = 0;
            if (valoresDois.size() > 0 ) {
                for (int j = 0; j < valoresDois.size(); j++) {
                    for (int k = 0; k < valoresDois.size(); k++) {
                        if (valoresDois.get(j) > valoresDois.get(k) + 1) {
                            l++;
                        }
                    }
                }
            }
            if(i > 0 || l > 0) {
                JOptionPane.showMessageDialog(null, "Existe(m) sala(s) em que há diferença de alunos é maior que 1");
            }
            else {
                JOptionPane.showMessageDialog(null, "O treinamento pode ser iniciado!");
            }
        }
    }//GEN-LAST:event_btIniciarTreinamentoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Desafio desafio = new Desafio();
                desafio.setVisible(true);
                desafio.setTitle("Projeto desafio");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEspaco;
    private javax.swing.JButton btBuscarPessoa;
    private javax.swing.JButton btBuscarSala;
    private javax.swing.JButton btCadastrarEspaco;
    private javax.swing.JButton btCadastrarPessoa;
    private javax.swing.JButton btCadastrarSala;
    private javax.swing.JButton btIniciarTreinamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
