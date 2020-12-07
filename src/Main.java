import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		// Börjar med att spelaren ska få välja.

		Scanner rock = new Scanner(System.in);

		System.out.print("Choose; rock, paper or scissors: ");

		// En loop som gör att man fortsätta köra igen
		int conter=0;
		while (conter<3) {
			String playerOne = rock.nextLine();

			// Ett script som gör att datorn väljer ett av valen slumpmässigt.

			int random = (int) (Math.random() * 3);

			String computerPlayer = "Computer";
			if (random == 0) {
				computerPlayer = "rock";
			} else if (random == 1) {
				computerPlayer = "paper";
			} else {
				computerPlayer = "scissors";
			}
			System.out.println("Computer: " + computerPlayer);

			// Meddelande man får beroende av reslutat.

			if (playerOne.equals(computerPlayer)) {
				System.out.println("Tie!");
			} else if ((playerOne.equals("rock") && computerPlayer.equals("scissors"))
					|| (playerOne.equals("scissors") && computerPlayer.equals("paper"))
					|| (playerOne.equals("paper") && computerPlayer.equals("rock"))) {
				System.out.println("You won!");
				conter++;
			} else {
				System.out.println("You lost!");

			}

		}

		// rock.close();
		// System.out.println("Good game! Choose again!");
	}

}