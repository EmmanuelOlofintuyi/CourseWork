package prob1;

public class Product {

	private int batch;
	private String code = "";
	private String date = "";
	private int indexDateBegins;
	private String plant = "";

		public Product(String code) {
			this.code = code;
			this.plant = extractPlant();
			this.date = extractDate();
			this.batch = extractBatch();
		}
		public int helperExtractsBatch(String digits, int index) {

			index += 7;
			return Integer.parseInt(digits.substring(0, index));
		}
		
		private int extractBatch() {
			for(int i = 0; i < code.length(); i++) {
				if(Character.isLetter(code.charAt(i))) {
					continue;
				}
				else {
					batch = helperExtractsBatch (code.substring(i),i);
					break;
					}
				}
			return batch;
			}
		
		public String helperExtractsDate(String digits) {
			  
			  String month = digits.substring(indexDateBegins, indexDateBegins +2);
			  indexDateBegins += 2;
			  
			  String day = digits.substring(indexDateBegins, indexDateBegins +2);
			  
			  indexDateBegins +=2;
			  
			  String year = digits.substring(indexDateBegins, indexDateBegins +4);
			  
			  	return month + "\'/'" + day + "\'/'" +year;
		}
		
		private String extractDate() {
			for(int i = 0; i < code.length(); i++) {
				if(Character.isLetter(code.charAt(i))) {
					continue;
				}
				else {
					indexDateBegins = i;
					date = helperExtractsDate (code.substring(i, i+9));
					break;
				}
			}
			return date;
		}
	
		private String extractPlant() {
			for(int i = 0; i < code.length(); i++) {
				if(Character.isLetter(code.charAt(i))) {
					plant += code.charAt(i);
				}
				else {
					break;
				}
			}
			return plant;
		}

		public int getBatch() {
			return batch;
		}

		public String getCode() {
			return code;
		}

		public String getDate() {
			return date;
		}

		public String getPlant() {
			return plant;
		}

		public boolean isAfter2000() {
			//date = mm/dd/yyyy
			int year= Integer.parseInt(date.substring(6));
			return year >= 2000;
		}
		
		public boolean isMonthEqual(int month) {
			int months= Integer.parseInt(date.substring(0,2));
			return  months == month;
		}
		
		public String toString() {
			return "code=" + code + ", plant=" + plant + ", date=" + date + ", batch=" + batch;
		}
	}

