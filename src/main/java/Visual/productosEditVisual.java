
package Visual;

import Clases.Productos;
import Clases.ProductosDao;
import Clases.Sucursal;
import Clases.SucursalDao;
import java.util.List;

/**
 *
 * @author david
 */
public class productosEditVisual extends javax.swing.JPanel {
    
    Productos prod = new Productos();
    ProductosDao productos = new ProductosDao();
    Sucursal sucu = new Sucursal();
    SucursalDao sucursal = new SucursalDao();
    /**
     * Creates new form productosEditVisual
     */
    public productosEditVisual() {
        initComponents();
        listarCat();
        listarSucur();
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
        Text3 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        Text9 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        ap1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jcCategoria = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtdinero = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jcNomTiendas = new javax.swing.JComboBox<>();
        jtTienda = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Usuarios");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        Text3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text3.setForeground(new java.awt.Color(0, 0, 255));
        Text3.setText("Codigo del producto");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Text6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text6.setForeground(new java.awt.Color(0, 0, 255));
        Text6.setText("Sucursal");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        Text5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text5.setForeground(new java.awt.Color(0, 0, 255));
        Text5.setText("Nombre");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Descripción");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        Text10.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text10.setForeground(new java.awt.Color(0, 0, 255));
        Text10.setText("Categorias");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        Text9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text9.setForeground(new java.awt.Color(0, 0, 255));
        Text9.setText("Cantidad Almacenada");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        Text7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Text7.setForeground(new java.awt.Color(0, 0, 255));
        Text7.setText("Precio Unitario");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        txtCodProd.setBackground(new java.awt.Color(255, 255, 255));
        txtCodProd.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtCodProd.setForeground(new java.awt.Color(0, 0, 0));
        txtCodProd.setBorder(null);
        add(txtCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 250, 20));

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtNombre.setBorder(null);
        add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 260, 20));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 320, -1));

        ap1.setBackground(new java.awt.Color(255, 255, 255));
        ap1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        ap1.setForeground(new java.awt.Color(0, 0, 0));
        ap1.setBorder(null);
        add(ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 160, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 160, 10));

        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });
        add(jcCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 30));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(null);
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 90, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, 10));

        txtdinero.setBackground(new java.awt.Color(255, 255, 255));
        txtdinero.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtdinero.setForeground(new java.awt.Color(0, 0, 0));
        txtdinero.setBorder(null);
        add(txtdinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 80, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 110, 10));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Q");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jcNomTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNomTiendasActionPerformed(evt);
            }
        });
        add(jcNomTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 60, 30));

        jtTienda.setEditable(false);
        jtTienda.setBackground(new java.awt.Color(255, 255, 255));
        jtTienda.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jtTienda.setForeground(new java.awt.Color(0, 0, 0));
        jtTienda.setBorder(null);
        add(jtTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 120, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 130, 10));

        jButton1.setText("Modificar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jButton2.setText("Insertar");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        // TODO add your handling code here:
         ap1.setText(jcCategoria.getSelectedItem().toString());

    }//GEN-LAST:event_jcCategoriaActionPerformed

    private void jcNomTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNomTiendasActionPerformed
        // TODO add your handling code here:
       int nuevo = Integer.parseInt(String.valueOf(jcNomTiendas.getSelectedItem()));
        sucu = sucursal.BuscarSucId(nuevo);
        String idT = sucu.getUbicacion();
        jtTienda.setText(idT);
    }//GEN-LAST:event_jcNomTiendasActionPerformed
    public void listarCat(){
        jcCategoria.removeAllItems();
        List<Productos> listProdu = productos.ListarCat();
        
        for (int i = 0; i < listProdu.size(); i++){
            jcCategoria.addItem(String.valueOf(listProdu.get(i).getCategoria()));
        }
    }

     public void listarSucur(){
        jcNomTiendas.removeAllItems();
        List<Productos> listProdu = productos.ListarIdSur();
        
        for (int i = 0; i < listProdu.size(); i++){
            jcNomTiendas.addItem(String.valueOf(listProdu.get(i).getSucurorigin()));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text9;
    private javax.swing.JTextField ap1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JComboBox<String> jcCategoria;
    public javax.swing.JComboBox<String> jcNomTiendas;
    public javax.swing.JTextField jtNombre;
    public javax.swing.JTextField jtTienda;
    public javax.swing.JTextField txtCodProd;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtdinero;
    // End of variables declaration//GEN-END:variables
}
