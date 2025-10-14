package sams.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sams.controller.ProgramController;
import sams.dto.ProgramDetailsDto;

public class Searchprogram extends JFrame {

    private ProgramController programController = new ProgramController();

    public Searchprogram() {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        programIdForSearch = new JLabel();
        jLabel3 = new JLabel();
        programName = new TextField();
        searchProgramBtn = new JToggleButton();
        jScrollPane1 = new JScrollPane();
        programTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        programIdForSearch.setFont(new Font("Segoe UI", 1, 18));
        programIdForSearch.setForeground(new Color(51, 51, 255));
        programIdForSearch.setText("Search Program Details");

        jLabel3.setFont(new Font("Segoe UI", 1, 14));
        jLabel3.setText("Program ID");

        searchProgramBtn.setFont(new Font("Segoe UI", 1, 14));
        searchProgramBtn.setText("Search");
        searchProgramBtn.addActionListener(evt -> searchPrograms());

        programTable.setModel(new DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Program Name", "Program Code", "Duration", "Description", "Manage"
                }
        ));
        jScrollPane1.setViewportView(programTable);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69)
                                .addComponent(jLabel3)
                                .addGap(65)
                                .addComponent(programName, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchProgramBtn)
                                .addGap(72))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(198)
                                                .addComponent(programIdForSearch, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43)
                                .addComponent(programIdForSearch)
                                .addGap(32)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(searchProgramBtn)
                                        .addComponent(jLabel3)
                                        .addComponent(programName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(42)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void loadTable() {
        try {
            ArrayList<ProgramDetailsDto> programList = programController.getAllProgram();
            DefaultTableModel model = (DefaultTableModel) programTable.getModel();
            model.setRowCount(0);

            for (ProgramDetailsDto dto : programList) {
                model.addRow(new Object[]{
                        dto.getProgramName(),
                        dto.getProgramCode(),
                        dto.getDuration(),
                        dto.getDescription(),
                        "Edit/Delete"
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading programs: " + e.getMessage());
        }
    }

    private void searchPrograms() {
        String searchText = programName.getText().trim().toLowerCase();

        try {
            ArrayList<ProgramDetailsDto> programList = programController.getAllProgram();
            DefaultTableModel model = (DefaultTableModel) programTable.getModel();
            model.setRowCount(0);

            for (ProgramDetailsDto dto : programList) {
                String name = dto.getProgramName() != null ? dto.getProgramName().toLowerCase() : "";
                String code = dto.getProgramCode() != null ? dto.getProgramCode().toLowerCase() : "";

                if (name.contains(searchText) || code.contains(searchText)) {
                    model.addRow(new Object[]{
                            dto.getProgramName(),
                            dto.getProgramCode(),
                            dto.getDuration(),
                            dto.getDescription(),
                            "Edit/Delete"
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Search failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Searchprogram.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new Searchprogram().setVisible(true));
    }

    // Variables declaration
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JLabel programIdForSearch;
    private TextField programName;
    private JTable programTable;
    private JToggleButton searchProgramBtn;
}
