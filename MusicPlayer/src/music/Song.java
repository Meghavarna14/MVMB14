package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Song {

	private static final String A = null;
	private static final String B = null;
	private static final String C = null;

	public static void main(String[] args) {

		String arr[] = { "1.FadeAway", "2.Closer", "3.On My Way", "4.Cheap Thrills", "5.Shape Of You" };
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice (1-4): ");

		System.out.println("i.Press 1 to play song");
		System.out.println("ii.Press 2 to search a song");
		System.out.println("iii.Press 3 to show all songs");
		System.out.println("iv.Press 4 to “Operate on Songs Database");
		int option = 0;
		option = sc.nextInt();

		switch (option) {
		case 1:
			Scanner sc1 = new Scanner(System.in);

			System.out.println("Choose any One from below list");
			System.out.println("Press A to “Play all songs”\n");
			System.out.println("Press B to “Play Songs Randomly”\n");
			System.out.println("Press C to “Play a Particular Song” \n");

			String choose = null;
			choose = sc1.next();
			switch (choose) {
			case "A":
				for (int i = 0; i < arr.length; i++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					System.out.println("Playing Song..." + arr[i]);
				}
				break;

			case "B":
				Random r = new Random();
				int randomNumber = r.nextInt(arr.length);
				System.out.println("playing Songs Randomly:\n" + arr[randomNumber]);
				break;
			case "C":
				System.out.println("Enter the Song Name to play particular song:-");
				String find = sc.next();
				for (int i = 0; i < arr.length; i++) {
					boolean song = (arr[i].equalsIgnoreCase(find)) ? true : false;
					if (song)
						System.out.println("Playing Requested Song\n" + arr[i]);
					else
						System.out.println("Requested Song does not exist\n");

					break;
				}
			}
			while (!exit)
				;
			break;

		case 2:
			System.out.println("Enter the Song Name to search :-");
			String sc3 = sc.next();
			int flag = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equalsIgnoreCase(sc3)) {
					flag = 1;
				}
			}
			if (flag == 0)
				System.out.println("The Song " + sc3 + " does not Exists");
			else
				System.out.println("The Song " + sc3 + "  Exists");
			break;

		case 3:
			System.out.println("Displaying All song\n ");
			System.out.println(Arrays.toString(arr));
			// list.forEach(System.out::println);
			break;
		case 4:
			Scanner sc4 = new Scanner(System.in);

			System.out.println("Choose any One from below list");
			System.out.println("Type-Add-to save Songs Repository\n");
			System.out.println("Type-Edit- to save existing Song info\n");
			System.out.println("Type-Delete- to delete existing Song info\n");

			String choose1 = null;
			choose1 = sc4.next();
			System.out.println();
			switch (choose1) {
			case "Add":
				Scanner scan = new Scanner(System.in);

				System.out.println("Enter the amount you want to deposit in your account");
				list.add(scan.next());
				// String addsong;
				// System.out.println("Enter the song to add");
				// addsong = sc.next();
				// list.add(addsong);
				// // System.out.println("new song has been added to the repo :"+addsong);
				//
				// // System.out.println("list" + list.get(list.size() - 1));
				//
				System.out.println("Your song has been addes to the repo" + Arrays.toString(arr));

				break;

			case "Delete":
				String deletesong;
				System.out.println("Enter the song to be Deleted");
				deletesong = sc.next();
				flag = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equalsIgnoreCase(deletesong)) {
						list.remove(list);
					}
				}
				if (flag == 0)
					System.out.println("Your song has been Deleted From the repo" + Arrays.toString(arr));

				break;
			}

			while (!exit)
				;
			break;

		}
	}
}
