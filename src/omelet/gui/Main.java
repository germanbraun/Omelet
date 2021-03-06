package omelet.gui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import omelet.MainVisual;
import omelet.gui.utils.*;
import omelet.semantic.*;
import omelet.table.*;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Giuliano
 */
public class Main extends javax.swing.JFrame {

    private Diagram diagram;
    private Database database;
    private String sql;
    private Document xmlModel;

    private String auxPath = "";

    private LinkedList<ButtonGroup> optionMultivalued = new LinkedList<>();
    private LinkedList<ButtonGroup> optionOneToOne = new LinkedList<>();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("omelet.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExamine = new javax.swing.JTextField();
        btnExamine = new javax.swing.JButton();
        lblExamine = new javax.swing.JLabel();
        btnGenSQL = new javax.swing.JButton();
        btnGenDBDiagram = new javax.swing.JButton();
        lblDatabaseCriteria = new javax.swing.JLabel();
        lblDatabaseLook = new javax.swing.JLabel();
        pnlDatabaseCriteriaOneToOne = new javax.swing.JPanel();
        scrDatabaseCriteriaOneToOne = new javax.swing.JScrollPane();
        tblDatabaseCriteriaOneToOne = new javax.swing.JTable();
        pnlDatabaseCriteriaMultivalued = new javax.swing.JPanel();
        scrDatabaseCriteriaMultivalued = new javax.swing.JScrollPane();
        tblDatabaseCriteriaMultivalued = new javax.swing.JTable();
        scrDatabasaLook = new javax.swing.JScrollPane();
        txtDatabaseLook = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Omelet");
        setMaximumSize(new java.awt.Dimension(780, 460));
        setMinimumSize(new java.awt.Dimension(780, 460));
        setPreferredSize(new java.awt.Dimension(780, 460));

        txtExamine.setToolTipText("");
        txtExamine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExamineKeyReleased(evt);
            }
        });

        btnExamine.setText("Examine");
        btnExamine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamineActionPerformed(evt);
            }
        });

        lblExamine.setText("Select archive (.uxf) generated by UMLet:");

        btnGenSQL.setText("Generate SQL");
        btnGenSQL.setEnabled(false);
        btnGenSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenSQLActionPerformed(evt);
            }
        });

        btnGenDBDiagram.setText("Generate DB Diagram");
        btnGenDBDiagram.setEnabled(false);
        btnGenDBDiagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenDBDiagramActionPerformed(evt);
            }
        });

        lblDatabaseCriteria.setText("Choose the criteria to generate database:");

        lblDatabaseLook.setText("Database generation:");

        pnlDatabaseCriteriaOneToOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDatabaseCriteriaOneToOne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrDatabaseCriteriaOneToOne.setViewportView(tblDatabaseCriteriaOneToOne);

        javax.swing.GroupLayout pnlDatabaseCriteriaOneToOneLayout = new javax.swing.GroupLayout(pnlDatabaseCriteriaOneToOne);
        pnlDatabaseCriteriaOneToOne.setLayout(pnlDatabaseCriteriaOneToOneLayout);
        pnlDatabaseCriteriaOneToOneLayout.setHorizontalGroup(
            pnlDatabaseCriteriaOneToOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrDatabaseCriteriaOneToOne, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        pnlDatabaseCriteriaOneToOneLayout.setVerticalGroup(
            pnlDatabaseCriteriaOneToOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrDatabaseCriteriaOneToOne, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        pnlDatabaseCriteriaMultivalued.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDatabaseCriteriaMultivalued.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrDatabaseCriteriaMultivalued.setViewportView(tblDatabaseCriteriaMultivalued);

        javax.swing.GroupLayout pnlDatabaseCriteriaMultivaluedLayout = new javax.swing.GroupLayout(pnlDatabaseCriteriaMultivalued);
        pnlDatabaseCriteriaMultivalued.setLayout(pnlDatabaseCriteriaMultivaluedLayout);
        pnlDatabaseCriteriaMultivaluedLayout.setHorizontalGroup(
            pnlDatabaseCriteriaMultivaluedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlDatabaseCriteriaMultivaluedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrDatabaseCriteriaMultivalued, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
        );
        pnlDatabaseCriteriaMultivaluedLayout.setVerticalGroup(
            pnlDatabaseCriteriaMultivaluedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(pnlDatabaseCriteriaMultivaluedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrDatabaseCriteriaMultivalued, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        );

        txtDatabaseLook.setEditable(false);
        txtDatabaseLook.setColumns(20);
        txtDatabaseLook.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtDatabaseLook.setRows(5);
        scrDatabasaLook.setViewportView(txtDatabaseLook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtExamine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExamine))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblExamine, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(lblDatabaseCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(118, 118, 118)
                                .addComponent(lblDatabaseLook))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenDBDiagram, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDatabaseCriteriaOneToOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDatabaseCriteriaMultivalued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrDatabasaLook)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblExamine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtExamine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExamine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenSQL)
                    .addComponent(btnGenDBDiagram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatabaseCriteria)
                    .addComponent(lblDatabaseLook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatabaseCriteriaOneToOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDatabaseCriteriaMultivalued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrDatabasaLook))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExamineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamineActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("UMLet files", "uxf");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(this);
        String loadPath = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            loadPath = file.getAbsolutePath();

            txtExamine.setText(loadPath);
        }
        auxPath = txtExamine.getText();
        enabledButtons(txtExamine.getText());
    }//GEN-LAST:event_btnExamineActionPerformed

    private void btnGenSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenSQLActionPerformed
        if (database != null) {
            sql = MainVisual.generateSQL(database);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("SQL files", "sql");
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(filter);
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showSaveDialog(this);
            String savePath = "";
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                savePath = file.getAbsolutePath();
                if (!savePath.endsWith(".sql")) {
                    savePath = savePath + ".sql";
                }
                try {
                    PrintWriter writer = new PrintWriter(savePath, "UTF-8");
                    writer.println(sql);
                    writer.close();
                } catch (IOException e) {
                    System.err.println("A problem in the creation of SQL file.");
                }
            }
        }
    }//GEN-LAST:event_btnGenSQLActionPerformed

    private void btnGenDBDiagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenDBDiagramActionPerformed
        if (database != null) {
            xmlModel = MainVisual.generateDatabaseDiagram(database);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("UXF files", "uxf");
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(filter);
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showSaveDialog(this);
            String savePath = "";
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                savePath = file.getAbsolutePath();
                if (!savePath.endsWith(".uxf")) {
                    savePath = savePath + ".uxf";
                }
                try {
                    XMLOutputter xmlOutput = new XMLOutputter();
                    xmlOutput.setFormat(Format.getPrettyFormat());
                    xmlOutput.output(xmlModel, new FileWriter(savePath));
                } catch (IOException ex) {
                    System.err.println("A problem in the creation of XML (.uxf) file.");
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGenDBDiagramActionPerformed

    private void txtExamineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamineKeyReleased
        if (!auxPath.equals(txtExamine.getText())) {
            auxPath = txtExamine.getText();
            enabledButtons(txtExamine.getText());
        }
    }//GEN-LAST:event_txtExamineKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void enabledButtons(String path) {
        File file = new File(path);
        if (path.substring(path.lastIndexOf(".") + 1).equals("uxf")
                && file.exists()) {
            if (!btnGenSQL.isEnabled()) {
                btnGenSQL.setEnabled(true);
                btnGenDBDiagram.setEnabled(true);
            }
            generateDiagram(path);
            generateDatabaseCriteria();
            generateDatabaseLook();
        } else {
            if (btnGenSQL.isEnabled()) {
                btnGenSQL.setEnabled(false);
                btnGenDBDiagram.setEnabled(false);
            }
            diagram = null;
            generateDatabaseCriteria();
            generateDatabaseLook();
        }
    }

    private void generateDiagram(String path) {
        diagram = MainVisual.generateDiagram(path);
    }

    private void generateDatabaseCriteria() {
        if (diagram != null) {
            DefaultTableModel modelMultivalued = new DefaultTableModel();
            DefaultTableModel modelOneToOne = new DefaultTableModel();

            String[] columnsMultivalued = {"Multivalued", "Entity", "1:M", "N:M"};
            String[] columnsOneToOne = {"Relationship (1:1)", "Entity 1", "Entity 2"};

            modelMultivalued.setColumnIdentifiers(columnsMultivalued);
            modelOneToOne.setColumnIdentifiers(columnsOneToOne);

            LinkedList<Object[]> rowsMultivaluedList = new LinkedList<>();
            LinkedList<Object[]> rowsOneToOneList = new LinkedList<>();

            for (Attribute attribute : diagram.getAttributes()) {
                Object[] row;
                /*if ((row = doMultivaluedCriteria(attribute, diagram)) != null) {
                    rowsMultivaluedList.add(row);
                }*/
                row = doMultivaluedCriteria(attribute, diagram);
                rowsMultivaluedList.add(row);
            }

            for (Relationship relationship : diagram.getRelationships()) {
                Object[] row;
                /*if ((row = doRelationshipCriteria(relationship, diagram)) != null) {
                    rowsOneToOneList.add(row);
                }*/
                row = doRelationshipCriteria(relationship, diagram);
                rowsOneToOneList.add(row);
            }

            Object[][] rowsMultivalued = new Object[rowsMultivaluedList.size()][4];
            for (int i = 0; i < rowsMultivaluedList.size(); i++) {
                rowsMultivalued[i] = rowsMultivaluedList.get(i);
                if (!rowsMultivalued[i][0].equals("")) {
                    modelMultivalued.addRow(rowsMultivalued[i]);
                }
                ButtonGroup radioGroup = new ButtonGroup();
                JRadioButton optionOne = ((JRadioButton) rowsMultivalued[i][2]);
                optionOne.setMnemonic(1);
                optionOne.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (diagram != null && database != null) {
                            generateDatabaseLook();
                        }
                    }
                });
                radioGroup.add(optionOne);
                JRadioButton optionTwo = ((JRadioButton) rowsMultivalued[i][3]);
                optionTwo.setMnemonic(2);
                optionTwo.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (diagram != null && database != null) {
                            generateDatabaseLook();
                        }
                    }
                });
                radioGroup.add(optionTwo);
                radioGroup.getElements().nextElement().setSelected(true);
                optionMultivalued.add(radioGroup);
            }

            Object[][] rowsOneToOne = new Object[rowsOneToOneList.size()][3];
            for (int i = 0; i < rowsOneToOneList.size(); i++) {
                rowsOneToOne[i] = rowsOneToOneList.get(i);
                if (!rowsOneToOne[i][0].equals("")) {
                    modelOneToOne.addRow(rowsOneToOne[i]);
                }
                ButtonGroup radioGroup = new ButtonGroup();
                JRadioButton optionOne = ((JRadioButton) rowsOneToOne[i][1]);
                optionOne.setMnemonic(1);
                radioGroup.add(optionOne);
                optionOne.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (diagram != null && database != null) {
                            generateDatabaseLook();
                        }
                    }
                });
                JRadioButton optionTwo = ((JRadioButton) rowsOneToOne[i][2]);
                optionTwo.setMnemonic(2);
                optionTwo.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (diagram != null && database != null) {
                            generateDatabaseLook();
                        }
                    }
                });
                radioGroup.add(optionTwo);
                radioGroup.getElements().nextElement().setSelected(true);
                optionOneToOne.add(radioGroup);
            }

            tblDatabaseCriteriaMultivalued = new JTable(modelMultivalued) {
                @Override
                public void tableChanged(TableModelEvent e) {
                    super.tableChanged(e);
                    repaint();
                }

                boolean[] canEdit = new boolean[]{
                    false, false, true, true
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            tblDatabaseCriteriaMultivalued.getTableHeader().setReorderingAllowed(false);
            scrDatabaseCriteriaMultivalued.setViewportView(tblDatabaseCriteriaMultivalued);

            tblDatabaseCriteriaMultivalued.getColumn("1:M").setCellRenderer(
                    new RadioButtonRenderer());
            tblDatabaseCriteriaMultivalued.getColumn("1:M").setCellEditor(
                    new RadioButtonEditor(new JCheckBox()));
            tblDatabaseCriteriaMultivalued.getColumn("N:M").setCellRenderer(
                    new RadioButtonRenderer());
            tblDatabaseCriteriaMultivalued.getColumn("N:M").setCellEditor(
                    new RadioButtonEditor(new JCheckBox()));

            tblDatabaseCriteriaOneToOne = new JTable(modelOneToOne) {
                @Override
                public void tableChanged(TableModelEvent e) {
                    super.tableChanged(e);
                    repaint();
                }

                boolean[] canEdit = new boolean[]{
                    false, true, true
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            tblDatabaseCriteriaOneToOne.getTableHeader().setReorderingAllowed(false);
            scrDatabaseCriteriaOneToOne.setViewportView(tblDatabaseCriteriaOneToOne);

            tblDatabaseCriteriaOneToOne.getColumn("Entity 1").setCellRenderer(
                    new RadioButtonRenderer());
            tblDatabaseCriteriaOneToOne.getColumn("Entity 1").setCellEditor(
                    new RadioButtonEditor(new JCheckBox()));
            tblDatabaseCriteriaOneToOne.getColumn("Entity 2").setCellRenderer(
                    new RadioButtonRenderer());
            tblDatabaseCriteriaOneToOne.getColumn("Entity 2").setCellEditor(
                    new RadioButtonEditor(new JCheckBox()));
        } else {
            tblDatabaseCriteriaMultivalued = null;
            scrDatabaseCriteriaMultivalued.setViewportView(null);
            tblDatabaseCriteriaOneToOne = null;
            scrDatabaseCriteriaOneToOne.setViewportView(null);
        }
    }

    private Object[] doMultivaluedCriteria(Attribute attribute, Diagram diagram) {
        Object[] row = null;
        if (attribute.isMultivalued()) {
            row = new Object[4];
            Entity entity;
            for (Connector connector : diagram.getConnectors()) {
                if ((entity = connector.connectEntity(attribute)) != null) {
                    row[0] = attribute.getName();
                    row[1] = entity.getName();
                    row[2] = new JRadioButton();
                    row[3] = new JRadioButton();
                }
            }
        } else {
            row = new Object[4];
            row[0] = "";
            row[1] = "";
            row[2] = new JRadioButton();
            row[3] = new JRadioButton();
        }
        return row;
    }

    private Object[] doRelationshipCriteria(Relationship relationship, Diagram diagram) {
        Object[] row = null;
        Entity entity;
        LinkedList<Entity> relationshipEntities = new LinkedList<>();
        boolean oneToOne = true;
        for (Connector connector : diagram.getConnectors()) {
            if ((entity = connector.connectEntity(relationship)) != null) {
                if (connector.isManyCardinality()) {
                    oneToOne = false;
                }
                relationshipEntities.add(entity);
            }
        }
        if (oneToOne && relationshipEntities.size() <= 2) {
            row = new Object[3];
            row[0] = relationship.getName();
            row[1] = new JRadioButton(relationshipEntities.getFirst().getName());
            row[2] = new JRadioButton(relationshipEntities.getLast().getName());
        } else {
            row = new Object[3];
            row[0] = "";
            row[1] = new JRadioButton();
            row[2] = new JRadioButton();
        }
        return row;
    }

    private void generateDatabaseLook() {
        if (diagram != null) {
            database = MainVisual.generateDatabase(diagram, optionMultivalued, optionOneToOne);
            txtDatabaseLook.setText(database.toStringNoColor());
        } else {
            txtDatabaseLook.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExamine;
    private javax.swing.JButton btnGenDBDiagram;
    private javax.swing.JButton btnGenSQL;
    private javax.swing.JLabel lblDatabaseCriteria;
    private javax.swing.JLabel lblDatabaseLook;
    private javax.swing.JLabel lblExamine;
    private javax.swing.JPanel pnlDatabaseCriteriaMultivalued;
    private javax.swing.JPanel pnlDatabaseCriteriaOneToOne;
    private javax.swing.JScrollPane scrDatabasaLook;
    private javax.swing.JScrollPane scrDatabaseCriteriaMultivalued;
    private javax.swing.JScrollPane scrDatabaseCriteriaOneToOne;
    private javax.swing.JTable tblDatabaseCriteriaMultivalued;
    private javax.swing.JTable tblDatabaseCriteriaOneToOne;
    private javax.swing.JTextArea txtDatabaseLook;
    private javax.swing.JTextField txtExamine;
    // End of variables declaration//GEN-END:variables
}
