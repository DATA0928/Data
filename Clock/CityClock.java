package Clock;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Calendar;

public class CityClock extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel city1Label;
    private JLabel city2Label;
    private ClockTime clock;
    private String city1;
    private String city2;
    private int offset1;
    private int offset2;

    public CityClock(ClockTime clock, String city1, int offset1, String city2, int offset2) {
        this.clock = clock;
        this.city1 = city1;
        this.city2 = city2;
        this.offset1 = offset1;
        this.offset2 = offset2;

        city1Label = new JLabel();
        city2Label = new JLabel();
        add(city1Label);
        add(city2Label);
        showTime();
    }

    public JLabel getCity1Label() {
		return city1Label;
	}

	public void setCity1Label(JLabel city1Label) {
		this.city1Label = city1Label;
	}

	public JLabel getCity2Label() {
		return city2Label;
	}

	public void setCity2Label(JLabel city2Label) {
		this.city2Label = city2Label;
	}

	public ClockTime getClock() {
		return clock;
	}

	public void setClock(ClockTime clock) {
		this.clock = clock;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public int getOffset1() {
		return offset1;
	}

	public void setOffset1(int offset1) {
		this.offset1 = offset1;
	}

	public int getOffset2() {
		return offset2;
	}

	public void setOffset2(int offset2) {
		this.offset2 = offset2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void showTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, clock.getHour());
        cal.set(Calendar.MINUTE, clock.getMinute());
        cal.set(Calendar.SECOND, clock.getSecond());
        
        cal.add(Calendar.HOUR, offset1);
        city1Label.setText(city1 + ": " + cal.get(Calendar.HOUR_OF_DAY) + ":" + String.format("%02d", cal.get(Calendar.MINUTE)) + ":" + String.format("%02d", cal.get(Calendar.SECOND)));
        
        cal.add(Calendar.HOUR, -offset1 + offset2);
        city2Label.setText(city2 + ": " + cal.get(Calendar.HOUR_OF_DAY) + ":" + String.format("%02d", cal.get(Calendar.MINUTE)) + ":" + String.format("%02d", cal.get(Calendar.SECOND)));
    }


}
