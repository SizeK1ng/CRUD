import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tag = 0;
        Scanner sc = new Scanner(System.in);

        // Criar uma instância do objeto Cliente para gerenciar cadastros
        Cliente clienteManager = new Cliente("", "", "");

        do {
            System.out.println();
            System.out.println("1- Cadastrar-Cliente");
            System.out.println("2- Listar-Clientes");
            System.out.println("3- Atualizar Dados");
            System.out.println("4- Deletar-Cliente");
            System.out.println("5- Buscar-Cliente");
            System.out.println("6- Sair");
            System.out.println();

            System.out.println("Digite uma opção válida: ");
            tag = Integer.parseInt(sc.nextLine());

            switch (tag) {
                case 1:
                    // Cadastrar Cliente
                    System.out.print("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o e-mail do cliente: ");
                    String email = sc.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = sc.nextLine();

                    Cliente novoCliente = new Cliente(nome, email, telefone);
                    clienteManager.adicionarCadastro(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    // Listar Clientes
                    if (clienteManager.getCadastrosCliente().isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Lista de Clientes: ");
                        for (Cliente c : clienteManager.getCadastrosCliente()) {
                            System.out.println("Nome: " + c.getNome() + " | E-mail: " + c.getEmail() + " | Telefone: " + c.getTelefone());
                        }
                    }
                    break;

                case 3:
                    // Atualizar Dados do Cliente
                    System.out.print("Digite o nome do cliente para atualizar: ");
                    String nomeAtualizar = sc.nextLine();
                    Cliente clienteEncontrado = null;

                    // Buscar o cliente
                    for (Cliente c : clienteManager.getCadastrosCliente()) {
                        if (c.getNome().equalsIgnoreCase(nomeAtualizar)) {
                            clienteEncontrado = c;
                            break;
                        }
                    }

                    if (clienteEncontrado == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        System.out.print("Digite o novo e-mail: ");
                        String novoEmail = sc.nextLine();
                        System.out.print("Digite o novo telefone: ");
                        String novoTelefone = sc.nextLine();

                        clienteEncontrado.setEmail(novoEmail);
                        clienteEncontrado.setTelefone(novoTelefone);
                        System.out.println("Dados atualizados com sucesso!");
                    }
                    break;

                case 4:
                    // Deletar Cliente
                    System.out.print("Digite o nome do cliente para deletar: ");
                    String nomeDeletar = sc.nextLine();
                    Cliente clienteDeletado = null;

                    // Buscar o cliente para deletar
                    for (Cliente c : clienteManager.getCadastrosCliente()) {
                        if (c.getNome().equalsIgnoreCase(nomeDeletar)) {
                            clienteDeletado = c;
                            break;
                        }
                    }

                    if (clienteDeletado == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        clienteManager.getCadastrosCliente().remove(clienteDeletado);
                        System.out.println("Cliente deletado com sucesso!");
                    }
                    break;

                case 5:
                    // Buscar Cliente
                    System.out.print("Digite o nome do cliente para buscar: ");
                    String nomeBuscar = sc.nextLine();
                    Cliente clienteBuscado = null;

                    // Buscar o cliente
                    for (Cliente c : clienteManager.getCadastrosCliente()) {
                        if (c.getNome().equalsIgnoreCase(nomeBuscar)) {
                            clienteBuscado = c;
                            break;
                        }
                    }

                    if (clienteBuscado == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        System.out.println("Cliente encontrado!");
                        System.out.println("Nome: " + clienteBuscado.getNome());
                        System.out.println("E-mail: " + clienteBuscado.getEmail());
                        System.out.println("Telefone: " + clienteBuscado.getTelefone());
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
            }
        } while (tag != 6);

        sc.close();
    }
}
