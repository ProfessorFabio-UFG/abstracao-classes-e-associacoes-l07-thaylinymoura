package java.endereco;
import java.musicasecompositores.Compositor;
import java.util.ArrayList;
import java.util.List;

public class EndResidencial {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Avenida Paulista");
        endereco.setNumero(1578);
        endereco.setBairro("Bela Vista");
        endereco.setComplemento("Apto 1203");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(endereco);

        Cliente cliente = new Cliente("Geovana", 72, enderecos);

        endereco.setCliente(new ArrayList<>());
        endereco.getCliente().add(cliente);

        System.out.println(endereco);
    }

}


