import java.time.Year;

public class QuaTrinhLamNghe {
	private String maNN;
	private String tenNN;
	private int namBD;

	public QuaTrinhLamNghe(String maNN, String tenNN, int namBD) {
		this.maNN = maNN;
		this.tenNN = tenNN;
		this.namBD = namBD;
	}

	public String getMaNN() {
		return maNN;
	}

	public void setMaNN(String maNN) {
		this.maNN = maNN;
	}

	public String getTenNN() {
		return tenNN;
	}

	public void setTenNN(String tenNN) {
		this.tenNN = tenNN;
	}

	public int getNamBD() {
		return namBD;
	}

	public void setNamBD(int namBD) {
		this.namBD = namBD;
	}

	public int getNamLamNghe() {
		int namHienTai = Year.now().getValue();
		return namHienTai - namBD;
	}

	public static void main(String[] args) {
		QuaTrinhLamNghe qt1 = new QuaTrinhLamNghe("NN001", "Ca Sĩ", 2007);
		QuaTrinhLamNghe qt2 = new QuaTrinhLamNghe("NN002", "Diễn Viên", 2010);
		QuaTrinhLamNghe qt3 = new QuaTrinhLamNghe("NN003", "MC", 2007);

		System.out.println("Mã nghề nghiệp: " + qt1.getMaNN());
		System.out.println("Tên nghề nghiệp: " + qt1.getTenNN());
		System.out.println("Năm bắt đầu làm nghề: " + qt1.getNamBD());

		System.out.println("Mã nghề nghiệp: " + qt2.getMaNN());
		System.out.println("Tên nghề nghiệp: " + qt2.getTenNN());
		System.out.println("Năm bắt đầu làm nghề: " + qt2.getNamBD());

		System.out.println("Mã nghề nghiệp: " + qt3.getMaNN());
		System.out.println("Tên nghề nghiệp: " + qt3.getTenNN());
		System.out.println("Năm bắt đầu làm nghề: " + qt3.getNamBD());
		
		int NLG1 = qt1.getNamLamNghe();
		int NLG2 = qt2.getNamLamNghe();
		int NLG3 = qt3.getNamLamNghe();
		
		System.out.println("Năm làm nghề: " + NLG1);
		System.out.println("Năm làm nghề: " + NLG2);
		System.out.println("Năm làm nghề: " + NLG3);
	}
}
