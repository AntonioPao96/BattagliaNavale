package entity;

public class EntityBersaglio {
	private static int idBersaglio=0;
	private int numRiga;
	private int numColonna;
	private EntityGriglia griglia;
	private EntityPartita partita;

public EntityBersaglio(int numRiga, int numColonna) {
	this.numRiga=numRiga;
	this.numColonna=numColonna;
	idBersaglio++;
}
public int getNumRiga() {
	return numRiga;
}
public int getNumColonna() {
	return numColonna;
}
public boolean verificaSeColpito(int numRiga,int numColonna) {
	if((numRiga==this.numRiga) && (numColonna==this.numColonna))
			return true;
	return false;
}


}
