/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows
 */
public class CadastroInt extends javax.swing.JInternalFrame {
        
      //  GestaoInt yui = new GestaoInt();
                Municipio das = new Municipio();

    /**
     * Creates new form CadastroInt
     */
    public CadastroInt() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jImposto = new javax.swing.JTextField();
        jMeses = new javax.swing.JTextField();
        jMatricula = new javax.swing.JTextField();
        jSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTb = new javax.swing.JTable();
        jMatriculaCalcular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSalv32 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome");

        jLabel2.setText("Imposto");

        jLabel3.setText("Meses de Atraso");

        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Matricula");

        jTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome do Imovel"
            }
        ));
        jScrollPane1.setViewportView(jTb);

        jLabel5.setText("Checar a Matricula");

        jSalv32.setText("Verificar");
        jSalv32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalv32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jNome)
                        .addComponent(jImposto)
                        .addComponent(jMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSalv32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jMatriculaCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMatriculaCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSalv32)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        // Acao apos apertar o botao
      
        //Pegar o nome por o bloco de texto
        GestaoInt sad = new GestaoInt();
        Imovel mov = new Imovel();
        
        mov.colocarNome(jNome.getText());
        mov.colocarImpostoImovel(Float.parseFloat(jImposto.getText()));
        mov.colocarMatricular(jMatricula.getText());
        mov.colocarMesesAtraso(Integer.parseInt(jMeses.getText()));
        
        das.adicionarI(jMatricula.getText(), mov);
                
        DefaultTableModel val =(DefaultTableModel) jTb.getModel();        
       val.addRow(new String[]{mov.retornarMatricula(),mov.retornarNome()});
        
      // JOptionPane.showMessageDialog(null, mov.getMatricula());

        
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jSalv32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalv32ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,  "Imposto cobrado:\n$"+das.calM(jMatricula.getText())+" " );
    }//GEN-LAST:event_jSalv32ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMatricula;
    private javax.swing.JTextField jMatriculaCalcular;
    private javax.swing.JTextField jMeses;
    private javax.swing.JTextField jNome;
    public javax.swing.JButton jSalv32;
    public javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTb;
    // End of variables declaration//GEN-END:variables
}