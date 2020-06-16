
package Functions;

import DAO.LivroDAO;
import Views.CadastroLivroView;
import java.sql.SQLException;

/**@author Rossan
 */
public class FunctionsInitController {
    
    private CadastroLivroView cadastroView;
    
    	public FunctionsInitController(CadastroLivroView cadastroView) {
		this.cadastroView = cadastroView;
	}
    
    	public void abrirCadastroView() {
		cadastroView = new CadastroLivroView();
		cadastroView.setVisible(true);
		
		abrirExibirView();
	}
	
	public void abrirExibirView() {
		LivroDAO livroDao;
		try {
			livroDao = new LivroDAO();
			System.out.println(livroDao.getAllLivros());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
