package Tour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TourManager extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea tourInfoArea;
	private JButton displayToursButton;

	public TourManager() {
		setTitle("Tour Manager");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		tourInfoArea = new JTextArea();
		tourInfoArea.setEditable(false);
		add(new JScrollPane(tourInfoArea), BorderLayout.CENTER);

		displayToursButton = new JButton("Display Tours");
		displayToursButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayTours();
			}
		});
		add(displayToursButton, BorderLayout.SOUTH);
	}

	private void displayTours() {
		Tour[] tours = { new DomesticTour("DLat", "Đà lạt", 3, 550000),
				new DomesticTour("NTrang", "Nha trang", 4, 900000), new DomesticTour("PQ", "Phú Quốc", 4, 1250000),
				new OverseasTour("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000, "Thailand", 500000), };

		StringBuilder tourInfo = new StringBuilder("Original Tours:\n");
		for (Tour tour : tours) {
			tourInfo.append(tour.getDescription()).append("\n");
		}

		tourInfo.append("\nDiscounted Tours:\n");
		Tour discountedTour = new SaleTour(tours[0], 50000);
		tourInfo.append(discountedTour.getDescription()).append("\n");

		discountedTour = new SaleTour(tours[3], 200000);
		tourInfo.append(discountedTour.getDescription()).append("\n");

		tourInfo.append("\nVisit Family Tours:\n");
		Tour visitFamilyTour = new VisitFamilyTour(tours[1]);
		tourInfo.append(visitFamilyTour.getDescription()).append("\n");

		visitFamilyTour = new VisitFamilyTour(tours[2]);
		tourInfo.append(visitFamilyTour.getDescription()).append("\n");

		tourInfoArea.setText(tourInfo.toString());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TourManager().setVisible(true);
			}
		});
	}
}
