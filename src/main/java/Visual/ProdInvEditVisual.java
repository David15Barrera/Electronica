package Visual;

import Clases.Productos;
import Clases.ProductosDao;
import Clases.Sucursal;
import Clases.SucursalDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class ProdInvEditVisual extends javax.swing.JPanel {
 //Declaramos las clases a usar   
    Productos prod = new Productos();
    ProductosDao productos = new ProductosDao();
    Sucursal sucu = new Sucursal();
    SucursalDao sucursal = new SucursalDao();
    /**
     * Creates new form ProdInvEditVisual
     */
    public ProdInvEditVisual() {
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

        txtCodProd = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jbModBod = new javax.swing.JButton();
        jbLimProd = new javax.swing.JButton();
        txtdinero = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Text11 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodProd.setEditable(false);
        txtCodProd.setBackground(new java.awt.Color(255, 255, 255));
        txtCodProd.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtCodProd.setForeground(new java.awt.Color(0, 0, 0));
        txtCodProd.setBorder(null);
        add(txtCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 20));

        Text3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text3.setForeground(new java.awt.Color(0, 0, 255));
        Text3.setText("Codigo del producto");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 250, 20));

        Text5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text5.setForeground(new java.awt.Color(0, 0, 255));
        Text5.setText("Nombre");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jtNombre.setEditable(false);
        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtNombre.setBorder(null);
        add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 260, 20));

        Text10.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text10.setForeground(new java.awt.Color(0, 0, 255));
        Text10.setText("Sucursal");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        ap1.setEditable(false);
        ap1.setBackground(new java.awt.Color(255, 255, 255));
        ap1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        ap1.setForeground(new java.awt.Color(0, 0, 0));
        ap1.setBorder(null);
        add(ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 160, 10));

        jbModBod.setBackground(new java.awt.Color(0, 51, 204));
        jbModBod.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jbModBod.setForeground(new java.awt.Color(255, 255, 255));
        jbModBod.setText("Modificar");
        jbModBod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModBodActionPerformed(evt);
            }
        });
        add(jbModBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 110, 30));

        jbLimProd.setBackground(new java.awt.Color(0, 51, 255));
        jbLimProd.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jbLimProd.setForeground(new java.awt.Color(255, 255, 255));
        jbLimProd.setText("Limpiar");
        jbLimProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimProdActionPerformed(evt);
            }
        });
        add(jbLimProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 100, 30));

        txtdinero.setEditable(false);
        txtdinero.setBackground(new java.awt.Color(255, 255, 255));
        txtdinero.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtdinero.setForeground(new java.awt.Color(0, 0, 0));
        txtdinero.setBorder(null);
        add(txtdinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 80, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 110, 10));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Q");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        Text7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text7.setForeground(new java.awt.Color(0, 0, 255));
        Text7.setText("Precio Unitario");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        Text9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text9.setForeground(new java.awt.Color(0, 0, 255));
        Text9.setText("Cantidad Almacenada");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(null);
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 90, 10));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 320, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Fecha Ingreso");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Ingresos de Productos de Bodega");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        Text11.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text11.setForeground(new java.awt.Color(0, 0, 255));
        Text11.setText("Categoria");
        add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtSucursal.setEditable(false);
        txtSucursal.setBackground(new java.awt.Color(255, 255, 255));
        txtSucursal.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtSucursal.setForeground(new java.awt.Color(0, 0, 0));
        txtSucursal.setBorder(null);
        add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 70, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 70, 10));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Descripción");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 150, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cant");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbModBodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModBodActionPerformed
        // Codigo para modivirar el producto
        String[] opciones = {"SI","NO"};
        if ("".equals(txtCodProd.getText())) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else{
            int n = JOptionPane.showOptionDialog(this,"¿Que Desea Hacer?","Modificar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"");

            if (n == JOptionPane.YES_OPTION) {
                if (!"".equals(txtCodProd.getText()) || !"".equals(jtNombre.getText()) || !"".equals(txtDescripcion.getText()) || !"".equals(ap1.getText()) || !"".equals(txtdinero.getText()) || !"".equals(txtPrecio.getText())) {

                    prod.setSucurorigin(Integer.valueOf(txtSucursal.getText()));
                    prod.setCantidad(Integer.valueOf(txtPrecio.getText()));
                    prod.setFecha(java.sql.Date.valueOf(((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText()));
                    prod.setIdProd(txtCodProd.getText());
                    productos.ModificarProdInv(prod);
                    actualizarBodega();
                    JOptionPane.showMessageDialog(null, "Producto Modificado");
                    limpText();

                }
            }else if (n == JOptionPane.NO_OPTION) {
                //TU CODIGO SI NO
                System.out.print("Error 400");
                JOptionPane.showMessageDialog(null, "Proceso Cancelado");
            }
        }
    }//GEN-LAST:event_jbModBodActionPerformed
    
//Metodo para actuzaliar el precio del prodcuto dentro de la base de datos bodega/inventario
    public void actualizarBodega(){
        int nuevo = Integer.valueOf(txtPrecio.getText());
        int anterior = Integer.valueOf(jLabel5.getText());
        String cod = txtCodProd.getText();
        prod = productos.BuscarPro(cod);

        int StockPrimero = nuevo - anterior;
        int StockActual = prod.getStock() - StockPrimero; 
        productos.ActualizarStock(StockActual, cod);
    }

//Metodos para limpiar     
    private void jbLimProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimProdActionPerformed
        // TODO add your handling code here:}
        limpText();
    }//GEN-LAST:event_jbLimProdActionPerformed
    public void limpText(){
        txtCodProd.setText("");
        jtNombre.setText("");
        txtPrecio.setText("");
        txtdinero.setText("");
        txtDescripcion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text9;
    public javax.swing.JTextField ap1;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbLimProd;
    private javax.swing.JButton jbModBod;
    public javax.swing.JTextField jtNombre;
    public javax.swing.JTextField txtCodProd;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtSucursal;
    public javax.swing.JTextField txtdinero;
    // End of variables declaration//GEN-END:variables
}
