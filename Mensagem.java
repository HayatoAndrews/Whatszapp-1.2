package whatsapp;

public class Mensagem {
    private String telEmissor;//Nome pode mudar
    private String mensagem;
    private String statusMensagem;
    private String dataHora;//Pode mudar

    public Mensagem(String telEmissor, String mensagem, String dataHora) {
        this.telEmissor = telEmissor;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public String getTelEmissor() {
        return telEmissor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getStatusMensagem() {
        return statusMensagem;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setStatusMensagem(String statusMensagem) {
        this.statusMensagem = statusMensagem;
    }
    
    
}
