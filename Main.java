import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        ArrayList<Imposto> listaImpostos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
       OUTER:
       while (true) {
           System.out.println("Selecione uma opção:");
           System.out.println("1 - Registrar Imposto");
           System.out.println("2 - Consultar Imposto");
           System.out.println("3 - Atualizar Imposto");
           System.out.println("4 - Ver Lista de Impostos");
           System.out.println("5 - Remover Imposto");
           System.out.println("6 - Sair");
           int opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                   registrarImposto(listaImpostos, scanner);
                   break;
               case 2:
                   consultarImposto(listaImpostos, scanner);
                   break;
               case 3:
                   atualizarImposto(listaImpostos, scanner);
                   break;
               case 4:
                   verListaImpostos(listaImpostos);
                   break;
               case 5:
                   removerImposto(listaImpostos, scanner);
                   break;
               case 6:
                   System.out.println("Sair");
                   break OUTER;
               default:
                   System.out.println("Opção inválida!");
                   break;
           }
       }
    }

     
    /**
     * @param listaImpostos
     * @param scanner
     */
    public static void registrarImposto(ArrayList<Imposto> listaImpostos, Scanner scanner) {
        System.out.println("Selecione o tipo de imposto:");
        System.out.println("1 - Imposto Predial");
        System.out.println("2 - Imposto Vivenda");
        System.out.println("3 - Imposto Veículos Motorizados");
        System.out.println("4 - Imposto Veículos Pesados");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o nome do cliente:"
                + "");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o NIF do cliente:");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite o endereço do cliente:");
        System.out.println("Rua:");
        String rua = scanner.nextLine();
        System.out.println("Número:");
        String numero = scanner.nextLine();
        System.out.println("Bairro:");
        String bairro = scanner.nextLine();
        System.out.println("Cidade:");
        String cidade = scanner.nextLine();
        System.out.println("País:");
        String pais = scanner.nextLine();
        final Endereco endereco = new Endereco(rua, numero, bairro, cidade, pais);

        System.out.println("Digite o contacto do cliente:");
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o valor do imposto:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a data do pagamento do imposto (no formato dd/mm/aaaa)1"
                + ":");
        String datapagamento = scanner.nextLine();
        String dataPagamento;
        dataPagamento = datapagamento;
        Imposto imposto = null;
        
       switch (tipo) {
           case 1:
               imposto = new ImpostoPredial(nome, cpf, endereco, telefone, email, valor, dataPagamento);
               break;
           case 2:
               imposto = new ImpostoVivenda(nome, cpf, endereco, telefone, email, valor, dataPagamento);
               break;
           case 3:
               {
                   System.out.println("Digite a marca do veículo:");
                   String placa = scanner.nextLine();
                   System.out.println("Digite a modelo do veículo:");
                   String marca = scanner.nextLine();
                   System.out.println("Digite a placa do veículo:");
                   String modelo = scanner.nextLine();
                   System.out.println("Digite o ano do veículo:");
                   int ano = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Digite a potência do veículo:");
                   double potencia = scanner.nextDouble();
                   scanner.nextLine();
                   break;
               }
           case 4:
               {
                   System.out.println("Digite a placa do veículo:");
                   String placa = scanner.nextLine();
                   System.out.println("Digite a marca do veículo:");
                   String marca = scanner.nextLine();
                   System.out.println("Digite o modelo do veículo:");
                   String modelo = scanner.nextLine();
                   System.out.println("Digite o ano do veículo:");
                   int ano = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Digite a capacidade de carga do veículo:");
                   double capacidadeCarga = scanner.nextDouble();
                   System.out.println("Digite a Tonelagem do veículo:");
                   int tonelagem = scanner.nextInt();
                   scanner.nextLine();
                   break;
               }
           default:
               break;
       }

        listaImpostos.add(imposto);
        System.out.println("Imposto registrado com sucesso!");
}

    public static void consultarImposto(ArrayList<Imposto> listaImpostos, Scanner scanner) {
        System.out.println("Digite o ID do imposto:");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (Imposto imposto : listaImpostos) {
            if (imposto.getId() == id) {
        System.out.println(imposto);
            encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
        System.out.println("Imposto não encontrado!");
        }
    }

    public static void atualizarImposto(ArrayList<Imposto> listaImpostos, Scanner scanner) {
        System.out.println("Digite o ID do imposto:");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (Imposto imposto : listaImpostos) {
            if (imposto.getId() == id) {
        System.out.println("Digite o novo valor do imposto:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        imposto.setValor(valor);
        System.out.println("Imposto atualizado com sucesso!");
                encontrado = true;
                break;

            }
        }
        
        if (!encontrado) {
        System.out.println("Imposto não encontrado!");
        }
    }

    public static void verListaImpostos(ArrayList<Imposto> listaImpostos) {
        System.out.println("Lista de Impostos:");
        listaImpostos.forEach((imposto) -> {
            System.out.println(imposto);
       });
    }

    public static void removerImposto(ArrayList<Imposto> listaImpostos, Scanner scanner) {
        System.out.println("Digite o ID do imposto:");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        boolean removido = listaImpostos.removeIf(imposto -> imposto.getId() == id);
        if (removido) {
            System.out.println("Imposto removido com sucesso!");
        } else {
            System.out.println("Imposto não encontrado!");
        }
    }

    }