/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Congreso;
import static Vista.UsaCongreso.losCongresos;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Page4 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Page4() {
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

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtx = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        existe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Consultar un Congreso");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el identificador del congreso deseado");

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        existe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        resultado.setColumns(20);
        resultado.setRows(5);
        resultado.setEnabled(false);
        jScrollPane1.setViewportView(resultado);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CONGRESO");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(idtx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(buscar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(596, Short.MAX_VALUE)
                        .addComponent(existe, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel3))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(existe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String identificadorCongreso = idtx.getText();
        if (existeCongreso(identificadorCongreso)) {
            existe.setText("EXISTE");
            int numero = 0;
            //if (losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).getSusInscripciones().size() == 0) {//entra la clase Congreso que estoy buscando y de hay entra al LinkedList y toma el valor del tamaño y la comparo con 0.
                consultarUnCongreso(identificadorCongreso);
            //}
            //String fechaYHoraInscripcionAux =
        } else {//el numero digitado no existe.
            existe.setText("El identificador digitado NO existe.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    public boolean existeCongreso(String identificadorCongreso) {
        boolean existeCongreso = false;
        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                existeCongreso = true;

            }
        }
        return existeCongreso;
    }

    public static int encontrarPosicionCongreso(String identificadorCongreso) {
        int aux = -1;

        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                aux++;
                break;
            }
        }
        return aux;
    }

    public void consultarUnCongreso(String identificador) {
        String listado = "INFORME DETALLADO DE UN CONGRESO\n";
        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(identificador)) {
                listado += elem.toString() + "\n";
            }
        }
        resultado.setText(listado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel existe;
    private javax.swing.JTextField idtx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
