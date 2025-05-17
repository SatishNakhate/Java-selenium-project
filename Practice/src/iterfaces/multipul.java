package iterfaces;

public class multipul implements state, district {

	

	@Override
	public void pbn() {
		System.out.println("PBN its district MH");
		
	}

	@Override
	public void mh() {
		System.out.println("MH is the State of India");
		
	}

	public static void main(String[] args) {
		multipul pmh = new multipul();
		pmh.mh();
		pmh.pbn();
		

	}
}
