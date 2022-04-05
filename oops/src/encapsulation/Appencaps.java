package encapsulation;

public class Appencaps {
	public static void main(String[] args) {
		Human human = new Human();

		human.setHumanName("Name01");
		human.setHumanAge(22);
		human.setHumanHeight(180);
		human.setHumanWeight(80);
		
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanAge());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanWeight());
	}

}
