package in.rahul.GUI;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//import javax.swing.JOptionPane;

public class Application extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Label lblTitle;
	private Label lblMovieList;
	private TextField txtTitle;
	private Label lblType;
	private Choice choiceType;
	private Label lblLanguage;
	private List lstLanguage;
	private TextArea txtAreaMovieList;
	private Button btnAdd;
	private Button btnFind;
	private Button btnDel;
	private Button btnShow;
	private Button btnSave;
	private Button btnLoad;
	ArrayList<Movie> arrayList;

	public Application() {

		arrayList = new ArrayList<Movie>();

		this.setLayout(null);
		getBackground();
		this.setBackground(Color.GRAY);

		lblTitle = new Label("Title : ");
		lblTitle.setBounds(40, 100, 80, 25);
		this.add(lblTitle);

		lblMovieList = new Label("Movie List : ");
		lblMovieList.setBounds(450, 100, 80, 25);
		this.add(lblMovieList);

		txtTitle = new TextField();
		txtTitle.setBounds(200, 100, 200, 25);
		this.add(txtTitle);

		lblType = new Label("Type : ");
		lblType.setBounds(40, 150, 80, 25);
		this.add(lblType);

		choiceType = new Choice();
		choiceType.add("Arts");
		choiceType.add("Horror");
		choiceType.add("Comedy");
		choiceType.add("Classics");

		choiceType.setBounds(200, 150, 200, 25);
		this.add(choiceType);

		lblLanguage = new Label("Language : ");
		lblLanguage.setBounds(40, 200, 80, 25);
		this.add(lblLanguage);

		lstLanguage = new List(3);
		lstLanguage.add("Marathi");
		lstLanguage.add("Hindi");
		lstLanguage.add("English");

		lstLanguage.setBounds(200, 200, 200, 80);
		this.add(lstLanguage);

		txtAreaMovieList = new TextArea();
		txtAreaMovieList.setBounds(520, 130, 350, 300);
		// Add a scroll bar
		this.add(txtAreaMovieList);

		btnAdd = new Button("ADD");
		btnAdd.setBounds(80, 320, 100, 35);
		btnAdd.addActionListener(this);
		this.add(btnAdd);

		btnFind = new Button("FIND");
		btnFind.setBounds(190, 320, 100, 35);
		btnFind.addActionListener(this);
		this.add(btnFind);

		btnDel = new Button("DEL");
		btnDel.setBounds(300, 320, 100, 35);
		btnDel.addActionListener(this);
		this.add(btnDel);

		btnShow = new Button("SHOW");
		btnShow.setBounds(80, 380, 100, 35);
		btnShow.addActionListener(this);
		this.add(btnShow);

		btnSave = new Button("SAVE");
		btnSave.setBounds(190, 380, 100, 35);
		btnSave.addActionListener(this);
		this.add(btnSave);

		btnLoad = new Button("LOAD");
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
				lstLanguage.getSelectedItem(),
				(String) choiceType.getSelectedItem());
		arrayList.add(movie);
		System.out.println(movie);
	}

	private void onShow() {
		txtAreaMovieList.setText(arrayList.toString());
	}

	private void onSave() {
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;

		try {
			fileOut = new FileOutputStream("d:\\movies.dat");
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(arrayList);
			objOut.flush();
			// JOptionPane.showMessageDialog(this, "Movie List Saved");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objOut != null)
					objOut.close();
				if (fileOut != null)
					fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void onLoad() {
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;

		try {
			fileIn = new FileInputStream("d:\\movies.dat");
			objIn = new ObjectInputStream(fileIn);
			arrayList = (ArrayList<Movie>) objIn.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objIn != null)
					objIn.close();
				if (fileIn != null)
					fileIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void onFind() {
		Movie movie = new Movie();
		movie.setTitle(txtTitle.getText());
		int index = arrayList.indexOf(movie);
		if (index == -1) {
			System.out.println("Movie Not Found");
			// JOptionPane.showMessageDialog(this, "Movie Not Found");
		} else {
			// JOptionPane.showMessageDialog(this, "Movie " + txtTitle.getText()
			// + " Found");
			System.out.println("Movie Found");
		}
	}

	private void onDelete() {
		Movie movie = new Movie();
		movie.setTitle(txtTitle.getText());
		int index = arrayList.indexOf(movie);
		if (index == -1) {
			// JOptionPane.showMessageDialog(this, "Movie Not Found");
			System.out.println("Movie Not Found");
		} else {
			arrayList.remove(index);
			// JOptionPane.showMessageDialog(this, "Movie Removed");
			System.out.println("Movie Removed");
		}
	}
}
