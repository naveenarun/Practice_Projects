class q_19 {
	static class Date {
		public int day;
		public int month;
		public int year;
		public int wkday;
		Date(int d, int m, int y) {
			day = d;
			month = m;
			year = y;
			wkday = 0;
		}
		void increment() {
			day++;
			wkday = (wkday + 1) % 7;
			boolean isLeap = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
			boolean isThirty = (month == 9 || month == 4 || month == 6 || month == 11);
			boolean isEndOf30 = (day == 31 && isThirty);
			boolean isEndOf31 = (day == 32);
			boolean isFeb = (month == 2);
			boolean isEndOfFeb28 = (isFeb && !isLeap && day == 29);
			boolean isEndOfFeb29 = (isFeb && isLeap && day == 30);
			boolean isEndOfFeb = isEndOfFeb28 || isEndOfFeb29;
			boolean isEndOfMonth = isEndOf30 || isEndOf31 || isEndOfFeb;
			if (isEndOfMonth) {
				day = 1;
				month++;
				if (month == 13) { month = 1; year++; }
			}
		}
		public String toString() {
			String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			String[] wkdays = {"Mon","Tues","Wed","Thurs","Fri","Sat","Sun"};
			return Integer.toString(day) + " " + months[month-1] + " " + Integer.toString(year) + " (" + wkdays[wkday] + ")";
		}
	}

	public static void main(String[] args) {
		Date x = new Date(1,1,1900);
		int numSunFirst = 0;
		while (!(x.day == 31 && x.month == 12 && x.year == 2000)) {
			if (x.wkday == 6 && x.day == 1 && x.year >= 1901) {
				numSunFirst++;
			}
			x.increment();
		}
		System.out.println(numSunFirst);
	}
}

