
package Functions;

import DAO.LivroDAO;
import Listeners.TableLivroListener;
import Models.Livro;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**@author Rossan
 */
public class FunctionExibirController {
    
    public String column[]={"Título","Autor", "Genero", "Ano", "Já Leu?"};
    public DefaultTableModel model;
    
    	public void setTableColumns() {
            for (String columnName : this.column) {
                    model.addColumn(columnName);
            }
	}
	
	public String getLivros() {
		
            this.model.setRowCount(0);

            try {
            	LivroDAO livroDao = new LivroDAO();
            	List<Livro> list = livroDao.getAllLivros();
			
            	for (Livro livro : list) {
                    model.addRow(new Object[] {
            		livro.getTitle(),
            		livro.getAuthor(),
            		livro.getGender(),
            		livro.getYear(),
            		livro.isRead()
                    });
            	}
		
		} catch (SQLException e) {
                    e.printStackTrace();
		}
		return null;
	}
}
