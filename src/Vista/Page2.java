//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Vista;

import Modelo.Congreso;
import Modelo.Egresado;
import Modelo.Inscripcion;
import static Vista.UsaCongreso.losCongresos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Page2 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    LinkedList<String> deportes = new LinkedList<>();

    public Page2() {
        initComponents();
        opciones.addItem("Ninguno");
        opciones.addItem("Futbol");
        opciones.addItem("Pin-Pon");
        opciones.addItem("Basketball");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fechaHoraI = new javax.swing.JTextField();
        estadoTx = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idEgresado = new javax.swing.JTextField();
        numeroIdEgresado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nombreCompletoTx = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numeroTelefonicoTx = new javax.swing.JTextField();
        emailTx = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        crearBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ultimoNFAtx = new javax.swing.JTextField();
        esEmpresarioTx = new javax.swing.JLabel();
        ultimoNFAtx1 = new javax.swing.JTextField();
        datosInscripcion = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        datosEgresado = new javax.swing.JScrollPane();
        resultadoEgresado = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Crear Inscripcion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el identificador del congreso deseado");

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        existe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Fecha y hora de la inscripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("estado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Identificacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Numero Identificador");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nombre ");

        fechaHoraI.setText("2021-07-01 01:00:00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Datos Egresado");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nombre Completo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Datos Inscripcion");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Numero Telofono");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Email");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Deportes");

        opciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcionesItemStateChanged(evt);
            }
        });
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        crearBtn.setText("CREAR");
        crearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Ultimo Nivel Formacion Alcanzado");

        esEmpresarioTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        esEmpresarioTx.setText("¿Es Empresario?");

        resultado.setColumns(20);
        resultado.setRows(5);
        resultado.setEnabled(false);
        datosInscripcion.setViewportView(resultado);

        resultadoEgresado.setColumns(20);
        resultadoEgresado.setRows(5);
        resultadoEgresado.setEnabled(false);
        datosEgresado.setViewportView(resultadoEgresado);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Debe ser un char");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Debe ser un char");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Inscripcion Creada");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Egresado Creado");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(estadoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9)
                            .addComponent(numeroTelefonicoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroIdEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(idEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(nombreCompletoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(esEmpresarioTx))
                            .addComponent(fechaHoraI)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(crearBtn)
                                .addGap(318, 364, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ultimoNFAtx1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datosEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(ultimoNFAtx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datosInscripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(62, 62, 62))))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idtx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(existe, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addGap(175, 175, 175))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(existe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(idtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscar)))
                        .addGap(30, 30, 30)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fechaHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(estadoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addComponent(datosInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(datosEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(esEmpresarioTx)
                                    .addComponent(ultimoNFAtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(idEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numeroIdEgresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel15)
                                    .addComponent(ultimoNFAtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreCompletoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroTelefonicoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(crearBtn))
                        .addGap(559, 559, 559)
                        .addComponent(jLabel7))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String identificadorCongreso = idtx.getText();
        if (existeCongreso(identificadorCongreso)) {
            existe.setText("el identificador digitado existe");
            int numero = 0;
            if (losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).getSusInscripciones().size() == 0) {//entra la clase Congreso que estoy buscando y de hay entra al LinkedList y toma el valor del tamaño y la comparo con 0.
                numero = 1;

            } else {
                numero = losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).calcularNumeroInscripcion(); //deberia ir un metodo.
            }
            //String fechaYHoraInscripcionAux =
        } else {//el numero digitado no existe.
            existe.setText("el identificador digitado no existe");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesActionPerformed

    private void opcionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcionesItemStateChanged
        //cada vez que yo le haga click a una opcion se viene a ejecutar esta linea.
        //1) En esta linea debo añadir un deporte a mi LinkedList deportes.
        String deporteSelect = (String) opciones.getSelectedItem();
        if (deporteSelect.equals("Futbol") && !deportes.contains("Futbol")) {
            deportes.add("Futbol");
        }
        if (deporteSelect.equals("Pin-Pon") && !deportes.contains("Pin-Pon")) {
            deportes.add("Pin-Pon");
        }
        if (deporteSelect.equals("Basketball") && !deportes.contains("Basketball")) {
            deportes.add("Basketball");
        }

    }//GEN-LAST:event_opcionesItemStateChanged

    private void crearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtnActionPerformed
        //  Inscripcion

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String IdentificadorCongreso = idtx.getText();
        int numero = 0;
        if (losCongresos.get(encontrarPosicionCongreso(IdentificadorCongreso)).getSusInscripciones().size() == 0) {
            numero = 1;
        } else {
            numero = losCongresos.get(encontrarPosicionCongreso(IdentificadorCongreso)).calcularNumeroInscripcion();
        }
        String fechaYHoraInicioAux = fechaHoraI.getText();
        LocalDateTime fechaYHoraInscripcion = LocalDateTime.parse(fechaYHoraInicioAux, formatter);
        char estado = estadoTx.getText().charAt(0);
        //  Egresado
        String tipoIdentificacion = idEgresado.getText();
        int numeroIdentificacion = Integer.parseInt(numeroIdEgresado.getText());
        String nombreCompleto = nombreCompletoTx.getText();
        int numeroTelefonico = Integer.parseInt(numeroTelefonicoTx.getText());
        String email = emailTx.getText();
        // atributo LinkedList
        String ultimoNFA = ultimoNFAtx.getText();
        char esEmpresario = esEmpresarioTx.getText().charAt(0);
        if (deportes.size() == 0) {
            deportes.add("Ninguno");
        }
        // Creando Egresado
        Egresado suEgresado = new Egresado(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefonico, email, deportes, ultimoNFA, esEmpresario);
        Inscripcion nuevaInscripcion = new Inscripcion(numero, fechaYHoraInscripcion, estado, suEgresado);
        agregarInscripcionCongreso(IdentificadorCongreso, nuevaInscripcion);
        resultado.setText("" + nuevaInscripcion.toString());
        resultadoEgresado.setText("" + suEgresado.toString());
        deportes.clear();
        /*
        losCongresos.add(objCongreso);
        resultado.setText("" + objCongreso.toString());*/
    }//GEN-LAST:event_crearBtnActionPerformed

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
        int posicion = -1;
        for (Congreso elem : losCongresos) {
            posicion++;
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                break;
            }
        }
        return posicion;
    }

    public static void agregarInscripcionCongreso(String numeroIdentificadorCongreso, Inscripcion nuevaInscripcion) {

        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(numeroIdentificadorCongreso)) {
                elem.agregarInscripcion(nuevaInscripcion);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscar;
    private javax.swing.JButton crearBtn;
    private javax.swing.JScrollPane datosEgresado;
    private javax.swing.JScrollPane datosInscripcion;
    private javax.swing.JTextField emailTx;
    private javax.swing.JLabel esEmpresarioTx;
    private javax.swing.JTextField estadoTx;
    private javax.swing.JLabel existe;
    private javax.swing.JTextField fechaHoraI;
    private javax.swing.JTextField idEgresado;
    private javax.swing.JTextField idtx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreCompletoTx;
    private javax.swing.JTextField numeroIdEgresado;
    private javax.swing.JTextField numeroTelefonicoTx;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextArea resultadoEgresado;
    private javax.swing.JTextField ultimoNFAtx;
    private javax.swing.JTextField ultimoNFAtx1;
    // End of variables declaration//GEN-END:variables
}
