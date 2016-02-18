package br.edu.ifpb.atividadejsf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.edu.ifpb.atividadejsf.entidades.Usuario;

public class UsuarioDAO {

	GeneralDAO bd = new GeneralDAO();
	private ResultSet rs;

	public UsuarioDAO() {
	}

	// Método para consulta de usuários no BD
	public ArrayList<Usuario> consultaUser() {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		bd.abrirConexao();
		System.out.print("Consulta SQL");

		String sql = "SELECT * FROM usuario";

		try {
			Statement st = GeneralDAO.connection.createStatement();
			rs = st.executeQuery(sql);
			
			Usuario user = new Usuario();
			while(rs.next()) {
				user.setNome(rs.getString("nome"));
				user.setMatricula(rs.getString("matricula"));
				user.setNascimento(rs.getString("nascimento"));
				usuarios.add(user);
				System.out.println("aqui");
			}
			st.close();

		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
			sqle.printStackTrace(System.err);
		} catch (NullPointerException npe){
			System.out.println("Nao foi possivel realizar inserção");
			npe.printStackTrace(System.err);
		}

		bd.fecharConexao();

		return usuarios;
	}

}
