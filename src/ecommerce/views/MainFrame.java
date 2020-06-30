/*
* To change this license header, choose License Headers in Project
Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package ecommerce.views;

/**
 *
 * @author hungv
 */
public class MainFrame extends javax.swing.JFrame {
    
    private static MainFrame instance = null;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        instance = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_Search = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        banner = new javax.swing.JScrollPane();
        jLabel_bannerDemo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1349, 737));
        setResizable(false);
        setSize(new java.awt.Dimension(1349, 737));

        headerBar.setMaximumSize(new java.awt.Dimension(1349, 194));
        headerBar.setMinimumSize(new java.awt.Dimension(1349, 194));
        headerBar.setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setBackground(new java.awt.Color(24, 158, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Search.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField_Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 238, 242)));
        jTextField_Search.setMaximumSize(new java.awt.Dimension(432, 40));
        jTextField_Search.setMinimumSize(new java.awt.Dimension(432, 40));
        jTextField_Search.setPreferredSize(new java.awt.Dimension(432, 40));
        jPanel1.add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 432, 40));

        jLabel24.setBackground(new java.awt.Color(237, 238, 242));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon7.png"))); // NOI18N
        jLabel24.setText("Tìm kiếm");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 238, 242)));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setMaximumSize(new java.awt.Dimension(115, 40));
        jLabel24.setMinimumSize(new java.awt.Dimension(115, 40));
        jLabel24.setPreferredSize(new java.awt.Dimension(115, 40));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 110, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon11.png"))); // NOI18N
        jLabel25.setText("<html>Giỏ hàng</html>");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 238, 242), 2));
        jLabel25.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel25.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel25.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 50, 100, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon8.png"))); // NOI18N
        jLabel26.setText("<html>Theo dõi đơn hàng</html>");
        jLabel26.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel26.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel26.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 90, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon9.png"))); // NOI18N
        jLabel27.setText("<html>Thông báo của tôi</html>");
        jLabel27.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel27.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel27.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 100, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon10.png"))); // NOI18N
        jLabel28.setText("<html>Đăng nhập Tài khoản</html>");
        jLabel28.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel28.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel28.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 100, 40));

        headerBar.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(24, 158, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(24, 158, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/iconMenu.png"))); // NOI18N
        jLabel18.setText("DANH MỤC SẢN PHẨM");
        jLabel18.setMaximumSize(new java.awt.Dimension(174, 30));
        jLabel18.setMinimumSize(new java.awt.Dimension(174, 30));
        jLabel18.setPreferredSize(new java.awt.Dimension(174, 30));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 174, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon1.png"))); // NOI18N
        jLabel17.setText("Bạn muốn giao hàng tới đâu?");
        jLabel17.setMaximumSize(new java.awt.Dimension(213, 30));
        jLabel17.setMinimumSize(new java.awt.Dimension(213, 30));
        jLabel17.setPreferredSize(new java.awt.Dimension(213, 40));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 210, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon5.png"))); // NOI18N
        jLabel19.setText("<html>30 ngày đổi trả</html>");
        jLabel19.setMaximumSize(new java.awt.Dimension(104, 30));
        jLabel19.setMinimumSize(new java.awt.Dimension(104, 30));
        jLabel19.setPreferredSize(new java.awt.Dimension(104, 30));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 40, 110, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon6.png"))); // NOI18N
        jLabel20.setText("Sản phẩm đã xem");
        jLabel20.setMaximumSize(new java.awt.Dimension(104, 30));
        jLabel20.setMinimumSize(new java.awt.Dimension(104, 30));
        jLabel20.setPreferredSize(new java.awt.Dimension(104, 30));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 140, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon2.png"))); // NOI18N
        jLabel21.setText("<html>Giao hàng nhanh 2h & hôm sau</html>");
        jLabel21.setMaximumSize(new java.awt.Dimension(104, 30));
        jLabel21.setMinimumSize(new java.awt.Dimension(104, 30));
        jLabel21.setPreferredSize(new java.awt.Dimension(104, 30));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 190, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon3.png"))); // NOI18N
        jLabel22.setText("<html>Thực phẩm tươi sống</html>");
        jLabel22.setMaximumSize(new java.awt.Dimension(104, 30));
        jLabel22.setMinimumSize(new java.awt.Dimension(104, 30));
        jLabel22.setPreferredSize(new java.awt.Dimension(104, 30));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 150, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon/icon4.png"))); // NOI18N
        jLabel23.setText("<html>Sản phẩm chính hiệu</html>");
        jLabel23.setMaximumSize(new java.awt.Dimension(104, 30));
        jLabel23.setMinimumSize(new java.awt.Dimension(104, 30));
        jLabel23.setPreferredSize(new java.awt.Dimension(104, 30));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 110, 40));

        headerBar.add(jPanel2);

        getContentPane().add(headerBar, java.awt.BorderLayout.PAGE_START);

        menuBar.setMaximumSize(new java.awt.Dimension(244, 543));
        menuBar.setMinimumSize(new java.awt.Dimension(244, 543));
        menuBar.setPreferredSize(new java.awt.Dimension(244, 543));
        menuBar.setLayout(new java.awt.GridLayout(16, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Điện Thoại - Máy Tính Bảng");
        menuBar.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Điện Tử - Điện Lạnh");
        menuBar.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phụ Kiện - Thiết Bị Số");
        menuBar.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Laptop - Thiết bị IT");
        menuBar.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Máy Ảnh - Quay Phim");
        menuBar.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Điện Gia Dụng");
        menuBar.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nhà Cửa Đời Sống");
        menuBar.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hàng Tiêu Dùng - Thực Phẩm");
        menuBar.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Đồ chơi, Mẹ & Bé");
        menuBar.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Làm Đẹp - Sức Khỏe");
        menuBar.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thời trang - Phụ kiện");
        menuBar.add(jLabel11);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thời trang - Phụ kiện");
        menuBar.add(jLabel12);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Thể Thao - Dã Ngoại");
        menuBar.add(jLabel13);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Xe Máy, Ô tô, Xe Đạp");
        menuBar.add(jLabel14);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hàng quốc tế");
        menuBar.add(jLabel15);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Voucher - Dịch Vụ - Thẻ Cào");
        menuBar.add(jLabel16);

        getContentPane().add(menuBar, java.awt.BorderLayout.LINE_START);

        banner.setBackground(new java.awt.Color(255, 255, 255));
        banner.setBorder(null);
        banner.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        banner.setMaximumSize(new java.awt.Dimension(1013, 543));
        banner.setMinimumSize(new java.awt.Dimension(1013, 543));

        jLabel_bannerDemo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_bannerDemo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_bannerDemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/banner/bannerDemo.png"))); // NOI18N
        jLabel_bannerDemo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_bannerDemo.setMaximumSize(new java.awt.Dimension(1013, 543));
        jLabel_bannerDemo.setMinimumSize(new java.awt.Dimension(1013, 543));
        jLabel_bannerDemo.setPreferredSize(new java.awt.Dimension(1013, 543));
        banner.setViewportView(jLabel_bannerDemo);

        getContentPane().add(banner, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hiện thị LoginForm
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new LoginForm().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel28MouseClicked

    public static MainFrame getInstance(){
        return instance;
    }
    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        System.out.println("Đang tìm kiếm. Vui lòng đợi...");
        jTextField_Search.setText("");
    }// GEN-LAST:event_jLabel24MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info
//                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException
//                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
//                    null, ex);
//        }
////</editor-fold>
//
////</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new MainFrame().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane banner;
    private javax.swing.JPanel headerBar;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_bannerDemo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JPanel menuBar;
    // End of variables declaration//GEN-END:variables
}
