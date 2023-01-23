package __View__;
import infectedclown.PL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Optional;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
public class __Class__ extends javax.swing.JFrame {
    public __Class__() {
        initComponents();
                ImageIcon img = new ImageIcon(getClass().getResource( "/__Asset__/icon.png"));
    this.setIconImage(img.getImage());
         Toolkit tk = this.getToolkit();
    Dimension dim = tk.getScreenSize();
    this.setLocation (
            (int) dim.getWidth() / 2 - this.getWidth() /2, 
            (int) dim.getHeight() / 2 - this.getHeight() / 2);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        OF1 = new javax.swing.JTextField();
        ff = new javax.swing.JButton();
        SF1 = new javax.swing.JButton();
        JP1 = new javax.swing.JProgressBar();
        oo = new javax.swing.JButton();
        JF1 = new javax.swing.JTextField();
        s = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plague");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));

        l1.setBackground(new java.awt.Color(0, 0, 0,100));
        l1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 204, 204));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/InfectedClown_3.jpg"))); // NOI18N
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        OF1.setBackground(new java.awt.Color(0, 0, 0));
        OF1.setForeground(new java.awt.Color(255, 255, 255));

        ff.setBackground(new java.awt.Color(255, 255, 255));
        ff.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ff.setForeground(new java.awt.Color(0, 0, 0));
        ff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/InfectedClown.png"))); // NOI18N
        ff.setText("Java File ");
        ff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SF1.setBackground(new java.awt.Color(0, 0, 0));
        SF1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        SF1.setForeground(new java.awt.Color(255, 255, 255));
        SF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/InfectedClown_2.png"))); // NOI18N
        SF1.setText("Obfuscate");
        SF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFActionPerformed(evt);
            }
        });

        JP1.setBackground(new java.awt.Color(0, 0, 0));
        JP1.setForeground(new java.awt.Color(0, 0, 102));
        JP1.setString("");

        oo.setBackground(new java.awt.Color(255, 255, 255));
        oo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        oo.setForeground(new java.awt.Color(0, 0, 0));
        oo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/InfectedClown.png"))); // NOI18N
        oo.setText("Output File ");
        oo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JF1.setBackground(new java.awt.Color(0, 0, 0));
        JF1.setForeground(new java.awt.Color(255, 255, 255));

        tp1.setBackground(new java.awt.Color(0, 0, 0));
        tp1.setFont(new java.awt.Font("Sitka Heading", 0, 10)); // NOI18N
        tp1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tp1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ff, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OF1)
                    .addComponent(JF1)
                    .addComponent(jScrollPane2)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SF1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(419, Short.MAX_VALUE)
                    .addComponent(SF1)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 260, 510);
    }// </editor-fold>//GEN-END:initComponents
public Optional<String> GET(String filename) {
    return Optional.ofNullable(filename)
      .filter(f -> f.contains("."))
      .map(f -> f.substring(filename.lastIndexOf(".") + 1));
}
    private int wr(String P,String C) throws IOException{

    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(P), "utf-8"))) {
   writer.write(C);
}
    return 1;}
    private void SFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFActionPerformed
        if(!tp1.getText().isEmpty()&& !OF1.getText().isEmpty()){
            if("Optional[java]".equals(GET(OF1.getText()).toString())){
                String OBF = new PL(tp1.getText()).Obf();
                    try {
                        wr(OF1.getText(),OBF);
                    } catch (IOException ex) {
                        Logger.getLogger(__Class__.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    iterate();}
            else {                
                String OBF = new PL(tp1.getText()).Obf();
                    try {
                        wr(OF1.getText()+".java",OBF);
                    } catch (IOException ex) {
                        Logger.getLogger(__Class__.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    iterate();}
        }
    }//GEN-LAST:event_SFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String e = Open();
            if(e!=null){
            String Cod = re(e);
            JF1.setText(e);
            tp1.setText(Cod);}
        } catch (IOException ex) {
            Logger.getLogger(__Class__.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String e = Save();
        if(e!=null){
        OF1.setText(e);}
    }//GEN-LAST:event_jButton3ActionPerformed
   public void iterate(){
    int i = 0;
    Random rand = new Random();
    JP1.setForeground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
while(i<=2000){    
  JP1.setValue(i);    
  i=i+20; }   
  try{Thread.sleep(2000);}catch(InterruptedException e){}    
}    private String re(String Url) throws FileNotFoundException, IOException{
    try(BufferedReader br = new BufferedReader(new FileReader(Url))) {
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    return sb.toString();
}}
    private String Open(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            final JFileChooser _ = new JFileChooser();
            _.setFileSelectionMode( JFileChooser.FILES_ONLY );
            _.setAcceptAllFileFilterUsed(false);
            _.setFileFilter(new FileNameExtensionFilter("Java File", "java"));
            int returnVal = _.showOpenDialog( this );
            if( returnVal == JFileChooser.APPROVE_OPTION ) {
                return _.getSelectedFile().getAbsolutePath();
                }   
            else {return null;}} 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(__Class__.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }}
    private String Save(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           final JFileChooser _ = new JFileChooser();
           _.setFileSelectionMode( JFileChooser.FILES_ONLY );
           _.setAcceptAllFileFilterUsed(false);
           _.setFileFilter(new FileNameExtensionFilter("Java File", "java"));
           int returnVal = _.showSaveDialog(this );
           if( returnVal == JFileChooser.APPROVE_OPTION ) {
                return _.getSelectedFile().getAbsolutePath();
                }
            else {return null;}} 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(__Class__.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       }
    public void run() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__Class__.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new __Class__().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JF1;
    private javax.swing.JProgressBar JP1;
    private javax.swing.JTextField OF1;
    private javax.swing.JButton SF1;
    private javax.swing.JButton ff;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JButton oo;
    private javax.swing.JSeparator s;
    private javax.swing.JTextPane tp1;
    // End of variables declaration//GEN-END:variables
}
