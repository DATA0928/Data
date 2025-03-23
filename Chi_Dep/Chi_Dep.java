import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Chi_Dep implements Comparable<Chi_Dep> {
	private String id;
	private String hoTen;
	private TreeSet<QuaTrinhLamNghe> ngheNghiepList;
	private LinkedList<Integer> diemQuaTrinh;
	private boolean biLoai;
	private String tenVongBiLoai;

	public Chi_Dep(String id, String hoTen) {
		this.id = id;
		this.hoTen = hoTen;
		this.ngheNghiepList = new TreeSet<>(Comparator.comparingInt(QuaTrinhLamNghe::getNamLamNghe));
		this.diemQuaTrinh = new LinkedList<>();
		this.biLoai = false;
		this.tenVongBiLoai = " ";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public TreeSet<QuaTrinhLamNghe> getNgheNghiepList() {
		return ngheNghiepList;
	}

	public void setNgheNghiepList(TreeSet<QuaTrinhLamNghe> ngheNghiepList) {
		this.ngheNghiepList = ngheNghiepList;
	}

	public LinkedList<Integer> getDiemQuaTrinh() {
		return diemQuaTrinh;
	}

	public void setDiemQuaTrinh(LinkedList<Integer> diemQuaTrinh) {
		this.diemQuaTrinh = diemQuaTrinh;
	}

	public boolean isBiLoai() {
		return biLoai;
	}

	public void setBiLoai(boolean biLoai) {
		this.biLoai = biLoai;
	}

	public String getTenVongBiLoai() {
		return tenVongBiLoai;
	}

	public void setTenVongBiLoai(String tenVongBiLoai) {
		this.tenVongBiLoai = tenVongBiLoai;
	}

	public void themDiemQuaTrinh(int diem) {
		diemQuaTrinh.add(diem);
	}

	public void setBiLoai() {
		this.biLoai = true;
	}

	public void themQuaTrinhLamNghe(QuaTrinhLamNghe qt) {
		this.ngheNghiepList.add(qt);
	}

	@Override
	public int compareTo(Chi_Dep o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {

		Chi_Dep chiDep = new Chi_Dep("01", "Ninh Duong Lan Ngoc");
		Chi_Dep chiDep2 = new Chi_Dep("04", "Le Quyen");
		Chi_Dep chiDep3 = new Chi_Dep("07", "Hoang Anh");

		System.out.println("ID: " + chiDep.getId());
		System.out.println("Ho Ten: " + chiDep.getHoTen());

		chiDep.setId("CD01");
		chiDep.setHoTen("Ninh Dương Lan Ngọc");

		System.out.println("Updated ID: " + chiDep.getId());
		System.out.println("Updated Ho Ten: " + chiDep.getHoTen());

		// Test themDiemQuaTrinh
		chiDep.themDiemQuaTrinh(27);
		chiDep.themDiemQuaTrinh(25);
		chiDep.themDiemQuaTrinh(28);
		System.out.println("Diem Qua Trinh: " + chiDep.getDiemQuaTrinh());

		System.out.println("ID: " + chiDep2.getId());
		System.out.println("Ho Ten: " + chiDep2.getHoTen());

		chiDep2.setId("CD04");
		chiDep2.setHoTen("Lệ Quyên");

		System.out.println("Updated ID: " + chiDep2.getId());
		System.out.println("Updated Ho Ten: " + chiDep2.getHoTen());

		// Test themDiemQuaTrinh
		chiDep2.themDiemQuaTrinh(30);
		chiDep2.themDiemQuaTrinh(29);
		chiDep2.themDiemQuaTrinh(29);
		System.out.println("Diem Qua Trinh: " + chiDep2.getDiemQuaTrinh());

		System.out.println("ID: " + chiDep3.getId());
		System.out.println("Ho Ten: " + chiDep3.getHoTen());

		chiDep.setId("CD07");
		chiDep.setHoTen("Hoàng Anh");

		System.out.println("Updated ID: " + chiDep3.getId());
		System.out.println("Updated Ho Ten: " + chiDep3.getHoTen());

		// Test themDiemQuaTrinh
		chiDep3.themDiemQuaTrinh(28);
		chiDep3.themDiemQuaTrinh(29);
		chiDep3.themDiemQuaTrinh(29);
		System.out.println("Diem Qua Trinh: " + chiDep3.getDiemQuaTrinh());

	}

	public String getDiemVongThi(VongThi vongThi1) {
		// TODO Auto-generated method stub
		return null;
	}

}
