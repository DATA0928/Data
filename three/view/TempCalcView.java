package three.view;

import javax.swing.*;

import three.model.IModelAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * View of the temperature calculator three2.full.general.model for C/F/K.
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
     * Text field for Kelvin.
     */
    private JTextField _kelvinField;

    /**
     * Adapter to let the three2.full.general.model perform computations.
     */
    private IModelAdapter _modelAdapter;

    /**
     * Constructs a new temperature calculator three2.full.general.view.
     *
     * @param modelAdapter adapter to three2.full.general.model
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
        degFPanel.setLayout(new BoxLayout(degFPanel, BoxLayout.Y_AXIS));
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
        degCPanel.setLayout(new BoxLayout(degCPanel, BoxLayout.Y_AXIS));
        degCPanel.add(new JLabel("°C"));
        degCPanel.add(_degCField);
        _kelvinField = new JTextField("373.2");
        _kelvinField.setPreferredSize(new Dimension(80, 30));
        _kelvinField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleKelvinChange();
            }
        });
        JPanel kelvinPanel = new JPanel();
        kelvinPanel.setLayout(new BoxLayout(kelvinPanel, BoxLayout.Y_AXIS));
        kelvinPanel.add(new JLabel("K"));
        kelvinPanel.add(_kelvinField);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(degFPanel);
        topPanel.add(degCPanel);
        topPanel.add(kelvinPanel);
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
        _kelvinField.setText(df.format(_modelAdapter.convertCtoK(_modelAdapter.convertFtoC(degF))));
    }

    /**
     * Recalculate the temperature after a change in degrees Celsius.
     */
    private void handleCelsiusChange() {
        double degC = Double.valueOf(_degCField.getText());
        DecimalFormat df = new DecimalFormat("#0.0");
        _degFField.setText(df.format(_modelAdapter.convertCtoF(degC)));
        _kelvinField.setText(df.format(_modelAdapter.convertCtoK(degC)));
    }

    /**
     * Recalculate the temperature after a change in Kelvin.
     */
    private void handleKelvinChange() {
        double kelvin = Double.valueOf(_kelvinField.getText());
        DecimalFormat df = new DecimalFormat("#0.0");
        _degFField.setText(df.format(_modelAdapter.convertCtoF(_modelAdapter.convertKtoC(kelvin))));
        _degCField.setText(df.format(_modelAdapter.convertKtoC(kelvin)));
    }
}
