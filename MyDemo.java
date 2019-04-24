package test;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JEditorPane;

public class MyDemo {

	private JFrame frame;
	private JPanel panel_courseSelect;
	private JPanel panel_trainPlan;
	private JPanel panel_document;
	private JPanel panel_userInfo;
	private JPanel panel_application;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDemo window = new MyDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u5B66\u751F\u81EA\u52A9\u7CFB\u7EDF");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_homePage = new JPanel();
		panel.add(panel_homePage);
		
		JPanel panel_querySocres = new JPanel();
		panel.add(panel_querySocres);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("查询成绩");
		panel_querySocres.add(textPane_1);
		
		JPanel panel_courseSelect;
		panel_courseSelect = new JPanel();
		panel.add(panel_courseSelect);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("选课");
		panel_courseSelect.add(textPane_2);
		
		JPanel panel_trainPlan;
		panel_trainPlan = new JPanel();
		panel.add(panel_trainPlan);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("培养方案");
		panel_trainPlan.add(textPane_3);
		
		JPanel panel_document;
		panel_document = new JPanel();
		panel.add(panel_document);
		JPanel panel_application;
		panel_application = new JPanel();
		panel.add(panel_application);
		
		JLabel label_6 = new JLabel("\u8BF7\u5047\u539F\u56E0");
		
		JLabel label_5 = new JLabel("\u8BF7\u5047\u65F6\u95F4");
		
		JLabel label_4 = new JLabel("\u5B66\u53F7");
		
		JLabel label_3 = new JLabel("\u59D3\u540D");
		
		JLabel label_2 = new JLabel("\u8BF7\u5047\u6761");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1555948800000L), null, null, Calendar.DAY_OF_MONTH));
		
		JLabel label_7 = new JLabel("\u2014\u2014");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerDateModel(new Date(1555948800000L), null, null, Calendar.DAY_OF_YEAR));
		
		JEditorPane editorPane = new JEditorPane();
		GroupLayout gl_panel_application = new GroupLayout(panel_application);
		gl_panel_application.setHorizontalGroup(
			gl_panel_application.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_application.createSequentialGroup()
					.addGroup(gl_panel_application.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(55)
							.addComponent(label_3)
							.addGap(17)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addGroup(gl_panel_application.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_application.createSequentialGroup()
									.addGap(42)
									.addComponent(label_4)
									.addGap(20)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_2)))
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(33)
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_7)
							.addGap(7)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(33)
							.addComponent(label_6)
							.addGap(8)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		gl_panel_application.setVerticalGroup(
			gl_panel_application.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_application.createSequentialGroup()
					.addGroup(gl_panel_application.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGroup(gl_panel_application.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_application.createSequentialGroup()
									.addGap(10)
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_4))
								.addGroup(gl_panel_application.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_application.createSequentialGroup()
									.addContainerGap()
									.addComponent(label_3)))
							.addGap(2))
						.addGroup(Alignment.TRAILING, gl_panel_application.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_application.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_application.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7)))
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(17)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_application.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(14)
							.addComponent(label_6))
						.addGroup(gl_panel_application.createSequentialGroup()
							.addGap(15)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel_application.setLayout(gl_panel_application);
		
		JLabel label = new JLabel("\u6700\u8FD1\u4F7F\u7528");
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		String[] recentDoc={"请假条.doc","课程替换申请.doc","转专业申请.doc"};
		JComboBox comboBox_1 = new JComboBox(recentDoc);
		comboBox_1.setToolTipText("");
		
		JButton button = new JButton("\u6253\u5F00");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_application);
				panel.updateUI();
			}
		});
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel label_1 = new JLabel("\u5168\u90E8\u6587\u6863");
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		String[] allDoc={"请假条.doc","转专业申请.doc","创新学分申请.doc","教室借用申请.doc","奖学金申请表.doc","补选课申请.doc","课程替换申请.doc"};
		JComboBox comboBox = new JComboBox(allDoc);
		comboBox.setToolTipText("");
		
		JButton button_1 = new JButton("\u6253\u5F00");
		GroupLayout gl_panel_document = new GroupLayout(panel_document);
		gl_panel_document.setHorizontalGroup(
			gl_panel_document.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_document.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel_document.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_document.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1))
						.addGroup(gl_panel_document.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button)))
					.addGap(152))
		);
		gl_panel_document.setVerticalGroup(
			gl_panel_document.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_document.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_document.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(62)
					.addGroup(gl_panel_document.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1))
					.addContainerGap(110, Short.MAX_VALUE))
		);
		panel_document.setLayout(gl_panel_document);
		
		JPanel panel_userInfo;
		panel_userInfo = new JPanel();
		panel.add(panel_userInfo);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu_homePage = new JMenu("\u6211\u7684\u9996\u9875");
		menu_homePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_homePage);
				panel.updateUI();
			}
		});
		menuBar.add(menu_homePage);
		
		JMenu menu_querySocres = new JMenu("\u67E5\u8BE2\u6210\u7EE9");
		menu_querySocres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_querySocres);
				panel.updateUI();
			}
		});
		menuBar.add(menu_querySocres);
		
		JMenu menu_courseSelect = new JMenu("\u9009\u8BFE\u7CFB\u7EDF");
		menuBar.add(menu_courseSelect);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u67E5\u8BE2\u9009\u8BFE");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_courseSelect);
				panel.updateUI();
			}
		});
		menu_courseSelect.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u9009\u8BFE\u5217\u8868");
		menu_courseSelect.add(mntmNewMenuItem_1);
		
		JMenuItem menuItem = new JMenuItem("\u6211\u7684\u9009\u8BFE");
		menu_courseSelect.add(menuItem);
		
		JMenu menu_trainPlan = new JMenu("\u57F9\u517B\u65B9\u6848");
		menu_trainPlan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_trainPlan);
				panel.updateUI();
			}
		});
		menuBar.add(menu_trainPlan);
		
		JMenu menu_document = new JMenu("\u6587\u6863\u5E94\u7528");
		menu_document.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_document);
				panel.updateUI();
			}
		});
		menuBar.add(menu_document);
		
		JMenu menu_userInfo = new JMenu("\u7528\u6237\u4FE1\u606F");
		menuBar.add(menu_userInfo);
		
		JMenu menu_logOut = new JMenu("\u6CE8\u9500");
		menuBar.add(menu_logOut);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
	}
}
