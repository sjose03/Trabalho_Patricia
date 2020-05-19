public class Paciente {
     long cpf;
     String nome;
     public Paciente(long cpf,String nome){
         this.nome = nome;
         this.cpf = cpf;
     }
     public Paciente(Paciente paciente){
     }

    @Override
    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf;
    }
}
