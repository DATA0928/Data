
public class CachTinhDiem {
	private double phanTramDiemBGK;
	private double phanTramDiemPB;
	public CachTinhDiem(double phanTramDiemBGK, double phanTramDiemPB) {
		this.phanTramDiemBGK = phanTramDiemBGK;
		this.phanTramDiemPB = phanTramDiemPB;
	}
	public double getPhanTramDiemBGK() {
		return phanTramDiemBGK;
	}
	public void setPhanTramDiemBGK(double phanTramDiemBGK) {
		this.phanTramDiemBGK = phanTramDiemBGK;
	}
	public double getPhanTramDiemPB() {
		return phanTramDiemPB;
	}
	public void setPhanTramDiemPB(double phanTramDiemPB) {
		this.phanTramDiemPB = phanTramDiemPB;
	}
	
	public double tinhDiem(double diemBGK, double diemPB) {
        return (diemBGK * phanTramDiemBGK + diemPB * phanTramDiemPB) / 100.0;
    }

    public static void main(String[] args) {
        // Test the CachTinhDiem class
        CachTinhDiem c1 = new CachTinhDiem(85.0, 60.0);

        double diemBGK = 8.5;
        double diemPB = 9.0;

        double diemTong = c1.tinhDiem(diemBGK, diemPB);

        System.out.println("Diem Tong: " + diemTong);
    }
}
