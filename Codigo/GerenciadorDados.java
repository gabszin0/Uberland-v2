import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDados {
    private List<Pessoa> listaPessoas;
    private final String CAMINHO_ARQUIVO = "dados_clientes.dat";

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
    public Pessoa buscarPorCpf(String cpf) {
        for (Pessoa p : listaPessoas) {
            // Verifica se o CPF não é nulo e se é igual ao pesquisado
            if (p.getCpf() != null && p.getCpf().equals(cpf)) {
                return p; // Achou! Devolve o cliente.
            }
        }
        return null; // Não achou ninguém
    }

    public boolean removerPorCpf(String cpf) {
        Pessoa clienteParaRemover = buscarPorCpf(cpf);
        
        if (clienteParaRemover != null) {
            listaPessoas.remove(clienteParaRemover); // Tira da lista
            salvarNoArquivo(); // Salva o arquivo .dat atualizado (sem o cliente)
            return true; // Sucesso na remoção
        }
        return false; // Falhou 
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