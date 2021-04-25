
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoasDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexao c=new Conexao();
    Connection con;
    
    public List listar(){
        List<Pessoas>lista=new ArrayList<>();
        String sql="select * from pessoas";
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Pessoas p =new Pessoas();
                p.setId(rs.getString(1));
                p.setNome(rs.getString(2));
                p.setEndereço(rs.getString(3));
                p.setTelefone (rs.getString(4));
                p.setDisciplina (rs.getString(4));
                lista.add(p);
            }
        } catch (Exception e){
        }
        return lista;
    }
}
