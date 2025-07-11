package minesweeper_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Minesweeper_Game extends JFrame {

    private final int SIZE;
    private final int MINES;

    private JButton[][] buttons;
    private boolean[][] mines;
    private boolean[][] revealed;
    

    public Minesweeper_Game(int size, int minesCount) {
        this.SIZE = size;
        this.MINES = minesCount;

        buttons = new JButton[SIZE][SIZE];
        mines = new boolean[SIZE][SIZE];
        revealed = new boolean[SIZE][SIZE];
        initComponents();
        setTitle("Minesweeper - " + SIZE + "x" + SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel2.setLayout(new GridLayout(SIZE, SIZE));
        setResizable(false);
        
        initializeButtons();
        placeMines();

        pack();
        setLocationRelativeTo(null);
        setVisible(true); // show immediately

    }

    private void initializeButtons() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(40, 40));
                button.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
                button.setBackground(Color.GRAY);
                button.setForeground(Color.BLACK);
                button.setFocusPainted(false);
                button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
                button.setOpaque(true);

                int r = row, c = col;
                button.addActionListener(e -> handleClick(r, c));

                buttons[row][col] = button;
                jPanel2.add(button);


                revealed[row][col] = false;
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int count = 0;
        while (count < MINES) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);
            if (!mines[r][c]) {
                mines[r][c] = true;
                count++;
            }
        }
    }

    private void handleClick(int row, int col) {
        if (revealed[row][col]) {
            return;
        }

        revealed[row][col] = true;

        if (mines[row][col]) {
            buttons[row][col].setText("💣");
            buttons[row][col].setBackground(Color.RED);
            gameOver(false);
        } else {
            int count = countAdjacentMines(row, col);
            buttons[row][col].setText(count == 0 ? "" : String.valueOf(count));
            buttons[row][col].setEnabled(false);
            buttons[row][col].setBackground(Color.LIGHT_GRAY);

            if (count == 0) {
                revealSurrounding(row, col);
            }

            if (checkWin()) {
                gameOver(true);
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && mines[r][c]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void revealSurrounding(int row, int col) {
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && !mines[r][c] && !revealed[r][c]) {
                    handleClick(r, c);
                }
            }
        }
    }

    private boolean checkWin() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (!mines[r][c] && !revealed[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void gameOver(boolean won) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                buttons[r][c].setEnabled(false);
                if (mines[r][c]) {
                    buttons[r][c].setText("💣");
                }
            }
        }
        JOptionPane.showMessageDialog(this, won ? "You Win! 🎉" : "Game Over! 💥");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rst = new javax.swing.JButton();
        newgme = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rst.setText("New Game");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });

        newgme.setText("Menu");
        newgme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(rst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newgme)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rst)
                    .addComponent(newgme))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newgmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgmeActionPerformed
        new MainMenu().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_newgmeActionPerformed

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstActionPerformed
        
        for (int r = 0; r < SIZE; r++) {
        for (int c = 0; c < SIZE; c++) {
            buttons[r][c].setEnabled(true);
            buttons[r][c].setText("");
            buttons[r][c].setBackground(null);
            mines[r][c] = false;
            revealed[r][c] = false;
        }
    }
    placeMines();
    }//GEN-LAST:event_rstActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newgme;
    private javax.swing.JButton rst;
    // End of variables declaration//GEN-END:variables
}
