package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private String telefone;
    private Endereco endereco;

    Scanner sc = new Scanner(System.in);

    private ArrayList<Pessoa> lista = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Pessoa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }

    public void addLista(Pessoa pessoa) {
        lista.add(pessoa);
    }

    public void incluir() {

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Rua: ");
        String rua = sc.nextLine();
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Complemento: ");
        String complemento = sc.nextLine();
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("Estado: ");
        String estado = sc.nextLine();
        System.out.print("CEP: ");
        String cep = sc.nextLine();
        

        addLista(new Pessoa(nome, telefone, new Endereco(rua, complemento, cidade, estado, cep, numero)));
        
        System.out.println("Cadastro efetuado com sucesso!");
        sc.nextLine();

    }

    public void relatorio() {

            System.out.println("__________________________________________________________");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("NOME: " + lista.get(i).nome);
            System.out.println("TELEFONE: " + lista.get(i).telefone);
            System.out.println("ENDERECO: " + lista.get(i).endereco.toString());
            System.out.println("__________________________________________________________");

        }
        sc.nextLine();

    }

    public void remover() {

        relatorio();

        System.out.print("Informe o ID que dejesa remover da lista: ");
        int indice = sc.nextInt();
        lista.remove(indice);
        
        System.out.println("Removido com Sucesso");
        relatorio();
        
        sc.nextLine();

    }

    public void alterar() {
        relatorio();

        System.out.print("Informe o ID de que dejesa alterar os dados: ");
        int indice = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("[1]Nome: ");
        System.out.println("[2]Telefone: ");
        System.out.println("[3]Endereco: ");
        System.out.println("");
        System.out.print("Qual dado deseja alterar? ");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                
                sc.nextLine();
                
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                lista.get(indice).setNome(nome);
                System.out.println("Alterado com Sucesso");
                relatorio();
                sc.nextLine();
                
                break;

            case 2:

                sc.nextLine();
                System.out.print("Telefone: ");
                String telefone = sc.nextLine();
                lista.get(indice).setTelefone(telefone);
                System.out.println("Alterado com Sucesso");
                relatorio();
                sc.nextLine();
                break;

            case 3:

                sc.nextLine();
                System.out.println("[1]Rua ");
                System.out.println("[2]Numero ");
                System.out.println("[3]Complemento ");
                System.out.println("[4]Cidade ");
                System.out.println("[5]Estado");
                System.out.println("[6]Cep");

                System.out.print("Opcao: ");
                int opcaoEndereco = sc.nextInt();

                switch (opcaoEndereco) {

                    case 1:
                        
                        sc.nextLine();
                        System.out.print("Rua: ");
                        String rua = sc.nextLine();
                        lista.get(indice).endereco.setRua(rua);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;
                        
                    case 2:
                        
                        sc.nextLine();
                        System.out.print("Numero: ");
                        int numero = sc.nextInt();
                        lista.get(indice).endereco.setNumero(numero);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;
                        
                    case 3:
                        
                        sc.nextLine();
                        System.out.print("Complemento: ");
                        String complemento = sc.nextLine();
                        lista.get(indice).endereco.setComplemento(complemento);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;

                    case 4:

                        sc.nextLine();
                        System.out.print("Cidade: ");
                        String cidade = sc.nextLine();
                        lista.get(indice).endereco.setCidade(cidade);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;

                    case 5:
                        
                        sc.nextLine();
                        System.out.print("Estado: ");
                        String estado = sc.nextLine();
                        lista.get(indice).endereco.setEstado(estado);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;

                    case 6:
                        
                        sc.nextLine();
                        System.out.print("CEP: ");
                        String cep = sc.nextLine();
                        lista.get(indice).endereco.setCep(cep);
                        System.out.println("Alterado com Sucesso");
                        relatorio();
                        sc.nextLine();
                        break;
                        
                    default:
                        System.out.println("Opcao Invalida");
                }
            default:
                System.out.println("Opcao Invalida");

        } 

    }

}
