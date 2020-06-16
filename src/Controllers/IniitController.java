package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import DAO.LivroDAO;
import Functions.FunctionsInitController;
import Views.CadastroLivroView;

public class IniitController implements ActionListener {
    
	private CadastroLivroView cadastroView;
	
	public IniitController(CadastroLivroView cadastroView) {
		this.cadastroView = cadastroView;
	}
        
        FunctionsInitController funcaoInit = new FunctionsInitController(cadastroView);
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		switch(event.getActionCommand()){
		case "Cadastrar": funcaoInit.abrirCadastroView();
		break;
		case "Exibir": funcaoInit.abrirExibirView();
		break;
		}
	}
}
