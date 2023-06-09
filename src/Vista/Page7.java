//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Vista;

import Modelo.Congreso;
import Modelo.Lugar;
import static Vista.UsaCongreso.losCongresos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Page7 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Page7() {
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
        buscar = new javax.swing.JButton();
        auxiliar = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Recuperar Archivo Texto");

        buscar.setText("RECUPERAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        auxiliar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(buscar)
                    .addComponent(auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(681, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(180, 180, 180)
                .addComponent(auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        losCongresos.clear();
        recuperarDesdeArchivoTexto();
        auxiliar.setText("Exito, datos recuperados correctamente.");
    }//GEN-LAST:event_buscarActionPerformed
    public static void recuperarDesdeArchivoTexto() {
        try {
            //Se define el archivo desde el cual se extrae la informacion.
            String nombreArchivo = "datosCongreso.txt";
            //Se crea el flujo de entrada.
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            //se declaran datos para almacenar informacion extraida del archivo.
            String[] datosC;
            String linea;
            String identificador;
            String nombre;
            String fechaYHoraInicio;
            String fechaYHoraTerminacion;
            String nombreOrganizador;
            //String suLugar;
            String nombreLugar;
            String direccion;
            String ciudad;
            //Se procesa cada linea del archivo para extraer informacion.
            while ((linea = entrada.readLine()) != null) {
                //Separa cada dato de la cadena leida, usando el formato utilizado al guardar.
                datosC = linea.split("--");
                //Captura los datos y almacenarlos en losCongresos
                identificador = datosC[0];
                nombre = datosC[1];
                fechaYHoraInicio = datosC[2];
                fechaYHoraTerminacion = datosC[3];
                nombreOrganizador = datosC[4];
                nombreLugar = datosC[5];
                direccion = datosC[6];
                ciudad = datosC[7];
                LocalDateTime fechaYHoraInicioaux = LocalDateTime.parse(fechaYHoraInicio);
                LocalDateTime fechaYHoraTerminacionaux = LocalDateTime.parse(fechaYHoraTerminacion);

                Lugar suLugar = new Lugar(nombreLugar, direccion, ciudad);
                losCongresos.add(new Congreso(identificador, nombre, fechaYHoraInicioaux, fechaYHoraTerminacionaux, nombreOrganizador, suLugar));
            }

            entrada.close();
        } catch (IOException e) {
            //error
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auxiliar;
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
