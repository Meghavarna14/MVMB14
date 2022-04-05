package encapsulation;


public class AppAddress {
		public static void main(String[] args) {
			Newhuman human = new Newhuman();
			human.setHumanName("Name01");
			human.setHumanAge(22);
			human.setHumanHeight(123);
			human.setHumanWeight(123);
			
			human.setAddress(human.createAddressObj());
			
			System.out.println(human.getHumanName());
			System.out.println(human.getHumanAge());
			
			System.out.println(human.getAddress());
		}
}
