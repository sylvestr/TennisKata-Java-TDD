package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	String resultat;
	int scoreServeur;
	int scoreReceveur;


	
	public TennisGame(){
		
		this.resultat = "love-all";	
		this.scoreServeur = 0;
		this.scoreReceveur = 0;
		
	}
	
	
	public void serveurMarqueInFirst(){
		this.scoreServeur = 15;
		this.scoreReceveur = 0;
		this.resultat ="fifteen-love";		
	}
	
	public void ReceveurMarqueInFirst(){
		this.scoreReceveur = 15;
		this.scoreServeur = 0;
		this.resultat ="love-fifteen";
	}
	

	public String getResultat() {
		
		return this.resultat;
	}

}
