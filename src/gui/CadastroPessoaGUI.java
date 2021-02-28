package gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.bean.Pessoa;
import model.dao.PessoaDAO;
import model.dao.SalaDAO;
import model.dao.EspacoDAO;


public class CadastroPessoaGUI extends javax.swing.JFrame {
    
    
    public CadastroPessoaGUI() {
        initComponents();
        DefaultComboBoxModel defaultComboBoxSalaUm = new DefaultComboBoxModel(SalaDAO.buscarLista().toArray());
        cbSalaEtapaUm.setModel(defaultComboBoxSalaUm);
        DefaultComboBoxModel defaultComboBoxSalaDois = new DefaultComboBoxModel(SalaDAO.buscarLista().toArray());
        cbSalaEtapaDois.setModel(defaultComboBoxSalaDois);
        
        DefaultComboBoxModel defaultComboBoxEspacoUm = new DefaultComboBoxModel(EspacoDAO.buscarLista().toArray());
        cbEspacoUm.setModel(defaultComboBoxEspacoUm);
        DefaultComboBoxModel defaultComboBoxEspacoDois = new DefaultComboBoxModel(EspacoDAO.buscarLista().toArray());
        cbEspacoDois.setModel(defaultComboBoxEspacoDois);
        
        this.setLocationRelativeTo(null);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelSobrenome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        labelSalaEtapaUm = new javax.swing.JLabel();
        labelSalaEtapaDois = new javax.swing.JLabel();
        labelEspacoUm = new javax.swing.JLabel();
        labelEspacoDois = new javax.swing.JLabel();
        cbSalaEtapaUm = new javax.swing.JComboBox<>();
        cbSalaEtapaDois = new javax.swing.JComboBox<>();
        cbEspacoUm = new javax.swing.JComboBox<>();
        cbEspacoDois = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pessoa");

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Pessoa "));

        labelNome.setText("Nome");

        labelSobrenome.setText("Sobrenome");

        labelSalaEtapaUm.setText("Sala etapa 1 ");

        labelSalaEtapaDois.setText("Sala etapa 2 ");

        labelEspacoUm.setText("Espaço 1");

        labelEspacoDois.setText("Espaço 2 ");

        cbSalaEtapaUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbSalaEtapaDois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbEspacoUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbEspacoDois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(labelSobrenome)
                        .add(labelNome))
                    .add(labelSalaEtapaUm)
                    .add(labelSalaEtapaDois)
                    .add(labelEspacoUm)
                    .add(labelEspacoDois))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tfSobrenome)
                    .add(cbSalaEtapaUm, 0, 394, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cbSalaEtapaDois, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cbEspacoDois, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cbEspacoUm, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, tfNome))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btSalvar)
                .add(51, 51, 51)
                .add(btCancelar)
                .add(46, 46, 46))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {btCancelar, btSalvar}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelNome)
                    .add(tfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelSobrenome)
                    .add(tfSobrenome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelSalaEtapaUm)
                    .add(cbSalaEtapaUm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelSalaEtapaDois)
                    .add(cbSalaEtapaDois, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(labelEspacoUm)
                    .add(cbEspacoUm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelEspacoDois)
                    .add(cbEspacoDois, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btSalvar)
                    .add(btCancelar))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Pessoa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(tfNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha com seu nome");
        }
        else if(tfSobrenome.getText().isEmpty ()){
            JOptionPane.showMessageDialog(null, "Preencha com seu sobrenome");    
        }
        else if(cbSalaEtapaUm.getSelectedIndex() == cbSalaEtapaDois.getSelectedIndex()){
            JOptionPane.showMessageDialog(null, "O aluno não pode ser cadastrado em salas iguais para as duas etapas");
        }
        else if (cbEspacoUm.getSelectedIndex() == cbEspacoDois.getSelectedIndex()){
            JOptionPane.showMessageDialog(null, "O aluno não pode ser cadastrado em espaços iguais para as duas etapas");
        }
        else {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(tfNome.getText());
            pessoa.setSobrenome(tfSobrenome.getText());
            pessoa.setSalaEtapaUm(cbSalaEtapaUm.getSelectedItem().toString());
            pessoa.setSalaEtapaDois(cbSalaEtapaDois.getSelectedItem().toString());
            pessoa.setEspacoUm(cbEspacoUm.getSelectedItem().toString());
            pessoa.setEspacoDois(cbEspacoDois.getSelectedItem().toString());
            PessoaDAO pDao = new PessoaDAO();
            if(pDao.inserir(pessoa)) {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed
    
    
    public static void main(String args[]) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbEspacoDois;
    private javax.swing.JComboBox<String> cbEspacoUm;
    private javax.swing.JComboBox<String> cbSalaEtapaDois;
    private javax.swing.JComboBox<String> cbSalaEtapaUm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEspacoDois;
    private javax.swing.JLabel labelEspacoUm;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalaEtapaDois;
    private javax.swing.JLabel labelSalaEtapaUm;
    private javax.swing.JLabel labelSobrenome;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    // End of variables declaration//GEN-END:variables
}
