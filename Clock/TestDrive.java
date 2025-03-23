package Clock;
import javax.swing.JFrame;

public class TestDrive {
	private static final String HoChiMinh = null;
	private static final String Moscow = null;

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Digital Clock");
		JFrame frame2 = new JFrame("Analog Clock");
		JFrame frame3 = new JFrame("City Clock");

		ClockTime clock = new ClockTime(5, 14, 36);
		DigitalClock digitalClock = new DigitalClock(clock);
		AnalogClock analogClock = new AnalogClock(clock);
		CityClock cityclock = new CityClock(clock, HoChiMinh, 0, Moscow, 5);
		frame1.setSize(100, 70);
		frame1.setContentPane(digitalClock);
		frame2.setSize(100, 150);
		frame2.setContentPane(analogClock);
		frame1.setVisible(true);
		frame2.setVisible(true);
		frame3.setSize(100, 80);
		frame3.setContentPane(cityclock);
		frame3.setVisible(true);
	}
}
