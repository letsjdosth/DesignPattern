package part1_Member;

import java.util.Date;

public class Member {
	private Date expiryDate;
	private boolean male;
	private static final long DAY30=1000*60*60*24*30;//30¿œ
	
	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public boolean isExpired() {
		if (male) {
			return expiryDate !=null && expiryDate.getDate() < System.currentTimeMillis();
		}
		return expiryDate!=null && expiryDate.getDate() < System.currentTimeMillis()-DAY30;
	}
	
	public boolean isMale() {
		return male;
	}
	
}
