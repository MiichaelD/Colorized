
package colorized;
import javax.swing.*;
import java.awt.event.*;

public class Applet extends JApplet {
    
    JLabel jLabel1 = new javax.swing.JLabel(),jLabel2 = new javax.swing.JLabel(),jLabel3 = new javax.swing.JLabel();
    JLabel jLabel4 = new javax.swing.JLabel(), jLabel5 = new javax.swing.JLabel(), jLabel6 = new javax.swing.JLabel();
    Panel panel1 = new colorized.Panel();
    JLabel jLabel8 = new javax.swing.JLabel();

    
    public void init() {
        
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (KeyEvent.VK_M == e.getKeyCode()) {
                    JOptionPane.showMessageDialog(null, "\"Colorized M&M's\"\nPor: MiichaelD\nFebrero/2012", "About", JOptionPane.PLAIN_MESSAGE);
                } 
                else if (KeyEvent.getKeyText(e.getKeyChar()).equals("Escape")) {
                 int s = JOptionPane.showOptionDialog(null,"     Seleccione Opcion:",
                            "OPCIONES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, (new String[]{"Reiniciar","Cambiar Dificultad", "Salir", "Cancelar "}), "Reiniciar");
                  switch(s){
                      case 0: restart(); break;
                      case 1: panel1.setDificulty(
                              1+JOptionPane.showOptionDialog(null,"     Seleccione Dificultad:",
                                "OPCIONES", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, (new String[]{"Facil","Dificil", "Muy Dificil"}), "Facil")
                                ); 
                            restart();
                      
                                break;
                      case 2: System.exit(0);break;
                  }
                   
                            
                }else switch(e.getKeyChar()){
                    case '1': Colorize(1);break;
                    case '2': Colorize(2);break;
                    case '3': Colorize(3);break;
                    case '4': Colorize(4);break;
                    case '5': Colorize(5);break;
                    case '6': Colorize(6);break;
                   }
            }
        });
        setFocusable(true);
        requestFocus();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/1.png"))); // NOI18N
        jLabel1.setText("1");
        jLabel1.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel1.setFocusable(false);
        
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/2.png"))); // NOI18N
        jLabel2.setText("2");
        jLabel2.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel2.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel2.setFocusable(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/3.png"))); // NOI18N
        jLabel3.setText("3");
        jLabel3.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel3.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel3.setFocusable(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/4.png"))); // NOI18N
        jLabel4.setText("4");
        jLabel4.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel4.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel4.setFocusable(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/5.png"))); // NOI18N
        jLabel5.setText("5");
        jLabel5.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel5.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel5.setFocusable(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorized/6.png"))); // NOI18N
        jLabel6.setText("6");
        jLabel6.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel6.setPreferredSize(new java.awt.Dimension(44, 44));
        jLabel6.setFocusable(false);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
       this.resize(316, 356);
    }
    
    int color, colornuevo, movimientos = 0;
    long t1;

     public void Colorize(int c) {
        colornuevo = c;
        color = panel1.mat[0][0].getcolor();
        if (color == colornuevo) {
            return;
        }
        jLabel8.setText("Movimientos: " + ++movimientos);

        Colorized(colornuevo);

        if (winCheck()) {
            restart("Ganaste en " + movimientos + " movimientos :D\n", JOptionPane.INFORMATION_MESSAGE);
        } else if (movimientos == panel1.maxMov) {
            restart("     Game Over :C\n", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Colorized(int c) {
        t1 = System.currentTimeMillis();
        panel1.mat[0][0].setcolor(c);
        checar2(0, 1);
        checar2(1, 0);
        System.out.println(movimientos + "\tTiempo:" + (System.currentTimeMillis() - t1));
    }

    //if al ser llamado
    public void checar(int indice, int indice2) {
        if ((indice == 0 && indice2 == 0) || indice == -1 || indice == panel1.mat.length
                || indice2 == -1 || indice2 == panel1.mat[0].length) {
                return;
        }
        try {
            if (color == panel1.mat[indice][indice2].getcolor()) {
                panel1.mat[indice][indice2].setcolor(colornuevo);

                //if(indice2!=0)//west
                checar(indice, indice2 - 1);

                //if(indice2!=panel1.mat.length-1)//east
                checar(indice, indice2 + 1);

                //if (indice!=panel1.mat.length-1)//south
                checar(indice + 1, indice2);

                //if(indice!=0)//north
                checar(indice - 1, indice2);
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(indice + "\t" + indice2);
        }

    }

    // if antes de llamar
    public void checar2(int indice, int indice2) {
        if ((indice == 0 && indice2 == 0)) {
            return;
        }
        try {
            if (color == panel1.mat[indice][indice2].getcolor()) {
                panel1.mat[indice][indice2].setcolor(colornuevo);
                if (indice > 0)//oeste
                {
                    checar2(indice - 1, indice2);
                }
                if (indice < panel1.mat.length-1 )//este
                {
                    checar2(indice + 1, indice2);
                }
                if (indice2 > 0)//norte
                {
                    checar2(indice, indice2 - 1);
                }

                if (indice2 < panel1.mat[0].length-1 )//sur
                {
                    checar2(indice, indice2 + 1);
                }
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(indice + "\t" + indice2);
        }

    }

    //con excepciones
    public void checar3(int indice, int indice2) {
        if ((indice == 0 && indice2 == 0)) {
            return;
        }
        try {
            if (color == panel1.mat[indice][indice2].getcolor()) {
                panel1.mat[indice][indice2].setcolor(colornuevo);

                //if(indice2!=0)//west
                checar3(indice, indice2 - 1);

                //if(indice2!=panel1.mat.length-1)//east
                checar3(indice, indice2 + 1);

                //if (indice!=panel1.mat.length-1)//south
                checar3(indice + 1, indice2);

                //if(indice!=0)//north
                checar3(indice - 1, indice2);
            } else {
                return;
            }
        } catch (Exception e) { return; }

    }

    public boolean winCheck() {
        for (int i = 0; i < panel1.mat.length; i++) {
            for (int j = 0; j < panel1.mat[0].length; j++) {
                if (panel1.mat[i][j].getcolor() != colornuevo) {
                    return false;
                }
            }
        }
        return true;
    }

    public void restart(String resultado, int tipo) {
        int s = JOptionPane.showOptionDialog(null, resultado + "Quieres volver a Jugar?",
                "SALIR SISTEMA", JOptionPane.YES_NO_OPTION, tipo, null, (new String[]{"SI ;)", "NO :("}), "SI ;)");
        if (s == 1) {
            System.exit(0);
        }
        restart();
    }

    public void restart() {
        for (int i = 0; i < panel1.mat.length; i++) {
            for (int j = 0; j < panel1.mat[0].length; j++) {
                panel1.mat[i][j].setcolor(1 + (int) (Math.random() * 6));
            }
        }
        movimientos = 0;
        jLabel8.setText("");
        requestFocus();
    }


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(1);
    }                                    

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(2);
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(3);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(4);
    }                                    

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(5);
    }                                    

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Colorize(6);
    }                                    




}
