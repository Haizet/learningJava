package webtesting;


public class AdminGuestMode {
    public static void main(String[] args) {
    	String inputArguments = String.join(",", args);
    	String ad = "--admin";
    	String gt = "--guest";
		if (inputArguments.contains(ad) && inputArguments.contains(gt)) {
			System.out.println("Please, select either 'ADMIN' or "
					+ "'GUEST' mode for this program");
		} else if (inputArguments.contains(ad)) {
			System.out.println("Hello, Admin!");
		} else if (inputArguments.contains(gt)) {
			System.out.println("Hello, Guest!");
    	}
    	   	  	
	}
}
