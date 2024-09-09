import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samglish
 */
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class Gestion_rdv extends javax.swing.JFrame {

    /**
     * Creates new form Gestion_infirmier
     */
    public Gestion_rdv() {
        initComponents();
        Pcombox();
        Mcombox();
        Icombox();
        Table();
    }
    String test;
    Gestion_rdv(String mana){
    initComponents();
    	this.test=mana;
    	login.setText(mana);  	
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patient = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        medecin = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        infirmier = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	try {
        		connect();
				pst=con.prepareStatement("insert into gerer_rdv (patient,date,medecin,infirmier)values(?,?,?,?)");
				pst.setString(1, patient.getSelectedItem().toString());
				pst.setString(2, ((JTextField)date.getDateEditor().getUiComponent()).getText());
				pst.setString(3, medecin.getSelectedItem().toString());
				pst.setString(4, infirmier.getSelectedItem().toString());
				pst.execute();
				con.close();
				JOptionPane.showMessageDialog(null, "rendez-vous de M/Mme/Mlle "+patient.getSelectedItem().toString()+ " ajouté");
				Table();
			} catch (Exception e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "Impossible de planifier un rendez-vous, verifiez tous les champs");
				// TODO: handle exception
			}
        	}
        });
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
            		connect();
    				pst=con.prepareStatement("delete from gerer_rdv where id="+ID.getText());
    				pst.execute();
    				JOptionPane.showMessageDialog(null, "suppression effectuée avec succès");
    				Table();
    			} catch (Exception e2) {
    				e2.printStackTrace();
    			}
        	}
        });
        jButton5 = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Go Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERER LES RENDEZ-VOUS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/accueil.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        login = new JLabel("");
        login.setFont(new Font("Go Mono", Font.BOLD, 15));
        login.setForeground(new Color(0, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        			.addGap(207)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        			.addComponent(login, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
        			.addGap(21))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        		.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(login, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHOISIR PATIENT(E)");

        jLabel5.setText("DEFINIR LA DATE");

        patient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sam", "louis" }));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MEDECIN DISPONIBLE");

        medecin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mewo", "kemdem" }));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("INFIRMIER(E) DISPONIBLE");

        infirmier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "asta", "fanta" }));

        jLabel12.setText("NUM ID | SUPPRIMER OU EDITER");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/precedent.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add2.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete2.png"))); // NOI18N

        jButton5.setIcon(new ImageIcon(Gestion_rdv.class.getResource("/icons/modifier1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        				.addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        				.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(infirmier, 0, 391, Short.MAX_VALUE)
        						.addComponent(medecin, 0, 391, Short.MAX_VALUE)
        						.addComponent(patient, 0, 391, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(jLabel12)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(ID, 151, 151, 151))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(date, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        					.addGap(52))))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(patient, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5)
        				.addComponent(date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(12)
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(medecin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel11)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(infirmier, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton5, 0, 0, Short.MAX_VALUE)
        				.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton3, 0, 0, Short.MAX_VALUE)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 410, -1));

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
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 60, 930, 552));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 420, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Accueil Jacc=new Accueil(login.getText());
Jacc.setVisible(true);
super.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Accueil Jacc=new Accueil(login.getText());
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
            java.util.logging.Logger.getLogger(Gestion_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_rdv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> patient;
    private javax.swing.JComboBox<String> medecin;
    private javax.swing.JComboBox<String> infirmier;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JLabel login;
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/asthmatique","root","");
			System.out.println("connexion reussie");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Table() {
		try {
			connect();
			String[] entete= {"id","Nom du patient","Medecin en charge", "Assistant medecin", "Rendez-vous"};
			String[]ligne=new String[5];
			DefaultTableModel mode1=new DefaultTableModel(null,entete);
			String sql="select * from gerer_rdv";
			java.sql.Statement st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				ligne[0]=rs.getString("id");
				ligne[1]=rs.getString("patient");
				ligne[2]=rs.getString("medecin");
				ligne[3]=rs.getString("infirmier");
				ligne[4]=rs.getString("date");
			mode1.addRow(ligne);
			}
			table.setModel(mode1);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Pcombox() {
		try {
			connect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select nom from patient");
			while(rs.next()) {
				String nom=rs.getString("nom");
				patient.addItem(nom);	
			}
			
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}
public void Mcombox() {
	try {
		connect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select nom from medecin");
		while(rs.next()) {
			String nom=rs.getString("nom");
			medecin.addItem(nom);	
		}
		
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
		
	}
public void Icombox() {
	try {
		connect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select nom from infirmier");
		while(rs.next()) {
			String nom=rs.getString("nom");
			infirmier.addItem(nom);	
		}
		
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
}
	
    // End of variables declaration//GEN-END:variables
}