import java.util.Scanner;

public class Ex04Class {

	public static void main(String[] args) {
		int mat,jjN,i,mmN,aaN,jjE,mmE,aaE,sal;
		String nam,prem;
		String r="O";
		//Employe E = new Employe();
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("Matricule:");
		mat=sc.nextInt();
		sc.nextLine();
		System.out.println("Nom:");
		nam=sc.nextLine();
		System.out.println("Prenom:");
		prem=sc.nextLine();
		System.out.print("Date de naissance jj/mm/aaaa:");
		jjN=sc.nextInt();
		System.out.print("/");
		mmN=sc.nextInt();
		System.out.print("/");
		aaN=sc.nextInt();
		System.out.print("Date d'embauche jj/mm/aaaa:");
		jjE=sc.nextInt();
		System.out.print("/");
		mmE=sc.nextInt();
		System.out.print("/");
		aaE=sc.nextInt();
		System.out.print("Salaire:");
		sal=sc.nextInt();
		Employe E=new Employe(mat,nam,prem,sal, jjN, mmN, aaN, jjE, mmE, aaE);
		E.AfficherEmp();
		E.ArgumentDuSalaire();
		System.out.println("\nApres application de l'augmentation\n");
		E.AfficherEmp();
		sc.nextLine();
		System.out.println("\nVoulez vous reesayer?:(O/N)");
		r =sc.nextLine();
		}while(r.equals("O")||r.equals("o"));
		
	}

}
