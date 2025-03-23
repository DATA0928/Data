import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CuocThi {
	private ArrayList<Chi_Dep> dsChiDep;
	private ArrayList<VongThi> VongThi;
	private String tenCuocThi;
	private int namToChuc;

	public CuocThi(String tenCuocThi, int namToChuc) {
		this.dsChiDep = new ArrayList<>();
		this.VongThi = new ArrayList<>();
		this.tenCuocThi = tenCuocThi;
		this.namToChuc = namToChuc;
	}

	// Phương thức thêm Vòng Thi
	public void themVongThi(VongThi vongThi) {
		VongThi.add(vongThi);
	}

	// Phương thức thêm Chị Đẹp
	public void themChiDep(Chi_Dep cd) {
		dsChiDep.add(cd);
	}

	// Phương thức thống kê điểm của Chị Đẹp qua các vòng thi
	public HashMap<Chi_Dep, Integer> thongKeChiDep_danhSachDiemSo() {
        HashMap<Chi_Dep, Integer> thongKe = new HashMap<>();
        for (Chi_Dep cd : dsChiDep) {
            Integer diemSo = new LinkedList()<>();
            for (VongThi vongThi : dsVongThi) {
                // Lấy điểm của Chị Đẹp trong vòng thi
                int diem = /* lấy điểm của Chị Đẹp trong vòng thi */;
                diemSo.add(diem);
            }
            thongKe.put(chiDep, diemSo);
        }
        return thongKe;
    }

	// Phương thức thống kê Chị Đẹp bị loại
	public HashMap<VongThi, Integer> thongKeChiDepBiLoai() {
        HashMap<VongThi, Integer> thongKe = new HashMap<>();
        VongThi[] dsVongThi = null;
		for (VongThi vongThi : dsVongThi) {
            int slgBiLoai = 2;
            thongKe.put(vongThi, slgBiLoai);
        }
        return thongKe;
    }

	// Phương thức lấy TreeSet Chị Đẹp theo giảm dần tổng điểm quá trình thi
	public TreeSet<Chi_Dep> getSetTongDiemChiDep() {
		TreeSet<Chi_Dep> setTongDiem = new TreeSet<>(Comparator.comparing(Chi_Dep::getDiemQuaTrinh).reversed());
		setTongDiem.addAll(dsChiDep);
		return setTongDiem;
	}

	

	// Phương thức loại Chị Đẹp từ vòng thi
	public ArrayList<Chi_Dep> loaiChiDep(VongThi v, int slg) {
		ArrayList<Chi_Dep> dsBiLoai = new ArrayList<>();
		TreeSet<Chi_Dep> setDiemVongThi = getSetChiDepVongThi(v);

		Iterator<Chi_Dep> iterator = setDiemVongThi.iterator();
		for (int i = 0; i < slg && iterator.hasNext(); i++) {
			Chi_Dep chiDep = iterator.next();
			chiDep.setBiLoai(true);
			chiDep.setTenVongBiLoai(v.getTenVong());
			dsBiLoai.add(chiDep);
		}
		return dsBiLoai;
	}

	private TreeSet<Chi_Dep> getSetChiDepVongThi(VongThi v) {
		// TODO Auto-generated method stub
		return null;
	}

	// Phương thức kiểm thử
	public static void main(String[] args) {
		// Tạo một đối tượng CuocThi
		CuocThi cuocThi = new CuocThi("Cuộc Thi 1", 2023);

		// Tạo một đối tượng VongThi
		VongThi vongThi1 = new VongThi("VT001", "Vòng Thi 1", 80);

		// Thêm vòng thi vào cuộc thi
		cuocThi.themVongThi(vongThi1);

		// Tạo một đối tượng ChiDep
		Chi_Dep chiDep1 = new Chi_Dep("CD01", "Phạm Trần Nhựt Quang");

		// Thêm Chị Đẹp vào cuộc thi
		cuocThi.themChiDep(chiDep1);

		
		// Kiểm tra thống kê điểm của Chị Đẹp qua các vòng thi
		HashMap<Chi_Dep, Integer> thongKeDiem = cuocThi.thongKeChiDep_danhSachDiemSo();
		for (Chi_Dep chiDep : thongKeDiem.keySet()) {
			System.out.println(
					"ID: " + chiDep.getId() + ", Ho ten: " + chiDep.getHoTen() + ", Diem: " + thongKeDiem.get(chiDep));
		}

		// Kiểm tra thống kê Chị Đẹp bị loại
		HashMap<VongThi, Integer> thongKeBiLoai = cuocThi.thongKeChiDepBiLoai();
		for (VongThi vongThi : thongKeBiLoai.keySet()) {
			System.out
					.println("Vong Thi: " + vongThi.getTenVong() + ", So luong bi loai: " + thongKeBiLoai.get(vongThi));
		}

		// Kiểm tra sắp xếp TreeSet các Chị Đẹp theo giảm dần tổng điểm
		TreeSet<Chi_Dep> setTongDiem = cuocThi.getSetTongDiemChiDep();
		System.out.println("Danh sach Chị Đẹp theo giảm dần tổng điểm:");
		for (Chi_Dep chiDep : setTongDiem) {
			System.out.println("ID: " + chiDep.getId() + ", Ho ten: " + chiDep.getHoTen() + ", Tong diem: "
					+ chiDep.getDiemQuaTrinh());
		}

		// Kiểm tra sắp xếp TreeSet các Chị Đẹp theo giảm dần điểm của vòng thi
		TreeSet<Chi_Dep> setDiemVongThi = cuocThi.getSetChiDepVongThi(vongThi1);
		System.out.println("Danh sach Chị Đẹp theo giảm dần điểm của vòng thi:");
		for (Chi_Dep chiDep : setDiemVongThi) {
			System.out.println("ID: " + chiDep.getId() + ", Ho ten: " + chiDep.getHoTen() + ", Diem vong thi: "
					+ chiDep.getDiemVongThi(vongThi1));
		}

		// Kiểm tra loại Chị Đẹp từ vòng thi
		ArrayList<Chi_Dep> dsBiLoai = cuocThi.loaiChiDep(vongThi1, 2);
		System.out.println("Danh sach Chị Đẹp bị loại:");
		for (Chi_Dep chiDep : dsBiLoai) {
			System.out.println("ID: " + chiDep.getId() + ", Ho ten: " + chiDep.getHoTen() + ", Vong bi loai: "
					+ chiDep.getTenVongBiLoai());
		}
	}
}
