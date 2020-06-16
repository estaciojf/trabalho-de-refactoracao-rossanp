
package Functions;

import Controllers.CadastroLivroController;
import Models.Livro;
import java.util.Calendar;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * @author Rossan
 */
public class FunctionCadastroLivro {
            private JTextField fieldTitle;
            private JTextField fieldAuthor;
            private JComboBox comboGender;
            private JComboBox comboYear;
            private JCheckBox isRead;
            public List<Livro> listLivros;
    
    public void functionComboYear(JComboBox comboYear) {
		this.comboYear = comboYear;
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 
		
		for (int yearLoop = anoAtual ; yearLoop >= 1900 ; yearLoop --) {
			this.comboYear.addItem(yearLoop);
		}
	}
    
    public void functionComboGender(JComboBox comboGender) {
		this.comboGender = comboGender;
		String[] genders = new String[] { "Terror", "Ficção", "Drama", "Aventura", "Comédia", "Técnico" };
		for (String genderLoop : genders) {
			this.comboGender.addItem(genderLoop);
		}
	}
    
    public void cadastrarLivro() {
		
		Livro livro = new Livro(
				this.fieldTitle.getText(), 
				this.fieldAuthor.getText(),
				this.comboGender.getSelectedItem().toString(),
				Integer.parseInt(this.comboYear.getSelectedItem().toString()),
				this.isRead.isSelected()
				);
		
		listLivros.add(livro);
		
		for (int i = 0 ; i < listLivros.size() ; i ++ ) {
			System.out.println(listLivros.get(i).toString());
		}
	}
}
