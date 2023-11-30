
package dal;
import java.sql.*;


public class ModuloConexao {
    	
    //Criando um método responsável por estabeleceruma conexão com o banco
    public static Connection conector() {
       
	   //Criando uma variável especial para estabelecer uma conexão com o banco
        Connection conexao = null;
        
		//Carregando o driver correspondente ao banco (não esqueça de importar ele em libraries 
        String driver = "com.mysql.jdbc.Driver";
        
		//Armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/infox?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";//endereço do banco de dados, ip do servidor
        
        
        String user = "root";
        String password = "root";
        //Estabelecendo a conexão com o banco
     
             try {
            Class.forName(driver);
      
            conexao = DriverManager.getConnection(url,user, password);
            
            
            System.out.println("Conexão realizada com sucesso");
            return conexao;

        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
         System.out.println(e);
                    System.out.println("Erro de conexão");
            return null;
        }

    }//fim Conexao
    
    public static void main(String[] args) {
        conector();    
    }
} //fim da classe conexão 
