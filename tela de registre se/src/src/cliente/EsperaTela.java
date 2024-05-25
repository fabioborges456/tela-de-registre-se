package src.cliente;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EsperaTela extends javax.swing.JFrame {

    Cliente cliente;
    String cpf;

    JSONObject jsonObj;    
    JSONParser parser = new JSONParser();
    
    Thread threadPosicao;
    Thread threadActivator;
       
    public EsperaTela(Cliente cliente, String cpf){
        this.cliente = cliente;
        this.cpf = cpf;
        
        initComponents();
        posicao(); 
        chatActivator();        
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
        btnLogout = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        posicaoFila = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(191, 234, 245));

        btnLogout.setBackground(new java.awt.Color(130, 170, 227));
        btnLogout.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(234, 253, 252));
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnChat.setBackground(new java.awt.Color(130, 170, 227));
        btnChat.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnChat.setForeground(new java.awt.Color(234, 253, 252));
        btnChat.setText("Iniciar chat");
        btnChat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 253, 252), 1, true));
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fila de espera");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("O botão será liberado quando for sua vez");

        jPanel2.setBackground(new java.awt.Color(130, 170, 227));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 253, 252), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sua posição atual é:");

        posicaoFila.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        posicaoFila.setForeground(new java.awt.Color(51, 51, 51));
        posicaoFila.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicaoFila.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posicaoFila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posicaoFila, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("x");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(btnChat, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGap(143, 143, 143)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        threadPosicao.interrupt();
        threadActivator.interrupt();
        
        if(btnChat.isEnabled()){
            jsonObj = new JSONObject();
            jsonObj.put("code", 8); //logout
            jsonObj.put("cpf", cpf);

            try {
                cliente.enviaMensagemChat(jsonObj.toJSONString());
                this.dispose();
            } catch (IOException ex) {
                System.out.println("Mensagem não enviada");
            }
        }
        
        jsonObj = new JSONObject();
        jsonObj.put("code", 14); //logout
        jsonObj.put("cpf", cpf);

        try {
            cliente.enviaMensagemChat(jsonObj.toJSONString());
        } catch (IOException ex) {
            System.out.println("Mensagem não enviada");
        }
        
        dispose();
        new LoginForm(cliente).setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
                     
        jsonObj = new JSONObject(); 
        
        jsonObj.put("code", 12);
        jsonObj.put("cpf", cpf);
        
        try {
            
            String msgServer = cliente.enviaMensagem(jsonObj.toJSONString());
            cliente.clienteLog.atualizaLog(msgServer);
            
            jsonObj = new JSONObject();
            jsonObj = (JSONObject) parser.parse(msgServer);
            
            if(Boolean.parseBoolean(jsonObj.get("success").toString())) {
            
                new ChatTela(cliente, cpf, false).setVisible(true);
                threadPosicao.interrupt();
                threadActivator.interrupt();
                this.dispose();
           
            } else {
                System.out.println("Falha ao receber chat");      
            }
            
        } catch (IOException ex) {
            System.out.println("Mensagem não enviada");
        } catch (ParseException ex) {
            System.out.println("Erro ao criar JSON");                  
        }                                                        
    }//GEN-LAST:event_btnChatActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel posicaoFila;
    // End of variables declaration//GEN-END:variables
  
    private void posicao(){

        //Pede a posição ao server de tempo em tempo
        threadPosicao = new Thread(() -> {
            int posicao = 0;
                 
            while(!threadPosicao.isInterrupted()){

                jsonObj = new JSONObject();
                jsonObj.put("code", 10);
                jsonObj.put("cpf", cpf);
                System.out.println("JSON enviada: " + jsonObj.toJSONString());
                
                try {
                    cliente.enviaMensagemChat(jsonObj.toJSONString());     
                } catch (IOException ex) {
                    System.out.println("Mensagem não enviada");
                }
                
                if(!threadPosicao.isInterrupted()){
                    try {
                        sleep(5000);
                    } catch (InterruptedException ex) {
                       break;
                    }
                }
            }                                           
        });
        threadPosicao.start();
    }

    private void chatActivator() {
        
        //Thread pra ficar aguardando mensagem do server
        threadActivator = new Thread(() -> {
            while (!threadActivator.isInterrupted()) {
                try {
                    //Fica esperando receber msg
                    String mensagem = cliente.recebeMensagem();
                    cliente.clienteLog.atualizaLog("Recebeu: " + mensagem);
                    
                    //Interpreta a msg
                    jsonObj = new JSONObject();
                    jsonObj = (JSONObject) parser.parse(mensagem);
                    System.out.println("JSON recebida do activator: " + jsonObj.toJSONString());                    
                    int code = Integer.parseInt(jsonObj.get("code").toString());                                        
                                                            
                    if (code == 110){
                        
                        //Recebeu a posição na fila
                        String posicao = (String.valueOf(jsonObj.get("position")));                        
                        posicaoFila.setText(posicao);
                        if(Integer.parseInt(posicao) <= 0){
                            threadPosicao.interrupt();                                                    
                        }
                        
                    } else if (code == 155){
                        
                        //Recebeu a chamada para entrar no chat                      
                        btnChat.setEnabled(true);
                        threadPosicao.interrupt();
                        threadActivator.interrupt();
                        
                    }

                } catch (IOException | ParseException ex) {
                    System.out.println("erro na threadActivator");
                }
            }
        });
        
        threadActivator.start();                
    }
}