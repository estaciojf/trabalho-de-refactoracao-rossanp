package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.LivroDAO;
import Functions.FunctionExibirController;
import Listeners.TableLivroListener;
import Models.Livro;

public class ExibirController implements ActionListener {
	
	private JTable table;

	public ExibirController(JTable table) throws SQLException {
            this.table = table;
            funcaoExibir.model = (DefaultTableModel) table.getModel();
            funcaoExibir.setTableColumns();
            funcaoExibir.getLivros();
		
            TableLivroListener tableListener = new TableLivroListener(table);
		
            table.getModel().addTableModelListener(tableListener);
	}
	
        FunctionExibirController funcaoExibir = new FunctionExibirController();

	@Override
	public void actionPerformed(ActionEvent e) {		
            funcaoExibir.getLivros();
		
	}
}


