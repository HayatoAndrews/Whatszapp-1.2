package whatsapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Zapzap extends javax.swing.JFrame {
    //caso não exista arquivo whatsapp
    Whatsapp nov=new Whatsapp();
    DefaultListModel conteudoListCont = new DefaultListModel(); //Cria a lista que ira armazenar o conteudo do Jlist
    
    public Zapzap() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMensagem = new javax.swing.ButtonGroup();
        panelContatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContatos = new javax.swing.JList<>();
        panelInformacoesUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelOpcoes = new javax.swing.JPanel();
        textPesquisar = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        buttonNovoContato = new javax.swing.JButton();
        panelinformacoesContato = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelMensagem = new javax.swing.JPanel();
        buttonEnviar = new javax.swing.JButton();
        textMensagem = new javax.swing.JTextField();
        rbVoce = new javax.swing.JRadioButton();
        rbContato = new javax.swing.JRadioButton();
        panelConversa = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atConversa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listContatos.setModel(conteudoListCont);
        listContatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listContatosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listContatos);
        listContatos.getAccessibleContext().setAccessibleName("listContatos");

        javax.swing.GroupLayout panelContatosLayout = new javax.swing.GroupLayout(panelContatos);
        panelContatos.setLayout(panelContatosLayout);
        panelContatosLayout.setHorizontalGroup(
            panelContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelContatosLayout.setVerticalGroup(
            panelContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelInformacoesUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelInformacoesUsuario.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Fulano");

        jLabel2.setText("Online");

        javax.swing.GroupLayout panelInformacoesUsuarioLayout = new javax.swing.GroupLayout(panelInformacoesUsuario);
        panelInformacoesUsuario.setLayout(panelInformacoesUsuarioLayout);
        panelInformacoesUsuarioLayout.setHorizontalGroup(
            panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelInformacoesUsuarioLayout.setVerticalGroup(
            panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        panelOpcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.setActionCommand("jPesquisar");
        buttonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPesquisarMouseClicked(evt);
            }
        });

        buttonNovoContato.setText("Novo Contato");
        buttonNovoContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNovoContatoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcoesLayout = new javax.swing.GroupLayout(panelOpcoes);
        panelOpcoes.setLayout(panelOpcoesLayout);
        panelOpcoesLayout.setHorizontalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPesquisar)
                    .addGroup(panelOpcoesLayout.createSequentialGroup()
                        .addComponent(buttonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNovoContato)))
                .addContainerGap())
        );
        panelOpcoesLayout.setVerticalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisar)
                    .addComponent(buttonNovoContato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textPesquisar.getAccessibleContext().setAccessibleName("textPesquisar");
        buttonPesquisar.getAccessibleContext().setAccessibleName("buttonPesquisar");
        buttonNovoContato.getAccessibleContext().setAccessibleName("buttonNovoContato");

        panelinformacoesContato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout panelinformacoesContatoLayout = new javax.swing.GroupLayout(panelinformacoesContato);
        panelinformacoesContato.setLayout(panelinformacoesContatoLayout);
        panelinformacoesContatoLayout.setHorizontalGroup(
            panelinformacoesContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacoesContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
        );
        panelinformacoesContatoLayout.setVerticalGroup(
            panelinformacoesContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacoesContatoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonEnviar.setText("Enviar");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });

        groupMensagem.add(rbVoce);
        rbVoce.setText("Você");

        groupMensagem.add(rbContato);
        rbContato.setLabel("Contato");

        javax.swing.GroupLayout panelMensagemLayout = new javax.swing.GroupLayout(panelMensagem);
        panelMensagem.setLayout(panelMensagemLayout);
        panelMensagemLayout.setHorizontalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMensagem)
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addComponent(rbVoce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(buttonEnviar)))
                .addContainerGap())
        );
        panelMensagemLayout.setVerticalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEnviar)
                    .addComponent(rbVoce)
                    .addComponent(rbContato))
                .addContainerGap())
        );

        buttonEnviar.getAccessibleContext().setAccessibleName("buttonEnviar");
        textMensagem.getAccessibleContext().setAccessibleName("textMensagem");
        rbVoce.getAccessibleContext().setAccessibleName("rbVoce");
        rbContato.getAccessibleContext().setAccessibleName("rbContato");

        panelConversa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atConversa.setEditable(false);
        atConversa.setColumns(20);
        atConversa.setRows(5);
        jScrollPane2.setViewportView(atConversa);
        atConversa.getAccessibleContext().setAccessibleName("atConversa");

        javax.swing.GroupLayout panelConversaLayout = new javax.swing.GroupLayout(panelConversa);
        panelConversa.setLayout(panelConversaLayout);
        panelConversaLayout.setHorizontalGroup(
            panelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelConversaLayout.setVerticalGroup(
            panelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelInformacoesUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelinformacoesContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConversa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelinformacoesContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInformacoesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContatos.getAccessibleContext().setAccessibleName("panelContatos");
        panelInformacoesUsuario.getAccessibleContext().setAccessibleName("panelInformacoesUsuario");
        panelOpcoes.getAccessibleContext().setAccessibleName("panelOpcoes");
        panelOpcoes.getAccessibleContext().setAccessibleDescription("");
        panelinformacoesContato.getAccessibleContext().setAccessibleName("panelInformacoesContato");
        panelMensagem.getAccessibleContext().setAccessibleName("panelMensagem");
        panelConversa.getAccessibleContext().setAccessibleName("panelConversa");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //fazer try catch para campo vazio do texto
    private void buttonNovoContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoContatoMouseClicked
        String teste="";
        teste=textPesquisar.getText();
        if (teste.isEmpty()) {
         JOptionPane.showMessageDialog(this, "Campo em branco...");
        } else {
            
        if(teste.charAt(0)==' '){
            JOptionPane.showMessageDialog(this, "Não inicie o contato com espaço");
            textPesquisar.setText("");
        }
        else{nov.novaConversa(textPesquisar.getText());
        Conversa c = new Conversa(textPesquisar.getText());
        conteudoListCont.addElement(c.getContato());
        textPesquisar.setText("");
        }
        }
    }//GEN-LAST:event_buttonNovoContatoMouseClicked

    private void listContatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listContatosValueChanged
        int indiceLista = listContatos.getSelectedIndex();
        atConversa.setText(nov.getTodasConversas().get(indiceLista).getMensagens());
    }//GEN-LAST:event_listContatosValueChanged

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        String teste;
        int indiceLista;
        teste=textMensagem.getText();
        if(listContatos.getSelectedIndex()>=0){
            indiceLista = listContatos.getSelectedIndex();
            if(teste.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, digite a sua mensagem");
        }
        else if (rbVoce.isSelected()) {
            nov.getTodasConversas().get(indiceLista).adicionarMensagem(nov.getNomeUsuario(), textMensagem.getText());
        } else if (rbContato.isSelected()) {
            nov.getTodasConversas().get(indiceLista).adicionarMensagem(
                    nov.getTodasConversas().get(indiceLista).getContato(), textMensagem.getText());
        }
        else
            JOptionPane.showMessageDialog(this, "Selecione a pessoa a enviar essa mensagem");
        atConversa.setText(nov.getTodasConversas().get(indiceLista).getMensagens());
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecione com quem você irá conversar");
        }
        textMensagem.setText("");
        
        
    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void buttonPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseClicked
        //precisaria do código relacionado a pesquisa
        String teste="";
        teste=textPesquisar.getText();
        if (teste.isEmpty()) {
         JOptionPane.showMessageDialog(this, "Campo em branco...");
        } else {
            
        if(teste.charAt(0)==' '){
            JOptionPane.showMessageDialog(this, "Não inicie a pesquisa com espaço");
            textPesquisar.setText("");
        }
        else{
            //aqui fica o código de pesquisa...
        }
        }
        
        
    }//GEN-LAST:event_buttonPesquisarMouseClicked

    public static void main(String args[]) {
        int escolha;
        
        try{
        BufferedReader bf=new BufferedReader(new FileReader("ArquivoTeste.txt"));    
        }catch(FileNotFoundException fnf){
        JOptionPane.showMessageDialog(null, "Arquivo de origem não encontrado...Procurando por backup");
        try{
        BufferedReader bf2=new BufferedReader(new FileReader("backup.txt"));
        }catch(FileNotFoundException fnf2){
        do{escolha=Integer.parseInt(JOptionPane.showInputDialog(null, "Problema em leitura do backup..."
                + "\nVocê deseja executar o programa sem seus contatos?"
                + "\n1-Sim"
                + "\n2-Não(encerrar programa)"));
                if(escolha==2){
                System.exit(0);
                }
                    
        }while(escolha!=1);
        }
        }
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
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zapzap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atConversa;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonNovoContato;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.ButtonGroup groupMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listContatos;
    private javax.swing.JPanel panelContatos;
    private javax.swing.JPanel panelConversa;
    private javax.swing.JPanel panelInformacoesUsuario;
    private javax.swing.JPanel panelMensagem;
    private javax.swing.JPanel panelOpcoes;
    private javax.swing.JPanel panelinformacoesContato;
    private javax.swing.JRadioButton rbContato;
    private javax.swing.JRadioButton rbVoce;
    private javax.swing.JTextField textMensagem;
    private javax.swing.JTextField textPesquisar;
    // End of variables declaration//GEN-END:variables
}
