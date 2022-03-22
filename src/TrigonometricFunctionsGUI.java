import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TrigonometricFunctionsGUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton sinOperation;
	private JButton cosOperation;
	private JButton tanOperation;
	private JButton cscOperation;
	private JButton secOperation;
	private JButton cotOperation;
	private JButton arcsinOperation;
	private JButton arccosOperation;
	private JButton arctanOperation;
	private JButton arccscOperation;
	private JButton arcsecOperation;
	private JButton arccotOperation;
	private JButton sinhOperation;
	private JButton coshOperation;
	private JButton tanhOperation;
	private JButton cschOperation;
	private JButton sechOperation;
	private JButton cothOperation;
	private JTextField theta;
	private JPanel mainTrigPanel;
	private JPanel subTrigPanel;
	private JLabel trigSolution;
	
	public TrigonometricFunctionsGUI() {
		setTitle("Trigonometric Operations Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTrigonometricComponents();
		pack();
	}
	
	public void setTrigonometricComponents() {
		mainTrigPanel = new JPanel(new GridLayout(20, 20));
		subTrigPanel = new JPanel();
		theta = new JTextField(4);
		subTrigPanel.add(new JLabel("Enter theta value in degrees: "));
		subTrigPanel.add(theta);
		mainTrigPanel.add(subTrigPanel);
		sinOperation = new JButton("Sine");
		cosOperation = new JButton("Cosine");
		tanOperation = new JButton("Tangent");
		cscOperation = new JButton("Cosecant");
		secOperation = new JButton("Secant");
		cotOperation = new JButton("Cotangent");
		arcsinOperation = new JButton("Arc-Sine");
		arccosOperation = new JButton("Arc-Cosine");
		arctanOperation = new JButton("Arc-Tangent");
		arccscOperation = new JButton("Arc-Cosecant");
		arcsecOperation = new JButton("Arc-Secant");
		arccotOperation = new JButton("Arc-Cotangent");
		sinhOperation = new JButton("Hyperbolic-Sine");
		coshOperation = new JButton("Hyperbolic-Cosine");
		tanhOperation = new JButton("Hyperbolic-Tangent");
		cschOperation = new JButton("Hyperbolic-Cosecant");
		sechOperation = new JButton("Hyperbolic--Secant");
		cothOperation = new JButton("Hyperbolic-Cotangent");
		sinOperation.addActionListener(this);
		cosOperation.addActionListener(this);
		tanOperation.addActionListener(this);
		cscOperation.addActionListener(this);
		secOperation.addActionListener(this);
		cotOperation.addActionListener(this);
		arcsinOperation.addActionListener(this);
		arccosOperation.addActionListener(this);
		arctanOperation.addActionListener(this);
		arccscOperation.addActionListener(this);
		arcsecOperation.addActionListener(this);
		arccotOperation.addActionListener(this);
		sinhOperation.addActionListener(this);
		coshOperation.addActionListener(this);
		tanhOperation.addActionListener(this);
		cschOperation.addActionListener(this);
		sechOperation.addActionListener(this);
		cothOperation.addActionListener(this);
		mainTrigPanel.add(sinOperation);
		mainTrigPanel.add(cosOperation);
		mainTrigPanel.add(tanOperation);
		mainTrigPanel.add(cscOperation);
		mainTrigPanel.add(secOperation);
		mainTrigPanel.add(cotOperation);
		mainTrigPanel.add(arcsinOperation);
		mainTrigPanel.add(arccosOperation);
		mainTrigPanel.add(arctanOperation);
		mainTrigPanel.add(arccscOperation);
		mainTrigPanel.add(arcsecOperation);
		mainTrigPanel.add(arccotOperation);
		mainTrigPanel.add(sinhOperation);
		mainTrigPanel.add(coshOperation);
		mainTrigPanel.add(tanhOperation);
		mainTrigPanel.add(cschOperation);
		mainTrigPanel.add(sechOperation);
		mainTrigPanel.add(cothOperation);
		trigSolution = new JLabel("");
		mainTrigPanel.add(trigSolution);
		theta.setText("");
		this.add(mainTrigPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double degrees = Integer.parseInt(theta.getText());
		double radians = Math.toRadians(degrees);
		if (e.getSource() == sinOperation) {
			double sinValue = Math.sin(radians);
			trigSolution.setText("sin(" + degrees + ") = " + sinValue);
		}
		else if (e.getSource() == cosOperation) {
			double cosValue = Math.cos(radians);
			trigSolution.setText("cos(" + degrees + ") = " + cosValue);
		}
		else if (e.getSource() == tanOperation) {
			double tanValue = Math.tan(radians);
			trigSolution.setText("tan(" + degrees + ") = " + tanValue);
		}
		else if (e.getSource() == cscOperation) {
			double cscValue = 1 / Math.sin(radians);
			trigSolution.setText("csc(" + degrees + ") = " + cscValue);
		}
		else if (e.getSource() == secOperation) {
			double secValue = 1 / Math.cos(radians);
			trigSolution.setText("sec(" + degrees + ") = " + secValue);
		}
		else if (e.getSource() == cotOperation) {
			double cotValue = 1 / Math.tan(radians);
			trigSolution.setText("cot(" + degrees + ") = " + cotValue);
		}
		else if (e.getSource() == arcsinOperation) {
			double arcsinValue = Math.asin(radians);
			trigSolution.setText("arcsin(" + degrees + ") = " + arcsinValue);
		}
		else if (e.getSource() == arccosOperation) {
			double arccosValue = Math.acos(radians);
			trigSolution.setText("arccos(" + degrees + ") = " + arccosValue);
		}
		else if (e.getSource() == arctanOperation) {
			double arctanValue = Math.atan(radians);
			trigSolution.setText("arctan(" + degrees + ") = " + arctanValue);
		}
		else if (e.getSource() == arccscOperation) {
			double arccscValue = 1 / Math.asin(radians);
			trigSolution.setText("arccsc(" + degrees + ") = " + arccscValue);
		}
		else if (e.getSource() == arcsecOperation) {
			double arcsecValue = 1 / Math.acos(radians);
			trigSolution.setText("arcsec(" + degrees + ") = " + arcsecValue);
		}
		else if (e.getSource() == arccotOperation) {
			double arccotValue = 1 / Math.atan(radians);
			trigSolution.setText("arccot(" + degrees + ") = " + arccotValue);
		}
		else if (e.getSource() == sinhOperation) {
			double sinhValue = Math.sinh(radians);
			trigSolution.setText("sinh(" + degrees + ") = " + sinhValue);
		}
		else if (e.getSource() == coshOperation) {
			double coshValue = Math.cosh(radians);
			trigSolution.setText("cosh(" + degrees + ") = " + coshValue);
		}
		else if (e.getSource() == tanhOperation) {
			double tanhValue = Math.tanh(radians);
			trigSolution.setText("tanh(" + degrees + ") = " + tanhValue);
		}
		else if (e.getSource() == cschOperation) {
			double cschValue = 1 / Math.sinh(radians);
			trigSolution.setText("arccsc(" + degrees + ") = " + cschValue);
		}
		else if (e.getSource() == sechOperation) {
			double sechValue = 1 / Math.cosh(radians);
			trigSolution.setText("arcsec(" + degrees + ") = " + sechValue);
		}
		else if (e.getSource() == cothOperation) {
			double cothValue = 1 / Math.tanh(radians);
			trigSolution.setText("arccot(" + degrees + ") = " + cothValue);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new TrigonometricFunctionsGUI().setVisible(true);
			}
		});
	}

}
