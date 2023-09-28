package aula07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseDeDados database = new BaseDeDados();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        Usuario user = database.getByNome(nomeUsuario);

        if (user != null && user.getSenha().equals(senha)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + user.getLogin() + ".");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
        
        scanner.close();
    }
}
