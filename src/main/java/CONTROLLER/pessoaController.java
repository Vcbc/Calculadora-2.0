
package CONTROLLER;
import MODEL.pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import UTIL.CONNECTIONFACTORY;
import java.sql.SQLException;

public class pessoaController {
    
    public void Salvar(pessoa PESSOA){
        
        String sql = "INSERT INTO infos( `NOME`, `IDADE`, `PESO`, `ALTURA`, `SEXO`) VALUES (?, ?, ?, ?, ?)";
        
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = CONNECTIONFACTORY.getConnection();
            statement = (PreparedStatement) connection.prepareStatement(sql);
            
            
            statement.setString(1, PESSOA.getNome());
            statement.setInt(2, PESSOA.getIdade());
            statement.setDouble(3, PESSOA.getPeso());
            statement.setDouble(4, PESSOA.getAltura());
            statement.setString(5, PESSOA.getSexo());
            
            
            statement.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao salvar pessoa no banco de dados "  + ex.getMessage(), ex);
        }finally {
            CONNECTIONFACTORY.closeConnection(connection, statement);
        }
        
        
    }
    
    
}
