package gui;

import javax.swing.JOptionPane;
import model.bean.Pessoa;
import model.dao.PessoaDAO;
import javax.swing.table.DefaultTableModel;

public class ConsultaPessoaGUI extends javax.swing.JFrame {
    
    
    public ConsultaPessoaGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelSobrenome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPessoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pessoa");
        setBackground(new java.awt.Color(204, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Pessoa "));

        labelNome.setText("Nome");

        labelSobrenome.setText("Sobrenome");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
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
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(labelSobrenome)
                    .add(labelNome))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tfSobrenome)
                    .add(tfNome))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btBuscar)
                .add(38, 38, 38)
                .add(btCancelar)
                .add(27, 27, 27))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {btBuscar, btCancelar}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

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
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btBuscar)
                    .add(btCancelar))
                .add(0, 15, Short.MAX_VALUE))
        );

        jTPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sobrenome", "Sala etapa 1", "Sala etapa 2 ", "Espaço intervalo1", "Espaço intervalo 2"
            }
        ));
        jScrollPane1.setViewportView(jTPessoa);
        if (jTPessoa.getColumnModel().getColumnCount() > 0) {
            jTPessoa.getColumnModel().getColumn(0).setResizable(false);
        }

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Pessoa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        PessoaDAO pessoaDao = new PessoaDAO();
        Pessoa pessoa = new Pessoa();
        if(!tfNome.getText().isEmpty()){
            pessoa.setNome(tfNome.getText());
        }
        if(!tfSobrenome.getText().isEmpty()) {
            pessoa.setSobrenome(tfSobrenome.getText());
        }

        try {
            DefaultTableModel model = (DefaultTableModel) jTPessoa.getModel();
            model.setNumRows(0);

            for (Pessoa pessoas : pessoaDao.buscar(pessoa)) {
                model.addRow(new Object[]{
                    pessoas.getIdSala(),
                    pessoas.getNome(),
                    pessoas.getSobrenome(),
                    pessoas.getSalaEtapaUm(),
                    pessoas.getSalaEtapaDois(),
                    pessoas.getEspacoUm(),
                    pessoas.getEspacoDois()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btBuscarActionPerformed
    
    
    public static void main(String args[]) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPessoaGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPessoa;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSobrenome;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    // End of variables declaration//GEN-END:variables
}
