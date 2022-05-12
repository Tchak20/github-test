
public class Employe {
private int matricule;
private String nom;
private String prenom;
private int naissance[]=new int[3];
private int embauche[]=new int [3];
private int salaire;

public Employe() {
	
	matricule=0;
	nom="inconnu";
	prenom="inconnu";
	salaire= 0;
	}

public Employe(int mat ,String nomE,String prenomE,int salaireE,int jjN,int mmN,int aaN,int jjE,int mmE,int aaE) {
	naissance[0]=jjN;
	naissance[1]=mmN;
	naissance[2]=aaN;
	embauche[0]=jjE;
	embauche[1]=mmE;
	embauche[2]=aaE;
	
	matricule=mat;
	nom=nomE;
	prenom=prenomE;
	salaire=salaireE;
	
	}

public int getMatricule() {
	return matricule;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public int[] getNaissance() {
	return naissance;
}

public void setNaissance(int[] naissance) {
	this.naissance = naissance;
}

public int[] getEmbauche() {
	return embauche;
}

public void setEmbauche(int[] embauche) {
	this.embauche = embauche;
}

public int getSalaire() {
	return salaire;
}

public void setSalaire(int salaire) {
	this.salaire = salaire;
}

public int age() {
	 int age=2022-this.naissance[2];
	 return age;
	//System.out.println("L'employe a "+age+"age");
}

public int Anciennete() {
	int anc= 2022-this.embauche[2];
	return anc;
	//System.out.println("L'employe est ancien de "+anc+"ans");
	
}

public void ArgumentDuSalaire() {
	if(this.Anciennete()<5) {
		this.salaire=this.salaire + (this.salaire*2)/100;
	}
	if(this.Anciennete()<5) 
		this.salaire=this.salaire + (this.salaire*2)/100;
	else if (this.Anciennete()<10) 
		this.salaire=this.salaire + (this.salaire*5)/100;
	else
		this.salaire=this.salaire + (this.salaire*10)/100;
}

public void Affiche() {
	System.out.println("Matricule: "+this.matricule);
	System.out.println("Nom complet: "+this.nom.toUpperCase()+" "+this.prenom);
	System.out.println("Age: "+this.age());
	System.out.println("Anciennete: "+this.Anciennete());
	System.out.println("Salaire: "+this.salaire);
}

public void AfficherEmp() {
	System.out.println("Matricule: "+this.matricule);
	System.out.println("Nom complet: "+this.nom.toUpperCase()+" "+this.prenom);
	System.out.println("Age: "+this.age());
	System.out.println("Anciennete: "+this.Anciennete());
	System.out.println("Salaire: "+this.salaire);
}


}

