import java.util.ArrayList;
import java.util.HashMap;

public class VongThi {
	private String idVT;
	private String tenVong;
	private ArrayList<NhomTrinhDien> dsNhomTrinhDien;
	private CachTinhDiem cachTinhDiemChiDep;

	public VongThi(String idVT, String tenVong, CachTinhDiem cachTinhDiemChiDep) {
		this.idVT = idVT;
		this.tenVong = tenVong;
		this.dsNhomTrinhDien = new ArrayList<>();
		 // Khởi tạo đối tượng CachTinhDiem với tỉ lệ mặc định (50% - 50%)
        this.cachTinhDiemChiDep = new CachTinhDiem(50.0, 50.0);
    }

    public VongThi(String idVT2, String tenVong2, Object $missing$) {
		// TODO Auto-generated constructor stub
	}

	// Phương thức thêm nhóm trình diễn
    public void themNhomTrinhDien(NhomTrinhDien nhom) {
        dsNhomTrinhDien.add(nhom);
    }

    // Phương thức set đội trưởng cho nhóm
    public void setNhomTruong(NhomTrinhDien nhom, Chi_Dep cd) {
        nhom.setNhomTruong(cd);
    }

    // Phương thức set thành viên cho nhóm
    public void setThanhVien(NhomTrinhDien nhom, Chi_Dep cd) {
        nhom.themThanhVien(cd);
    }

    // Phương thức set cách tính điểm cho vòng thi
    public void setCachTinhDiem(CachTinhDiem cachTinhDiem) {
        this.cachTinhDiemChiDep = cachTinhDiem;
    }

    // Phương thức tính điểm cho nhóm
    public HashMap<Chi_Dep, Integer> getDiemTVNhom(NhomTrinhDien nhom) {
        HashMap<Chi_Dep, Integer> diemNhom = new HashMap<>();
        for (Chi_Dep cd : nhom.getDsThanhVien()) {
            // Tính điểm cho từng thành viên
            int diemBGK =(cd.getDiemQuaTrinh().isEmpty() ? 0 : cd.getDiemQuaTrinh().getFirst());
            int diemPB = cachTinhDiemChiDep.getPhanTramDiemPB() > 0 ?
                    (int) (cd.().isEmpty() ? 0 : cd.getPhieuBauThanhVien().get(cd))
                    : 0;
            int diemTong = (diemBGK + diemPB)/100;
            diemNhom.put(cd, diemTong);

        }
        return diemNhom;
    }

    // Phương thức loại thành viên
    public void loaiThanhVien(int slg, NhomTrinhDien nhom) {

        for (int i = 0; i < slg; i++) {
        	if (!nhom..isEmpty()) {
                ChiDep chidepLowestDiem = nhom.dsThanhVien.getFirst();

                // Tìm Chị đẹp có điểm thấp nhất
                for (ChiDep chiDep : nhom.dsThanhVien) {
                    if (chiDep.getDiemQuaTrinh().isEmpty()) {
                        // Nếu không có điểm qua trình, loại bỏ
                        nhom.loaiThanhVien(chiDep);
                        break;
                    } else if (chiDepLowestDiem.getDiemQuaTrinh().isEmpty()
                            || chiDep.getDiemQuaTrinh().getFirst() < chiDepLowestDiem.getDiemQuaTrinh().getFirst()) {
                        chidepLowestDiem = chiDep;
                    }
                }

                // Loại bỏ Chị đẹp có điểm thấp nhất
                nhom.loaiThanhVien(chidepLowestDiem);
            }
        }
    }

    // Phương thức kiểm thử
    public static void main(String[] args) {
        // Tạo một đối tượng VongThi
        VongThi vongThi = new VongThi("VT001", "Vong Thi 1", 1);

        // Tạo một đối tượng NhomTrinhDien
        NhomTrinhDien NTD1 = new NhomTrinhDien("Nhom 7 nguoi", "Mashup Gửi anh xa nhớ - Người ơi người ở đừng về",
				"Lệ Quyên");

        // Tạo một đối tượng ChiDep đại diện cho đội trưởng
        Chi_Dep doiTruong = new Chi_Dep("CD04", "Lệ Quyên");

        // Set đội trưởng cho nhóm
        vongThi.setNhomTruong(NTD1, doiTruong);

        // Thêm thành viên vào nhóm
        Chi_Dep cd2 = new Chi_Dep("CD05", "Diệp Lâm Anh");
		Chi_Dep cd3 = new Chi_Dep("CD09", "Hương Ly");
        vongThi.setThanhVien(NTD1, cd2);
        vongThi.setThanhVien(NTD1, cd3);

        // Set cách tính điểm cho vòng thi
        CachTinhDiem cachTinhDiem = new CachTinhDiem(50.0, 50.0);
        vongThi.setCachTinhDiem(cachTinhDiem);

        // Kiểm tra điểm của nhóm
        HashMap<Chi_Dep, Integer> diemNhom = vongThi.getDiemTVNhom(nhom);
        for (Chi_Dep chiDep : diemNhom.keySet()) {
            System.out.println("ID: " + chiDep.getId() + ", Ho ten: " + chiDep.getHoTen() + ", Diem: " + diemNhom.get(chiDep));
        }

        // Loại thành viên
        vongThi.loaiThanhVien(2, NTD1);

        // Loại chị đẹp từ nhóm nguy hiểm
        vongThi.loaiChiDep(3, 2);
    }

	private void loaiChiDep(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public String getTenVong() {
		// TODO Auto-generated method stub
		return null;
	}
}
