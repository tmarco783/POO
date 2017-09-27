package Lista03.Questao1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);*/
        Filme filme[] = new Filme[4];
        Cd cd[] = new Cd[3];
        Jogo jogo[] = new Jogo[3];
        
        //Obtendo os dados de 'Filme' atráves de JOptionPane
        for(int i = 0; i < 4; i++){
            filme[i] = new Filme();
            filme[i].setTitulo(JOptionPane.showInputDialog("Entre com o título do filme "+(i+1)+": "));
            filme[i].setDiretor(JOptionPane.showInputDialog("Entre com o nome do diretor: "));
            filme[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de lançamento: ")));
            filme[i].setTempoDuracao(JOptionPane.showInputDialog("Entre com o tempo de duração do filme: "));
            filme[i].setComentarios(JOptionPane.showInputDialog("Escreva algum comentário: "));
        }
        
        //Obtendo os dados de 'Cd' atráves de JOptionPane
        for(int i = 0; i < 3; i++){
            cd[i] = new Cd();
            cd[i].setTitulo(JOptionPane.showInputDialog("Entre com o título do CD "+(i+1)+": "));
            cd[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de lançamento: ")));
            cd[i].setArtista(JOptionPane.showInputDialog("Entre com o nome do artista: "));
            cd[i].setQtdeFaixas(Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de faixas: ")));
            cd[i].setTempoDuracao(JOptionPane.showInputDialog("Entre com o tempo de duração do CD: "));
            cd[i].setComentarios(JOptionPane.showInputDialog("Escreva algum comentário: "));
        }
        
        //Obtendo os dados de 'Jogo' atráves de JOptionPane
        for(int i = 0; i < 3; i++){
            jogo[i] = new Jogo();
            jogo[i].setTitulo(JOptionPane.showInputDialog("Entre com o título do jogo "+(i+1)+": "));
            jogo[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de lançamento: ")));
            jogo[i].setNumJogadores(Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de jogadores: ")));
            jogo[i].setPlataforma(JOptionPane.showInputDialog("Entre com a plataforma do jogo: "));
            jogo[i].setTempoDuracao(JOptionPane.showInputDialog("Entre com o tempo de duração do jogo: "));
            jogo[i].setComentarios(JOptionPane.showInputDialog("Escreva algum comentário: "));  
        }
        
        //Mostrando dados de 'Filme'
        System.out.println("==============================");
        for(int i = 0; i < 4; i++){
            System.out.println(filme[i].mostraDadosComuns());
            System.out.println(filme[i].toString());
        }
        
        //Mostrando dados de 'Cd'
        System.out.println("==============================");
        for(int i = 0; i < 3; i++){
            System.out.println(cd[i].mostraDadosComuns());
            System.out.println(cd[i].toString());
        }
        
        //Mostrando dados de 'Jogo'
        System.out.println("==============================");
        for(int i = 0; i < 3; i++){
            System.out.println(jogo[i].mostraDadosComuns());
            System.out.println(jogo[i].toString());
            System.out.println("Plataforma de " + jogo[i].getTitulo() + ": " + jogo[i].getPlataforma()); //Mostrando a plataforma separadamente
        }
        
        
        
        
        
    }
    
}
