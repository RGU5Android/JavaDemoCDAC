package rahul.awtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTDemo extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button btnSubmit;
	private Button btnExit;
	private Label lblName;
	private TextField textField;

	public AWTDemo() {
		setLayout(null);

		lblName = new Label("Name : ");
		lblName.setBounds(30, 50, 100, 30);
		this.add(lblName);

		textField = new TextField();
		textField.setBounds(145, 50, 150, 30);
		this.add(textField);

		btnSubmit = new Button("Submit");
		btnSubmit.setBounds(30, 100, 100, 30);
		btnSubmit.addActionListener(this);
		this.add(btnSubmit);

		btnExit = new Button("Exit");
		btnExit.setBounds(145, 100, 100, 30);
		btnExit.addActionListener(this);
		this.add(btnExit);

		WindowAdapter windowAdapter = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				AWTDemo.this.dispose();
			}
		};
		this.addWindowListener(windowAdapter);

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Object src = actionEvent.getSource();
		if (src == btnSubmit) {
			onSubmit();
		} else if (src == btnExit) {
			onExit();
		}

	}

	private void onExit() {
		this.dispose();
	}

	private void onSubmit() {
		String strName = textField.getText();
		strName = strName.toUpperCase();
		textField.setText(strName);
	}
}