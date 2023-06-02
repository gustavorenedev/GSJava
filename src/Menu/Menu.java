package Menu;

import java.util.Scanner;

import Agricultor.GerenciadorAgricultor;
import Plantio.Plantio;

public class Menu {
    private GerenciadorAgricultor gerenciador;
    private Scanner input;
    private boolean perfilCriado;

    public Menu(GerenciadorAgricultor gerenciador) {
        this.gerenciador = gerenciador;
        input = new Scanner(System.in);
        perfilCriado = false;
    }

    public void exibirMenuInicial() {
        System.out.println("Bem-vindo pequeno agricultor\n");
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Criar meu perfil");
        System.out.println("0 - Sair");
        System.out.println("");

        int opcao = input.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                gerenciador.adicionarAgricultores();
                perfilCriado = true;
                exibirMenuLogado();
                break;
            case 0:
                System.out.println("Sistema Encerrado!");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                exibirMenuInicial();
        }
    }

    public void exibirMenuLogado() {
        System.out.println("Olá, " + gerenciador.getAgricultor(0).getNome());
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Ver meu perfil");
        System.out.println("2 - Ver plantio da minha região");
        System.out.println("3 - Atualizar meu perfil");
        System.out.println("4 - Excluir meu perfil");
        System.out.println("0 - Sair");
        System.out.println("");

        int opcao = input.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                gerenciador.mostrarAgricultores();
                break;
            case 2:
                if (perfilCriado) {
                    int regiao = gerenciador.getAgricultor(0).getRegiao();
                    Plantio.mostrarAlimentos(regiao);

                    System.out.println("Selecione o número do alimento que deseja plantar:");
                    int opcaoAlimento = input.nextInt();
                    System.out.println();

                    Plantio.mostrarDicasPlantio(regiao, opcaoAlimento);
                } else {
                    System.out.println("Nenhum agricultor cadastrado.");
                }
                break;
            case 3:
                gerenciador.atualizarAgricultor();
                break;
            case 4:
                gerenciador.deletarAgricultor();
                perfilCriado = false;
                exibirMenuInicial();
                break;
            case 0:
                System.out.println("Sistema Encerrado!");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println();
        exibirMenuLogado();
    }
}