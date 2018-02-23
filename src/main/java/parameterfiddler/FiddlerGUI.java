package parameterfiddler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FiddlerGUI extends javax.swing.JFrame implements Observer {

    public FiddlerGUI() {
        initComponents();

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");
            prop.load(input);

            textboxTester.setText(prop.getProperty("brutaltester"));
            textboxReferee.setText(prop.getProperty("refereeCommand"));
            textboxRuns.setText(prop.getProperty("rounds"));
            textboxPlayers.setText(prop.getProperty("players"));
            textboxThreads.setText(prop.getProperty("threads"));
            textboxDelta.setText(prop.getProperty("delta"));
            checkBoxSwap.setSelected(Boolean.parseBoolean(prop.getProperty("swap")));
        } catch (IOException ex) {
            // failed to load config - perfectly normal at least on first start
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

        jPanel1 = new javax.swing.JPanel();
        labelTester = new javax.swing.JLabel();
        textboxTester = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        labelReferee = new javax.swing.JLabel();
        textboxReferee = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelBot = new javax.swing.JLabel();
        textboxBot = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelParameters = new javax.swing.JLabel();
        textboxParameters = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelDelta = new javax.swing.JLabel();
        textboxDelta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelRuns = new javax.swing.JLabel();
        textboxRuns = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        labelThreads = new javax.swing.JLabel();
        textboxThreads = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        labelPlayers = new javax.swing.JLabel();
        textboxPlayers = new javax.swing.JTextField();
        checkBoxSwap = new javax.swing.JCheckBox();
        buttonRun = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableOpponents = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParameters = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaParameterchanges = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textareaBrutaltester = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ParameterFiddler");

        labelTester.setText("brutaltester:");
        jPanel1.add(labelTester);

        textboxTester.setColumns(10);
        textboxTester.setText("cg-brutaltester.jar");
        jPanel1.add(textboxTester);

        jSeparator8.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator8);

        labelReferee.setText("referee:");
        jPanel1.add(labelReferee);

        textboxReferee.setColumns(10);
        textboxReferee.setText("java -jar cg-mm.jar");
        jPanel1.add(textboxReferee);

        jSeparator1.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator1);

        labelBot.setText("bot:");
        jPanel1.add(labelBot);

        textboxBot.setColumns(10);
        textboxBot.setText("./MeanMax.exe");
        jPanel1.add(textboxBot);

        jSeparator5.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator5);

        labelParameters.setText("parameter file:");
        jPanel1.add(labelParameters);

        textboxParameters.setColumns(10);
        textboxParameters.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textboxParameters.setText("params.txt");
        jPanel1.add(textboxParameters);

        jSeparator2.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator2);

        labelDelta.setText("delta:");
        jPanel1.add(labelDelta);

        textboxDelta.setColumns(3);
        textboxDelta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textboxDelta.setText("0.3");
        jPanel1.add(textboxDelta);

        jSeparator3.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator3);

        labelRuns.setText("runs:");
        jPanel1.add(labelRuns);

        textboxRuns.setColumns(3);
        textboxRuns.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textboxRuns.setText("1000");
        jPanel1.add(textboxRuns);

        jSeparator4.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator4);

        labelThreads.setText("threads:");
        jPanel1.add(labelThreads);

        textboxThreads.setColumns(3);
        textboxThreads.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textboxThreads.setText("4");
        jPanel1.add(textboxThreads);

        jSeparator7.setPreferredSize(new java.awt.Dimension(10, 0));
        jPanel1.add(jSeparator7);

        labelPlayers.setText("players:");
        jPanel1.add(labelPlayers);

        textboxPlayers.setColumns(3);
        textboxPlayers.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textboxPlayers.setText("3");
        jPanel1.add(textboxPlayers);

        checkBoxSwap.setSelected(true);
        checkBoxSwap.setText("swap");
        jPanel1.add(checkBoxSwap);

        buttonRun.setText("RUN");
        buttonRun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buttonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRun);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(310, 68));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("opponents");
        jPanel4.add(jLabel2);

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        tableOpponents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"./MeanMax.exe", "params.txt"}
            },
            new String [] {
                "Bot", "Parameter File"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableOpponents.setName(""); // NOI18N
        jScrollPane4.setViewportView(tableOpponents);

        jPanel2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2, java.awt.BorderLayout.EAST);

        tableParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "old value", "new value", "testing"
            }
        ));
        tableParameters.setEnabled(false);
        jScrollPane1.setViewportView(tableParameters);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(jPanel3);

        textareaParameterchanges.setColumns(20);
        textareaParameterchanges.setRows(5);
        jScrollPane2.setViewportView(textareaParameterchanges);

        jTabbedPane1.addTab("parameter changes", jScrollPane2);

        textareaBrutaltester.setColumns(20);
        textareaBrutaltester.setRows(5);
        jScrollPane3.setViewportView(textareaBrutaltester);

        jTabbedPane1.addTab("brutaltester", jScrollPane3);

        jSplitPane1.setBottomComponent(jTabbedPane1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            String brutaltester = textboxTester.getText();
            String refereeCommand = textboxReferee.getText();
            String[] parts = new String[]{textboxBot.getText(), textboxParameters.getText()};
            Bot toImprove = new Bot(parts[0], parts[1]);
            ArrayList<Bot> opponents = new ArrayList<Bot>();
            DefaultTableModel opponentModel = (DefaultTableModel) tableOpponents.getModel();
            for (int opp = 0; opp < opponentModel.getRowCount(); opp++) {
                String botName = (String) opponentModel.getValueAt(opp, 0);
                String botParams = (String) opponentModel.getValueAt(opp, 1);
                if (!botName.equals("")) {
                    opponents.add(new Bot(botName, botParams));
                }
            }
            int rounds = Integer.parseInt(textboxRuns.getText());
            int threads = Integer.parseInt(textboxThreads.getText());
            int players = Integer.parseInt(textboxPlayers.getText());
            boolean swap = checkBoxSwap.isSelected();
            double delta = Double.parseDouble(textboxDelta.getText());
            ArrayList<Parameter> parameters = new ArrayList<Parameter>();
            List<String> lines = Files.readAllLines(Paths.get(toImprove.getParamFile()), Charset.forName("UTF-8"));
            for (String line : lines) {
                parameters.add(new Parameter(line));
            }

            Properties prop = new Properties();
            OutputStream output = null;

            try {
                output = new FileOutputStream("config.properties");
                prop.setProperty("brutaltester", brutaltester);
                prop.setProperty("refereeCommand", refereeCommand);
                prop.setProperty("rounds", String.valueOf(rounds));
                prop.setProperty("players", String.valueOf(players));
                prop.setProperty("threads", String.valueOf(threads));
                prop.setProperty("delta", String.valueOf(delta));
                prop.setProperty("swap", String.valueOf(swap));

                prop.store(output, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.toString(), "failed to save preferences", JOptionPane.ERROR_MESSAGE);
            }

            Runner runner = new Runner(toImprove, opponents,
                    parameters, brutaltester, refereeCommand,
                    rounds, threads, delta, false, swap, players);

            runner.addObserver(this);
            Thread thread = new Thread(runner);

            thread.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "parsing error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((DefaultTableModel) tableOpponents.getModel()).addRow(new String[]{"", ""});
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        Runner r = (Runner) o;
        boolean updateTable = false;

        ConcurrentLinkedQueue<String> brutaltesterQueue = r.getBrutaltesterQueue();
        while (brutaltesterQueue.size() > 0) {
            textareaBrutaltester.append(brutaltesterQueue.poll() + "\n");
        }

        ConcurrentLinkedQueue<String> parameterFiddlerQueue = r.getParameterFiddlerQueue();
        while (parameterFiddlerQueue.size() > 0) {
            textareaParameterchanges.append(parameterFiddlerQueue.poll() + "\n");
            updateTable = true;
        }

        if (updateTable) {
            DefaultTableModel table = (DefaultTableModel) tableParameters.getModel();
            table.setNumRows(0);
            for (Parameter p : r.getParameters()) {
                table.addRow(new String[]{p.getName(), p.getInitalValue(), p.getBestValue(), p.getTestingValue()});
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiddlerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JCheckBox checkBoxSwap;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelBot;
    private javax.swing.JLabel labelDelta;
    private javax.swing.JLabel labelParameters;
    private javax.swing.JLabel labelPlayers;
    private javax.swing.JLabel labelReferee;
    private javax.swing.JLabel labelRuns;
    private javax.swing.JLabel labelTester;
    private javax.swing.JLabel labelThreads;
    private javax.swing.JTable tableOpponents;
    private javax.swing.JTable tableParameters;
    private javax.swing.JTextArea textareaBrutaltester;
    private javax.swing.JTextArea textareaParameterchanges;
    private javax.swing.JTextField textboxBot;
    private javax.swing.JTextField textboxDelta;
    private javax.swing.JTextField textboxParameters;
    private javax.swing.JTextField textboxPlayers;
    private javax.swing.JTextField textboxReferee;
    private javax.swing.JTextField textboxRuns;
    private javax.swing.JTextField textboxTester;
    private javax.swing.JTextField textboxThreads;
    // End of variables declaration//GEN-END:variables
}