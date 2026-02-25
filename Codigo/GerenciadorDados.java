import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDados {
    private List<Pessoa> listaPessoas;
    private final String CAMINHO_ARQUIVO = "C:\\Users\\ghost\\Documents\\dados_clientes.dat";

    public GerenciadorDados() {
        this.listaPessoas = carregarDoArquivo();
    }

    // Adiciona uma pessoa e já salva no arquivo automaticamente
    public void cadastrar(Pessoa p) {
        listaPessoas.add(p);
        salvarNoArquivo();
    }

    private void salvarNoArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO_ARQUIVO))) {
            oos.writeObject(listaPessoas);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private List<Pessoa> carregarDoArquivo() {
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (!arquivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (List<Pessoa>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}