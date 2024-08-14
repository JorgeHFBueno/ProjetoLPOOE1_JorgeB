package com.lpoo2401.projetolpooe1_jorgeb.view;

import com.lpoo2401.projetolpooe1_jorgeb.model.Caminhao;
import com.lpoo2401.projetolpooe1_jorgeb.model.Motoristas;
import com.lpoo2401.projetolpooe1_jorgeb.model.Obra;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

//@author JRG B

public class Tela_CCaminhao extends javax.swing.JFrame {

    private Caminhao caminhao;  // Will be null if adding a new entry
    private EntityManagerFactory emf;
    private Tela_Controle parentFrame; 
    
    public Tela_CCaminhao(EntityManagerFactory emf, Tela_Controle parentFrame) {
        this.emf = emf;
        this.parentFrame = parentFrame;
        initComponents();
        loadComboBoxData();
    }

    // Constructor for editing an existing Caminhao
    public Tela_CCaminhao(EntityManagerFactory emf, Caminhao caminhao, Tela_Controle parentFrame) {
        this.emf = emf;
        this.caminhao = caminhao;
        this.parentFrame = parentFrame;
        initComponents();
        loadComboBoxData();
        populateFields();  // Populate fields with the existing data
    }
    
     private void loadComboBoxData() {
        EntityManager em = emf.createEntityManager();

        // Load Obra entities
        List<Obra> obras = em.createQuery("SELECT o FROM Obra o", Obra.class).getResultList();
        DefaultComboBoxModel<Obra> obraModel = new DefaultComboBoxModel<>(obras.toArray(new Obra[0]));
        jComboBox_Obra.setModel(obraModel);

        // Load Motoristas entities
        List<Motoristas> motoristas = em.createQuery("SELECT m FROM Motoristas m", Motoristas.class).getResultList();
        DefaultComboBoxModel<Motoristas> motoristaModel = new DefaultComboBoxModel<>(motoristas.toArray(new Motoristas[0]));
        jComboBox_Motorista.setModel(motoristaModel);

        em.close();
    }
     
    private void populateFields() {
        if (caminhao != null) {
            jTextField_Placa.setText(caminhao.getPlaca());
            jTextField_KM.setText(caminhao.getKm().toString());
            jTextField_Placa.setEditable(false);
            if (caminhao.getObra() != null) {
                jComboBox_Obra.setSelectedItem(caminhao.getObra());
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Salvar = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel_Placa = new javax.swing.JLabel();
        jTextField_Placa = new javax.swing.JTextField();
        jLabel_KM = new javax.swing.JLabel();
        jTextField_KM = new javax.swing.JTextField();
        jComboBox_Obra = new javax.swing.JComboBox<>();
        jComboBox_Motorista = new javax.swing.JComboBox<>();
        jLabel_Obra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("Cancelar");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jLabel_Placa.setText("Placa");

        jLabel_KM.setText("KM");

        jLabel_Obra.setText("Obra:");

        jLabel2.setText("Motorista:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Placa)
                            .addComponent(jTextField_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Obra)
                            .addComponent(jComboBox_Obra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_KM)
                            .addComponent(jLabel_KM)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox_Motorista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Placa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_KM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_KM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Obra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Obra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Motorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Cancel))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            if (caminhao == null) {
                // Adding new Caminhao
                caminhao = new Caminhao();
                caminhao.setPlaca(jTextField_Placa.getText());
            }
            // Setting/Updating values
            caminhao.setKm(Integer.parseInt(jTextField_KM.getText()));
            caminhao.setObra((Obra) jComboBox_Obra.getSelectedItem());

            // Update Motorista relationships (you need to ensure this logic fits your design)
            List<Motoristas> selectedMotoristas = List.of((Motoristas) jComboBox_Motorista.getSelectedItem());
            caminhao.setMotoristas(selectedMotoristas);

            if (caminhao.getPlaca() != null) {
                em.merge(caminhao);  // Merges the new or updated Caminhao into the database
            } else {
                em.persist(caminhao);
            }

            em.getTransaction().commit();
            parentFrame.attList();  // Refresh the list in the parent frame
            this.dispose();  // Close the form
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Error na tentativa de salvar Caminhao: " + e.getMessage());
        } finally {
            em.close();
        }
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JComboBox<Motoristas> jComboBox_Motorista;
    private javax.swing.JComboBox<Obra> jComboBox_Obra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_KM;
    private javax.swing.JLabel jLabel_Obra;
    private javax.swing.JLabel jLabel_Placa;
    private javax.swing.JTextField jTextField_KM;
    private javax.swing.JTextField jTextField_Placa;
    // End of variables declaration//GEN-END:variables
}
