import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> carros; // Boa prática: programar voltado à interface (List)

    public Frota(){
        this.carros = new ArrayList<>();
    }
    // construtor(sem parâmetros)

    // criar os métodos adicionar carro, remover carro e pesquisar carro

    // adicionar carro
    public void adicionarCarro(Carro novo) {
        this.carros.add(novo);
    }

    //pesquisar carro
    public Carro pesquisarPlaca(String placa) {
        for (Carro carro : this.carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }

    //remover carro
    public void removerCarro(String placa) {
        Carro carro = pesquisarPlaca(placa);
        if (carro != null) {
            this.carros.remove(carro);
        }
    }

}
