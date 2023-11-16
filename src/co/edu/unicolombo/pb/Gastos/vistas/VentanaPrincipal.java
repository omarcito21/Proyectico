/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.pb.Gastos.vistas;

import co.edu.unicolombo.pb.Gastos.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        BarraMenu = new javax.swing.JMenuBar();
        MenuCliente = new javax.swing.JMenu();
        itemIniciarSesionCliente = new javax.swing.JMenuItem();
        itemAgregarCliente = new javax.swing.JMenuItem();
        itemConsultarCliente = new javax.swing.JMenuItem();
        itemEditarCliente = new javax.swing.JMenuItem();
        itemEliminarCliente = new javax.swing.JMenuItem();
        subMenuReporteCliente = new javax.swing.JMenu();
        itemBuscarClienteNombre = new javax.swing.JMenuItem();
        itemBuscarClienteCorreo = new javax.swing.JMenuItem();
        itemBuscarClienteTelefono = new javax.swing.JMenuItem();
        itemTodosClientes = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        itemAgregarProducto = new javax.swing.JMenuItem();
        itemConsultarProducto = new javax.swing.JMenuItem();
        itemEditarProducto = new javax.swing.JMenuItem();
        itemEliminarProducto = new javax.swing.JMenuItem();
        subMenuReporteProducto = new javax.swing.JMenu();
        itemBuscarProductoNombre = new javax.swing.JMenuItem();
        itemBuscarProductoValor = new javax.swing.JMenuItem();
        itemBuscarProductoFecha = new javax.swing.JMenuItem();
        itemBuscarProductoDescripcion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Productos");

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Cliente48px.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });

        itemIniciarSesionCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemIniciarSesionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Login24px.png"))); // NOI18N
        itemIniciarSesionCliente.setText("Iniciar sesion..");
        itemIniciarSesionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemIniciarSesionCliente);

        itemAgregarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Agregar24px.png"))); // NOI18N
        itemAgregarCliente.setText("Agregar Cliente..");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemAgregarCliente);

        itemConsultarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Buscar24px.png"))); // NOI18N
        itemConsultarCliente.setText("Consultar Datos..");
        itemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemConsultarCliente);

        itemEditarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Editar24px.png"))); // NOI18N
        itemEditarCliente.setText("Editar datos..");
        MenuCliente.add(itemEditarCliente);

        itemEliminarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Eliminar24px.png"))); // NOI18N
        itemEliminarCliente.setText("Eliminar cliente..");
        MenuCliente.add(itemEliminarCliente);

        subMenuReporteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Reporte48px.png"))); // NOI18N
        subMenuReporteCliente.setText("Reportes..");

        itemBuscarClienteNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/define-name-icon.png"))); // NOI18N
        itemBuscarClienteNombre.setText("Nombres..");
        subMenuReporteCliente.add(itemBuscarClienteNombre);

        itemBuscarClienteCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Mail-icon.png"))); // NOI18N
        itemBuscarClienteCorreo.setText("Correo..");
        subMenuReporteCliente.add(itemBuscarClienteCorreo);

        itemBuscarClienteTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Phone-icon.png"))); // NOI18N
        itemBuscarClienteTelefono.setText("Telefono..");
        itemBuscarClienteTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemBuscarClienteTelefono.setIconTextGap(1);
        subMenuReporteCliente.add(itemBuscarClienteTelefono);

        itemTodosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/define-name-icon.png"))); // NOI18N
        itemTodosClientes.setText("Todo..");
        itemTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTodosClientesActionPerformed(evt);
            }
        });
        subMenuReporteCliente.add(itemTodosClientes);

        MenuCliente.add(subMenuReporteCliente);

        BarraMenu.add(MenuCliente);

        MenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Producto48px.png"))); // NOI18N
        MenuProducto.setText("Producto");
        MenuProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAgregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/AgregarProducto48px.png"))); // NOI18N
        itemAgregarProducto.setText("Agregar productos..");
        MenuProducto.add(itemAgregarProducto);

        itemConsultarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Buscar24px.png"))); // NOI18N
        itemConsultarProducto.setText("Consultar sus productos..");
        MenuProducto.add(itemConsultarProducto);

        itemEditarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Editar24px.png"))); // NOI18N
        itemEditarProducto.setText("Editar sus productos ..");
        MenuProducto.add(itemEditarProducto);

        itemEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/EliminarProducto48px.png"))); // NOI18N
        itemEliminarProducto.setText("Eliminar sus productos..");
        itemEliminarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuProducto.add(itemEliminarProducto);

        subMenuReporteProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Reporte48px.png"))); // NOI18N
        subMenuReporteProducto.setText("Reportes..");

        itemBuscarProductoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBuscarProductoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/define-name-icon.png"))); // NOI18N
        itemBuscarProductoNombre.setText("Nombres..");
        itemBuscarProductoNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        subMenuReporteProducto.add(itemBuscarProductoNombre);

        itemBuscarProductoValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBuscarProductoValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/price-icon_1.png"))); // NOI18N
        itemBuscarProductoValor.setText("Valor..");
        subMenuReporteProducto.add(itemBuscarProductoValor);

        itemBuscarProductoFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBuscarProductoFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Fecha24px.png"))); // NOI18N
        itemBuscarProductoFecha.setText("Fecha..");
        itemBuscarProductoFecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        itemBuscarProductoFecha.setIconTextGap(1);
        subMenuReporteProducto.add(itemBuscarProductoFecha);

        itemBuscarProductoDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBuscarProductoDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Descripcion24px.png"))); // NOI18N
        itemBuscarProductoDescripcion.setText("Descripcion..");
        itemBuscarProductoDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        itemBuscarProductoDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        itemBuscarProductoDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarProductoDescripcionActionPerformed(evt);
            }
        });
        subMenuReporteProducto.add(itemBuscarProductoDescripcion);

        MenuProducto.add(subMenuReporteProducto);

        BarraMenu.add(MenuProducto);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/Gastos/vistas/iconos/Ayuda48px.png"))); // NOI18N
        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem17.setText("Acerca de..");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        BarraMenu.add(jMenu3);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIniciarSesionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIniciarSesionClienteActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
        VentanaClientes ventana = new VentanaClientes(this,true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void itemBuscarProductoDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarProductoDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarProductoDescripcionActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void itemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarClienteActionPerformed
      itemAgregarClienteActionPerformed (evt);
    }//GEN-LAST:event_itemConsultarClienteActionPerformed

    private void itemTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTodosClientesActionPerformed
              if(Cliente.ClientesBD == null || Cliente.ClientesBD.isEmpty()){
             JOptionPane.showMessageDialog(this, " No existe cliente en el sistema"
                     , " Resultado negativo ", JOptionPane.WARNING_MESSAGE);
             return;
             
         }
        
        VentanaReporteCliente Ventana = new VentanaReporteCliente(this,true);
        Ventana.setLocationRelativeTo(this);
        Ventana.setVisible(true);
    }//GEN-LAST:event_itemTodosClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenuItem itemAgregarCliente;
    private javax.swing.JMenuItem itemAgregarProducto;
    private javax.swing.JMenuItem itemBuscarClienteCorreo;
    private javax.swing.JMenuItem itemBuscarClienteNombre;
    private javax.swing.JMenuItem itemBuscarClienteTelefono;
    private javax.swing.JMenuItem itemBuscarProductoDescripcion;
    private javax.swing.JMenuItem itemBuscarProductoFecha;
    private javax.swing.JMenuItem itemBuscarProductoNombre;
    private javax.swing.JMenuItem itemBuscarProductoValor;
    private javax.swing.JMenuItem itemConsultarCliente;
    private javax.swing.JMenuItem itemConsultarProducto;
    private javax.swing.JMenuItem itemEditarCliente;
    private javax.swing.JMenuItem itemEditarProducto;
    private javax.swing.JMenuItem itemEliminarCliente;
    private javax.swing.JMenuItem itemEliminarProducto;
    private javax.swing.JMenuItem itemIniciarSesionCliente;
    private javax.swing.JMenuItem itemTodosClientes;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenu subMenuReporteCliente;
    private javax.swing.JMenu subMenuReporteProducto;
    // End of variables declaration//GEN-END:variables
}