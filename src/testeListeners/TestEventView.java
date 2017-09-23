package testeListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestEventView implements ActionListener{

	private JLabel lblTexto;
	
	public TestEventView() {

		JFrame janela = new JFrame("Teste de Evento");
		JPanel painel = new JPanel();
		lblTexto = new JLabel("Teste de pressionamento do botão");
		JButton btnOK = new JButton("Aperte-me");

		//ListenerDoBotao ld = new ListenerDoBotao();
		//btnOK.addActionListener(ld);
		btnOK.addActionListener(this);
		
		painel.add(lblTexto);
		painel.add(btnOK);
		janela.setContentPane(painel);

		janela.setSize(300, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestEventView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lblTexto.setText("botão pressionado");
		
	}
}