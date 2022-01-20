import javax.swing.JOptionPane;

public class Livraria{
    //VARIÁVEIS GLOBAIS
    static String nomeLivro[] = new String[50];
    static String nomeAutor[] = new String[50];
    static String nomeEditora[] = new String[50];
    static int ano[] = new int[50];
    static int numLivros;

    //PROCEDIMENTO PARA O MENU
    public static void Menu(){
        char op = '0';
        boolean rp = true;

        op = JOptionPane.showInputDialog(null, "Escolha uma opção \n 1. Cadastrar Livros \n 2. Listar Livros \n 3. Sair", "Livraria", JOptionPane.QUESTION_MESSAGE).charAt(0);

        while(rp == true){
            switch(op){
                case '1':{
                    rp = false;
                    Cadastrar();
                }
                case '2':{
                    rp = false;
                    Listar();
                }
                case '3':{
                    rp = false;
                    System.exit(0);
                }
                default: JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
                Menu();
            }
        }
    }
    //PROCEDIMENTO PARA CADASTRO DE LIVROS
    public static void Cadastrar(){
        for(boolean rp = true; rp == true;){
            try{
                numLivros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos livros deseja cadastrar?", "Cadastro de Livros", JOptionPane.QUESTION_MESSAGE));
                rp = false;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Quantidade inválida! Tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

        for (int i = 0; i < numLivros; i++){
            nomeLivro[i] = JOptionPane.showInputDialog(null, "Nome do livro", "Cadastro de Livros", JOptionPane.QUESTION_MESSAGE);
            nomeAutor[i] = JOptionPane.showInputDialog(null, "Nome do autor", "Cadastro de Livros", JOptionPane.QUESTION_MESSAGE);
            nomeEditora[i] = JOptionPane.showInputDialog(null, "Nome da editora", "Cadastro de Livros", JOptionPane.QUESTION_MESSAGE);
            for(boolean rp = true; rp == true;){
                try{
                    ano[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de lançamento", "Cadastro de Livros", JOptionPane.QUESTION_MESSAGE));
                    rp = false;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Precisa digitar um ano válido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
        JOptionPane.showMessageDialog(null, "Livro(s) cadastrado(s) com sucesso!", "Livraria", JOptionPane.INFORMATION_MESSAGE);

        Menu();
    }
    
    //PROCEDIMENTO PARA LISTAR LIVROS CADASTRADOS
    public static void Listar(){
        for (int i = 0; i < numLivros; i++){
            JOptionPane.showMessageDialog(null, "Livros cadastrados \n \n Título: " + nomeLivro[i] + "\n Autor: " + nomeAutor[i] + "\n Editora: " + nomeEditora[i] + "\n Ano de lançamento: " + ano[i], "Lista de Livros", JOptionPane.INFORMATION_MESSAGE);
        }
        Menu();
    }
    public static void main(String args[]){

        Menu();

        System.exit(0);
    }
}