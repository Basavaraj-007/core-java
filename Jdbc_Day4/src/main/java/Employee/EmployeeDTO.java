package Employee;



	
	public class EmployeeDTO {

		private int id;
		private String employeeName;
		private String gender;
		private long contactNo;
		private String designation;
		private String jobLocation;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getJobLocation() {
			return jobLocation;
		}
		public void setJobLocation(String jobLocation) {
			this.jobLocation = jobLocation;
		}
		@Override
		public String toString() {
			return "EmployeeDTO [id=" + id + ", employeeName=" + employeeName + ", gender=" + gender + ", contactNo="
					+ contactNo + ", designation=" + designation + ", jobLocation=" + jobLocation + "]";
		}

		
		
	}
	

