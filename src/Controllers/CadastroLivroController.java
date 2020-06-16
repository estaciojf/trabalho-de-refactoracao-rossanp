package Controllers;

import Functions.FunctionCadastroLivro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Models.Livro;

public class CadastroLivroController implements ActionListener {

	public JTextField fieldTitle;
	public JTextField fieldAuthor;
	public JComboBox comboGender;
	public JComboBox comboYear;
	public JCheckBox isRead;
        public List<Livro> listLivros;
	
	public CadastroLivroController(
			JTextField fieldTitle, 
			JTextField fieldAuthor,
			JComboBox comboGender,
			JComboBox comboYear,
			JCheckBox isRead) {
		
		this.fieldTitle = fieldTitle;
		this.fieldAuthor = fieldAuthor;
		this.isRead = isRead;
		
		listLivros = new ArrayList<>();
                
                this.populateComboYear(comboYear);
		this.populateComboGender(comboGender);
	}
	FunctionCadastroLivro PopularDados = new FunctionCadastroLivro();
        
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getActionCommand());
		PopularDados.cadastrarLivro();
	}

    private void populateComboGender(JComboBox comboGender) {
        this.comboGender = comboGender;
        
        PopularDados.functionComboGender(comboGender);
    }

    private void populateComboYear(JComboBox comboYear) {
        this.comboYear = comboYear;
        
        PopularDados.functionComboYear(comboYear);
    }
}
