package dao;

public class HospitalDTO {


		private int id ;
		private String hospitalName  ;
		private String hospitalAddress  ;
		private long hospitalContactNo ;
		private String patientName;
		private int patientTokenNo ;
		private String patientAddress ;
		private int patientAge ;
		private long patientContactNo;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getHospitalName() {
			return hospitalName;
		}
		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}
		public String getHospitalAddress() {
			return hospitalAddress;
		}
		public void setHospitalAddress(String hospitalAddress) {
			this.hospitalAddress = hospitalAddress;
		}
		public long getHospitalContactNo() {
			return hospitalContactNo;
		}
		public void setHospitalContactNo(long hospitalContactNo) {
			this.hospitalContactNo = hospitalContactNo;
		}
		public String getPatientName () {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getPatientTokenNo() {
			return patientTokenNo;
		}
		public void setPatientTokenNo(int patientTokenNo) {
			this.patientTokenNo = patientTokenNo;
		}
	
		public int getPatientAge() {
			return patientAge;
		}
		public void setPatientAge(int patientAge) {
			this.patientAge = patientAge;
		}
		public String getPatientAddress() {
			return patientAddress;
		}
		public void setPatientAddress(String patientAddress) {
			this.patientAddress = patientAddress;
		}
		
		public long getPatientContactNo() {
			return hospitalContactNo;
		}
		public void setPatientContactNo(long patientContactNo) {
			this.patientContactNo=patientContactNo;
		}
		@Override
		public String toString() {
			return "HospitalDTO [id=" + id + ", hospitalName=" + hospitalName + ", hospitalAddress=" + hospitalAddress
					+ ", hospitalContactNo=" + hospitalContactNo + ", patientName=" + patientName + ", patientTokenNo="
					+ patientTokenNo + ", patientAddress=" + patientAddress + ", patientAge=" + patientAge
					+ ", patientContactNo=" + patientContactNo + "]";
		}
		
		
}
		
		
	

