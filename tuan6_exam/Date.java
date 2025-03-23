package tuan6_exam;

public class Date {
	private int ngay;
	private int thang;
	private int nam;
	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam + " ";
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof Date)) {
			return false;
		}else {
			Date that = (Date)obj;
			return this.ngay==that.ngay&& this.thang==that.thang&&this.nam==that.nam;
			
		}
	}
	

}
