public class Banco {

    public int numConta;
    public String nome;
    public float saldo = 0.0f;
    public String tipoConta;
    public boolean status;


    public Banco() {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
        this.status = status;
        this.tipoConta = tipoConta;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Integer getNumConta() {
        return getNumConta();
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}
