package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Trip {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, TripPerson> personsMaps = new HashMap<String, TripPerson>();
		int testcases = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < testcases; i++)  {
			String[] firstInput = br.readLine().split(" ");
			int nnumbersOfPersons = Integer.parseInt(firstInput[0].trim());
			String[] nameOfpersonList = new String[nnumbersOfPersons];
			int q = Integer.parseInt(firstInput[1].trim());
			for (int j = 0; j < nnumbersOfPersons; j++) {
				String nameOfPerson = br.readLine().trim();
				nameOfpersonList[j] = nameOfPerson;
				personsMaps.put(nameOfPerson, new TripPerson(nameOfPerson));
			}
			for (int j = 0; j < q; j++) {
				String moneyPaidByPerson = br.readLine().trim();
				int transactionAmount = Integer.parseInt(br.readLine().trim());
				int numberOfPeople = Integer.parseInt(br.readLine().trim());
				int sharingAmount = transactionAmount / (numberOfPeople + 1);
				personsMaps.get(moneyPaidByPerson).setPaidMoney(personsMaps.get(moneyPaidByPerson).getPaidMoney()+transactionAmount);
				personsMaps.get(moneyPaidByPerson).setShare(personsMaps.get(moneyPaidByPerson).getShare()+sharingAmount + (transactionAmount % (numberOfPeople + 1)));
				for (int k = 0; k < numberOfPeople; k++) {
					String otherPerson = br.readLine().trim();
					personsMaps.get(otherPerson).setShare(personsMaps.get(otherPerson).getShare()+sharingAmount);

				}
			}
			for (int j = 0; j < nameOfpersonList.length; j++) {
				showTripPersonDetail(personsMaps.get(nameOfpersonList[j]));
			}
		}

	}

	private static void showTripPersonDetail(TripPerson person) {
		if (person.getPaidMoney() == person.getShare()) {
			System.out.println(person.getName() + " neither owes nor is owed");
		} else if (person.getPaidMoney() > person.getShare()) {
			System.out.println(person.getName() + " is owed " + (person.getPaidMoney() - person.getShare()));

		} else {
			System.out.println(person.getName() + " owes " + (person.getShare() - person.getPaidMoney()));
		}
	}

}

class TripPerson {
	String name;
	int paidMoney;
	int share;

	public TripPerson(String name) {
		this.name = name;
		this.paidMoney = 0;
		this.share = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(int paidMoney) {
		this.paidMoney = paidMoney;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

}
