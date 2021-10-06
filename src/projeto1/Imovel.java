 
package projeto1;
public class Imovel {
    String nome;
    float impostoImovel;
    int meses_Atraso;
    String Matricula;

            public String retornarMatricula() {
        return Matricula;
    }

            public void colocarMatricular(String Matricula) {
        this.Matricula = Matricula;
    }
    
    public String retornarNome() {
        return nome;
    }

     public void colocarNome(String nome) {
        this.nome = nome;
    }

    public float retornarImpostoImovel() {
        return impostoImovel;
    }

             public void colocarImpostoImovel(float impostoImovel) {
        this.impostoImovel = impostoImovel;
    }

          public int retornarMesesAtraso() {
        return meses_Atraso;
    }

            public void colocarMesesAtraso(int meses_Atraso) {
        this.meses_Atraso = meses_Atraso;
    }
    
}
