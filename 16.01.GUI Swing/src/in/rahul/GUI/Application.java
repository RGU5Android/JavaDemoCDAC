package in.rahul.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Application extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle;
	private JLabel lblMovieList;
	private JTextField txtTitle;
	private JLabel lblType;
	private JComboBox<String> jComboType;
	private JLabel lblLanguage;
	private JList<String> jListLanguage;
	private JTextArea jTextMovieList;
	private JButton btnAdd;
	private JButton btnFind;
	private JButton btnDel;
	private JButton btnShow;
	private JButton btnSave;
	private JButton btnLoad;
	ArrayList<Movie> arrayList;

	public Application() {

		arrayList = new ArrayList<Movie>();

		this.setLayout(null);
		getBackground();
		this.setBackground(Color.GRAY);

		lblTitle = new JLabel("Title : ");
		lblTitle.setBounds(40, 100, 80, 25);
		this.add(lblTitle);

		lblMovieList = new JLabel("Movie List : ");
		lblMovieList.setBounds(450, 100, 80, 25);
		this.add(lblMovieList);

		txtTitle = new JTextField();
		txtTitle.setBounds(200, 100, 200, 25);
		this.add(txtTitle);

		lblType = new JLabel("Type : ");
		lblType.setBounds(40, 150, 80, 25);
		this.add(lblType);

		String[] strType = { "Arts", "Horror", "Historic", "Classics",
				"Love Story" };
		jComboType = new JComboBox<String>(strType);
		jComboType.setBounds(200, 150, 200, 25);
		this.add(jComboType);

		lblLanguage = new JLabel("Language : ");
		lblLanguage.setBounds(40, 200, 80, 25);
		this.add(lblLanguage);

		String[] strLanguage = { "Marathi", "Hindi", "English" };
		jListLanguage = new JList<String>(strLanguage);
		jListLanguage.setBounds(200, 200, 200, 80);
		this.add(jListLanguage);

		jTextMovieList = new JTextArea();
		jTextMovieList.setBounds(520, 130, 350, 300);
		// Add a scroll bar
		this.add(jTextMovieList);

		btnAdd = new JButton("ADD");
		btnAdd.setBounds(80, 320, 100, 35);
		btnAdd.addActionListener(this);
		this.add(btnAdd);

		btnFind = new JButton("FIND");
		btnFind.setBounds(190, 320, 100, 35);
		btnFind.addActionListener(this);
		this.add(btnFind);

		btnDel = new JButton("DEL");
		btnDel.setBounds(300, 320, 100, 35);
		btnDel.addActionListener(this);
		this.add(btnDel);

		btnShow = new JButton("SHOW");
		btnShow.setBounds(80, 380, 100, 35);
		btnShow.addActionListener(this);
		this.add(btnShow);

		btnSave = new JButton("SAVE");
		btnSave.setBounds(190, 380, 100, 35);
		btnSave.addActionListener(this);
		this.add(btnSave);

		btnLoad = new JButton("LOAD");
		btnLoad.setBounds(300, 380, 100, 35);
		btnLoad.addActionListener(this);
		this.add(btnLoad);

		WindowAdapter windowAdapter = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		};
		this.addWindowListener(windowAdapter);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object src = ae.getSource();

		if (src == btnAdd) {
			onAdd();
		} else if (src == btnDel) {
			onDelete();
		} else if (src == btnFind) {
			onFind();
		} else if (src == btnLoad) {
			onLoad();
		} else if (src == btnSave) {
			onSave();
		} else if (src == btnShow) {
			onShow();
		}

	}

	private void onAdd() {
		Movie movie = new Movie(txtTitle.getText(),
				jListLanguage.getSelectedValue(),
				(String) jComboType.getSelectedItem());
		arrayList.add(movie);
		JOptionPane.showMessageDialog(this, movie.toString());
	}

	private void onShow() {
		jTextMovieList.setText(arrayList.toString());
	}

	private void onSave() {
		File file = new File("//D:movies.rgu");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arrayList);
			fos.close();
			oos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private void onLoad() {
		File file = new File("//D:movies.rgu");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			arrayList = (ArrayList<Movie>) ois.readObject();
			fis.close();
			ois.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		onShow() ;

	}

	private void onFind() {
		Movie movie = new Movie();
		movie.setTitle(txtTitle.getText());
		int index = arrayList.indexOf(movie);
		if (index == -1) {
			JOptionPane.showMessageDialog(this, "Movie Not Found");
		} else {
			JOptionPane.showMessageDialog(this, "Movie " + txtTitle.getText()
					+ " Found");
		}
	}

	private void onDelete() {
		Movie movie = new Movie();
		movie.setTitle(txtTitle.getText());
		int index = arrayList.indexOf(movie);
		if (index == -1) {
			JOptionPane.showMessageDialog(this, "Movie Not Found");
		} else {
			arrayList.remove(index);
		}
	}
};
