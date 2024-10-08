/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author samglish
 */
import java.sql.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
public class Monitor extends javax.swing.JFrame {

    /**
     * Creates new form Monitor
     */
    public Monitor() {
        initComponents();
        Table();
        Table1();
        Table2();
        Table3();
        Table4();
    }
    String test;
    Monitor(String mana){
    initComponents();
    	this.test=mana;
    	login.setText(mana);
    	Table();
    	Table1();
    	Table2();
    	Table3();
    	Table4();
    	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        selectID = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			connect();
        	 select=selectID.getValue().toString();

        			JOptionPane.showMessageDialog(null, "Veuillez patientez, ID : "+selectID.getValue().toString());
        			Table();
        			Table1();
        			Table2();
        			Table3();
        			Table4();
        		} catch (Exception e2) {
        			e2.printStackTrace();
        		}
        	}
        });
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "message envoyé");
        	}
        });
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        table3.setFont(new Font("Dialog", Font.BOLD, 12));
        table3.setBorder(new LineBorder(new Color(0, 0, 0)));
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        table.setFont(new Font("Dialog", Font.BOLD, 12));
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        table2.setFont(new Font("Dialog", Font.BOLD, 12));
        table2.setBorder(new LineBorder(new Color(0, 0, 0)));
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        table1.setFont(new Font("Dialog", Font.BOLD, 12));
        table1.setBorder(new LineBorder(new Color(0, 0, 0)));
        jScrollPane6 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        table4.setBorder(new LineBorder(new Color(0, 0, 0)));
        table4.setFont(new Font("Dialog", Font.BOLD, 12));
        table4.setForeground(new Color(255, 255, 255));
        table4.setBackground(new Color(94, 92, 100));
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/moni1.png"))); // NOI18N
        jLabel1.setText("ASTHMA MONITORING");

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Accueil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        login = new JLabel("");
        login.setForeground(new Color(0, 255, 0));
        login.setFont(new Font("Go Mono", Font.BOLD, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(3)
        			.addComponent(jButton1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton2)
        			.addGap(173)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        			.addComponent(login, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
        			.addGap(24))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        				.addComponent(jButton1)
        				.addComponent(jButton2)
        				.addComponent(login))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Verifier");

        jLabel2.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("Envoyer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resident-evil-health.gif"))); // NOI18N

        table3.setBackground(new java.awt.Color(0, 153, 0));
        table3.setForeground(new java.awt.Color(255, 255, 255));
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospital-monitor.gif"))); // NOI18N

        table.setBackground(new java.awt.Color(255, 0, 0));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table);

        jLabel5.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Stade 4 : Symptômes présents tous les jours");

        jLabel6.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Stade 3 : Plusieurs crises d'asthme par semaine");

        table2.setBackground(new java.awt.Color(153, 0, 0));
        table2.setForeground(new java.awt.Color(255, 255, 255));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(table2);

        jLabel7.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Stade 2 : Moins d'une crise d'asthme par semaine");

        table1.setBackground(new java.awt.Color(255, 102, 0));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(table1);

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(table4);

        jLabel8.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Stade 1 : Constances normales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1341, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
        					.addGap(87))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        									.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        						.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addComponent(jLabel7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addComponent(jScrollPane4, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        					.addGap(3)
        					.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(2)
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel6)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel7)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
        			.addGap(9))
        );
        getContentPane().setLayout(layout);

        jLabel7.getAccessibleContext().setAccessibleName("Stade 2 : Moins d'une crise d'asthme par semaine");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Gestion_patient Jpat =new Gestion_patient(login.getText());
Jpat.setVisible(true);
super.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Accueil Jacc =new Accueil(login.getText());
Jacc.setVisible(true);
super.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner selectID;
    private javax.swing.JTable table3;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JTable table1;
    private javax.swing.JTable table4;
    private javax.swing.JTextArea jTextArea1;
    String select;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private JLabel login;
    public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/asthmatique","root","");
			System.out.println("connection reussie");
		} catch(Exception e) {
			System.err.println(e); //on affiche l'erreur
		}
		}
    public void Table() {
		try {
			
			connect();
			String[] entete= {"ID","NOM","PRENOM","ADRESSE","TELEPHONE"};
			String[] ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select id_patient,nom,prenom,adresse,telephone from patient where stade=4 ORDER BY id_patient DESC LIMIT 0,10000";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ligne[0]=rs.getString("id_patient");
				ligne[1]=rs.getString("nom");
				ligne[2]=rs.getString("prenom");
				ligne[3]=rs.getString("adresse");
				ligne[4]=rs.getString("telephone");
				mode1.addRow(ligne);
			}
			table.setModel(mode1);
			con.close();
		 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void Table1() {
		try {
			
			connect();
			String[] entete= {"ID","NOM","PRENOM","ADRESSE","TELEPHONE"};
			String[] ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select id_patient,nom,prenom,adresse,telephone from patient where stade=3 ORDER BY id_patient DESC LIMIT 0,10000";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ligne[0]=rs.getString("id_patient");
				ligne[1]=rs.getString("nom");
				ligne[2]=rs.getString("prenom");
				ligne[3]=rs.getString("adresse");
				ligne[4]=rs.getString("telephone");
				mode1.addRow(ligne);
			}
			table1.setModel(mode1);
			con.close();
		 
			
			
		} catch (Exception e) {
		e.printStackTrace();		}
	}
	public void Table2() {
		try {
			
			connect();
			String[] entete= {"ID","NOM","PRENOM","ADRESSE","TELEPHONE"};
			String[] ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select id_patient,nom,prenom,adresse,telephone from patient where stade=2 ORDER BY id_patient DESC LIMIT 0,10000";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ligne[0]=rs.getString("id_patient");
				ligne[1]=rs.getString("nom");
				ligne[2]=rs.getString("prenom");
				ligne[3]=rs.getString("adresse");
				ligne[4]=rs.getString("telephone");
				mode1.addRow(ligne);
			}
			table2.setModel(mode1);
			con.close();
		 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void Table3() {
		try {
			
			connect();
			String[] entete= {"ID","NOM","PRENOM","ADRESSE","TELEPHONE"};
			String[] ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select id_patient,nom,prenom,adresse,telephone from patient where stade=1 ORDER BY id_patient DESC LIMIT 0,10000";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ligne[0]=rs.getString("id_patient");
				ligne[1]=rs.getString("nom");
				ligne[2]=rs.getString("prenom");
				ligne[3]=rs.getString("adresse");
				ligne[4]=rs.getString("telephone");
				mode1.addRow(ligne);
			}
			table3.setModel(mode1);
			con.close();
		 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void Table4() {
		try {
			connect();
			String[] entete= {"identifiant","frequence cardiaque", "frequence respiratoire", "tension", "temperature"};
			String[] ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select *from donnees where id_patient="+select+" ORDER BY id_patient DESC LIMIT 0,3";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ligne[0]=rs.getString("id_patient");
				ligne[1]=rs.getString("freq_car");
				ligne[2]=rs.getString("freq_res");
				ligne[3]=rs.getString("tension");
				ligne[4]=rs.getString("temperature");
				mode1.addRow(ligne);
			}
			table4.setModel(mode1);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    // End of variables declaration//GEN-END:variables
}
