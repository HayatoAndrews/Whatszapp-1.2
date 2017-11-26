package whatsapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Whatsapp {
    private ArrayList<Conversa> todasConversas = new ArrayList<>();
    private String nomeUsuario = "Fulano";
    private String telUsuario = "1234-5678";
    private String statusUsuario = "Online";
    private String contato;
    public void novaConversa(String contato){
    
        todasConversas.add(new Conversa(contato));
        
    }
    
    public ArrayList<Conversa> getTodasConversas(){
        return todasConversas;
    }
    
    public void enviarMensagem(String contato, String mensagem){ //pode ser alterada    
        
    }
    
    public void receberMensagem(String contato, String mensagem){//pode ser alterada
        
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }
    
    
}
/*private File f;
    public ArquivoSerializado(String nomeArquivo){
        f=new File(nomeArquivo);
    }
    public GerenciarClientes lerArquivo(){
        if(f.exists()){
            try (FileInputStream arquivoLeitura=new FileInputStream(f);
                    ObjectInputStream objetoLeitura= new ObjectInputStream(arquivoLeitura);)
            { 
                return(GerenciarClientes) objetoLeitura.readObject();}           
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"Deu ruim");
                return new GerenciarClientes();
                }        
        }else{
            JOptionPane.showMessageDialog(null, "Não tem arquivo");
            return new GerenciarClientes();
        }
       
            
    }
    public void gravarArquivo(GerenciarClientes ger){
        try (FileOutputStream arquivoGravar =
                new FileOutputStream(f);
             ObjectOutputStream objetoGravar =
                new ObjectOutputStream(arquivoGravar);)
        {
            objetoGravar.writeObject(ger);
            objetoGravar.flush();
            JOptionPane.showMessageDialog(null, "Deu bom");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }*/