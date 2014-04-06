/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamsgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas Bock
 */
public class EditorPane extends javax.swing.JPanel {

    /**
     * Creates new form EditorPane
     */
    public EditorPane()
    {
        initComponents();
        setUpEditorPane();
    }
    
    /**
     * Creates new form EditorPane specifying a file to display
     * @param f;
     */
    public EditorPane(File f)
    {
        initComponents();
        setUpEditorPane();
        
        try
        {
            String text = new Scanner(f).useDelimiter("\\A").next();
            editorPanel.setText(text);
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Could not open the file.", "GAMSGUI", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        splitPane = new javax.swing.JSplitPane();
        editorSplitPanel = new javax.swing.JScrollPane();
        editorPanel = new javax.swing.JEditorPane();
        lstSplitPanel = new javax.swing.JScrollPane();
        lstPanel = new javax.swing.JEditorPane();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWeights = new double[] {1.0};
        layout.rowWeights = new double[] {1.0};
        setLayout(layout);

        splitPane.setContinuousLayout(true);

        editorSplitPanel.setPreferredSize(new java.awt.Dimension(150, 50));
        editorSplitPanel.setViewportView(editorPanel);

        splitPane.setLeftComponent(editorSplitPanel);

        lstSplitPanel.setPreferredSize(new java.awt.Dimension(150, 50));
        lstSplitPanel.setViewportView(lstPanel);

        splitPane.setRightComponent(lstSplitPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 616;
        gridBagConstraints.ipady = 470;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 2, 14, 3);
        add(splitPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane editorPanel;
    private javax.swing.JScrollPane editorSplitPanel;
    private javax.swing.JEditorPane lstPanel;
    private javax.swing.JScrollPane lstSplitPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables

    private void setUpEditorPane()
    {
        splitPane.setResizeWeight(0.5);
    }
    
    public boolean isBlank()
    {
        return editorPanel.getDocument().getLength() <= 0;
    }
}