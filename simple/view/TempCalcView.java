package simple.view;

import simple.model.IModelAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * View of the simple temperature calculator.
 *
 * @author Mathias Ricken
 */
public class TempCalcView extends JPanel {
    /**
     * Text field for degrees Fahrenheit.
     */
    private JTextField _degFField;

    /**
     * Text field for degrees Celsius.
     */
    private JTextField _degCField;

    /**
     * Adapter to let the three.three2.full.general.model perform computations.
     */
    private IModelAdapter _modelAdapter;

    /**
     * Constructs a new temperature calculator three.three2.full.general.view.
     *
     * @param modelAdapter adapter to three.three2.full.general.model
     */
    public TempCalcView(IModelAdapter modelAdapter) {
        _modelAdapter = modelAdapter;
        try {
            jbInit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initialize the GUI components.
     */
    private void jbInit() {
        setSize(new Dimension(540, 380));
        setLayout(new BorderLayout());
        _degFField = new JTextField("212.0");
        _degFField.setPreferredSize(new Dimension(80, 30));
        _degFField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleFahrenheitChange();
            }
        });
        JPanel degFPanel = new JPanel();
        degFPanel.setLayout(new FlowLayout());
        degFPanel.add(new JLabel("°F"));
        degFPanel.add(_degFField);
        _degCField = new JTextField("100.0");
        _degCField.setPreferredSize(new Dimension(80, 30));
        _degCField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCelsiusChange();
            }
        });
        JPanel degCPanel = new JPanel();
        degCPanel.setLayout(new FlowLayout());
        degCPanel.add(new JLabel("°C"));
        degCPanel.add(_degCField);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(degFPanel);
        topPanel.add(degCPanel);
        add(topPanel, BorderLayout.CENTER);
        handleCelsiusChange();
    }

    /**
     * Recalculate the temperature after a change in degrees Fahrenheit.
     */
    private void handleFahrenheitChange() {
        double degF = Double.valueOf(_degFField.getText());
        DecimalFormat df = new DecimalFormat("#0.0");
        _degCField.setText(df.format(_modelAdapter.convertFtoC(degF)));
    }

    /**
     * Recalculate the temperature after a change in degrees Celsius.
     */
    private void handleCelsiusChange() {
        double degC = Double.valueOf(_degCField.getText());
        DecimalFormat df = new DecimalFormat("#0.0");
        _degFField.setText(df.format(_modelAdapter.convertCtoF(degC)));
    }
}
