import java.util.LinkedList;
import java.util.HashMap;

public class NhomTrinhDien {
	private String loaiNhom;
	private String tenBaiHat;
	private String tenBienDao;
	private int diemNhom;
	private Chi_Dep nhomTruong;
	private LinkedList<Chi_Dep> dsThanhVien;
	private HashMap<Chi_Dep, Integer> phieuBauThanhVien;
	private String trangThaiNhom;

	public NhomTrinhDien(String loaiNhom, String tenBaiHat, String tenBienDao) {
		this.loaiNhom = loaiNhom;
		this.tenBaiHat = tenBaiHat;
		this.tenBienDao = tenBienDao;
		this.diemNhom = 0;
		this.nhomTruong = null;
		this.dsThanhVien = new LinkedList<>();
		this.phieuBauThanhVien = new HashMap<>();
		this.trangThaiNhom = " ";
	}

	public String getLoaiNhom() {
		return loaiNhom;
	}

	public String getTenBaiHat() {
		return tenBaiHat;
	}

	public String getTenBienDao() {
		return tenBienDao;
	}

	// Set loại nhóm
	public void setLoaiNhom(String loaiNhom) {
		this.loaiNhom = loaiNhom;
	}

	// Set tên bài hét
	public void setTenBaiHat(String tenBaiHat) {
		this.tenBaiHat = tenBaiHat;
	}

	// Set tên biên đạo
	public void setTenBienDao(String tenBienDao) {
		this.tenBienDao = tenBienDao;
	}

	public void setNhomTruong(Chi_Dep cd) {
		// Set trưởng nhóm và sanh sách thành viên
		this.nhomTruong = cd;
		this.dsThanhVien.add(cd);
	}

	// Thêm thành viên vào nhóm
	public void themThanhVien(Chi_Dep cd) {
		dsThanhVien.add(cd);
	}

	// Loại thành viên khỏi nhóm
	public void loaiThanhVien(int slg) {
		dsThanhVien.remove(slg);
	}

	public int getPhieuBauThanhVien(Chi_Dep cd) {
		return phieuBauThanhVien.get(cd);
	}

	// Set điểm cho nhóm
	public void setDiemNhom(int diem) {
		this.diemNhom = diem;
	}

	public String getTrangThaiNhom() {
		return trangThaiNhom;
	}

	public void setTrangThaiNhom(String trangThaiNhom) {
		this.trangThaiNhom = trangThaiNhom;
	}

	// Set phiếu bầu cho thành viên
	public void setPhieuBauTV(Chi_Dep cd, int soLuongPhieu) {
		phieuBauThanhVien.put(cd, soLuongPhieu);
	}

	public LinkedList<Chi_Dep> getDsThanhVien() {
		return dsThanhVien;
	}

	public void setDsThanhVien(LinkedList<Chi_Dep> dsThanhVien) {
		this.dsThanhVien = dsThanhVien;
	}

	public static void main(String[] args) {

		NhomTrinhDien NTD1 = new NhomTrinhDien("Nhom 7 nguoi", "Mashup Gửi anh xa nhớ - Người ơi người ở đừng về",
				"Lệ Quyên");

		NTD1.setLoaiNhom("Nhóm 7 người ");
		NTD1.setTenBaiHat("Bai Hat Mashup Gửi anh xa nhớ - Người ơi người ở đừng về");
		NTD1.setTenBienDao("Biên Đạo Lệ Quyên");

		// Test nhóm trưởng
		Chi_Dep cd1 = new Chi_Dep("CD04", "Lệ Quyên");
		NTD1.setNhomTruong(cd1);

		// Thêm thành viên
		Chi_Dep cd2 = new Chi_Dep("CD05", "Diệp Lâm Anh");
		Chi_Dep cd3 = new Chi_Dep("CD09", "Hương Ly");
		Chi_Dep cd4 = new Chi_Dep("CD011", " Lưu Hương Giang");
		Chi_Dep cd5 = new Chi_Dep("CD023", "MLee");
		NTD1.themThanhVien(cd2);
		NTD1.themThanhVien(cd3);
		NTD1.themThanhVien(cd4);
		NTD1.themThanhVien(cd5);

		// Set phiếu bầu cho thành viên
		NTD1.setPhieuBauTV(cd1, 5);
		NTD1.setPhieuBauTV(cd2, 4);
		NTD1.setPhieuBauTV(cd3, 3);
		NTD1.setPhieuBauTV(cd4, 2);
		NTD1.setPhieuBauTV(cd5, 3);

		System.out.println("Loai Nhom: " + NTD1.loaiNhom);
		System.out.println("Ten Bai Hat: " + NTD1.tenBaiHat);
		System.out.println("Ten Bien Dao: " + NTD1.tenBienDao);
		System.out.println("Diem Nhom: " + NTD1.diemNhom);
		System.out.println("Nhom Truong: " + NTD1.nhomTruong.getHoTen());
		System.out.println("Danh Sach Thanh Vien:");
		for (Chi_Dep member : NTD1.dsThanhVien) {
			System.out.println("- " + member.getHoTen());
		}

		System.out.println("Phieu Bau Thanh Vien:");
		for (HashMap.Entry<Chi_Dep, Integer> entry : NTD1.phieuBauThanhVien.entrySet()) {
			System.out.println("- " + entry.getKey().getHoTen() + ": " + entry.getValue() + " phiếu");
		}
	}
}
