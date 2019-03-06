     package br.com.guikar.netbeans.ufc.poo.eclusa.view;

import java.awt.Image;
import javax.swing.ImageIcon;

public class JfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JfPrincipal
     */
    public JfPrincipal() {
        initComponents();
        long tempo=15;
        ImageIcon image=new ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/CargueiroRioMar.png"));
        image.setImage(image.getImage().getScaledInstance(LbNavio.getWidth(), LbNavio.getHeight(), Image.SCALE_DEFAULT));
        LbNavio.setIcon(image);
        image=new ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/LanchaMarRio.png"));
        image.setImage(image.getImage().getScaledInstance(LbBarco1.getWidth(), LbBarco1.getHeight(), Image.SCALE_DEFAULT));
        LbBarco1.setIcon(image);
        image=new ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/LanchaMarRio.png"));
        image.setImage(image.getImage().getScaledInstance(LbBarco2.getWidth(), LbBarco2.getHeight(), Image.SCALE_DEFAULT));
        LbBarco2.setIcon(image);
        //Rio para Eclusa
        Thread rioEclusa = new Thread(){
            public void run(){
                int x = -280;//posicao inicial do panel
                while(true){
                    x++;
                    if(x > 370){
                        break;
                    }
                    LbNavio.setLocation(x, 140);//posicao que vai ficar o panel
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        rioEclusa.start();
        
        //subir
        Thread subirRio = new Thread(){
            public void run(){
                try {
                    rioEclusa.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 80;
                int y = 210;
                while(true){
                    alt++;
                    y--;
                    if(alt > 140 && y < 150){
                        break;
                    }
                    PnlRio.setLocation(360, y);
                    PnlRio.setSize(10, alt);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        subirRio.start();
        
        //encher
        Thread encher = new Thread(){
            public void run(){
                try {
                    subirRio.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 80;//tamanho incial do panel
                int y = 210;//posicao inicial do panel
                int yNavio = 130;
                while(true){
                    alt++;
                    y--;
                    yNavio--;
                    if(alt > 140 && y < 150 && yNavio < 70){
                        break;
                    }
                    PnlEclusa.setLocation(370, y);//posicao que vai ficar o panel
                    PnlEclusa.setSize(280, alt);//tamanho ique vai ficar o panel
                    LbNavio.setLocation(370, yNavio);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        encher.start();
        
       //descer
        Thread descerMar = new Thread(){
            public void run(){
                try {
                    encher.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 140;
                int y = 150;
                while(true){
                    alt--;
                    y++;
                    if(alt < 80 && y > 210){
                        break;
                    }
                    PnlMar.setLocation(650, y);
                    PnlMar.setSize(10, alt);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        descerMar.start();
        
        //Eclusa Mar
        Thread eclusaMar = new Thread(){
            public void run(){
                try {
                    descerMar.join();
                } catch (InterruptedException ex) {
                    
                }
                int x = 370;//posicao inicial do panel
                while(true){
                    x++;
                    if(x > 1020){
                        break;
                    }
                    LbNavio.setLocation(x, 70);//posicao que vai ficar o panel
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        eclusaMar.start();
        
        //Mar Eclusa
        Thread marEclusa = new Thread(){
            public void run(){
                try {
                    eclusaMar.join();
                } catch (InterruptedException ex) {
                    
                }
                int xBarco1 = 1020;
                int xBarco2 = 1020;
                while(true){
                    xBarco1--;
                    if(xBarco1 < 880)
                        xBarco2--;
                    if(xBarco1 < 370 && xBarco2 < 510){
                        break;
                    }
                    LbBarco1.setLocation(xBarco1, 65);
                    LbBarco2.setLocation(xBarco2, 65);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        marEclusa.start();
        
        //subir
        Thread subirMar = new Thread(){
            public void run(){
                try {
                    marEclusa.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 80;
                int y = 210;
                while(true){
                    alt++;
                    y--;
                    if(alt > 140 && y < 150){
                        break;
                    }
                    PnlMar.setLocation(650, y);
                    PnlMar.setSize(10, alt);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        subirMar.start();
        
        //secar
        Thread secar = new Thread(){
            public void run(){
                try {
                    subirMar.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 140;//tamanho incial do panel
                int y = 150;//posicao inicial do panel
                int yBarco1 = 70;
                int yBarco2 = 70;
                while(true){
                    alt--;
                    y++;
                    yBarco1++;
                    yBarco2++;
                    if(alt < 80 && y > 210 && yBarco1 > 130 && yBarco2 > 130){
                        break;
                    }
                    PnlEclusa.setLocation(370, y);//posicao que vai ficar o panel
                    PnlEclusa.setSize(280, alt);//tamanho ique vai ficar o panel
                    LbBarco1.setLocation(370, yBarco1);
                    LbBarco2.setLocation(510, yBarco2);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        secar.start();
        
        //descer
        Thread descerRio = new Thread(){
            public void run(){
                try {
                    secar.join();
                } catch (InterruptedException ex) {
                    
                }
                int alt = 140;
                int y = 150;
                while(true){
                    alt--;
                    y++;
                    if(alt < 80 && y > 210){
                        break;
                    }
                    PnlRio.setLocation(360, y);
                    PnlRio.setSize(10, alt);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        descerRio.start();
        
        //Eclusa Rio
        Thread eclusaRio = new Thread(){
            public void run(){
                try {
                    descerRio.join();
                } catch (InterruptedException ex) {
                    
                }
                int xBarco1 = 370;
                int xBarco2 = 510;
                while(true){
                    xBarco1--;
                    xBarco2--;
                    if(xBarco1 < -420 && xBarco2 < -280){
                        break;
                    }
                    LbBarco1.setLocation(xBarco1, 130);
                    LbBarco2.setLocation(xBarco2, 130);
                    try{
                        sleep(tempo);
                    }catch(Exception e){
                    
                    }
                }
            }
        };
        eclusaRio.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        LbNavio = new javax.swing.JLabel();
        LbBarco1 = new javax.swing.JLabel();
        LbBarco2 = new javax.swing.JLabel();
        PnlEclusa = new javax.swing.JPanel();
        PnlMar = new javax.swing.JPanel();
        PnlRio = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ProgStatus = new javax.swing.JProgressBar();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbHora = new javax.swing.JLabel();
        LbMin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LbSeg = new javax.swing.JLabel();
        LbStatus = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblMar = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblRio = new javax.swing.JTable();
        BtnRmRio = new javax.swing.JButton();
        BtnAltRio = new javax.swing.JButton();
        BtnRmMar = new javax.swing.JButton();
        BtnAltMar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(1025, 730));
        setResizable(false);
        setSize(new java.awt.Dimension(1019, 720));
        getContentPane().setLayout(null);

        LbNavio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/CargueiroRioMar.png"))); // NOI18N
        getContentPane().add(LbNavio);
        LbNavio.setBounds(-280, 130, 280, 100);

        LbBarco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/LanchaMarRioteste.png"))); // NOI18N
        getContentPane().add(LbBarco1);
        LbBarco1.setBounds(1020, 65, 200, 150);

        LbBarco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guikar/netbeans/ufc/poo/eclusa/images/LanchaMarRioteste.png"))); // NOI18N
        getContentPane().add(LbBarco2);
        LbBarco2.setBounds(1020, 65, 200, 150);

        PnlEclusa.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout PnlEclusaLayout = new javax.swing.GroupLayout(PnlEclusa);
        PnlEclusa.setLayout(PnlEclusaLayout);
        PnlEclusaLayout.setHorizontalGroup(
            PnlEclusaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        PnlEclusaLayout.setVerticalGroup(
            PnlEclusaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PnlEclusa);
        PnlEclusa.setBounds(370, 210, 280, 80);

        PnlMar.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PnlMarLayout = new javax.swing.GroupLayout(PnlMar);
        PnlMar.setLayout(PnlMarLayout);
        PnlMarLayout.setHorizontalGroup(
            PnlMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        PnlMarLayout.setVerticalGroup(
            PnlMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(PnlMar);
        PnlMar.setBounds(650, 150, 10, 140);

        PnlRio.setBackground(new java.awt.Color(153, 153, 153));
        PnlRio.setName("PnlRio"); // NOI18N
        PnlRio.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout PnlRioLayout = new javax.swing.GroupLayout(PnlRio);
        PnlRio.setLayout(PnlRioLayout);
        PnlRioLayout.setHorizontalGroup(
            PnlRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        PnlRioLayout.setVerticalGroup(
            PnlRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PnlRio);
        PnlRio.setBounds(360, 210, 10, 80);

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(660, 150, 360, 140);

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 210, 360, 80);
        getContentPane().add(ProgStatus);
        ProgStatus.setBounds(590, 390, 250, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 290, 1020, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Status Eclusa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 350, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Gestão Eclusa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 10, 270, 50);

        LbHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbHora.setText("01");
        getContentPane().add(LbHora);
        LbHora.setBounds(130, 380, 40, 30);

        LbMin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbMin.setText("12");
        getContentPane().add(LbMin);
        LbMin.setBounds(180, 380, 40, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText(":");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 380, 20, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 380, 20, 29);

        LbSeg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbSeg.setText("50");
        getContentPane().add(LbSeg);
        LbSeg.setBounds(240, 380, 40, 30);

        LbStatus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbStatus.setText("Secando");
        getContentPane().add(LbStatus);
        LbStatus.setBounds(870, 390, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Informações");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(430, 290, 250, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Fila das Embarcações do Mar");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 470, 200, 17);

        TblMar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Carga Máxima", "Porto Origem", "Porto Destino", "Capitão", "Largura", "Altura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblMar.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TblMar);
        if (TblMar.getColumnModel().getColumnCount() > 0) {
            TblMar.getColumnModel().getColumn(0).setMinWidth(35);
            TblMar.getColumnModel().getColumn(0).setPreferredWidth(35);
            TblMar.getColumnModel().getColumn(0).setMaxWidth(35);
            TblMar.getColumnModel().getColumn(1).setMinWidth(80);
            TblMar.getColumnModel().getColumn(1).setPreferredWidth(80);
            TblMar.getColumnModel().getColumn(1).setMaxWidth(80);
            TblMar.getColumnModel().getColumn(2).setMinWidth(80);
            TblMar.getColumnModel().getColumn(2).setPreferredWidth(80);
            TblMar.getColumnModel().getColumn(2).setMaxWidth(80);
            TblMar.getColumnModel().getColumn(3).setMinWidth(80);
            TblMar.getColumnModel().getColumn(3).setPreferredWidth(80);
            TblMar.getColumnModel().getColumn(3).setMaxWidth(80);
            TblMar.getColumnModel().getColumn(4).setMinWidth(60);
            TblMar.getColumnModel().getColumn(4).setPreferredWidth(60);
            TblMar.getColumnModel().getColumn(4).setMaxWidth(60);
            TblMar.getColumnModel().getColumn(5).setMinWidth(50);
            TblMar.getColumnModel().getColumn(5).setPreferredWidth(50);
            TblMar.getColumnModel().getColumn(5).setMaxWidth(50);
            TblMar.getColumnModel().getColumn(6).setMinWidth(50);
            TblMar.getColumnModel().getColumn(6).setPreferredWidth(50);
            TblMar.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 510, 450, 120);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Fila das Embarcações do Rio");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(160, 470, 200, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Previsão de tempo para atender todas as embarcações");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 350, 380, 17);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 690, 1020, 20);

        TblRio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Carga Máxima", "Porto Origem", "Porto Destino", "Capitão", "Largura", "Altura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblRio.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TblRio);
        if (TblRio.getColumnModel().getColumnCount() > 0) {
            TblRio.getColumnModel().getColumn(0).setMinWidth(35);
            TblRio.getColumnModel().getColumn(0).setPreferredWidth(35);
            TblRio.getColumnModel().getColumn(0).setMaxWidth(35);
            TblRio.getColumnModel().getColumn(1).setMinWidth(80);
            TblRio.getColumnModel().getColumn(1).setPreferredWidth(80);
            TblRio.getColumnModel().getColumn(1).setMaxWidth(80);
            TblRio.getColumnModel().getColumn(2).setMinWidth(80);
            TblRio.getColumnModel().getColumn(2).setPreferredWidth(80);
            TblRio.getColumnModel().getColumn(2).setMaxWidth(80);
            TblRio.getColumnModel().getColumn(3).setMinWidth(80);
            TblRio.getColumnModel().getColumn(3).setPreferredWidth(80);
            TblRio.getColumnModel().getColumn(3).setMaxWidth(80);
            TblRio.getColumnModel().getColumn(4).setMinWidth(60);
            TblRio.getColumnModel().getColumn(4).setPreferredWidth(60);
            TblRio.getColumnModel().getColumn(4).setMaxWidth(60);
            TblRio.getColumnModel().getColumn(5).setMinWidth(50);
            TblRio.getColumnModel().getColumn(5).setPreferredWidth(50);
            TblRio.getColumnModel().getColumn(5).setMaxWidth(50);
            TblRio.getColumnModel().getColumn(6).setMinWidth(50);
            TblRio.getColumnModel().getColumn(6).setPreferredWidth(50);
            TblRio.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 510, 450, 120);

        BtnRmRio.setText("Excluir Embarcação do Rio");
        BtnRmRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRmRioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRmRio);
        BtnRmRio.setBounds(260, 650, 220, 31);

        BtnAltRio.setText("Alterar Embarcação do Rio");
        BtnAltRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltRioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAltRio);
        BtnAltRio.setBounds(30, 650, 220, 31);

        BtnRmMar.setText("Excluir Embarcação do Mar");
        BtnRmMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRmMarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRmMar);
        BtnRmMar.setBounds(770, 650, 220, 31);

        BtnAltMar.setText("Alterar Embarcação do Mar");
        BtnAltMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltMarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAltMar);
        BtnAltMar.setBounds(540, 650, 220, 31);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(510, 460, 10, 230);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 340, 1020, 20);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 460, 1020, 20);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(650, 150, 10, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRmRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRmRioActionPerformed

    }//GEN-LAST:event_BtnRmRioActionPerformed

    private void BtnAltRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltRioActionPerformed

    }//GEN-LAST:event_BtnAltRioActionPerformed

    private void BtnRmMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRmMarActionPerformed

    }//GEN-LAST:event_BtnRmMarActionPerformed

    private void BtnAltMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltMarActionPerformed

    }//GEN-LAST:event_BtnAltMarActionPerformed

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
            java.util.logging.Logger.getLogger(JfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JfPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAltMar;
    private javax.swing.JButton BtnAltRio;
    private javax.swing.JButton BtnRmMar;
    private javax.swing.JButton BtnRmRio;
    private javax.swing.JLabel LbBarco1;
    private javax.swing.JLabel LbBarco2;
    private javax.swing.JLabel LbHora;
    private javax.swing.JLabel LbMin;
    private javax.swing.JLabel LbNavio;
    private javax.swing.JLabel LbSeg;
    private javax.swing.JLabel LbStatus;
    private javax.swing.JPanel PnlEclusa;
    private javax.swing.JPanel PnlMar;
    private javax.swing.JPanel PnlRio;
    private javax.swing.JProgressBar ProgStatus;
    private javax.swing.JTable TblMar;
    private javax.swing.JTable TblRio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
