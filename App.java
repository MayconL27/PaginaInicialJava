import java.util.ArrayList;
import java.util.Scanner;

import model.Usuario;

public class App {
    public static Usuario usuarioLogado = null;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        ArrayList<Usuario> usuarios = new ArrayList();

        boolean rodando = true;
        while (rodando) {
            System.out.println("=== PAGINA INICIAL ===");
            System.out.println("1 Fazer cadastro");
            System.out.println("2 Fazer Login");
            System.out.println("3 Sair");
            System.out.println("Digite a opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
            // FAZER CADASTRO.
            case "1": {
                System.out.println("CADASTRO");
                System.out.println("Digite email: ");
                String email = scanner.nextLine();
                System.out.println("Digite senha: ");
                String senha = scanner.nextLine();

                Usuario u = new Usuario();
                u.setEmail(email);
                u.setSenha(senha);

                usuarios.add(u); // adicionar array lista de usuarios em u

                System.out.println("Usuario cadastrado");

                break;
            }
            // FAZER LOGIN
            case "2": {
                System.out.println("LOGIN");
                System.out.println("Digite Email:");
                String email = scanner.nextLine();
                System.out.println("Digite a Senha:");
                String senha = scanner.nextLine();

                boolean loginSucesso = false;
                for (Usuario u : usuarios) {
                    String uEmail = u.getEmail();
                    String uSenha = u.getSenha();

                    boolean emailConfere = email.equals(uEmail);
                    boolean senhaConfere = senha.equals(uSenha);

                    if (emailConfere && senhaConfere) {
                        loginSucesso = true;
                        usuarioLogado = u;
                        break;
                    }
                }
                if (!loginSucesso) {
                    System.out.println("-----> incorreto");
                } else {
                    System.out.println("Logado");
                    homePage();
                }
                break;
            }
            // ENCERRAR PROGRAMA.
            case "3": {
                rodando = false;
                System.out.println("Programa encerrado...");
                break;
            }
            default: {
                break;
            }

            }

        }
        System.out.println("Fim do programa");

    }
    // HOMEPAGE LISTA DE TAREFAS
    public static void homePage() {
        boolean rodando = true;
        while (rodando) {
            System.out.println("=== HOME PAGE ===");
            System.out.println("1 mostrar tarefas");
            System.out.println("2 Mostrar tarefas finalizadas");
            System.out.println("3 Mostrar tarefas não finalizadas");
            System.out.println("4 Adicionar tarefas");
            System.out.println("5 Finalizar tarefas");
            System.out.println("6 Remover tarefa");
            System.out.println("7 Logout");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                // 1 mostrar tarefas
                case "1": {
                    break;
                }
                // 2 Mostrar tarefas finalizadas
                case "2": {
                    break;
                }
                // 3 Mostrar tarefas não finalizadas
                case "3": {
                    break;
                }
                // 4 Adicionar tarefas
                case "4": {
                    break;
                }
                // 5 Finalizar tarefas
                case "5": {
                    break;
                }
                // 6 Remover tarefa
                case "6": {
                    break;
                }
                // 7 Logout
                case "7": {
                    System.out.println("Fazendo logout...");
                    rodando = false;
                    break;
                }
                
            }
        }

    }
}
