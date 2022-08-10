package com.shayam.test;

public class DateIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dateIterator("2-29-2024"));

	}

	public static String dateIterator(String date) {
		String dateSplit[];
		StringBuilder sb = new StringBuilder();
		dateSplit = date.split("-");
		if ((dateSplit[0].equals("1") || dateSplit[0].equals("3") || dateSplit[0].equals("5")
				|| dateSplit[0].equals("7") || dateSplit[0].equals("8") || dateSplit[0].equals("10")
				|| dateSplit[0].equals("12")) && Integer.valueOf(dateSplit[1]) < 32) {
			if (dateSplit[1].equals("31") && !dateSplit[0].equals("12")) {
				dateSplit[0] = String.valueOf(Integer.valueOf(dateSplit[0]) + 1);
				dateSplit[1] = "1";
			} else if (dateSplit[1].equals("31")) {
				dateSplit[2] = String.valueOf(Integer.valueOf(dateSplit[2]) + 1);
				dateSplit[0] = "1";
				dateSplit[1] = "1";
			} else {
				dateSplit[1] = String.valueOf(Integer.valueOf(dateSplit[1]) + 1);
			}
		} else if ((dateSplit[0].equals("4") || dateSplit[0].equals("6") || dateSplit[0].equals("9")
				|| dateSplit[0].equals("11")) && Integer.valueOf(dateSplit[1]) < 31) {
			if (dateSplit[1].equals("30") && !dateSplit[0].equals("12")) {
				dateSplit[0] = String.valueOf(Integer.valueOf(dateSplit[0]) + 1);
				dateSplit[1] = "1";
			} else if (dateSplit[1].equals("30")) {
				dateSplit[2] = String.valueOf(Integer.valueOf(dateSplit[2]) + 1);
				dateSplit[0] = "1";
				dateSplit[1] = "1";
			} else {
				dateSplit[1] = String.valueOf(Integer.valueOf(dateSplit[1]) + 1);
			}
		} else if (dateSplit[0].equals("2") && (Integer.valueOf(dateSplit[1]) < 30)) {
			if (Integer.valueOf(dateSplit[2]) % 4 != 0) {
				if (dateSplit[1].equals("28") && !dateSplit[0].equals("12")) {
					dateSplit[0] = String.valueOf(Integer.valueOf(dateSplit[0]) + 1);
					dateSplit[1] = "1";
				} else if (dateSplit[1].equals("28")) {
					dateSplit[2] = String.valueOf(Integer.valueOf(dateSplit[2]) + 1);
					dateSplit[0] = "1";
					dateSplit[1] = "1";
				} else {
					dateSplit[1] = String.valueOf(Integer.valueOf(dateSplit[1]) + 1);
				}
			} else {
				if (dateSplit[1].equals("29") && !dateSplit[0].equals("12")) {
					dateSplit[0] = String.valueOf(Integer.valueOf(dateSplit[0]) + 1);
					dateSplit[1] = "1";
				} else if (dateSplit[1].equals("29")) {
					dateSplit[2] = String.valueOf(Integer.valueOf(dateSplit[2]) + 1);
					dateSplit[0] = "1";
					dateSplit[1] = "1";
				} else {
					dateSplit[1] = String.valueOf(Integer.valueOf(dateSplit[1]) + 1);
				}

			}

		}
		for (int i = 0; i < dateSplit.length; i++) {
			sb.append(dateSplit[i]);
			if (i != dateSplit.length - 1) {
				sb.append("-");
			}
		}
		return sb.toString();
	}

}
