package whatsapp;

import java.time.LocalDateTime;
import java.util.ArrayList;



public class Conversa {
    private ArrayList<Mensagem> conversa = new ArrayList<>();
    private String contato;
    private String dataHoraOnlineContato;//pode ser alterado o tipo
    private LocalDateTime horaMsg;
    
    public Conversa() {
        
    }

    public Conversa(String contato) {
    this.contato = contato;
    }
    
    public void adicionarMensagem(String emissor, String mensagem){
        horaMsg = LocalDateTime.now();
        conversa.add(new Mensagem(emissor, mensagem, horaMsg.toString()));
        
        
        
    }  
    
    public ArrayList<Mensagem> buscarMensagens(String palavra){ // Busca e retorna todas as mensagens encontradas na forma de um ArrayList
        ArrayList<Mensagem> mensagensEncontradas = new ArrayList<>();
        
        
        return mensagensEncontradas;
    }
    
    public ArrayList<Mensagem> mostrarMensagens(){ // Retorna as mensagens p/ interface
        ArrayList<Mensagem> mensagens = new ArrayList<>();
        
        return mensagens;
    }

    public String getContato() {
        return contato;
    }
    
    public String getMensagens(){
        StringBuilder sb = new StringBuilder();
        if (conversa.size() > 0) {
            for (Mensagem mensagem : conversa) {
            sb.append(mensagem.getMensagem());
            sb.append("\n");
            sb.append("    ");
            sb.append(mensagem.getTelEmissor());
            sb.append(" - ");
            sb.append(mensagem.getDataHora());
            sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    private String horaLocal(){
        StringBuilder sb = new StringBuilder();
        sb.append(horaMsg.getDayOfMonth());
        sb.append("/");
        sb.append(horaMsg.getMonth());
        sb.append("/");
        sb.append(horaMsg.getYear());
        sb.append(" - ");
        sb.append(horaMsg.getHour());
        sb.append(":");
        sb.append(horaMsg.getMinute());
        
        return sb.toString();
    }
    
}
